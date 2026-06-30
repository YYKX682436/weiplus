package zf4;

/* loaded from: classes13.dex */
public class s implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.w f472689d;

    public s(zf4.w wVar) {
        this.f472689d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zf4.w wVar = this.f472689d;
        wVar.f472701g.q("record");
        wVar.f472695a = new w21.k0();
        s75.d.b(new zf4.v(wVar), "VoiceRemindRecorder_record");
        wVar.f472700f = 1;
        wVar.f472702h.c(3000L, 3000L);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        return null;
    }
}
