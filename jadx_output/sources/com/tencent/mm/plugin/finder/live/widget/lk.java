package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lk {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashSet f118940j = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f118941a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f118942b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.e6 f118943c;

    /* renamed from: d, reason: collision with root package name */
    public int f118944d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f118945e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f118946f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f118947g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f118948h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f118949i;

    public lk(com.tencent.mm.ui.MMActivity activity, android.view.ViewGroup licenseContainer, boolean z17, com.tencent.mm.plugin.finder.live.viewmodel.e6 callback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(licenseContainer, "licenseContainer");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f118941a = activity;
        this.f118942b = z17;
        this.f118943c = callback;
        ae2.in inVar = ae2.in.f3688a;
        this.f118944d = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_KNOW_GAME_LICENSE_UPDATE_INT_SYNC, 0);
        this.f118949i = "";
        this.f118945e = licenseContainer;
        licenseContainer.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.jk(this));
        android.view.View findViewById = licenseContainer.findViewById(com.tencent.mm.R.id.l0i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118946f = (android.widget.CheckBox) findViewById;
        b().setOnCheckedChangeListener(new com.tencent.mm.plugin.finder.live.widget.kk(this));
        android.view.View findViewById2 = licenseContainer.findViewById(com.tencent.mm.R.id.l0k);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f118947g = textView;
        android.text.SpannableString h17 = com.tencent.mm.plugin.finder.assist.b3.f102022a.h(activity, com.tencent.mm.R.string.dgc, this.f118948h);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(h17);
    }

    public final void a() {
        if (this.f118942b) {
            this.f118944d = 0;
        }
        int i17 = this.f118944d;
        android.view.View view = this.f118945e;
        if (i17 != 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b().setChecked(true);
        this.f118943c.onChange();
    }

    public final android.widget.CheckBox b() {
        android.widget.CheckBox checkBox = this.f118946f;
        if (checkBox != null) {
            return checkBox;
        }
        kotlin.jvm.internal.o.o("checkBox");
        throw null;
    }
}
