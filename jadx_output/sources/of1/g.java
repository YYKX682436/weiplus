package of1;

/* loaded from: classes8.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.m f344916d;

    public g(of1.m mVar) {
        this.f344916d = mVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        of1.m mVar = this.f344916d;
        try {
            boolean isSDCardAvailable = mVar.f344882f.isSDCardAvailable();
            zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
            android.content.Context a17 = mVar.a();
            java.lang.String str = mVar.f344967n;
            java.lang.String a18 = com.tencent.xweb.d.g().a(mVar.f344967n);
            of1.f fVar = new of1.f(this);
            ((yg0.s4) q3Var).getClass();
            com.tencent.mm.pluginsdk.ui.tools.e9.h(a17, str, a18, isSDCardAvailable, fVar);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
            return true;
        }
    }
}
