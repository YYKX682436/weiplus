package dw2;

/* loaded from: classes2.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f244167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager f244168e;

    public v(fc2.a aVar, com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager) {
        this.f244167d = aVar;
        this.f244168e = finderVideoAutoPlayManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = ((fc2.t) this.f244167d).f260991j != 5;
        com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager = this.f244168e;
        finderVideoAutoPlayManager.I0(finderVideoAutoPlayManager.f130775h, z17);
    }
}
