package sm2;

/* loaded from: classes3.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409507d = o4Var;
        this.f409508e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.h7 h7Var = new sm2.h7(this.f409508e);
        sm2.o4 o4Var = this.f409507d;
        com.tencent.mm.plugin.finder.live.plugin.t8 t8Var = (com.tencent.mm.plugin.finder.live.plugin.t8) o4Var.N(h7Var);
        o4Var.U = t8Var;
        return t8Var;
    }
}
