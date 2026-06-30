package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class FilterImageView extends android.widget.LinearLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.ui.tools.n3[] f210041r = {new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("原图", "原圖", "Normal"), "icon.png", 0, 0, "MatteOrigin.jpg", 0), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("LOMO", "LOMO", "LOMO"), "nuowei_mask%02d.jpg", 2, 1, "0004.jpg", 2), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("麦田", "麥田", "Wheat"), "0062_%02d.jpg", 2, 2, "0062.jpg", 20), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("玻璃镜", "玻璃鏡", "Glossy"), "habi_mask%02d.jpg", 1, 3, "0005.jpg", 4), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("拍立得", "拍立得", "Polaroid"), "0063_%02d.jpg", 2, 4, "0063.jpg", 21), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("湖水", "湖水", "Lake"), "0061_%02d.jpg", 1, 5, "0061.jpg", 19), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("黄昏", "黃昏", "Twilight"), "0030_mask%01d.jpg", 1, 6, "0030.jpg", 7), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("黑白", "黑白", "B&W"), "0065_%02d.jpg", 1, 7, "0065.jpg", 22), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("铜版画", "銅版畫", "Aquatint"), "0032_mask%01d.jpg", 1, 8, "0032.jpg", 9), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("圆珠笔", "圓珠筆", "Pen"), "0035_mask%01d.jpg", 1, 9, "0035.jpg", 18), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("海报", "海報", "Poster"), "0036_mask%01d.jpg", 0, 10, "0036.jpg", 17), new com.tencent.mm.ui.tools.n3(new com.tencent.mm.ui.tools.m3("素描", "素描", "Portrait"), "icon.jpg", 0, 11, "0040.jpg", 12)};

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f210042d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f210043e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f210044f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f210045g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.CropImageView f210046h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f210047i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMHorList f210048m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.tools.l3 f210049n;

    /* renamed from: o, reason: collision with root package name */
    public int f210050o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f210051p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f210052q;

    public FilterImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210050o = 0;
        android.app.Activity activity = (android.app.Activity) context;
        this.f210042d = activity;
        android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.a3a, this);
        this.f210046h = (com.tencent.mm.ui.tools.CropImageView) inflate.findViewById(com.tencent.mm.R.id.cn6);
        this.f210045g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cne);
        this.f210044f = inflate.findViewById(com.tencent.mm.R.id.cn_);
        this.f210046h.setOnTouchListener(null);
        this.f210048m = (com.tencent.mm.ui.base.MMHorList) inflate.findViewById(com.tencent.mm.R.id.f483991cn3);
        com.tencent.mm.ui.tools.l3 l3Var = new com.tencent.mm.ui.tools.l3(this);
        this.f210049n = l3Var;
        this.f210048m.setAdapter((android.widget.ListAdapter) l3Var);
        this.f210048m.invalidate();
        this.f210048m.setOnItemClickListener(new com.tencent.mm.ui.tools.j3(this));
    }

    public static boolean a(com.tencent.mm.ui.tools.FilterImageView filterImageView, java.lang.String str, int i17, int i18) {
        if (i18 == 0) {
            android.graphics.Bitmap bitmap = filterImageView.f210047i;
            bitmap.setPixels(filterImageView.f210043e, 0, bitmap.getWidth(), 0, 0, filterImageView.f210047i.getWidth(), filterImageView.f210047i.getHeight());
            filterImageView.f210046h.invalidate();
            return true;
        }
        int width = filterImageView.f210047i.getWidth() * filterImageView.f210047i.getHeight();
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i17, width);
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.String format = java.lang.String.format(str, java.lang.Integer.valueOf(i19));
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = filterImageView.f210042d.getAssets().open("filter/" + format);
                    byte[] bArr = new byte[width];
                    inputStream.read(bArr);
                    android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
                    inputStream.close();
                    inputStream.close();
                    if (G != null) {
                        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(G, filterImageView.f210047i.getWidth(), filterImageView.f210047i.getHeight(), true);
                        if (G != createScaledBitmap) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", G.toString());
                            G.recycle();
                        }
                        if (createScaledBitmap != null) {
                            createScaledBitmap.getPixels(iArr[i19], 0, createScaledBitmap.getWidth(), 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                            com.tencent.mars.xlog.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", createScaledBitmap.toString());
                            createScaledBitmap.recycle();
                        }
                    }
                    return false;
                } catch (java.lang.Exception e17) {
                    throw e17;
                }
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th6;
            }
        }
        com.tencent.mm.pointers.PIntArray pIntArray = new com.tencent.mm.pointers.PIntArray();
        com.tencent.mars.xlog.Log.e("MicroMsg.FilterView", "src.len:" + filterImageView.f210043e.length);
        for (int i27 = 0; i27 < iArr.length; i27++) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilterView", "mask[" + i27 + "].len:" + iArr[i27].length);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FilterView", "before filter");
        com.tencent.mm.ui.tools.ImgFilter.FilterInt(i18, filterImageView.f210043e, iArr, i17, filterImageView.f210047i.getWidth(), filterImageView.f210047i.getHeight(), pIntArray);
        com.tencent.mars.xlog.Log.e("MicroMsg.FilterView", "after filter");
        android.graphics.Bitmap bitmap2 = filterImageView.f210047i;
        bitmap2.setPixels(pIntArray.value, 0, bitmap2.getWidth(), 0, 0, filterImageView.f210047i.getWidth(), filterImageView.f210047i.getHeight());
        filterImageView.f210046h.invalidate();
        return true;
    }

    public void b(java.lang.String str, int i17) {
        int i18 = i17 % 180;
        com.tencent.mars.xlog.Log.i("MicroMsg.FilterView", "filePath before fiterBmp:" + str);
        android.graphics.Bitmap bitmap = this.f210047i;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f210047i = com.tencent.mm.sdk.platformtools.x.w0(com.tencent.mm.sdk.platformtools.x.T(str, 480, 480, false), i17);
        }
        this.f210047i.getWidth();
        this.f210047i.getHeight();
        int[] iArr = new int[this.f210047i.getWidth() * this.f210047i.getHeight()];
        this.f210043e = iArr;
        android.graphics.Bitmap bitmap2 = this.f210047i;
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, this.f210047i.getWidth(), this.f210047i.getHeight());
        this.f210046h.setImageBitmap(this.f210047i);
    }

    public android.view.View getCropAreaView() {
        return this.f210044f;
    }

    public com.tencent.mm.ui.tools.CropImageView getCropImageIV() {
        return this.f210046h;
    }

    public android.graphics.Bitmap getFilterBmp() {
        return this.f210047i;
    }

    public int getFilterId() {
        return this.f210050o;
    }

    public void setCropMaskBackground(int i17) {
        android.widget.ImageView imageView = this.f210045g;
        if (imageView != null) {
            imageView.setBackgroundResource(i17);
        }
    }

    public void setCropMaskVisible(int i17) {
        android.widget.ImageView imageView = this.f210045g;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
    }

    public void setImage(android.graphics.Bitmap bitmap) {
        this.f210047i = bitmap;
    }

    public void setLimitZoomIn(boolean z17) {
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210046h;
        if (cropImageView != null) {
            cropImageView.setLimitZoomIn(z17);
        }
    }

    public void setMatrix(android.graphics.Matrix matrix) {
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210046h;
        if (cropImageView != null) {
            cropImageView.setImageMatrix(matrix);
        }
    }

    public void setOnConfirmImp(java.lang.Runnable runnable) {
        this.f210051p = runnable;
    }

    public void setOnExitImp(java.lang.Runnable runnable) {
        this.f210052q = runnable;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 == 0) {
            this.f210049n.notifyDataSetChanged();
            this.f210048m.invalidate();
        }
        super.setVisibility(i17);
    }
}
