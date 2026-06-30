package com.tencent.mm.ui.base;

/* loaded from: classes14.dex */
public class MMTextureView extends android.view.TextureView implements db5.e7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f197598d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f197599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f197600f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f197601g;

    public MMTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197599e = false;
    }

    public void B() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "hookInnerDetach");
            java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f197600f = declaredField.get(this);
            declaredField.set(this, null);
            java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f197601g = declaredField2.get(this);
            declaredField2.set(this, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    public void C() {
        if (fp.h.a(16)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        if (fp.h.b(20)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        if (wo.v1.f447833m.E == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "detect texture problem, sly");
        try {
            if (this.f197598d == null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mSurface");
                this.f197598d = declaredField;
                declaredField.setAccessible(true);
            }
            android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) this.f197598d.get(this);
            if (surfaceTexture == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
                return;
            }
            if (surfaceTexture instanceof db5.h6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
                return;
            }
            db5.h6 h6Var = new db5.h6(0);
            h6Var.f228383a = surfaceTexture;
            this.f197598d.set(this, h6Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "detect texture problem, wrap");
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTextureView", "detect texture problem, IllegalAccessException");
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e18, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTextureView", "detect texture problem, IllegalArgumentException");
        } catch (java.lang.NoSuchFieldException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e19, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTextureView", "detect texture problem, NoSuchFieldException");
        }
    }

    public void D() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "unHookInnerDetach");
            if (this.f197600f != null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f197600f);
                this.f197600f = null;
            }
            if (this.f197601g != null) {
                java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f197601g);
                this.f197601g = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f197599e) {
            D();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        if (this.f197599e) {
            B();
        }
        super.onAttachedToWindow();
        if (this.f197599e) {
            D();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (this.f197599e) {
            B();
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "unkown error", new java.lang.Object[0]);
        }
    }

    @Override // db5.e7
    public void setInterceptDetach(boolean z17) {
        this.f197599e = z17;
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        C();
    }

    public MMTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197599e = false;
    }

    public MMTextureView(android.content.Context context) {
        super(context);
        this.f197599e = false;
    }
}
