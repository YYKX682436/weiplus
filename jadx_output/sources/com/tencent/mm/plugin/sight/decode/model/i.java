package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f162430d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.decode.model.h f162431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162432f;

    public i(com.tencent.mm.plugin.sight.decode.model.s sVar) {
        this.f162432f = sVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "make sure drawJob alive");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f162430d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", java.lang.Integer.valueOf(this.f162432f.hashCode()), java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.f162432f;
        android.graphics.Bitmap bitmap = sVar.f162452h;
        m34.g gVar = (m34.g) sVar;
        com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) gVar.I.get();
        if (sightPlayImageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
            gVar.c();
        } else {
            sightPlayImageView.setImageBitmap(bitmap);
        }
        if (this.f162432f.f162455k == 0) {
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.h hVar = this.f162431e;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(hVar, 0L);
            return;
        }
        long currentTimeMillis = r0.f162451g - (java.lang.System.currentTimeMillis() - this.f162432f.f162455k);
        if (currentTimeMillis > 0) {
            wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.h hVar2 = this.f162431e;
            ((vf0.y1) k1Var2).getClass();
            t21.o2.aj(hVar2, currentTimeMillis);
            return;
        }
        wf0.k1 k1Var3 = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.tencent.mm.plugin.sight.decode.model.h hVar3 = this.f162431e;
        ((vf0.y1) k1Var3).getClass();
        t21.o2.aj(hVar3, 0L);
    }
}
