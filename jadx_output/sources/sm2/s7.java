package sm2;

/* loaded from: classes3.dex */
public final class s7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409698d = o4Var;
        this.f409699e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.r7 r7Var = new sm2.r7(this.f409699e);
        sm2.o4 o4Var = this.f409698d;
        com.tencent.mm.plugin.finder.live.plugin.a8 a8Var = (com.tencent.mm.plugin.finder.live.plugin.a8) o4Var.N(r7Var);
        o4Var.f409624m = a8Var;
        return a8Var;
    }
}
