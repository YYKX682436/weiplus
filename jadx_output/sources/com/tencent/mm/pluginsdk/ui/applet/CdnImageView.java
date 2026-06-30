package com.tencent.mm.pluginsdk.ui.applet;

/* loaded from: classes9.dex */
public class CdnImageView extends com.tencent.mm.ui.MMImageView implements mg5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189891d;

    /* renamed from: e, reason: collision with root package name */
    public int f189892e;

    /* renamed from: f, reason: collision with root package name */
    public int f189893f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f189894g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189895h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f189896i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f189897m;

    /* renamed from: n, reason: collision with root package name */
    public float f189898n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189899o;

    /* renamed from: p, reason: collision with root package name */
    public wu5.c f189900p;

    public CdnImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView, android.graphics.Bitmap bitmap) {
        cdnImageView.getClass();
        if (bitmap != null) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, cdnImageView.getCacheFilePath(), false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CdnImageView", e17, "saveBitmapToLocalCache error: %s", e17.getMessage());
            }
        }
    }

    private java.lang.String getAccImagesPath() {
        return lp0.b.D() + "wallet_images/";
    }

    private java.lang.String getCacheFilePath() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189894g)) {
            return this.f189894g;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189895h)) {
            return this.f189895h + kk.k.g(this.f189891d.getBytes());
        }
        com.tencent.mm.vfs.w6.u(getAccImagesPath());
        return getAccImagesPath() + kk.k.g(this.f189891d.getBytes());
    }

    public void b(java.lang.String str, int i17, int i18, int i19) {
        c(str, i17, i18, i19, null);
    }

    public void c(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        int i27;
        android.graphics.Bitmap i07;
        int i28;
        int i29;
        android.graphics.Bitmap i08;
        this.f189891d = str;
        this.f189892e = i17;
        this.f189893f = i18;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f189894g = str2;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189894g) && (i08 = com.tencent.mm.sdk.platformtools.x.i0(this.f189894g)) != null && i08.getWidth() > 0 && i08.getHeight() > 0) {
            setImageBitmap(i08);
            setImageBitmapCompleted(i08);
            return;
        }
        if (str == null || str.length() == 0) {
            setVisibility(8);
            return;
        }
        boolean z17 = false;
        if (!str.startsWith("http")) {
            if (!com.tencent.mm.vfs.w6.j(str)) {
                setVisibility(8);
                return;
            }
            int i37 = this.f189892e;
            android.graphics.Bitmap i09 = (i37 <= 0 || (i27 = this.f189893f) <= 0) ? com.tencent.mm.sdk.platformtools.x.i0(str) : com.tencent.mm.sdk.platformtools.x.T(str, i27, i37, true);
            if (i09 == null) {
                setVisibility(8);
                return;
            }
            if (this.f189896i) {
                i09 = this.f189898n > 0.0f ? com.tencent.mm.sdk.platformtools.x.s0(i09, false, i09.getWidth() * this.f189898n) : com.tencent.mm.sdk.platformtools.x.s0(i09, false, i09.getWidth() * 0.5f);
            }
            setImageBitmap(i09);
            setImageBitmapCompleted(i09);
            return;
        }
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        if (Bi != null) {
            int i38 = this.f189892e;
            if (i38 > 0 && (i29 = this.f189893f) > 0) {
                Bi = com.tencent.mm.sdk.platformtools.x.S(Bi, i29, i38, true, false);
            }
            if (this.f189896i && Bi != null) {
                Bi = this.f189898n > 0.0f ? com.tencent.mm.sdk.platformtools.x.s0(Bi, false, Bi.getWidth() * this.f189898n) : com.tencent.mm.sdk.platformtools.x.s0(Bi, false, Bi.getWidth() * 0.5f);
            }
            setImageBitmap(Bi);
            setImageBitmapCompleted(Bi);
            return;
        }
        if (this.f189897m) {
            try {
                java.lang.String cacheFilePath = getCacheFilePath();
                if (com.tencent.mm.vfs.w6.j(cacheFilePath) && (i07 = com.tencent.mm.sdk.platformtools.x.i0(cacheFilePath)) != null) {
                    int i39 = this.f189892e;
                    if (i39 > 0 && (i28 = this.f189893f) > 0) {
                        i07 = com.tencent.mm.sdk.platformtools.x.S(i07, i28, i39, true, false);
                    }
                    if (this.f189896i && i07 != null) {
                        i07 = this.f189898n > 0.0f ? com.tencent.mm.sdk.platformtools.x.s0(i07, false, i07.getWidth() * this.f189898n) : com.tencent.mm.sdk.platformtools.x.s0(i07, false, i07.getWidth() * 0.5f);
                    }
                    setImageBitmap(i07);
                    setImageBitmapCompleted(i07);
                    z17 = true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CdnImageView", e17, "setBitmapFromLocalCache error: %s", e17.getMessage());
            }
            if (z17) {
                return;
            }
        }
        if (i19 > 0) {
            setImageResource(i19);
        } else {
            setImageBitmap(null);
        }
        this.f189900p = ((ku5.t0) ku5.t0.f312615d).q(new r35.j0(str, this.f189899o));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wu5.c cVar = this.f189900p;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    public void setImageBitmapCompleted(android.graphics.Bitmap bitmap) {
    }

    public void setImgSavedDir(java.lang.String str) {
        if (str != null && !str.endsWith("/")) {
            str = str.concat("/");
        }
        this.f189895h = str;
    }

    public void setImgSavedPath(java.lang.String str) {
        this.f189894g = str;
    }

    public void setRoundCorner(boolean z17) {
        this.f189896i = z17;
    }

    public void setRoundCornerRate(float f17) {
        this.f189898n = f17;
    }

    public void setUrl(java.lang.String str) {
        b(str, 0, 0, -1);
    }

    public void setUseSdcardCache(boolean z17) {
        this.f189897m = z17;
    }

    public CdnImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189891d = null;
        this.f189897m = false;
        this.f189899o = new r35.i0(this);
    }
}
