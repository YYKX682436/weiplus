package cw2;

/* loaded from: classes2.dex */
public final class z implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.b0 f224125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener f224126e;

    public z(cw2.b0 b0Var, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f224125d = b0Var;
        this.f224126e = iOnSeekCompleteListener;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f224125d.f223578a.y("onSeekComplete");
        com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener = this.f224126e;
        if (iOnSeekCompleteListener != null) {
            iOnSeekCompleteListener.onSeekComplete(iTPPlayer);
        }
    }
}
