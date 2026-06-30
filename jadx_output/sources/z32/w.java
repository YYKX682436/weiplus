package z32;

/* loaded from: classes12.dex */
public final class w implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f469950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469951b;

    public w(k91.v5 v5Var, r45.ed6 ed6Var) {
        this.f469950a = v5Var;
        this.f469951b = ed6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str2 = this.f469950a.field_username;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str2;
            nxVar.f7467b = this.f469951b.f373333m;
            nxVar.f7469d = com.tencent.mm.plugin.appbrand.ad.jsapi.c.CTRL_INDEX;
            startAppBrandUIFromOuterEvent.e();
        }
    }
}
