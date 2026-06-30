package qx4;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f367424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f367424d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qx4.d0 d0Var = (qx4.d0) this.f367424d.get();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onDispatchLiteAppAction: jsapi->" + d0Var + ", action->" + it);
        if (d0Var != null) {
            d0Var.m("onDispatchLiteAppAction", it);
        }
        return jz5.f0.f302826a;
    }
}
