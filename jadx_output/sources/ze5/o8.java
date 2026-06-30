package ze5;

/* loaded from: classes9.dex */
public final class o8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f472132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f472134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q31.p f472135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(rd5.d dVar, yb5.d dVar2, ze5.w8 w8Var, q31.p pVar) {
        super(1);
        this.f472132d = dVar;
        this.f472133e = dVar2;
        this.f472134f = w8Var;
        this.f472135g = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.mvvm.MvvmView mvvmView = it.f472111c;
        yb5.d dVar = this.f472133e;
        if (mvvmView != null) {
            mvvmView.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f472132d, dVar.D(), it, dVar.x()));
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = it.f472111c;
        if (mvvmView2 != null) {
            mvvmView2.setOnLongClickListener(this.f472134f.u(dVar));
        }
        com.tencent.mm.mvvm.MvvmView mvvmView3 = it.f472111c;
        if (mvvmView3 != null) {
            mvvmView3.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView4 = it.f472111c;
        if (mvvmView4 != null) {
            mvvmView4.setViewModel(this.f472135g);
        }
        return jz5.f0.f302826a;
    }
}
