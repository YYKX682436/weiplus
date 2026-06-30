package x22;

/* loaded from: classes10.dex */
public final class e implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x22.f f451563a;

    public e(x22.f fVar) {
        this.f451563a = fVar;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                if (strArr[0].length() > 0) {
                    java.lang.String str = strArr[0];
                    x22.f fVar = this.f451563a;
                    fVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInput", "onRes " + str);
                    int P = r26.n0.P(str, "。", 0, false, 6, null);
                    if (P >= 0) {
                        str = str.substring(0, P);
                        kotlin.jvm.internal.o.f(str, "substring(...)");
                    }
                    x22.d dVar = fVar.f451565a;
                    if (dVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "onRes ".concat(str));
                        ((w22.f) dVar).f442529a.f442538i = str;
                    }
                }
            }
        }
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        x22.f fVar = this.f451563a;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInput", "onRecognizeFinish");
        x22.d dVar = fVar.f451565a;
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "onRecognizeFinish voice finish called");
            w22.g gVar = ((w22.f) dVar).f442529a;
            if (!gVar.f442537h) {
                ((y22.m) gVar.f442532c).e(gVar.f442538i);
            }
            gVar.f442537h = true;
        }
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        this.f451563a.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.VoiceInput", "onError " + i18 + ' ' + i19 + ' ' + i17 + ' ' + j17);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        this.f451563a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInput", "onRecordFin");
    }
}
