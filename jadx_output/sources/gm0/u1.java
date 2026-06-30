package gm0;

/* loaded from: classes12.dex */
public class u1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f273279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km0.b f273280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gm0.z1 f273281c;

    public u1(gm0.z1 z1Var, long j17, km0.b bVar) {
        this.f273281c = z1Var;
        this.f273279a = j17;
        this.f273280b = bVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        gm0.c2.b("executeBootExtension");
        synchronized (this.f273281c.f273298c) {
            this.f273281c.f273299d = true;
        }
        im0.a.a("summerboot mmskeleton boot startup finished in [%s]!", (java.lang.System.currentTimeMillis() - this.f273279a) + "ms");
        this.f273281c.f273303h.b();
        this.f273281c.f273302g.b();
        ((ku5.t0) ku5.t0.f312615d).g(new gm0.t1(this));
        gm0.c2.b("onStartupDone");
        com.tencent.mm.app.u6.INSTANCE.h(com.tencent.mm.app.t6.UNTIL_KERNEL_STARTUP_END);
        this.f273281c.f273300e = java.lang.System.currentTimeMillis();
        this.f273280b.f308991e.f308986f = this.f273281c.f273300e;
    }
}
