package com.tencent.paymars;

/* loaded from: classes12.dex */
public class MarsContext {
    private static final java.lang.String TAG = "MicroMsg.PayMarsContext";
    public static com.tencent.paymars.app.Context ctx;

    public static com.tencent.paymars.app.Context getContext() {
        if (ctx == null) {
            synchronized (com.tencent.paymars.MarsContext.class) {
                ctx = new com.tencent.paymars.app.Context("default");
            }
        }
        return ctx;
    }

    public static <T extends com.tencent.paymars.app.BaseManager> T getManager(java.lang.Class<T> cls) {
        T t17 = (T) getContext().getManager(cls);
        if (t17 == null) {
            com.tencent.mars.xlog.Log.e(TAG, "getManager %s failed", cls.getName());
            bm5.n.a(t17);
        }
        return t17;
    }

    public static void release() {
        com.tencent.mars.xlog.Log.i(TAG, "mars2 release.");
        com.tencent.paymars.app.Context context = ctx;
        if (context != null) {
            context.onDestroy();
        }
        ctx = null;
    }
}
