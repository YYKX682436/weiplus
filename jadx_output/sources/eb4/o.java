package eb4;

/* loaded from: classes4.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f250899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.p3 f250900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f250901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f250902d;

    public o(boolean z17, com.tencent.mm.ui.widget.dialog.p3 p3Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f250899a = z17;
        this.f250900b = p3Var;
        this.f250901c = c0Var;
        this.f250902d = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$2");
        if (this.f250899a) {
            this.f250901c.f310112d = true;
            this.f250902d.B();
        } else {
            this.f250900b.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$2");
    }
}
