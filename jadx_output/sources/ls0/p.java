package ls0;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f320879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ls0.v vVar) {
        super(4);
        this.f320879d = vVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long longValue = ((java.lang.Number) obj2).longValue();
        ((java.lang.Boolean) obj4).booleanValue();
        kotlin.jvm.internal.o.g((android.media.MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        java.lang.String str = this.f320879d.f320935g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDecode, format:");
        fs0.g gVar = this.f320879d.f320930b;
        sb6.append(gVar != null ? gVar.f266237g : null);
        sb6.append(", pts:");
        sb6.append(longValue);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ls0.v vVar = this.f320879d;
        synchronized (vVar.f320933e) {
            fs0.g gVar2 = vVar.f320930b;
            android.media.MediaFormat mediaFormat = gVar2 != null ? gVar2.f266237g : null;
            if (!vVar.f320932d) {
                com.tencent.mars.xlog.Log.i(vVar.f320935g, "stopDecoder");
                fs0.g gVar3 = vVar.f320930b;
                if (gVar3 != null) {
                    gVar3.c();
                }
                android.os.HandlerThread handlerThread = vVar.f320936h;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                vVar.f320934f.post(new ls0.o(vVar, mediaFormat));
                vVar.f320932d = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
