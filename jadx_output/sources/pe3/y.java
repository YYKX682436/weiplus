package pe3;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ se3.f f353689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(pe3.g0 g0Var, se3.f fVar) {
        super(1);
        this.f353688d = g0Var;
        this.f353689e = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView it = (com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pe3.g0 g0Var = this.f353688d;
        kotlinx.coroutines.l.d(g0Var.getMainScope(), null, null, new pe3.x(g0Var, it, this.f353689e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
