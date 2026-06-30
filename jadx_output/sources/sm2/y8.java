package sm2;

/* loaded from: classes3.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409804d = o4Var;
        this.f409805e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.o4 o4Var = this.f409804d;
        com.tencent.mm.plugin.finder.live.plugin.w60 w60Var = o4Var.f409615h0;
        if (w60Var == null) {
            fm2.a aVar = this.f409805e;
            android.view.ViewStub viewStub = (android.view.ViewStub) aVar.findViewById(com.tencent.mm.R.id.fjb);
            w60Var = viewStub != null ? (com.tencent.mm.plugin.finder.live.plugin.w60) o4Var.N(new sm2.x8(viewStub, aVar)) : null;
        }
        o4Var.f409615h0 = w60Var;
        return w60Var;
    }
}
