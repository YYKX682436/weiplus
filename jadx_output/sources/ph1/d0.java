package ph1;

/* loaded from: classes7.dex */
public class d0 implements ph1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph1.i f354313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f354314c;

    public d0(ph1.g0 g0Var, java.lang.String str, ph1.i iVar) {
        this.f354314c = g0Var;
        this.f354312a = str;
        this.f354313b = iVar;
    }

    @Override // ph1.p
    public void a(com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress wxaPkgLoadProgress) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "hy: on load module progress %s", wxaPkgLoadProgress);
        java.util.Set d17 = this.f354314c.f354328e.d(this.f354312a);
        if (d17 == null) {
            return;
        }
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            ph1.c cVar = ((ph1.f0) it.next()).f354321b;
            if (cVar != null) {
                cVar.a(wxaPkgLoadProgress);
            }
        }
    }

    @Override // ph1.p
    public void b(boolean z17, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad, module(%s) succeed(%b)", this.f354312a, java.lang.Boolean.valueOf(z17));
        this.f354313b.a(new ph1.c0(this, z17, list));
    }
}
