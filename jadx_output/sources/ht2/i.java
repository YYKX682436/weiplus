package ht2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f284836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, ht2.y0 y0Var) {
        super(0);
        this.f284836d = bitmap;
        this.f284837e = weImageView;
        this.f284838f = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f284836d;
        if (bitmap != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f284837e;
            weImageView.setIconColor(0);
            weImageView.setColorFilter((android.graphics.ColorFilter) null);
            int d17 = i65.a.d(weImageView.getContext(), com.tencent.mm.R.color.FG_0);
            java.util.regex.Pattern pattern = ht2.y0.f284936g;
            ht2.y0 y0Var = this.f284838f;
            y0Var.getClass();
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
            y0Var.cj(bitmapDrawable, d17);
            weImageView.setImageDrawable(bitmapDrawable);
        }
        return jz5.f0.f302826a;
    }
}
