package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public class p3 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141708d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f141709e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View[] f141710f;

    public p3(android.content.Context context, java.lang.String[] strArr) {
        this.f141709e = new java.lang.String[0];
        this.f141708d = context;
        if (strArr != null) {
            this.f141709e = strArr;
        }
        this.f141710f = new android.view.View[this.f141709e.length];
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f141709e.length;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        android.view.View[] viewArr = this.f141710f;
        android.view.View view = viewArr[i17];
        if (view == null) {
            view = android.view.View.inflate(this.f141708d, com.tencent.mm.R.layout.bdl, null);
            viewArr[i17] = view;
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.glc);
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.gle);
            progressBar.setVisibility(0);
            n11.a b17 = n11.a.b();
            java.lang.String str = this.f141709e[i17];
            o11.f fVar = new o11.f();
            fVar.f342079c = true;
            b17.i(str, imageView, fVar.a(), new com.tencent.mm.plugin.game.ui.n3(this, progressBar));
        }
        viewGroup.addView(view);
        view.setOnClickListener(new com.tencent.mm.plugin.game.ui.o3(this));
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
