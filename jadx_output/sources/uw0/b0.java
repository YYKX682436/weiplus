package uw0;

/* loaded from: classes5.dex */
public final class b0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431533e;

    public b0(uw0.x xVar, uw0.t0 t0Var) {
        this.f431532d = xVar;
        this.f431533e = t0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f431532d.setColorStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f431533e.V7(eVar);
        }
    }
}
