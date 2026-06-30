package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pe0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f113861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a84 f113862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f113865h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113866i;

    public pe0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, r45.a84 a84Var, java.lang.String str, java.lang.String str2, ya2.b2 b2Var, java.lang.String str3) {
        this.f113861d = jf0Var;
        this.f113862e = a84Var;
        this.f113863f = str;
        this.f113864g = str2;
        this.f113865h = b2Var;
        this.f113866i = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f113861d.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ya2.b2 b2Var = this.f113865h;
        java.lang.String avatarUrl = b2Var != null ? b2Var.getAvatarUrl() : null;
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        if (avatarUrl.length() == 0) {
            avatarUrl = this.f113866i;
        }
        qe2.l.d(context, this.f113862e, this.f113863f, this.f113864g, avatarUrl);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
