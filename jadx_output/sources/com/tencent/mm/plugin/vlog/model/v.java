package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.w f175750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f175751e;

    public v(com.tencent.mm.plugin.vlog.model.w wVar, long j17) {
        this.f175750d = wVar;
        this.f175751e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.model.w wVar = this.f175750d;
        java.lang.Object obj = wVar.f175774w;
        long j17 = this.f175751e;
        synchronized (obj) {
            if (wVar.f175767p != null && wVar.f175766o != null) {
                wVar.D.frame("MicroMsg.CompositionSoftwareEncoder", "render gpu rgb2yuv, timestamp:" + j17);
                os0.g gVar = wVar.f175766o;
                if (gVar != null) {
                    gVar.o();
                }
                rs0.h hVar = wVar.f175767p;
                android.opengl.EGLExt.eglPresentationTimeANDROID(hVar != null ? hVar.f399292a : null, hVar != null ? hVar.f399293b : null, j17 * 1000);
                rs0.g gVar2 = rs0.i.f399296a;
                rs0.h hVar2 = wVar.f175767p;
                gVar2.x(hVar2 != null ? hVar2.f399292a : null, hVar2 != null ? hVar2.f399293b : null);
                wVar.f175776y++;
            }
        }
    }
}
