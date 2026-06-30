package kj2;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.e0 f308394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kj2.e0 e0Var) {
        super(1);
        this.f308394d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ColorDrawable[]{new android.graphics.drawable.ColorDrawable(((java.lang.Number) obj).intValue()), new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#80000000"))});
        kj2.e0 e0Var = this.f308394d;
        e0Var.N = layerDrawable;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = e0Var.L;
        if (roundCornerRelativeLayout != null) {
            roundCornerRelativeLayout.setBackgroundDrawable(e0Var.getTagLayoutBackgroundDrawable());
        }
        return jz5.f0.f302826a;
    }
}
