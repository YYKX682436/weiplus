package cx;

/* loaded from: classes7.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.a2 f224492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(cx.a2 a2Var) {
        super(0);
        this.f224492d = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cx.a2 a2Var = this.f224492d;
        cx.a2.wi(a2Var);
        ((dq0.c0) ((dq0.i) i95.n0.c(dq0.i.class))).Ai("MagicBrandService", a2Var.Bi());
        ((dq0.c0) ((dq0.i) i95.n0.c(dq0.i.class))).Ai("MagicAdBrandService", a2Var.Ai());
        if (((hw.d1) ((d10.n) i95.n0.c(d10.n.class))).mj()) {
            dq0.i iVar = (dq0.i) i95.n0.c(dq0.i.class);
            io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin = (io.flutter.embedding.engine.plugins.FlutterPlugin) ((jz5.n) a2Var.f224374h).getValue();
            kotlin.jvm.internal.o.e(flutterPlugin, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.flutter.IMagicSclHandler");
            ((dq0.c0) iVar).Ai("MagicEcsTimelineSubscribe", (dq0.j) flutterPlugin);
        }
        return (dq0.i) i95.n0.c(dq0.i.class);
    }
}
