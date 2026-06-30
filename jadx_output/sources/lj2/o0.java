package lj2;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318901a;

    /* renamed from: b, reason: collision with root package name */
    public final qf2.q3 f318902b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f318903c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f318904d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f318905e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f318906f;

    /* renamed from: g, reason: collision with root package name */
    public int f318907g;

    public o0(android.view.View root, qf2.q3 controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f318901a = root;
        this.f318902b = controller;
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = (com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer) root.findViewById(com.tencent.mm.R.id.rmw);
        this.f318903c = finderLiveFloatContainer;
        this.f318904d = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.kqr);
        this.f318905e = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.rzs);
        this.f318906f = root.findViewById(com.tencent.mm.R.id.imn);
        finderLiveFloatContainer.setOnClick(new lj2.j0(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(root, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "<init>", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/controller/mic/FinderLivePayMicController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        root.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(root, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "<init>", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/controller/mic/FinderLivePayMicController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.defaultTranslationY;
    }

    public final void a(int i17, int i18) {
        this.f318907g = i18;
        android.widget.TextView textView = this.f318905e;
        android.view.View view = this.f318901a;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f318904d;
        if (i18 != 2) {
            android.view.View view2 = this.f318906f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(8);
            textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.mkf));
            return;
        }
        int i19 = i17 == 2 ? com.tencent.mm.R.raw.icons_filled_video_call : com.tencent.mm.R.raw.icons_filled_call;
        android.view.View view3 = this.f318906f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToWaitingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget", "changeToWaitingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(0);
        weImageView.setImageResource(i19);
        textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.dnt));
    }

    public final void b() {
        if (this.f318901a.getVisibility() == 0) {
            return;
        }
        pm0.v.X(new lj2.n0(this));
    }
}
