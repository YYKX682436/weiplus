package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public final class AppInfoChangedBlocker {
    private static final java.lang.String TAG = "Tinker.AppInfoChangedBlocker";

    /* loaded from: classes13.dex */
    public static class HackerCallback implements android.os.Handler.Callback {
        private final int APPLICATION_INFO_CHANGED;
        private android.os.Handler.Callback origin;

        public HackerCallback(android.os.Handler.Callback callback, java.lang.Class cls) {
            int i17;
            this.origin = callback;
            try {
                i17 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) cls, "APPLICATION_INFO_CHANGED").getInt(null);
            } catch (java.lang.Throwable unused) {
                i17 = 156;
            }
            this.APPLICATION_INFO_CHANGED = i17;
        }

        private boolean hackMessage(android.os.Message message) {
            if (message.what != this.APPLICATION_INFO_CHANGED) {
                return false;
            }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(com.tencent.tinker.loader.AppInfoChangedBlocker.TAG, "Suicide now.", new java.lang.Object[0]);
            android.os.Process.killProcess(android.os.Process.myPid());
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (hackMessage(message)) {
                return true;
            }
            android.os.Handler.Callback callback = this.origin;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    private static android.os.Handler fetchMHObject(android.content.Context context) {
        java.lang.Object activityThread = com.tencent.tinker.loader.shareutil.ShareReflectUtil.getActivityThread(context, null);
        return (android.os.Handler) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(activityThread, "mH").get(activityThread);
    }

    private static void interceptHandler(android.os.Handler handler) {
        java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) android.os.Handler.class, "mCallback");
        android.os.Handler.Callback callback = (android.os.Handler.Callback) findField.get(handler);
        if (callback instanceof com.tencent.tinker.loader.AppInfoChangedBlocker.HackerCallback) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "Already intercepted, skip rest logic.", new java.lang.Object[0]);
        } else {
            findField.set(handler, new com.tencent.tinker.loader.AppInfoChangedBlocker.HackerCallback(callback, handler.getClass()));
        }
    }

    public static boolean tryStart(android.app.Application application) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return true;
        }
        try {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "tryStart called.", new java.lang.Object[0]);
            interceptHandler(fetchMHObject(application));
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "tryStart done.", new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "AppInfoChangedBlocker start failed, simply ignore.", th6);
            return false;
        }
    }
}
