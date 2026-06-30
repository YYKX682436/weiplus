package kk4;

/* loaded from: classes4.dex */
public final class c0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308520d;

    public c0(kk4.f0 f0Var) {
        this.f308520d = f0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public final void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        kk4.f0 f0Var = this.f308520d;
        com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener iOnInfoListener = f0Var.f308530f;
        if (iOnInfoListener != null) {
            iOnInfoListener.onInfo(iTPPlayer, i17, j17, j18, obj);
        }
        if (i17 == 106) {
            f0Var.f308529e = true;
        }
    }
}
