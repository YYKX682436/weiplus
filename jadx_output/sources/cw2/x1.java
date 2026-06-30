package cw2;

/* loaded from: classes2.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f224102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f224102d = finderFullSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f224102d;
        android.view.View findViewById = finderFullSeekBarLayout.getSeekLayout().findViewById(com.tencent.mm.R.id.ggw);
        findViewById.setOnClickListener(new cw2.w1(finderFullSeekBarLayout));
        return findViewById;
    }
}
