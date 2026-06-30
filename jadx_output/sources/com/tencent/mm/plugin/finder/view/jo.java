package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class jo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f132458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f132459h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132460i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f132461m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f132462n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132463o;

    public jo(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, int i27, int i28, yz5.l lVar) {
        this.f132455d = str;
        this.f132456e = str2;
        this.f132457f = i17;
        this.f132458g = i18;
        this.f132459h = i19;
        this.f132460i = str3;
        this.f132461m = i27;
        this.f132462n = i28;
        this.f132463o = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderHeartLikePermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        h73.e.d(bundle, "Username", this.f132455d);
        java.lang.String str = this.f132456e;
        if (str == null) {
            str = "";
        }
        h73.e.d(bundle, "WxUserName", str);
        h73.e.c(bundle, "isShieldHisLike", this.f132457f);
        h73.e.c(bundle, "isShieldMyLike", this.f132458g);
        h73.e.c(bundle, "FromScene_WXPROFILE", this.f132459h);
        java.lang.String sessionId = this.f132460i;
        kotlin.jvm.internal.o.f(sessionId, "$sessionId");
        h73.e.d(bundle, "SessionId", sessionId);
        h73.e.c(bundle, "isNotRec", this.f132461m);
        h73.e.c(bundle, "isBlackList", this.f132462n);
        android.content.Intent intent = new android.content.Intent();
        intent.replaceExtras(bundle);
        yz5.l lVar = this.f132463o;
        if (lVar != null) {
            lVar.invoke(intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderHeartLikePermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
