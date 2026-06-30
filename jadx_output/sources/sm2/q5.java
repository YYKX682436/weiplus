package sm2;

/* loaded from: classes3.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f409668d = aVar;
        this.f409669e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409668d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.findViewById(com.tencent.mm.R.id.ia_);
        sm2.o4 o4Var = this.f409669e;
        if (viewGroup != null) {
            o4Var.A = (com.tencent.mm.plugin.finder.live.plugin.et) o4Var.N(new sm2.p5(viewGroup, aVar));
        }
        return o4Var.A;
    }
}
