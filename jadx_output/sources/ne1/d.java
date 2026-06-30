package ne1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f336515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ne1.e f336516e;

    public d(ne1.e eVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f336516e = eVar;
        this.f336515d = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public void run() {
        ne1.a aVar = new ne1.a(this);
        if (com.tencent.mm.sdk.platformtools.z.f193112h >= 654315264 && com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f336516e.f336517a.t3().f74805p.f77281g)) {
            this.f336516e.f336517a.t3().I1(aVar);
            return;
        }
        fl1.b bVar = new fl1.b(this.f336516e.f336517a.getContext());
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.t(this.f336516e.f336517a.getContext().getString(this.f336516e.f336517a.t3().r2() ? com.tencent.mm.R.string.f490183n8 : com.tencent.mm.R.string.f490184n9, this.f336516e.f336517a.t3().u0().f77279e));
        ne1.b bVar2 = new ne1.b(this, aVar);
        if (this.f336516e.f336517a.t3().E0().f305852r.f75399d != 0) {
            bVar.z(com.tencent.mm.R.string.f490182n7, bVar2);
            bVar.u(com.tencent.mm.R.string.f490180n5, new ne1.c(this));
        } else {
            bVar.z(com.tencent.mm.R.string.f490181n6, bVar2);
        }
        this.f336516e.f336517a.getDialogContainer().c(bVar);
    }
}
