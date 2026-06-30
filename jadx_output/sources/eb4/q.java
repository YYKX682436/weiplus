package eb4;

/* loaded from: classes.dex */
public final class q implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f250906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f250908c;

    public q(yz5.q qVar, java.lang.String str, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f250906a = qVar;
        this.f250907b = str;
        this.f250908c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$leftClickFunc$1");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", 4);
        hashMap.put("err_msg", "get_location:user_cancel");
        yz5.q qVar = this.f250906a;
        if (qVar != null) {
            qVar.invoke(this.f250907b, "GEO", hashMap);
        }
        this.f250908c.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$leftClickFunc$1");
    }
}
