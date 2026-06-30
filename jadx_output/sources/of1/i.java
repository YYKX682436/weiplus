package of1;

/* loaded from: classes8.dex */
public class i implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.j f344936a;

    public i(of1.j jVar) {
        this.f344936a = jVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        of1.m mVar = this.f344936a.f344943d;
        mVar.getClass();
        try {
            if (mVar.f344882f.Sg(str) == 0) {
                dp.a.makeText(mVar.a(), mVar.a().getString(com.tencent.mm.R.string.cbq), 0).show();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "favoriteUrl fail, ex = " + e17.getMessage());
        }
    }
}
