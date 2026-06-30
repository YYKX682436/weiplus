package ga3;

/* loaded from: classes15.dex */
public class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f269862d;

    public o(ga3.v vVar) {
        this.f269862d = vVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "timer, onTimerExpired to stop record");
        this.f269862d.k();
        return true;
    }
}
