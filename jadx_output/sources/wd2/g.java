package wd2;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f444834a;

    /* renamed from: b, reason: collision with root package name */
    public final zl2.u4 f444835b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f444836c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f444837d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f444838e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f444839f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f444840g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f444841h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f444842i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f444843j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f444844k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f444845l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.FrameLayout f444846m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f444847n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f444848o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f444849p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f444850q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f444851r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f444852s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f444853t;

    /* JADX WARN: Removed duplicated region for block: B:12:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r11, boolean r12, zl2.u4 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd2.g.<init>(android.content.Context, boolean, zl2.u4, boolean):void");
    }

    public final boolean a() {
        return this.f444834a.getResources().getConfiguration().orientation == 2;
    }

    public final void b(int i17) {
        android.view.View view;
        this.f444838e.setVisibility(i17);
        if (i17 != 0 || (view = this.f444848o) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(android.graphics.drawable.Drawable drawable) {
        this.f444837d.setBackground(drawable);
    }

    public final void d(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        boolean z17 = title.length() == 0;
        android.widget.TextView textView = this.f444843j;
        if (z17) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(title);
        textView.setVisibility(0);
        this.f444844k.setVisibility(8);
        this.f444845l.setVisibility(8);
    }

    public final void e(java.lang.String mainTitle, java.lang.String secondTitle) {
        kotlin.jvm.internal.o.g(mainTitle, "mainTitle");
        kotlin.jvm.internal.o.g(secondTitle, "secondTitle");
        boolean z17 = mainTitle.length() == 0;
        android.widget.TextView textView = this.f444845l;
        android.widget.TextView textView2 = this.f444844k;
        if (!z17) {
            if (!(secondTitle.length() == 0)) {
                textView2.setText(mainTitle);
                textView2.setVisibility(0);
                textView.setText(secondTitle);
                textView.setVisibility(0);
                this.f444843j.setVisibility(8);
                return;
            }
        }
        textView2.setVisibility(8);
        textView.setVisibility(8);
    }

    public final void f(int i17) {
        android.widget.RelativeLayout relativeLayout = this.f444838e;
        int i18 = relativeLayout.getVisibility() == 0 ? relativeLayout.getLayoutParams().height : this.f444848o.getLayoutParams().height;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f444836c;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = y1Var.f212036r;
        if (bottomSheetBehavior != null && i17 > 0) {
            bottomSheetBehavior.C(i17 + i18);
            bottomSheetBehavior.D(3);
        }
        y1Var.s();
    }
}
