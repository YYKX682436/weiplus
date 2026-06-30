package qd2;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f361793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361794f;

    public l(android.app.Activity activity, jz5.l lVar, int i17) {
        this.f361792d = activity;
        this.f361793e = lVar;
        this.f361794f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderJumpErrHelper$getCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = (java.lang.String) this.f361793e.f302834e;
        android.app.Activity context = this.f361792d;
        kotlin.jvm.internal.o.g(context, "context");
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, this.f361794f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderJumpErrHelper$getCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
