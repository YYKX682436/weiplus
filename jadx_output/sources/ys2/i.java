package ys2;

/* loaded from: classes10.dex */
public final class i implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.o f465166d;

    public i(ys2.o oVar) {
        this.f465166d = oVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f465166d.d7(iTPPlayer.getVideoWidth() > iTPPlayer.getVideoHeight());
    }
}
