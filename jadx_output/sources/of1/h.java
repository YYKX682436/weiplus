package of1;

/* loaded from: classes8.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.m f344927d;

    public h(of1.m mVar) {
        this.f344927d = mVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17;
        of1.m mVar = this.f344927d;
        try {
            z17 = mVar.f344882f.isSDCardAvailable();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
            z17 = false;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick saveImage2SD with url[%s]", mVar.f344967n);
            com.tencent.mm.pluginsdk.ui.tools.e9.m(mVar.a(), mVar.f344967n, mVar.b(), com.tencent.xweb.d.g().a(mVar.f344967n), z17, null);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "save to sdcard failed : %s", e18.getMessage());
        }
        return true;
    }
}
