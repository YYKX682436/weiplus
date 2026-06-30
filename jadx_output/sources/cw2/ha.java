package cw2;

/* loaded from: classes10.dex */
public final class ha extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f223757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        super(1);
        this.f223757d = liveFeedPlayerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.s7 it = (r45.s7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f223757d;
        mn0.b0 player = liveFeedPlayerView.getPlayer();
        if (player != null) {
            android.content.Context context = liveFeedPlayerView.getContext();
            if (!java.lang.Boolean.valueOf(context instanceof androidx.appcompat.app.AppCompatActivity).booleanValue()) {
                context = null;
            }
            if (context == null) {
                context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
            }
            ((mn0.y) player).r(liveFeedPlayerView.T(context), liveFeedPlayerView.G, it.getInteger(0), it.getInteger(1));
        }
        return jz5.f0.f302826a;
    }
}
