package uw0;

/* loaded from: classes5.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.a f431540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.o f431541e;

    public d(uw0.a aVar, uw0.o oVar) {
        this.f431540d = aVar;
        this.f431541e = oVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f431540d.setFontStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f431541e.U7(eVar);
        }
    }
}
