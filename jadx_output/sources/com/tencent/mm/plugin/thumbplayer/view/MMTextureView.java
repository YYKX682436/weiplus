package com.tencent.mm.plugin.thumbplayer.view;

/* loaded from: classes14.dex */
public class MMTextureView extends com.tencent.thumbplayer.tmediacodec.hook.THookTextureView implements pk4.a, db5.e7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Field f174552d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f174553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f174554f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f174555g;

    public MMTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f174553e = false;
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f174553e) {
            j();
        }
    }

    public void h() {
        try {
            setInterceptDetach(false);
            j();
            java.lang.reflect.Method method = android.view.TextureView.class.getMethod("destroyHardwareLayer", new java.lang.Class[0]);
            method.setAccessible(true);
            method.invoke(this, new java.lang.Object[0]);
            java.lang.reflect.Method method2 = android.view.TextureView.class.getMethod("releaseSurfaceTexture", new java.lang.Class[0]);
            method2.setAccessible(true);
            method2.invoke(this, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
        }
    }

    public void i() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "hookInnerDetach");
            java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f174554f = declaredField.get(this);
            declaredField.set(this, null);
            java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f174555g = declaredField2.get(this);
            declaredField2.set(this, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    public void j() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "unHookInnerDetach");
            if (this.f174554f != null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f174554f);
                this.f174554f = null;
            }
            if (this.f174555g != null) {
                java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f174555g);
                this.f174555g = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        if (this.f174553e) {
            i();
        }
        super.onAttachedToWindow();
        if (this.f174553e) {
            j();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (this.f174553e) {
            i();
        }
        try {
            super.onDetachedFromWindow();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTextureView", e17, "unkown error", new java.lang.Object[0]);
        }
    }

    @Override // pk4.a, db5.e7
    public void setInterceptDetach(boolean z17) {
        this.f174553e = z17;
    }

    @Override // android.view.TextureView, pk4.a
    public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
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
            if (this.f174552d == null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mSurface");
                this.f174552d = declaredField;
                declaredField.setAccessible(true);
            }
            android.graphics.SurfaceTexture surfaceTexture2 = (android.graphics.SurfaceTexture) this.f174552d.get(this);
            if (surfaceTexture2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
                return;
            }
            if (surfaceTexture2 instanceof pk4.m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
                return;
            }
            pk4.m mVar = new pk4.m(0);
            mVar.f356509a = surfaceTexture2;
            this.f174552d.set(this, mVar);
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

    public MMTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f174553e = false;
    }

    public MMTextureView(android.content.Context context) {
        super(context);
        this.f174553e = false;
    }
}
