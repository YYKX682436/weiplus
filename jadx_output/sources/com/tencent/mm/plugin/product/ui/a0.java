package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class a0 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f153266d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.b0 f153268f;

    public a0(com.tencent.mm.plugin.product.ui.b0 b0Var, java.lang.String str) {
        this.f153268f = b0Var;
        this.f153266d = null;
        this.f153267e = str;
        android.widget.ImageView imageView = (android.widget.ImageView) ((android.view.LayoutInflater) b0Var.f153270d.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.cab, (android.view.ViewGroup) null);
        this.f153266d = imageView;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.tencent.mm.plugin.product.ui.o oVar = new com.tencent.mm.plugin.product.ui.o(str);
        ((x60.e) fVar).getClass();
        imageView.setImageBitmap(x51.w0.d(oVar));
        imageView.setOnClickListener(new com.tencent.mm.plugin.product.ui.y(this, b0Var));
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String str2 = this.f153267e;
        if (str2 != null && str.equals(str2)) {
            this.f153266d.post(new com.tencent.mm.plugin.product.ui.z(this, bitmap));
        }
    }
}
