package jj1;

/* loaded from: classes15.dex */
public class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage f299965a;

    public b(com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage wxaShareMessagePage) {
        this.f299965a = wxaShareMessagePage;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage wxaShareMessagePage = this.f299965a;
        wxaShareMessagePage.setTag(com.tencent.mm.R.id.a0m, valueOf);
        k01.t0 t0Var = wxaShareMessagePage.f88861q;
        if (t0Var != null) {
            t0Var.a(z17);
        }
    }
}
