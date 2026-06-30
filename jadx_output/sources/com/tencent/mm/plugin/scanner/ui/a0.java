package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes5.dex */
public class a0 extends androidx.viewpager.widget.a implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f159496d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f159497e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f159498f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int f159499g;

    public a0(com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI, android.content.Context context) {
        this.f159496d = context;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.f159499g = context.getResources().getColor(com.tencent.mm.R.color.f479233tl);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        android.widget.ImageView a17;
        if (bitmap == null || bitmap.isRecycled() || com.tencent.mm.sdk.platformtools.t8.K0(str) || (a17 = a(str)) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.z(this, a17, bitmap));
    }

    public final android.widget.ImageView a(java.lang.String str) {
        java.util.Map map = this.f159498f;
        if (((java.util.HashMap) map).containsKey(str)) {
            return (android.widget.ImageView) ((java.util.HashMap) map).get(str);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this.f159496d);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((java.util.HashMap) map).put(str, imageView);
        return imageView;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.widget.ImageView) obj);
        java.lang.String str = (java.lang.String) this.f159497e.get(i17);
        java.util.HashMap hashMap = (java.util.HashMap) this.f159498f;
        if (hashMap.containsKey(str)) {
            hashMap.remove(str);
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f159497e.size();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        java.lang.String str = (java.lang.String) this.f159497e.get(i17);
        android.widget.ImageView a17 = a(str);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        e04.s3 s3Var = new e04.s3(str);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            a17.setImageBitmap(null);
            a17.setBackgroundColor(this.f159499g);
        } else {
            a17.setImageBitmap(d17);
            a17.setBackgroundColor(0);
        }
        try {
            viewGroup.addView(a17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProductFurtherInfoUI", "Add view failed: " + e17.getMessage());
        }
        return a17;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
