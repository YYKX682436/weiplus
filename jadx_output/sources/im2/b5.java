package im2;

/* loaded from: classes3.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a84 f292259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f292262h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292263i;

    public b5(im2.h6 h6Var, r45.a84 a84Var, java.lang.String str, java.lang.String str2, ya2.b2 b2Var, java.lang.String str3) {
        this.f292258d = h6Var;
        this.f292259e = a84Var;
        this.f292260f = str;
        this.f292261g = str2;
        this.f292262h = b2Var;
        this.f292263i = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f292258d.f113668d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ya2.b2 b2Var = this.f292262h;
        java.lang.String avatarUrl = b2Var != null ? b2Var.getAvatarUrl() : null;
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        if (avatarUrl.length() == 0) {
            avatarUrl = this.f292263i;
        }
        qe2.l.d(context, this.f292259e, this.f292260f, this.f292261g, avatarUrl);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
