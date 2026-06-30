package qc1;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f361472i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qc1.m f361473j;

    public l(qc1.m mVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, boolean z17) {
        this.f361473j = mVar;
        this.f361471h = v5Var;
        this.f361472i = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        this.f361473j.getClass();
        com.tencent.mm.plugin.appbrand.widget.input.s sVar = com.tencent.mm.plugin.appbrand.widget.input.s.f91646b;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f361471h;
        sVar.c(v5Var.a2());
        android.view.View contentView = v5Var.a2().getContentView();
        if (this.f361472i) {
            com.tencent.mm.plugin.appbrand.widget.input.u3 G = com.tencent.mm.plugin.appbrand.widget.input.u3.G(contentView, null, v5Var.V1());
            if (G != null) {
                G.setShowDoneButton(false);
            }
            contentView.requestFocus();
        }
        return null;
    }
}
