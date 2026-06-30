package ht0;

/* loaded from: classes10.dex */
public class u implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f284779d;

    public u(ht0.c0 c0Var) {
        this.f284779d = c0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.X264MP4MuxRecorder", "preview callback data is null");
            return false;
        }
        ht0.c0 c0Var = this.f284779d;
        ei3.e1 e1Var = c0Var.f284678p;
        ei3.l lVar = e1Var.f253039a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar != lVar2 && lVar != lVar3) {
            return false;
        }
        if (lVar == lVar3) {
            e1Var.f253039a = ei3.l.WaitStop;
        }
        c0Var.f284685w.a(1L);
        ht0.a aVar = c0Var.f284670h;
        if (aVar != null) {
            aVar.f253133j = true;
        }
        long nanoTime = java.lang.System.nanoTime();
        ht0.t tVar = new ht0.t(this);
        ls0.k kVar = c0Var.F;
        kVar.getClass();
        kVar.d(new ls0.f(kVar, bArr, nanoTime, tVar));
        c0Var.f284684v.a(1L);
        return true;
    }
}
