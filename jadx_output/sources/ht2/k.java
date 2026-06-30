package ht2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, ht2.y0 y0Var, zy2.p6 p6Var) {
        super(2);
        this.f284849d = weImageView;
        this.f284850e = y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f284849d;
        if (bitmap != null) {
            weImageView.setAlpha(0.8f);
            weImageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(weImageView.getResources(), bitmap));
        } else {
            weImageView.setAlpha(1.0f);
            this.f284850e.getClass();
            weImageView.setImageDrawable(m95.a.e(weImageView.getContext().getResources(), com.tencent.mm.R.raw.icon_outlined_awesome, 0.0f));
        }
        return jz5.f0.f302826a;
    }
}
