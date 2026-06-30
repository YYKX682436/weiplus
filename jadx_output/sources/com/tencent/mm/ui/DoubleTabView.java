package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class DoubleTabView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f196632d;

    /* renamed from: e, reason: collision with root package name */
    public int f196633e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f196634f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f196635g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f196636h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Matrix f196637i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.MMTabView f196638m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.MMTabView f196639n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f196640o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f196641p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.q3 f196642q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f196643r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f196644s;

    public DoubleTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196633e = 0;
        this.f196637i = new android.graphics.Matrix();
        this.f196643r = new com.tencent.mm.ui.p3(this);
        this.f196644s = false;
        a();
    }

    public final void a() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        this.f196635g = linearLayout;
        linearLayout.setBackgroundResource(com.tencent.mm.R.color.aaw);
        this.f196635g.setId(com.tencent.mm.R.id.d2k);
        this.f196635g.setOrientation(0);
        addView(this.f196635g, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f196636h = imageView;
        imageView.setImageMatrix(this.f196637i);
        this.f196636h.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f196636h.setId(com.tencent.mm.R.id.d2l);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, i65.a.b(getContext(), 3));
        layoutParams.addRule(8, com.tencent.mm.R.id.d2k);
        addView(this.f196636h, layoutParams);
        com.tencent.mm.ui.MMTabView mMTabView = new com.tencent.mm.ui.MMTabView(getContext(), 0);
        mMTabView.setTag(0);
        android.view.View.OnClickListener onClickListener = this.f196643r;
        mMTabView.setOnClickListener(onClickListener);
        this.f196638m = mMTabView;
        mMTabView.setText(this.f196640o);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aci));
        layoutParams2.weight = 1.0f;
        this.f196635g.addView(this.f196638m, layoutParams2);
        com.tencent.mm.ui.MMTabView mMTabView2 = new com.tencent.mm.ui.MMTabView(getContext(), 1);
        mMTabView2.setTag(1);
        mMTabView2.setOnClickListener(onClickListener);
        this.f196639n = mMTabView2;
        mMTabView2.setText(this.f196641p);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aci));
        layoutParams3.weight = 1.0f;
        this.f196635g.addView(this.f196639n, layoutParams3);
    }

    public int getCurentIndex() {
        return this.f196633e;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = (i19 - i17) / 2;
        this.f196632d = i28;
        android.graphics.Bitmap bitmap = this.f196634f;
        if (bitmap == null || bitmap.getWidth() != i28) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            android.graphics.Bitmap bitmap2 = this.f196634f;
            objArr[0] = java.lang.Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = java.lang.Integer.valueOf(i28);
            com.tencent.mars.xlog.Log.w("MicroMsg.DoubleTabView", "sharp width changed, from %d to %d", objArr);
            int b17 = i65.a.b(getContext(), 3);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(b17));
            arrayList.add(java.lang.Integer.valueOf(i28));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/DoubleTabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/DoubleTabView", "initSharpBarBitmap", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f196634f = createBitmap;
            new android.graphics.Canvas(this.f196634f).drawColor(getResources().getColor(com.tencent.mm.R.color.aaq));
            android.graphics.Matrix matrix = this.f196637i;
            matrix.setTranslate(this.f196632d * (this.f196633e + 0.0f), 0.0f);
            this.f196636h.setImageMatrix(matrix);
            this.f196636h.setImageBitmap(this.f196634f);
        }
        setTo(this.f196633e);
    }

    public void setFirstTabString(java.lang.String str) {
        this.f196640o = str;
        this.f196638m.setText(str);
        this.f196638m.setContentDescription(str + "，" + getResources().getString(com.tencent.mm.R.string.igy));
        requestLayout();
    }

    public void setFirstTabUnReadCount(java.lang.String str) {
        com.tencent.mm.ui.MMTabView mMTabView = this.f196638m;
        if (mMTabView != null) {
            mMTabView.setUnread(str);
        }
    }

    public void setOnTabClickListener(com.tencent.mm.ui.q3 q3Var) {
        this.f196642q = q3Var;
    }

    public void setSecondTabString(java.lang.String str) {
        this.f196641p = str;
        this.f196639n.setText(str);
        this.f196639n.setContentDescription(str + "，" + getResources().getString(com.tencent.mm.R.string.igy));
        requestLayout();
    }

    public void setSecondTabUnReadCount(java.lang.String str) {
        com.tencent.mm.ui.MMTabView mMTabView = this.f196639n;
        if (mMTabView != null) {
            mMTabView.setUnread(str);
        }
    }

    public void setThirdTabString(java.lang.String str) {
        throw null;
    }

    public void setTo(int i17) {
        this.f196633e = i17;
        this.f196638m.setTextColor(i17 == 0 ? getResources().getColor(com.tencent.mm.R.color.aaq) : getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f196639n.setTextColor(this.f196633e == 1 ? getResources().getColor(com.tencent.mm.R.color.aaq) : getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    public DoubleTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196633e = 0;
        this.f196637i = new android.graphics.Matrix();
        this.f196643r = new com.tencent.mm.ui.p3(this);
        this.f196644s = false;
        a();
    }
}
