package so2;

/* loaded from: classes2.dex */
public final class q0 implements so2.s0 {
    @Override // so2.s0
    public boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        android.view.View findViewByPosition;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition(i17)) == null) {
            return false;
        }
        androidx.recyclerview.widget.k3 w07 = recyclerView.w0(findViewByPosition);
        in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
        com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var = s0Var != null ? (so2.j5) s0Var.f293125i : null;
        if (!(r0Var instanceof so2.j5)) {
            r0Var = null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = r0Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0Var : null;
        return baseFinderFeed != null && baseFinderFeed.h() == 4;
    }
}
