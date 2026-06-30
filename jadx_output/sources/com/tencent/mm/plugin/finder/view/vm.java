package com.tencent.mm.plugin.finder.view;

/* loaded from: classes14.dex */
public final class vm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.xm f133257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f133258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f133260g;

    public vm(com.tencent.mm.plugin.finder.view.xm xmVar, android.graphics.SurfaceTexture surfaceTexture, yz5.l lVar, yz5.a aVar) {
        this.f133257d = xmVar;
        this.f133258e = surfaceTexture;
        this.f133259f = lVar;
        this.f133260g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.media.MediaCodec mediaCodec;
        android.media.MediaFormat mediaFormat;
        com.tencent.mm.plugin.finder.view.xm xmVar = this.f133257d;
        if (xmVar.f133346g != null) {
            xmVar.d();
        }
        java.lang.String concat = "[createDecoder] before create, mime:".concat(xmVar.c());
        java.lang.String str = xmVar.f133342c;
        com.tencent.mars.xlog.Log.i(str, concat);
        try {
            mediaCodec = android.media.MediaCodec.createDecoderByType(xmVar.c());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, java.lang.String.valueOf(e17.getMessage()));
            if (kotlin.jvm.internal.o.b(xmVar.c(), "video/dolby-vision") && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.E).getValue()).r()).booleanValue()) {
                xmVar.f133348i = "video/hevc";
                mediaCodec = android.media.MediaCodec.createDecoderByType(xmVar.c());
            } else {
                mediaCodec = null;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "[createDecoder] after create, mime:".concat(xmVar.c()));
        xmVar.f133346g = mediaCodec;
        xmVar.f133355p = false;
        if (mediaCodec != null) {
            android.graphics.SurfaceTexture surfaceTexture = this.f133258e;
            mediaCodec.setCallback(new com.tencent.mm.plugin.finder.view.tm(xmVar, this.f133259f));
            try {
                mediaFormat = xmVar.f133347h;
            } catch (java.lang.Exception e18) {
                android.media.MediaFormat mediaFormat2 = xmVar.f133347h;
                if (mediaFormat2 == null) {
                    kotlin.jvm.internal.o.o("mediaFormat");
                    throw null;
                }
                com.tencent.mars.xlog.Log.i(str, mediaFormat2.toString());
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "configure", new java.lang.Object[0]);
            }
            if (mediaFormat == null) {
                kotlin.jvm.internal.o.o("mediaFormat");
                throw null;
            }
            mediaCodec.configure(mediaFormat, new android.view.Surface(surfaceTexture), (android.media.MediaCrypto) null, 0);
            xmVar.f133341b.post(new com.tencent.mm.plugin.finder.view.um(this.f133260g));
        }
    }
}
