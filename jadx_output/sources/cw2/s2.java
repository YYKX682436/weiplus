package cw2;

/* loaded from: classes2.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f223988d = finderFullSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f223988d.getSeekLayout().findViewById(com.tencent.mm.R.id.tvk);
    }
}
