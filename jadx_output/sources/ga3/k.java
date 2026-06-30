package ga3;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.plugin.appbrand.media.record.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga3.v f269859a;

    public k(ga3.v vVar) {
        this.f269859a = vVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.media.record.k
    public void a() {
        ga3.v vVar = this.f269859a;
        if (vVar.f269896v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "is interrupting");
        } else {
            vVar.f269896v = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onInterruptionBegin");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.media.record.k
    public void b() {
        ga3.v vVar = this.f269859a;
        if (!vVar.f269896v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "not call onInterruptionEnd");
        } else {
            vVar.f269896v = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onInterruptionEnd");
        }
    }
}
