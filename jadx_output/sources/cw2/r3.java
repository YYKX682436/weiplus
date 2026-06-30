package cw2;

/* loaded from: classes10.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f223966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView, boolean z17) {
        super(0);
        this.f223966d = finderLivePlayView;
        this.f223967e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f223966d;
        boolean z17 = finderLivePlayView.H;
        boolean z18 = !this.f223967e;
        if (z17 != z18) {
            finderLivePlayView.H = z18;
            finderLivePlayView.Y("decorateInVisible:" + finderLivePlayView.H);
            if (finderLivePlayView.f130606m) {
                finderLivePlayView.g(finderLivePlayView.f130614t, finderLivePlayView.f130615u);
            }
        }
        return jz5.f0.f302826a;
    }
}
