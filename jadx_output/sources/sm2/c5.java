package sm2;

/* loaded from: classes3.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409412d = o4Var;
        this.f409413e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.a aVar = this.f409413e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.findViewById(com.tencent.mm.R.id.f482627jp);
        xu2.u uVar = viewGroup != null ? new xu2.u(viewGroup, aVar) : null;
        this.f409412d.f409626n = uVar;
        return uVar;
    }
}
