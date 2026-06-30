package xu2;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f457210d;

    public m(xu2.n nVar) {
        this.f457210d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xu2.n nVar = this.f457210d;
        com.tencent.mars.xlog.Log.i(nVar.f457215e, "showFeedBackFrameOne");
        android.view.ViewGroup viewGroup = nVar.f457216f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view = nVar.f457217g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = nVar.f457218h;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$showFeedBackFrameOne$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup2 = nVar.f457216f;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
        }
    }
}
