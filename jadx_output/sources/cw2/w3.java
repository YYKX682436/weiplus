package cw2;

/* loaded from: classes10.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224083d;

    public w3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        this.f224083d = finderLivePlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig2.r f17 = ig2.m.f291393a.f(this.f224083d.f130620y);
        if (f17 instanceof ig2.i) {
            ((ig2.i) f17).a();
        }
    }
}
