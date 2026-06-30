package cw2;

/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f223782d = finderFullSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object parent = this.f223782d.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        return (android.view.ViewGroup) ((android.view.View) parent).findViewById(com.tencent.mm.R.id.g1y);
    }
}
