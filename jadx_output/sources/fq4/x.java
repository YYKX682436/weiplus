package fq4;

/* loaded from: classes15.dex */
public class x implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.y f265652d;

    public x(fq4.y yVar) {
        this.f265652d = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        fq4.y yVar = this.f265652d;
        yVar.f265655c += 100;
        yVar.f265656d += (yVar.f265653a.d() * 100) / 100;
        if (yVar.f265655c < 3000) {
            return true;
        }
        yVar.f265653a.stopRecord();
        yVar.f265654b.d();
        int i17 = yVar.f265656d / 30;
        yVar.f265656d = i17;
        boolean z17 = i17 >= 30;
        com.tencent.mm.autogen.events.VoicePrintNoiseDetectResultEvent voicePrintNoiseDetectResultEvent = new com.tencent.mm.autogen.events.VoicePrintNoiseDetectResultEvent();
        voicePrintNoiseDetectResultEvent.f54937g.f7685a = z17;
        voicePrintNoiseDetectResultEvent.e();
        return false;
    }
}
