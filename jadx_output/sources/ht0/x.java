package ht0;

/* loaded from: classes10.dex */
public class x implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f284780d;

    public x(ht0.c0 c0Var) {
        this.f284780d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        synchronized (this.f284780d.f284663a) {
            if (this.f284780d.f284671i != null) {
                android.opengl.GLES20.glFinish();
                ht0.c0 c0Var = this.f284780d;
                gs0.w wVar = c0Var.f284671i;
                long j17 = c0Var.f284672j;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                wVar.b((android.os.SystemClock.elapsedRealtime() - j17) * 1000000);
            }
            ht0.c0 c0Var2 = this.f284780d;
            gs0.w wVar2 = c0Var2.f284671i;
            if (wVar2 != null && c0Var2.f284678p.f253039a == ei3.l.WaitStop) {
                wVar2.d();
                ht0.a aVar = this.f284780d.f284670h;
                if (aVar != null) {
                    aVar.f(new ht0.w(this));
                }
                this.f284780d.F.e();
                ht0.c0 c0Var3 = this.f284780d;
                c0Var3.getClass();
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl", new java.lang.Object[0]);
                s75.d.b(new ht0.a0(c0Var3), "X264MP4MuxRecorder_stop");
                ei3.e1 e1Var = this.f284780d.f284678p;
                if (e1Var != null) {
                    e1Var.a(ei3.l.Stop);
                }
            }
        }
        return null;
    }
}
