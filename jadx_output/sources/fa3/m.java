package fa3;

/* loaded from: classes10.dex */
public class m implements bi3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f260769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260771c;

    public m(fa3.b bVar, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260771c = bVar;
        this.f260769a = map;
        this.f260770b = gVar;
    }

    @Override // bi3.j
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera onRecordFinish error %b", java.lang.Boolean.valueOf(z17));
        fa3.b bVar = this.f260771c;
        bVar.f260732r = 1;
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = bVar.f260724j;
        if (mMSightRecordView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera onRecordFinish recordView is null");
            this.f260769a.put("error", "recordView is null");
            this.f260770b.a(this.f260769a);
            this.f260771c.f260734t = false;
            return;
        }
        bVar.f260727m = mMSightRecordView.getVideoFilePath();
        if (z17) {
            this.f260769a.put("error", "stopRecord error");
            this.f260770b.a(this.f260769a);
            this.f260771c.f260734t = false;
            return;
        }
        fa3.b bVar2 = this.f260771c;
        if (bVar2.f260731q) {
            java.lang.String str = bVar2.f260727m;
            com.tencent.mm.plugin.lite.api.g gVar = this.f260770b;
            bVar2.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new fa3.d(bVar2, str, gVar));
        } else {
            fa3.b.a(bVar2, bVar2.f260727m, this.f260770b);
        }
        fa3.b bVar3 = this.f260771c;
        bVar3.f260734t = false;
        bVar3.i();
        fa3.b bVar4 = this.f260771c;
        bVar4.f260724j.setVideoFilePath(bVar4.f260727m);
    }
}
