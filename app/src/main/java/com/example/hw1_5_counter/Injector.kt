package com.example.hw1_5_counter

class Injector {
    companion object {

        fun getModel(): CountModel {
            return CountModel()
        }

        fun getPresenter(view: CounterView): CountPesenter{
            return CountPesenter(view)
        }
    }
}