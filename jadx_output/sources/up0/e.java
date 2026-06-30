package up0;

/* loaded from: classes7.dex */
public final class e extends tp0.i {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f429772f = jz5.h.b(new up0.d(this));

    @Override // lc3.c0
    public java.lang.String f() {
        return "updatePagView";
    }

    @Override // tp0.i
    public void z(java.lang.Object obj, org.json.JSONObject data) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        super.z(view, data);
        up0.k.f429791a.a((com.tencent.mm.plugin.appbrand.appstorage.u1) ((jz5.n) this.f429772f).getValue(), data, (com.tencent.mm.view.MMPAGView) view);
    }
}
