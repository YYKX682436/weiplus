package cw2;

/* loaded from: classes2.dex */
public final class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223605e;

    public b9(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, boolean z17) {
        this.f223604d = finderVideoLayout;
        this.f223605e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223604d;
        yz5.p videoPauseCallback = finderVideoLayout.getVideoPauseCallback();
        if (videoPauseCallback != null) {
            videoPauseCallback.invoke(java.lang.Boolean.valueOf(this.f223605e), finderVideoLayout.getPlayInfo());
        }
        finderVideoLayout.getClass();
    }
}
