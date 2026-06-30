package d92;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.k0 f227518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d92.k0 k0Var) {
        super(1);
        this.f227518d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout;
        android.view.View v17 = (android.view.View) obj;
        kotlin.jvm.internal.o.g(v17, "v");
        this.f227518d.getClass();
        android.view.ViewParent parent = v17.getParent();
        while (true) {
            if (parent == null) {
                finderFullSeekBarLayout = null;
                break;
            }
            if (parent instanceof com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) {
                finderFullSeekBarLayout = ((com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) parent).getFullSeekBarLayout();
                break;
            }
            parent = parent.getParent();
        }
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.A(true);
        }
        return jz5.f0.f302826a;
    }
}
