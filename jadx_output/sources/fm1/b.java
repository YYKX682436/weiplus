package fm1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final fm1.b f264014a = new fm1.b();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f264015b = new android.util.SparseArray();

    static {
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        kotlin.jvm.internal.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new fm1.a());
    }

    public final android.app.Activity a(java.lang.String invokeTicket) {
        android.app.Activity activity;
        android.content.ComponentName componentName;
        java.lang.String className;
        kotlin.jvm.internal.o.g(invokeTicket, "invokeTicket");
        android.util.SparseArray sparseArray = f264015b;
        int indexOfKey = sparseArray.indexOfKey(invokeTicket.hashCode());
        if (indexOfKey >= 0) {
            activity = (android.app.Activity) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            activity = null;
        }
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaRedirectingPageExportApi.WXBizEntryActivityPendingMap", "finish with ticket:" + invokeTicket + ", get null wxBizEntryActivity");
            return null;
        }
        android.app.ActivityManager.RunningTaskInfo z17 = com.tencent.mm.sdk.platformtools.t8.z(activity, activity.getTaskId());
        boolean z18 = false;
        if (z17 != null && (componentName = z17.baseActivity) != null && (className = componentName.getClassName()) != null && r26.i0.n(className, "WXEntryActivity", false)) {
            z18 = true;
        }
        if (z18) {
            activity.finishAndRemoveTask();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaRedirectingPageExportApi.WXBizEntryActivityPendingMap", "finish with ticket:" + invokeTicket + ", invoke finishAndRemoveTask(), wxBizEntryActivity:" + activity.hashCode());
        } else {
            activity.finish();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaRedirectingPageExportApi.WXBizEntryActivityPendingMap", "finish with ticket:" + invokeTicket + ", invoke finish(), wxBizEntryActivity:" + activity.hashCode());
        }
        return activity;
    }
}
