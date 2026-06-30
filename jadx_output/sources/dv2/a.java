package dv2;

/* loaded from: classes10.dex */
public final class a implements com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.b f243804a;

    public a(dv2.b bVar) {
        this.f243804a = bVar;
    }

    @Override // com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback
    public final void complete(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dv2.b bVar = this.f243804a;
        sb6.append(bVar.hashCode());
        sb6.append(" report task reportMsgReadCGI complete username=");
        sb6.append(bVar.f243814e);
        sb6.append(",sessionId=");
        sb6.append(bVar.f243813d);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
    }
}
