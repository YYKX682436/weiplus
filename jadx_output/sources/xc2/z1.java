package xc2;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f453350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f453350d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC;
        com.tencent.mm.ui.vas.VASActivity vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) this.f453350d.f310123d).f211121p;
        com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI finderMusicTopicUI = vASActivity instanceof com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI ? (com.tencent.mm.plugin.finder.activity.music.ui.FinderMusicTopicUI) vASActivity : null;
        if (finderMusicTopicUI != null && (finderMusicTopicHeaderUIC = (com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC) pf5.z.f353948a.a(finderMusicTopicUI).e(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.class)) != null) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = finderMusicTopicHeaderUIC.f101763n;
            android.view.ViewGroup.LayoutParams layoutParams = appBarLayout != null ? appBarLayout.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f11006a;
            if (!(behavior instanceof com.google.android.material.appbar.AppBarLayout.Behavior) || ((com.google.android.material.appbar.AppBarLayout.Behavior) behavior).y() == 0) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
