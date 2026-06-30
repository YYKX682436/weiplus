package k72;

/* loaded from: classes14.dex */
public class r implements k72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k72.s f304744a;

    public r(k72.s sVar) {
        this.f304744a = sVar;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "on record error");
        k72.t tVar = this.f304744a.f304748g.f304760r;
        if (tVar != null) {
            ((l72.j) tVar).a(2, -1, "", "", 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 47L, 1L, false);
        }
    }
}
