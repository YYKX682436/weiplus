package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class rq implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xj.m f161523a;

    public rq(xj.m mVar) {
        this.f161523a = mVar;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "handleAdOpen: onJumpAppCancel, aid=" + this.f161523a.f454753a);
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "handleAdOpen: onJumpAppCheckExpose, aid=" + this.f161523a.f454753a);
    }

    @Override // xj.l
    public void onJumpAppFail() {
        com.tencent.mars.xlog.Log.w("MicroMsg.YuanBaoAvatarUIC", "handleAdOpen: onJumpAppFail, aid=" + this.f161523a.f454753a);
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "handleAdOpen: onJumpAppSuccess, aid=" + this.f161523a.f454753a);
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", "handleAdOpen: onJumpDownloadPage, aid=" + this.f161523a.f454753a);
    }
}
