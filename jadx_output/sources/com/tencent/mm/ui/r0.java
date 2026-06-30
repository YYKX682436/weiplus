package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f209577a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f209578b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.q0 f209579c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f209580d;

    /* renamed from: e, reason: collision with root package name */
    public int f209581e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f209582f;

    /* renamed from: g, reason: collision with root package name */
    public int f209583g;

    /* renamed from: h, reason: collision with root package name */
    public int f209584h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f209585i;

    public r0(android.app.Activity activity, boolean z17) {
        this.f209578b = false;
        com.tencent.mm.ui.p0 p0Var = new com.tencent.mm.ui.p0(this);
        this.f209585i = p0Var;
        this.f209577a = activity;
        this.f209578b = z17;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) activity.findViewById(android.R.id.content);
        if (frameLayout == null) {
            return;
        }
        android.view.View childAt = frameLayout.getChildAt(0);
        this.f209580d = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(p0Var);
        this.f209582f = childAt.getLayoutParams();
    }

    public static void a(android.app.Activity activity, boolean z17) {
        new com.tencent.mm.ui.r0(activity, z17);
    }

    public r0(android.app.Activity activity, boolean z17, android.view.View view, com.tencent.mm.ui.q0 q0Var) {
        this.f209578b = false;
        com.tencent.mm.ui.p0 p0Var = new com.tencent.mm.ui.p0(this);
        this.f209585i = p0Var;
        this.f209577a = activity;
        this.f209578b = z17;
        this.f209580d = view;
        this.f209579c = q0Var;
        view.getViewTreeObserver().addOnGlobalLayoutListener(p0Var);
        this.f209582f = view.getLayoutParams();
    }
}
