package pa3;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa3.i f352982d;

    public h(pa3.i iVar) {
        this.f352982d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pa3.i iVar = this.f352982d;
        iVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.h("type", "minimize");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "api");
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(iVar.A, 0L, "tasks.addTask", gVar);
    }
}
