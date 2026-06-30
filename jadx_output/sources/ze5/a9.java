package ze5;

/* loaded from: classes9.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.c9 f471826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q31.p f471829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(ze5.c9 c9Var, rd5.d dVar, yb5.d dVar2, q31.p pVar) {
        super(1);
        this.f471826d = c9Var;
        this.f471827e = dVar;
        this.f471828f = dVar2;
        this.f471829g = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.z8 it = (ze5.z8) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ze5.c9 c9Var = this.f471826d;
        c9Var.getClass();
        com.tencent.mm.mvvm.MvvmView mvvmView = it.f472352b;
        yb5.d dVar = this.f471828f;
        if (mvvmView != null) {
            mvvmView.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f471827e, dVar.D(), it, dVar.x()));
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = it.f472352b;
        if (mvvmView2 != null) {
            mvvmView2.setOnLongClickListener(c9Var.u(dVar));
        }
        com.tencent.mm.mvvm.MvvmView mvvmView3 = it.f472352b;
        if (mvvmView3 != null) {
            mvvmView3.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView4 = it.f472352b;
        if (mvvmView4 != null) {
            mvvmView4.setViewModel(this.f471829g);
        }
        return jz5.f0.f302826a;
    }
}
