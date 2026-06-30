package fn2;

/* loaded from: classes8.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f264262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264263e;

    public g1(fn2.h1 h1Var, int i17) {
        this.f264262d = h1Var;
        this.f264263e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fn2.h1 h1Var = this.f264262d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = h1Var.getSongRv().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int w17 = linearLayoutManager.w();
        int y17 = linearLayoutManager.y();
        int i17 = this.f264263e;
        if (w17 <= i17 && i17 <= y17) {
            h1Var.getSongRv().post(new fn2.d1(h1Var, i17));
            return;
        }
        h1Var.getSongRv().i(new fn2.f1(h1Var, i17));
        androidx.recyclerview.widget.RecyclerView songRv = h1Var.getSongRv();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(songRv, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestedSongPlayListTabView$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        songRv.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(songRv, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestedSongPlayListTabView$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
