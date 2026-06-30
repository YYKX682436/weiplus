package ht2;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.n6 f284934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, ht2.y0 y0Var, zy2.n6 n6Var) {
        super(2);
        this.f284932d = weImageView;
        this.f284933e = y0Var;
        this.f284934f = n6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String url = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f284932d;
        if (bitmap != null) {
            weImageView.setAlpha(0.8f);
            weImageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(weImageView.getResources(), bitmap));
        } else {
            weImageView.setAlpha(1.0f);
            this.f284933e.uj(weImageView, this.f284934f);
        }
        return jz5.f0.f302826a;
    }
}
