package lc3;

/* loaded from: classes7.dex */
public abstract class s extends lc3.e {

    /* renamed from: e, reason: collision with root package name */
    public static int f317918e;

    /* renamed from: d, reason: collision with root package name */
    public final lc3.r f317919d = new lc3.r();

    public final int C0(java.lang.Object view) {
        int i17;
        kotlin.jvm.internal.o.g(view, "view");
        synchronized (this) {
            i17 = f317918e - 1;
            f317918e = i17;
        }
        com.tencent.mars.xlog.Log.i("MBDynamicBizContext", "addCustomView,viewId:" + i17);
        this.f317919d.a(i17, view);
        return i17;
    }

    public void E0(org.json.JSONObject data, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(null);
    }

    public abstract jc3.m F0(java.lang.String str);
}
