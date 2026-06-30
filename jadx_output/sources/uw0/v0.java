package uw0;

/* loaded from: classes5.dex */
public final class v0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f431616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f431617e;

    public v0(uw0.u0 u0Var, uw0.e1 e1Var) {
        this.f431616d = u0Var;
        this.f431617e = e1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f431616d.setFontStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f431617e.K7(eVar);
        }
    }
}
