package com.tencent.mm.plugin.gif;

/* loaded from: classes12.dex */
public class MMAnimateView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f142122f;

    /* renamed from: g, reason: collision with root package name */
    public final int f142123g;

    /* renamed from: h, reason: collision with root package name */
    public float f142124h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142125i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f142126m;

    public MMAnimateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public java.lang.String getCacheKey() {
        return this.f142125i;
    }

    public int getEmojiDensity() {
        return com.tencent.mapsdk.internal.km.f50100e;
    }

    public float getEmojiDensityScale() {
        if (this.f142124h == 0.0f) {
            float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a) / 1.8181819f;
            this.f142124h = g17;
            if (g17 < 1.0f) {
                this.f142124h = 1.0f;
            } else if (g17 > 1.8181819f) {
                this.f142124h = 1.8181819f;
            }
        }
        return this.f142124h;
    }

    public int getIntrinsicHeight() {
        if (getDrawable() == null) {
            return 0;
        }
        return getDrawable().getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        if (getDrawable() == null) {
            return 0;
        }
        return getDrawable().getIntrinsicWidth();
    }

    public void n() {
        if (fp.i.b()) {
            int i17 = this.f142122f;
            if (i17 > 0) {
                super.setImageResource(i17);
                return;
            }
            return;
        }
        int i18 = this.f142123g;
        if (i18 > 0) {
            super.setImageResource(i18);
        }
    }

    public void pause() {
        if (getDrawable() == null || !(getDrawable() instanceof com.tencent.mm.plugin.gif.b)) {
            return;
        }
        ((com.tencent.mm.plugin.gif.b) getDrawable()).a();
    }

    public boolean r() {
        if (getDrawable() == null || !(getDrawable() instanceof com.tencent.mm.plugin.gif.b)) {
            return false;
        }
        return ((com.tencent.mm.plugin.gif.b) getDrawable()).isRunning();
    }

    public void resume() {
        if (getDrawable() == null || !(getDrawable() instanceof com.tencent.mm.plugin.gif.b)) {
            return;
        }
        ((com.tencent.mm.plugin.gif.b) getDrawable()).d();
    }

    public void s(com.tencent.mm.plugin.gif.MMGIFException mMGIFException) {
        ((com.tencent.mm.feature.emoji.xa) ((com.tencent.mm.feature.emoji.api.u6) i95.n0.c(com.tencent.mm.feature.emoji.api.u6.class))).getClass();
        com.tencent.mm.autogen.events.GifErrorCodeEvent gifErrorCodeEvent = new com.tencent.mm.autogen.events.GifErrorCodeEvent();
        gifErrorCodeEvent.f54422g.f8377a = mMGIFException.getErrorCode();
        gifErrorCodeEvent.e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(int i17) {
        w(getResources(), i17, false, null);
    }

    public void setBoundaryCheckInvalid(boolean z17) {
        this.f142126m = z17;
    }

    public void setCacheKey(java.lang.String str) {
        this.f142125i = str;
    }

    public void setDefaultBackgroundResource(int i17) {
        this.f142122f = i17;
    }

    public void setDefaultImageResource(int i17) {
        this.f142122f = i17;
    }

    public void setImageFilePath(java.lang.String str) {
        v(str, true, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i17) {
        w(getResources(), i17, true, null);
    }

    public void t() {
        if (getDrawable() == null || !(getDrawable() instanceof com.tencent.mm.plugin.gif.k)) {
            return;
        }
        ((com.tencent.mm.plugin.gif.k) getDrawable()).b();
    }

    public void u(byte[] bArr, java.lang.String str) {
        com.tencent.mm.plugin.gif.b kVar;
        try {
            if (bArr == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "[setMMGIFFileByteArray] bytes is null! src:%s cacheKey:%s", java.lang.Boolean.TRUE, str);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (com.tencent.mm.sdk.platformtools.y1.h(bArr)) {
                    kVar = new com.tencent.mm.plugin.gif.u(bArr);
                } else {
                    if (!com.tencent.mm.sdk.platformtools.y1.d(bArr)) {
                        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
                        if (G != null) {
                            G.setDensity(getEmojiDensity());
                            setImageBitmap(G);
                            return;
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", bArr.toString());
                            n();
                            return;
                        }
                    }
                    kVar = new com.tencent.mm.plugin.gif.k(bArr, this.f142126m);
                }
                kVar.start();
            } else {
                setCacheKey(str);
                com.tencent.mm.feature.emoji.api.j5 j5Var = (com.tencent.mm.feature.emoji.api.j5) i95.n0.c(com.tencent.mm.feature.emoji.api.j5.class);
                java.lang.String cacheKey = getCacheKey();
                ((com.tencent.mm.feature.emoji.e) j5Var).getClass();
                kVar = com.tencent.mm.plugin.gif.d.c().b(cacheKey, bArr);
            }
            setImageDrawable(kVar);
        } catch (com.tencent.mm.plugin.gif.MMGIFException e17) {
            s(e17);
            if (e17.getErrorCode() != 103) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", e17.toString());
                n();
            }
            android.graphics.Bitmap G2 = com.tencent.mm.sdk.platformtools.x.G(bArr);
            if (G2 != null) {
                G2.setDensity(getEmojiDensity());
                setImageBitmap(G2);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", bArr.toString());
                n();
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", e18.toString());
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ee -> B:39:0x010a). Please report as a decompilation issue!!! */
    public final void v(java.lang.String str, boolean z17, java.lang.String str2) {
        android.graphics.drawable.Drawable kVar;
        try {
            if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
                com.tencent.mm.plugin.gif.u uVar = new com.tencent.mm.plugin.gif.u(com.tencent.mm.vfs.w6.N(str, 0, -1));
                uVar.start();
                if (z17) {
                    setImageDrawable(uVar);
                    return;
                } else {
                    setBackgroundDrawable(uVar);
                    return;
                }
            }
            if (com.tencent.mm.sdk.platformtools.y1.c(str)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    kVar = new com.tencent.mm.plugin.gif.k(str, this.f142126m);
                } else {
                    setCacheKey(str2);
                    com.tencent.mm.feature.emoji.api.j5 j5Var = (com.tencent.mm.feature.emoji.api.j5) i95.n0.c(com.tencent.mm.feature.emoji.api.j5.class);
                    java.lang.String cacheKey = getCacheKey();
                    ((com.tencent.mm.feature.emoji.e) j5Var).getClass();
                    kVar = com.tencent.mm.plugin.gif.d.c().a(cacheKey, str);
                }
                if (z17) {
                    setImageDrawable(kVar);
                    return;
                } else {
                    setBackgroundDrawable(kVar);
                    return;
                }
            }
            try {
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
                if (J2 != null) {
                    J2.setDensity(getEmojiDensity());
                    if (z17) {
                        setImageBitmap(J2);
                    } else {
                        setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(J2));
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", str);
                    n();
                }
            } catch (java.lang.OutOfMemoryError e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFImageView", e17, "setMMGIFFilePath failed, oom happened. show default. path %s", str);
                n();
            }
        } catch (com.tencent.mm.plugin.gif.MMGIFException e18) {
            try {
                s(e18);
                str = str;
                if (e18.getErrorCode() == 103) {
                    try {
                        android.graphics.Bitmap J3 = com.tencent.mm.sdk.platformtools.x.J(str, null);
                        if (J3 != null) {
                            J3.setDensity(getEmojiDensity());
                            if (z17) {
                                setImageBitmap(J3);
                                str = str;
                            } else {
                                setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(J3));
                                str = str;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", str);
                            n();
                            com.tencent.mm.vfs.w6.h(str);
                            str = str;
                        }
                    } catch (java.lang.OutOfMemoryError e19) {
                        java.lang.Object[] objArr = {str};
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GIF.MMGIFImageView", e19, "setMMGIFFilePath failed, oom happened. show default. path %s", objArr);
                        n();
                        str = objArr;
                    }
                }
            } catch (java.lang.Exception e27) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed1. %s", com.tencent.mm.sdk.platformtools.z3.c(e27));
            }
        } catch (java.io.IOException e28) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed3. %s", com.tencent.mm.sdk.platformtools.z3.c(e28));
            com.tencent.mm.vfs.w6.h(str);
            n();
        } catch (java.lang.NullPointerException unused) {
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.tencent.mm.plugin.gif.b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.tencent.mm.plugin.gif.MMAnimateView, androidx.appcompat.widget.AppCompatImageView] */
    public final void w(android.content.res.Resources resources, int i17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.gif.k kVar;
        try {
            boolean z18 = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                kVar = new com.tencent.mm.plugin.gif.k(resources, i17, this.f142126m);
                if (kVar.f142139f == 0) {
                    z18 = false;
                }
            } else {
                setCacheKey(str);
                ((com.tencent.mm.feature.emoji.e) ((com.tencent.mm.feature.emoji.api.j5) i95.n0.c(com.tencent.mm.feature.emoji.api.j5.class))).getClass();
                lt0.f fVar = (lt0.f) com.tencent.mm.plugin.gif.d.c().f142129b;
                kVar = fVar.get(str) != null ? (com.tencent.mm.plugin.gif.b) ((java.lang.ref.WeakReference) fVar.get(str)).get() : null;
                if (kVar == null) {
                    kVar = new com.tencent.mm.plugin.gif.k(resources, i17, false);
                    fVar.put(str, new java.lang.ref.WeakReference(kVar));
                }
            }
            if (z18) {
                if (z17) {
                    setImageDrawable(kVar);
                    return;
                } else {
                    setBackgroundDrawable(kVar);
                    return;
                }
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFResource failed. %s" + e17.toString());
        }
        if (z17) {
            super.setImageResource(i17);
        } else {
            super.setBackgroundResource(i17);
        }
    }

    public void x() {
        if (getDrawable() == null || !(getDrawable() instanceof com.tencent.mm.plugin.gif.b)) {
            return;
        }
        ((com.tencent.mm.plugin.gif.b) getDrawable()).start();
    }

    public void y() {
        if (getDrawable() == null || !(getDrawable() instanceof com.tencent.mm.plugin.gif.b)) {
            return;
        }
        ((com.tencent.mm.plugin.gif.b) getDrawable()).stop();
    }

    public MMAnimateView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f142122f = com.tencent.mm.R.drawable.emoji_download_icon;
        this.f142123g = com.tencent.mm.R.drawable.f481147lw;
        this.f142124h = 0.0f;
        this.f142126m = false;
    }
}
