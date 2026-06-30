package dn2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.j0 f241922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(dn2.j0 j0Var) {
        super(0);
        this.f241922d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dn2.j0 j0Var = this.f241922d;
        android.view.View view = j0Var.f241929a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        android.graphics.drawable.Drawable e17 = m95.a.e(view.getContext().getResources(), com.tencent.mm.R.raw.icons_filled_shop, 0.0f);
        e17.setBounds(0, 0, j0Var.e(), j0Var.e());
        android.view.View view2 = j0Var.f241929a;
        if (view2 != null) {
            e17.setColorFilter(new android.graphics.PorterDuffColorFilter(view2.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an), android.graphics.PorterDuff.Mode.SRC_ATOP));
            return new al5.w(e17, 1);
        }
        kotlin.jvm.internal.o.o("bulletContent");
        throw null;
    }
}
