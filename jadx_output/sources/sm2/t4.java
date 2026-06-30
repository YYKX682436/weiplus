package sm2;

/* loaded from: classes3.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409714d = o4Var;
        this.f409715e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.s4 s4Var = new sm2.s4(this.f409715e);
        sm2.o4 o4Var = this.f409714d;
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) o4Var.N(s4Var);
        o4Var.S = h8Var;
        return h8Var;
    }
}
