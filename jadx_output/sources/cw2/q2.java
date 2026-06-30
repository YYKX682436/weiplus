package cw2;

/* loaded from: classes2.dex */
public final class q2 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223947d;

    public q2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223947d = finderFullSeekBarLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223947d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderFullSeekBarLayout.H;
        if (baseFinderFeed != null) {
            android.content.Context context = finderFullSeekBarLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            r45.qt2 qt2Var = V6;
            b6Var.b(qt2Var, "pause_by_icon", true, baseFinderFeed.getItemId(), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? "" : null);
            b6Var.b(qt2Var, "private_like", true, baseFinderFeed.getItemId(), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? "" : null);
        }
    }
}
