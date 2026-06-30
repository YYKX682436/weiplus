package eb4;

/* loaded from: classes4.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f250895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.p3 f250896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f250897c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f250898d;

    public n(boolean z17, com.tencent.mm.ui.widget.dialog.p3 p3Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f250895a = z17;
        this.f250896b = p3Var;
        this.f250897c = c0Var;
        this.f250898d = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$1");
        if (this.f250895a) {
            this.f250897c.f310112d = false;
            this.f250898d.B();
        } else {
            this.f250896b.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$1");
    }
}
