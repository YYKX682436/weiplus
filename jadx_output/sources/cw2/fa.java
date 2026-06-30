package cw2;

/* loaded from: classes10.dex */
public final class fa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f223720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        super(0);
        this.f223720d = liveFeedPlayerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveFeedPlayerView, live url=");
        cw2.wa waVar = this.f223720d.f130756y;
        sb6.append(waVar != null ? waVar.f224094a : null);
        return sb6.toString();
    }
}
