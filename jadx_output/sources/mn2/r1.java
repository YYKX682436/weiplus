package mn2;

/* loaded from: classes10.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mn2.r1 f330102d = new mn2.r1();

    public r1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yo0.f fVar = new yo0.f();
        com.tencent.mm.sdk.platformtools.c4 INSTANCE = com.tencent.mm.sdk.platformtools.c4.f192496b;
        kotlin.jvm.internal.o.f(INSTANCE, "INSTANCE");
        fVar.f464088l = INSTANCE;
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464084h = com.tencent.mm.R.color.BW_97;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        fVar.f464082f = ((java.lang.Number) t70Var.u().r()).intValue();
        fVar.f464081e = ((java.lang.Number) t70Var.v().r()).intValue();
        fVar.f464086j = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        return fVar.a();
    }
}
