package sk4;

/* loaded from: classes15.dex */
public final class l implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408983a;

    public l(sk4.p pVar) {
        this.f408983a = pVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AudioRecorderImpl", "onRecError " + i17 + ' ' + i18);
    }

    @Override // tl.c
    public void b(byte[] pcm, int i17) {
        kotlin.jvm.internal.o.g(pcm, "pcm");
        sk4.p pVar = this.f408983a;
        pVar.f408995m++;
        sk4.c cVar = new sk4.c();
        cVar.f300431d = pVar.f408995m;
        cVar.notifyFieldUpdated(0);
        this.f408983a.getClass();
        double d17 = 0.0d;
        for (int i18 = 0; i18 < i17; i18 += 2) {
            double abs = java.lang.Math.abs((short) ((pcm[i18] & 255) | ((pcm[i18 + 1] & 255) << 8)));
            if (abs > d17) {
                d17 = abs;
            }
        }
        cVar.f300432e = (float) ((d17 / 32767.0d) * 100);
        cVar.notifyFieldUpdated(1);
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(pcm);
        kotlin.jvm.internal.o.f(wrap, "wrap(...)");
        cVar.f408969g = new com.tencent.unit_rc.ByteBuffer(wrap);
        ((ku5.t0) ku5.t0.f312615d).h(new sk4.k(this.f408983a, cVar, i17), "MicroMsg.AudioRecorderImpl");
    }
}
