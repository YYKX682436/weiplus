package com.tencent.mm.plugin.finder.view;

/* renamed from: com.tencent.mm.plugin.finder.view.do, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cdo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f131915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f131916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f131917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131918i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f131919m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f131920n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f131921o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131922p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131923q;

    public Cdo(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, int i27, int i28, yz5.l lVar, android.view.View view, android.view.View view2) {
        this.f131913d = str;
        this.f131914e = str2;
        this.f131915f = i17;
        this.f131916g = i18;
        this.f131917h = i19;
        this.f131918i = str3;
        this.f131919m = i27;
        this.f131920n = i28;
        this.f131921o = lVar;
        this.f131922p = view;
        this.f131923q = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String username = this.f131913d;
        kotlin.jvm.internal.o.f(username, "$username");
        h73.e.d(bundle, "Username", username);
        java.lang.String wxUsername = this.f131914e;
        kotlin.jvm.internal.o.f(wxUsername, "$wxUsername");
        h73.e.d(bundle, "WxUserName", wxUsername);
        h73.e.c(bundle, "isShieldHisLike", this.f131915f);
        h73.e.c(bundle, "isShieldMyLike", this.f131916g);
        h73.e.c(bundle, "FromScene_WXPROFILE", this.f131917h);
        java.lang.String sessionId = this.f131918i;
        kotlin.jvm.internal.o.f(sessionId, "$sessionId");
        h73.e.d(bundle, "SessionId", sessionId);
        h73.e.c(bundle, "isNotRec", this.f131919m);
        h73.e.c(bundle, "isBlackList", this.f131920n);
        android.view.View view2 = this.f131922p;
        yz5.l lVar = this.f131921o;
        if (lVar != null) {
            if (view2 != null) {
                view2.callOnClick();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.replaceExtras(bundle);
            lVar.invoke(intent);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view2 != null) {
            view2.callOnClick();
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.replaceExtras(bundle);
        android.view.View view3 = this.f131923q;
        intent2.setClass(view3.getContext(), com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31.class);
        android.content.Context context = view3.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfile$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
