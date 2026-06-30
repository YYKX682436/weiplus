package ze5;

/* loaded from: classes9.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f472183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(ze5.w8 w8Var) {
        super(1);
        this.f472183d = w8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ze5.w8 w8Var = this.f472183d;
        w8Var.getClass();
        boolean z17 = !(w8Var instanceof ze5.j8);
        com.tencent.mm.ui.base.MaskLayout maskLayout = it.avatarMask;
        if (maskLayout != null) {
            maskLayout.setVisibility(z17 ? 0 : 8);
        }
        android.view.View view = it.f472116h;
        if (view != null) {
            int a17 = z17 ? 0 : i65.a.a(view.getContext(), 4.0f);
            if (w8Var.M()) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a17, view.getPaddingBottom());
            } else {
                view.setPadding(a17, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            }
        }
        return jz5.f0.f302826a;
    }
}
