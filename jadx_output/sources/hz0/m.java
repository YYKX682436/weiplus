package hz0;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final hz0.m f286283a = new hz0.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f286284b = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public final synchronized void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWorkManager", "removeRunningWorkInList >> " + str);
        if (str != null) {
            f286284b.remove(str);
        }
    }
}
