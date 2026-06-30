package of1;

/* loaded from: classes8.dex */
public class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.m f344943d;

    public j(of1.m mVar) {
        this.f344943d = mVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        of1.m mVar = this.f344943d;
        try {
            boolean isSDCardAvailable = mVar.f344882f.isSDCardAvailable();
            java.lang.String replaceAll = mVar.f344967n.replaceAll("tp=webp", "");
            zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
            android.content.Context a17 = mVar.a();
            java.lang.String a18 = com.tencent.xweb.d.g().a(replaceAll);
            of1.i iVar = new of1.i(this);
            ((yg0.s4) q3Var).getClass();
            com.tencent.mm.pluginsdk.ui.tools.e9.h(a17, replaceAll, a18, isSDCardAvailable, iVar);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
            return true;
        }
    }
}
