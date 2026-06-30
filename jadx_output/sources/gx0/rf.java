package gx0;

/* loaded from: classes5.dex */
public final class rf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f276932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(vu0.o0 o0Var, gx0.gg ggVar) {
        super(1);
        this.f276932d = o0Var;
        this.f276933e = ggVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("SubtitleRecommendedUseUIC", "asrAudioRemoteCheck: cancel ");
        vu0.o0 o0Var = this.f276932d;
        o0Var.c();
        kotlinx.coroutines.z0.e(o0Var.f440137j, null, 1, null);
        ru0.m.a().m();
        this.f276933e.Z6();
        return jz5.f0.f302826a;
    }
}
