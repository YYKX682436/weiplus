package uj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f428268a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f428269b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f428270c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f428271d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f428272e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f428273f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f428274g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f428275h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f428276i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f428277j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f428278k;

    public g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f428268a = context;
        this.f428278k = new uj3.f(this);
    }

    public final void a(android.widget.RelativeLayout rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f428277j = rootView;
        android.view.View inflate = android.view.LayoutInflater.from(this.f428268a).inflate(com.tencent.mm.R.layout.f489431ci4, rootView);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f428276i = relativeLayout;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) relativeLayout.findViewById(com.tencent.mm.R.id.mbf);
        this.f428269b = weImageView;
        if (weImageView != null) {
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(rootView.getContext(), com.tencent.mm.R.raw.icons_filled_board, -1));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428269b;
        if (weImageView2 != null) {
            weImageView2.setIconColor(-1);
        }
        android.widget.RelativeLayout relativeLayout2 = this.f428276i;
        this.f428270c = relativeLayout2 != null ? relativeLayout2.findViewById(com.tencent.mm.R.id.mbg) : null;
        android.widget.RelativeLayout relativeLayout3 = this.f428276i;
        android.view.View findViewById = relativeLayout3 != null ? relativeLayout3.findViewById(com.tencent.mm.R.id.jwq) : null;
        this.f428272e = findViewById;
        if (findViewById != null) {
            findViewById.setBackground(com.tencent.mm.ui.uk.e(rootView.getContext(), com.tencent.mm.R.drawable.aqf, rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f478496g)));
        }
        android.view.View view = this.f428272e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "getNavLayout", "(Landroid/widget/RelativeLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "getNavLayout", "(Landroid/widget/RelativeLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.RelativeLayout relativeLayout4 = this.f428276i;
        this.f428273f = relativeLayout4 != null ? (android.widget.TextView) relativeLayout4.findViewById(com.tencent.mm.R.id.mbh) : null;
        android.widget.RelativeLayout relativeLayout5 = this.f428276i;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = relativeLayout5 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) relativeLayout5.findViewById(com.tencent.mm.R.id.jwy) : null;
        this.f428274g = weImageView3;
        if (weImageView3 == null) {
            return;
        }
        weImageView3.setVisibility(8);
    }

    public final void b() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f428271d;
        if (n3Var != null) {
            n3Var.removeCallbacks(this.f428278k);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f428271d;
        if (n3Var2 != null) {
            n3Var2.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var3 = this.f428271d;
        if (n3Var3 != null) {
            n3Var3.quitSafely();
        }
        android.view.View view = this.f428270c;
        if (view != null) {
            view.clearAnimation();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f428269b;
        if (weImageView != null) {
            weImageView.clearAnimation();
        }
        c(0);
        this.f428275h = true;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428269b;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        android.view.View view2 = this.f428270c;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "reachAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "reachAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f428273f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenAvatarNavAnimatorUI", "showScreenIconAvatar " + i17);
        android.view.View view = this.f428277j;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f428274g;
        android.content.Context context = this.f428268a;
        if (weImageView != null) {
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_board, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f428274g;
        if (weImageView2 != null) {
            weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f428274g;
        if (weImageView3 != null) {
            weImageView3.setVisibility(i17);
        }
        android.view.View view2 = this.f428272e;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f428269b;
        if (weImageView4 != null) {
            weImageView4.setVisibility(8);
        }
        android.view.View view3 = this.f428270c;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f428273f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
