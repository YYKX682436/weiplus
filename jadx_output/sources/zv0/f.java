package zv0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zv0.f0 f0Var, rv0.n1 n1Var) {
        super(1);
        this.f476172d = f0Var;
        this.f476173e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zv0.r transitionInfo = (zv0.r) obj;
        kotlin.jvm.internal.o.g(transitionInfo, "transitionInfo");
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this.f476172d.getContext());
        i0Var.d(com.tencent.mm.R.string.lkp);
        i0Var.f(com.tencent.mm.R.string.lkq);
        i0Var.f211821b.E = new zv0.e(this.f476173e, transitionInfo);
        i0Var.e(com.tencent.mm.R.string.apj);
        i0Var.h();
        return jz5.f0.f302826a;
    }
}
