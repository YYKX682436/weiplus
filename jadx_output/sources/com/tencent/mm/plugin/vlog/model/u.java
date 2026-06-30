package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes14.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.ImageReader f175728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.w f175729e;

    public u(android.media.ImageReader imageReader, com.tencent.mm.plugin.vlog.model.w wVar) {
        this.f175728d = imageReader;
        this.f175729e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.model.w wVar;
        try {
            try {
                if (this.f175728d.getSurface().isValid()) {
                    com.tencent.mm.plugin.vlog.model.w wVar2 = this.f175729e;
                    rs0.g gVar = rs0.i.f399296a;
                    android.view.Surface surface = this.f175728d.getSurface();
                    com.tencent.tav.decoder.RenderContext renderContext = this.f175729e.f175753b;
                    wVar2.f175767p = rs0.g.n(gVar, surface, null, 0, 0, renderContext != null ? renderContext.eglContext() : null, 14, null);
                    com.tencent.mm.plugin.vlog.model.w wVar3 = this.f175729e;
                    os0.g gVar2 = new os0.g(0, 0, 0, 0, 1, 15, null);
                    com.tencent.mm.plugin.vlog.model.w wVar4 = this.f175729e;
                    android.media.MediaFormat mediaFormat = wVar4.f175758g;
                    if (mediaFormat != null && mediaFormat.containsKey("color-range")) {
                        android.media.MediaFormat mediaFormat2 = wVar4.f175758g;
                        gVar2.V = mediaFormat2 != null && mediaFormat2.getInteger("color-range") == 1;
                        gVar2.x();
                    } else {
                        wVar4.D.w("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader: do not containsKey KEY_COLOR_RANGE ");
                    }
                    android.media.MediaFormat mediaFormat3 = wVar4.f175758g;
                    if (mediaFormat3 != null && mediaFormat3.containsKey("color-standard")) {
                        android.media.MediaFormat mediaFormat4 = wVar4.f175758g;
                        gVar2.W = mediaFormat4 != null && mediaFormat4.getInteger("color-standard") == 1;
                        gVar2.x();
                    } else {
                        wVar4.D.w("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader: do not containsKey KEY_COLOR_STANDARD ");
                    }
                    wVar4.D.i("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader: trans is fullRange " + gVar2.V + ", is yuv709 " + gVar2.W, new java.lang.Object[0]);
                    wVar3.f175766o = gVar2;
                    com.tencent.mm.plugin.vlog.model.w wVar5 = this.f175729e;
                    os0.g gVar3 = wVar5.f175766o;
                    if (gVar3 != null) {
                        gVar3.u(wVar5.f175769r, wVar5.f175770s);
                    }
                    com.tencent.tav.decoder.logger.WXLogger wXLogger = this.f175729e.D;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create rgb2yuvEGLEnvironment:");
                    sb6.append(this.f175729e.f175767p);
                    sb6.append(", shareEGLContext:");
                    com.tencent.tav.decoder.RenderContext renderContext2 = this.f175729e.f175753b;
                    sb6.append(renderContext2 != null ? renderContext2.eglContext() : null);
                    wXLogger.i("MicroMsg.CompositionSoftwareEncoder", sb6.toString(), new java.lang.Object[0]);
                } else {
                    this.f175729e.D.e("MicroMsg.CompositionSoftwareEncoder", "create rgb2yuvEGLEnvironment error surface invalid");
                }
                this.f175729e.f175765n = true;
                wVar = this.f175729e;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CompositionSoftwareEncoder", e17, "configure imageReader render error", new java.lang.Object[0]);
                this.f175729e.f175765n = false;
                wVar = this.f175729e;
            }
            wVar.f175768q.open();
        } catch (java.lang.Throwable th6) {
            this.f175729e.f175768q.open();
            throw th6;
        }
    }
}
