package el2;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f253957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(el2.c2 c2Var, cm2.b0 b0Var) {
        super(0);
        this.f253956d = c2Var;
        this.f253957e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.y30 y30Var = com.tencent.mm.plugin.finder.live.plugin.c40.f112107m;
        android.content.Context m17 = this.f253956d.m();
        kotlin.jvm.internal.o.f(m17, "access$getContext(...)");
        cm2.b0 b0Var = this.f253957e;
        y30Var.a(m17, new cm2.b0(b0Var.f43331v, b0Var.f43332w));
        return jz5.f0.f302826a;
    }
}
