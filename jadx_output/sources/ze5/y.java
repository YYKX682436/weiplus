package ze5;

/* loaded from: classes9.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.c0 f472303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ze5.c0 c0Var, yb5.d dVar) {
        super(1);
        this.f472303d = c0Var;
        this.f472304e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.n8 holder = (ze5.n8) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.mvvm.MvvmView mvvmView = holder.f472111c;
        if (mvvmView != null) {
            mvvmView.setOnClickListener(this.f472303d.w(this.f472304e));
        }
        return jz5.f0.f302826a;
    }
}
