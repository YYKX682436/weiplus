package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareTinkerLog {
    public static final int FN_LOG_PRINT_PENDING_LOGS = 4002;
    public static final int FN_LOG_PRINT_STACKTRACE = 4001;
    private static final java.lang.String TAG = "Tinker.ShareTinkerLog";
    private static final com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp debugLog;
    private static final com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp[] tinkerLogImpRef;
    private static final android.os.Handler[] tinkerLogInlineFenceRef;

    /* loaded from: classes13.dex */
    public interface TinkerLogImp {
        void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr);

        void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);
    }

    static {
        android.os.Handler[] handlerArr = {null};
        tinkerLogInlineFenceRef = handlerArr;
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp tinkerLogImp = new com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp() { // from class: com.tencent.tinker.loader.shareutil.ShareTinkerLog.1
            @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
            public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
            public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
            public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
            public void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    java.lang.String.format(str2, objArr);
                }
                android.util.Log.getStackTraceString(th6);
            }

            @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
            public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp
            public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }
        };
        debugLog = tinkerLogImp;
        tinkerLogImpRef = new com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp[]{tinkerLogImp};
        synchronized (handlerArr) {
            try {
                int i17 = com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.f215551a;
                java.lang.reflect.Constructor declaredConstructor = com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.class.getDeclaredConstructor(new java.lang.Class[0]);
                declaredConstructor.setAccessible(true);
                handlerArr[0] = (android.os.Handler) declaredConstructor.newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused) {
                tinkerLogInlineFenceRef[0] = null;
            }
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printLog(3, str, str2, objArr);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printLog(6, str, str2, objArr);
    }

    public static com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp getDefaultImpl() {
        return debugLog;
    }

    public static com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp getImpl() {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp tinkerLogImp;
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp[] tinkerLogImpArr = tinkerLogImpRef;
        synchronized (tinkerLogImpArr) {
            tinkerLogImp = tinkerLogImpArr[0];
        }
        return tinkerLogImp;
    }

    private static android.os.Handler getInlineFence() {
        android.os.Handler handler;
        android.os.Handler[] handlerArr = tinkerLogInlineFenceRef;
        synchronized (handlerArr) {
            handler = handlerArr[0];
        }
        return handler;
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printLog(4, str, str2, objArr);
    }

    public static void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printLog(str, th6, str2, objArr);
    }

    private static void printLog(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, str2, objArr};
        android.os.Handler inlineFence = getInlineFence();
        if (inlineFence != null) {
            android.os.Message obtain = android.os.Message.obtain(inlineFence, i17, objArr2);
            inlineFence.handleMessage(obtain);
            obtain.recycle();
        } else {
            debugLog.e(str, "!! NO_LOG_IMPL !! Original Log: " + str2, objArr);
        }
    }

    public static void printPendingLogs() {
        android.os.Handler inlineFence = getInlineFence();
        if (inlineFence != null) {
            android.os.Message obtain = android.os.Message.obtain(inlineFence, 4002);
            inlineFence.handleMessage(obtain);
            obtain.recycle();
        }
    }

    public static void setTinkerLogImp(com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp tinkerLogImp) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp[] tinkerLogImpArr = tinkerLogImpRef;
        synchronized (tinkerLogImpArr) {
            tinkerLogImpArr[0] = tinkerLogImp;
            if (tinkerLogImp != null && tinkerLogImp != debugLog) {
                printPendingLogs();
            }
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printLog(2, str, str2, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printLog(5, str, str2, objArr);
    }

    private static void printLog(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = {4001, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, th6, str2, objArr};
        android.os.Handler inlineFence = getInlineFence();
        if (inlineFence != null) {
            android.os.Message obtain = android.os.Message.obtain(inlineFence, 4001, objArr2);
            inlineFence.handleMessage(obtain);
            obtain.recycle();
        } else {
            debugLog.printErrStackTrace(str, th6, "!! NO_LOG_IMPL !! Original Log: " + str2, objArr);
        }
    }
}
