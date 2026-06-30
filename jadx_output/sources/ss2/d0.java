package ss2;

/* loaded from: classes10.dex */
public final class d0 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f411937d;

    /* renamed from: e, reason: collision with root package name */
    public int f411938e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f411939f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f411940g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f411941h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f411942i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f411943m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f411944n;

    /* renamed from: o, reason: collision with root package name */
    public int f411945o;

    public d0(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411937d = activity;
        this.f411945o = 2;
    }

    public final void a() {
        int i17 = this.f411945o;
        android.app.Activity activity = this.f411937d;
        if (i17 == 2) {
            android.view.View view = this.f411943m;
            if (view == null) {
                kotlin.jvm.internal.o.o("switchSceneFinderLogo");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = this.f411940g;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("switchSceneAvatar");
                throw null;
            }
            ng5.a.a(imageView, c01.z1.r());
        } else {
            android.view.View view2 = this.f411943m;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("switchSceneFinderLogo");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(activity));
            java.lang.String avatarUrl = b17 != null ? b17.getAvatarUrl() : "";
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(avatarUrl, null, 2, null);
            android.widget.ImageView imageView2 = this.f411940g;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("switchSceneAvatar");
                throw null;
            }
            a17.c(nVar, imageView2, g1Var.h(mn2.f1.f329957h));
        }
        android.widget.TextView textView = this.f411941h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("switchSceneName");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String b18 = hc2.t.b(activity, this.f411945o);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, b18));
    }
}
