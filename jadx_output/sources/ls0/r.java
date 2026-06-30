package ls0;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f320885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ls0.v vVar) {
        super(1);
        this.f320885d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.media.MediaFormat mediaFormat = (android.media.MediaFormat) obj;
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        com.tencent.mars.xlog.Log.i(this.f320885d.f320935g, "onFormatChanged, format:" + mediaFormat);
        ls0.v vVar = this.f320885d;
        synchronized (vVar.f320933e) {
            if (!vVar.f320932d) {
                com.tencent.mars.xlog.Log.i(vVar.f320935g, "stopDecoder");
                fs0.g gVar = vVar.f320930b;
                if (gVar != null) {
                    gVar.c();
                }
                android.os.HandlerThread handlerThread = vVar.f320936h;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                vVar.f320934f.post(new ls0.q(vVar, mediaFormat));
                vVar.f320932d = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
