package cw2;

/* loaded from: classes2.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f223558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        super(0);
        this.f223558d = finderFeedNewSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = this.f223558d;
        android.content.Context context = finderFeedNewSeekBarLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new mw2.j(context, (android.widget.ImageView) finderFeedNewSeekBarLayout.findViewById(com.tencent.mm.R.id.f486472uv5), finderFeedNewSeekBarLayout.f130523J);
    }
}
