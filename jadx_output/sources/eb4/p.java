package eb4;

/* loaded from: classes4.dex */
public final class p implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f250903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.p3 f250904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.p3 f250905c;

    public p(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.p3 p3Var, com.tencent.mm.ui.widget.dialog.p3 p3Var2) {
        this.f250903a = c0Var;
        this.f250904b = p3Var;
        this.f250905c = p3Var2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$3");
        if (this.f250903a.f310112d) {
            this.f250904b.a();
        } else {
            this.f250905c.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$3");
    }
}
