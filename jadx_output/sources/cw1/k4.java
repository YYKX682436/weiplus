package cw1;

/* loaded from: classes10.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f223085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(cw1.q4 q4Var) {
        super(1);
        this.f223085d = q4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kn5.e create = (kn5.e) obj;
        kotlin.jvm.internal.o.g(create, "$this$create");
        cw1.q4 q4Var = this.f223085d;
        create.f309790g = q4Var.f223265d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.akh);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI = q4Var.f223265d;
        int dimensionPixelSize = cleanChattingDetailUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.agu);
        create.f309791h = -dimensionPixelSize;
        create.f309792i = dimensionPixelSize;
        cleanChattingDetailUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479556yd);
        return jz5.f0.f302826a;
    }
}
