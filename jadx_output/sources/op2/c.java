package op2;

/* loaded from: classes2.dex */
public final class c extends cp2.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.MMActivity activity, androidx.fragment.app.Fragment fragment, r45.qt2 contextObj, r45.dd2 dd2Var, java.lang.String by_pass, java.lang.String str) {
        super(activity, contextObj, by_pass, str);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(by_pass, "by_pass");
        this.f220933m = fragment;
        this.f220934n = dd2Var;
    }

    @Override // cp2.c
    public int getCommentScene() {
        return this.f220928e.getInteger(5);
    }

    @Override // cp2.v0, fs2.a
    public void onDetach() {
        androidx.fragment.app.Fragment fragment = this.f220933m;
        kotlin.jvm.internal.o.d(fragment);
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        kotlin.jvm.internal.o.d(parentFragment);
        ((op2.a) pf5.z.f353948a.b(parentFragment).a(op2.a.class)).f347237d.e();
        super.onDetach();
    }

    @Override // cp2.v0, cp2.c
    public void onRefreshEnd(ym5.s3 reason) {
        androidx.fragment.app.Fragment fragment;
        androidx.fragment.app.Fragment parentFragment;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onRefreshEnd(reason);
        int commentScene = getCommentScene();
        if (commentScene == 9500001 || commentScene == 9500002 || commentScene == 9500004 || commentScene == 9500003) {
            return;
        }
        if ((getCommentScene() == 112) || (fragment = this.f220933m) == null || (parentFragment = fragment.getParentFragment()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC = (com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class);
        androidx.fragment.app.Fragment fragment2 = this.f220933m;
        kotlin.jvm.internal.o.e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment");
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) fragment2;
        nearbyLiveSquareUIC.getClass();
        java.util.LinkedList linkedList = nearbyLiveSquareUIC.f121501o;
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (nearbyLiveSquareTabFragment.f121519s.getInteger(0) == ((com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) it.next()).f121519s.getInteger(0)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        int i18 = i17 + 1;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = (i18 < 0 || i18 >= linkedList.size() || linkedList.size() == 0) ? null : (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) linkedList.get(i18);
        bp2.m mVar = ((op2.a) pf5.z.f353948a.b(parentFragment).a(op2.a.class)).f347237d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start delayMs:");
        int i19 = mVar.f23073b;
        sb6.append(i19);
        sb6.append(" maxCnt:");
        int i27 = mVar.f23072a;
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", sb6.toString());
        android.view.View view = mVar.f23075d;
        int[] iArr = mVar.f23076e;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        mVar.f23077f = nearbyLiveSquareTabFragment2;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC, 0);
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, true);
        com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "start scrollGuideCnt:" + r17 + " isNeverScroll:" + o17 + " pos[" + iArr[0] + ", " + iArr[1] + ']');
        if (nearbyLiveSquareTabFragment2 == null) {
            com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "start return for nextPageFragment:" + nearbyLiveSquareTabFragment2);
            return;
        }
        if (!o17) {
            com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "start return for isNeverScroll:" + o17);
        } else {
            if (r17 > i27) {
                com.tencent.mars.xlog.Log.i("FinderLivePageScrollGuideHelper", "start return for scrollGuideCnt:" + r17);
                return;
            }
            long j17 = i19;
            java.lang.Runnable runnable = mVar.f23081j;
            com.tencent.mm.sdk.platformtools.n3 n3Var = mVar.f23080i;
            if (runnable != null) {
                n3Var.removeCallbacks(runnable);
                mVar.f23081j = null;
            }
            bp2.l lVar = new bp2.l(mVar);
            mVar.f23081j = lVar;
            n3Var.postDelayed(lVar, j17);
        }
    }

    @Override // cp2.v0
    public int s() {
        r45.dd2 dd2Var = this.f220934n;
        return (dd2Var != null ? dd2Var.getInteger(0) : 0) + 15;
    }

    @Override // cp2.v0
    public int y() {
        r45.dd2 dd2Var = this.f220934n;
        return (dd2Var != null ? dd2Var.getInteger(0) : 0) + 1001;
    }
}
