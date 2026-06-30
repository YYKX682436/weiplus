package uu0;

/* loaded from: classes5.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu0.c f431231d;

    public f(uu0.c cVar) {
        this.f431231d = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "timer, onTimerExpired to stop record");
        this.f431231d.h(java.lang.Boolean.FALSE);
        return true;
    }
}
