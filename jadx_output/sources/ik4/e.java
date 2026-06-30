package ik4;

/* loaded from: classes4.dex */
public final class e implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291917d;

    public e(ik4.g gVar) {
        this.f291917d = gVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public final void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        ik4.g gVar = this.f291917d;
        for (com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener : gVar.f291927v) {
            gVar.f291930y = j17;
            gVar.f291931z = j18;
            iOnVideoSizeChangedListener.onVideoSizeChanged(iTPPlayer, j17, j18);
        }
    }
}
