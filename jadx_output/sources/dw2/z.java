package dw2;

/* loaded from: classes2.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager f244175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244176e;

    public z(com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager, java.lang.String str) {
        this.f244175d = finderVideoAutoPlayManager;
        this.f244176e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager = this.f244175d;
        finderVideoAutoPlayManager.f130787w.add(this.f244176e);
        finderVideoAutoPlayManager.I0(finderVideoAutoPlayManager.f130775h, true);
    }
}
