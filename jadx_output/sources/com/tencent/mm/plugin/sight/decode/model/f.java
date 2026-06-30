package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.h f162425d;

    public f(com.tencent.mm.plugin.sight.decode.model.h hVar) {
        this.f162425d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.g gVar = (m34.g) this.f162425d.f162429f;
        com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) gVar.I.get();
        if (sightPlayImageView != null) {
            sightPlayImageView.setImageBitmap(null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
            gVar.c();
        }
    }
}
