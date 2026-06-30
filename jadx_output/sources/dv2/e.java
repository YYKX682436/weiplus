package dv2;

/* loaded from: classes10.dex */
public final class e implements com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.h f243833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.c f243834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f243835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243837e;

    public e(dv2.h hVar, dv2.c cVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f243833a = hVar;
        this.f243834b = cVar;
        this.f243835c = i17;
        this.f243836d = str;
        this.f243837e = str2;
    }

    @Override // com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback
    public final void complete(boolean z17) {
        dv2.h hVar = this.f243833a;
        com.tencent.mars.xlog.Log.i(hVar.f243857d, hVar.hashCode() + ' ' + this.f243834b + " reportMsgReadCGI complete unreadCount=" + this.f243835c + " username=" + this.f243836d + ",sessionId=" + this.f243837e);
        hVar.R6();
    }
}
