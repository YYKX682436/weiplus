package ru3;

/* loaded from: classes10.dex */
public final class a implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer f399749d;

    public a(com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer) {
        this.f399749d = fakeVideoViewLayer;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer = this.f399749d;
        com.tencent.mars.xlog.Log.i(fakeVideoViewLayer.f155886d, "tpplayer prepared finished");
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = fakeVideoViewLayer.f155888f;
        if (iTPPlayer2 != null) {
            iTPPlayer2.start();
        }
    }
}
