package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class h9 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk4.d f200992d;

    public h9(pk4.d dVar) {
        this.f200992d = dVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onPause: loss focus canDuck " + z17);
        this.f200992d.setMute(true);
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onResume: gain focus");
        this.f200992d.setMute(false);
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onStop: loss focus");
    }
}
