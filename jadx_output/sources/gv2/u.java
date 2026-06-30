package gv2;

/* loaded from: classes2.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f276079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f276080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f276081f;

    public u(android.view.View view, android.view.ViewGroup viewGroup, int i17) {
        this.f276079d = view;
        this.f276080e = viewGroup;
        this.f276081f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f276079d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f276079d;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = this.f276080e.getHeight();
            view2.setLayoutParams(layoutParams);
        }
        android.view.View view3 = this.f276079d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.animate().alpha(0.0f).setDuration(1000L).setListener(new gv2.t(view2, this.f276081f)).start();
    }
}
