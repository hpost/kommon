package cc.femto.kommon.util

import android.util.Log
import timber.log.Timber

class CrashlyticsTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String?, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }

        // TODO
//        Crashlytics.log(priority, tag, message)
    }
}
