package com.example.sensorguide

abstract class MeasurableSensor(
    protected val sensorType: Int
) {

    protected var onSensorValuesChanged: ((List<Float>) -> Unit)?=null

    abstract val doesSensorExists: Boolean

    abstract fun startListening()
    abstract fun stopListening()

    fun setOnSensorValuesChangedListener(listener: (List<Float>) -> Unit){
        onSensorValuesChanged= listener
    }
}