package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class zg {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f212621a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f212622b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f212623c;

    /* renamed from: d, reason: collision with root package name */
    public final int f212624d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212625e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f212626f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f212627g;

    /* renamed from: h, reason: collision with root package name */
    public int f212628h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f212629i;

    /* renamed from: j, reason: collision with root package name */
    public int f212630j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f212631k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f212632l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.k0 f212633m;

    public zg(android.content.Context context, java.lang.String filePath, java.lang.String fileExt, int i17, yz5.a aVar, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 8) != 0 ? 3 : i17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.f212621a = context;
        this.f212622b = filePath;
        this.f212623c = fileExt;
        this.f212624d = i17;
        this.f212633m = new com.tencent.mm.ui.yg(this);
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View view = this.f212625e;
        if (view != null) {
        }
        android.view.View view2 = this.f212625e;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mba) : null;
        this.f212626f = textView;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.View view3 = this.f212625e;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.mbb) : null;
        this.f212627g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "applyClickEvent", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "applyClickEvent", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f212625e;
        android.widget.RelativeLayout relativeLayout = view4 != null ? (android.widget.RelativeLayout) view4.findViewById(com.tencent.mm.R.id.mbd) : null;
        this.f212629i = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        android.widget.RelativeLayout relativeLayout2 = this.f212629i;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new com.tencent.mm.ui.xg(this, context));
        }
    }

    public final void b() {
        android.widget.RelativeLayout relativeLayout = this.f212629i;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        android.view.View view = this.f212625e;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.mbb) : null;
        this.f212627g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "refreshIndexLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "refreshIndexLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f212626f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f212626f;
        if (textView2 == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f212628h + 1);
        sb6.append('/');
        sb6.append(this.f212630j);
        textView2.setText(sb6.toString());
    }
}
