package cw2;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f223878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        super(0);
        this.f223878d = finderFeedNewSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f223878d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vx2.k(context);
    }
}
