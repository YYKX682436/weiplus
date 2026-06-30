package com.tencent.mm.plugin.video;

/* loaded from: classes14.dex */
public class ObservableSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public android.view.SurfaceHolder f175523d;

    /* renamed from: e, reason: collision with root package name */
    public fo4.a f175524e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175525f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175526g;

    public ObservableSurfaceView(android.content.Context context) {
        super(context);
        this.f175524e = null;
        this.f175525f = false;
        this.f175526g = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f175523d = holder;
        holder.addCallback(this);
    }

    public android.view.SurfaceHolder getSurfaceHolder() {
        return this.f175523d;
    }

    public void setNeedSetType(boolean z17) {
        this.f175526g = z17;
        if (z17) {
            this.f175523d.setType(3);
        }
    }

    public void setSurfaceChangeCallback(fo4.a aVar) {
        this.f175524e = aVar;
        if (this.f175526g) {
            this.f175523d.setType(3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        try {
            this.f175523d.removeCallback(this);
        } catch (java.lang.Exception unused) {
        }
        this.f175523d = surfaceHolder;
        surfaceHolder.addCallback(this);
        fo4.a aVar = this.f175524e;
        if (aVar != null) {
            android.view.SurfaceHolder surfaceHolder2 = this.f175523d;
            yq4.b bVar = (yq4.b) aVar;
            if (!bVar.f464567n || surfaceHolder2.getSurface() == null) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(bVar.f464567n);
                objArr[1] = java.lang.Boolean.valueOf(surfaceHolder2.getSurface() == null);
                objArr[2] = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed, CameraOpen: %b, surface: %b, apiLevel: %s", objArr);
                return;
            }
            try {
                if (!bVar.f464563g.f447654c) {
                    bVar.f464563g.g(null);
                }
                bVar.f464563g.l();
                android.hardware.Camera camera = bVar.f464563g.f447652a;
                if (camera != null) {
                    camera.setPreviewDisplay(surfaceHolder2);
                }
                bVar.g();
                bVar.f464563g.k();
            } catch (java.lang.Exception e17) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(159L, 0L, 1L, false);
                g0Var.idkeyStat(159L, 2L, 1L, false);
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + e17.getMessage());
                bVar.f464562f = 1;
            }
            if (bVar.f464575v) {
                bVar.h();
                bVar.f464575v = false;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f175525f = true;
        fo4.a aVar = this.f175524e;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f175525f = false;
    }

    public ObservableSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175524e = null;
        this.f175525f = false;
        this.f175526g = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f175523d = holder;
        holder.addCallback(this);
    }

    public ObservableSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175524e = null;
        this.f175525f = false;
        this.f175526g = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f175523d = holder;
        holder.addCallback(this);
    }
}
