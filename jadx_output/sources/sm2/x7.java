package sm2;

/* loaded from: classes3.dex */
public final class x7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409786d = o4Var;
        this.f409787e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.c7 c7Var = new sm2.c7(this.f409787e);
        sm2.o4 o4Var = this.f409786d;
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = (com.tencent.mm.plugin.finder.live.plugin.ow) o4Var.N(c7Var);
        o4Var.f409635u = owVar;
        return owVar;
    }
}
