package yt3;

/* loaded from: classes10.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f465450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f465451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f465452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(yt3.r4 r4Var, lt3.f0 f0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        super(0);
        this.f465449d = r4Var;
        this.f465450e = f0Var;
        this.f465451f = h0Var;
        this.f465452g = recordConfigProvider;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yt3.r4 r4Var = this.f465449d;
        lt3.f0 f0Var = this.f465450e;
        st3.s sVar = r4Var.f465651i;
        kotlin.jvm.internal.o.d(sVar);
        r45.on0 on0Var = (r45.on0) this.f465451f.f310123d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f465452g;
        long j17 = recordConfigProvider.f155668J;
        st3.r rVar = this.f465449d.f465652m;
        int i17 = recordConfigProvider.F;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "mix in background");
        ((ku5.t0) ku5.t0.f312615d).g(new yt3.n4(r4Var, f0Var, rVar, sVar, on0Var, j17, i17));
        return jz5.f0.f302826a;
    }
}
