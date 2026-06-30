package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class l9 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f201923d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f201924e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f201925f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f201926g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.customview.widget.l f201927h;

    /* renamed from: i, reason: collision with root package name */
    public float f201928i;

    /* renamed from: m, reason: collision with root package name */
    public int f201929m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f201930n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.j9 f201931o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(android.app.Activity context, yz5.l dragEnableBlock) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dragEnableBlock, "dragEnableBlock");
        this.f201923d = dragEnableBlock;
        this.f201926g = context;
        this.f201927h = new androidx.customview.widget.l(getContext(), this, new com.tencent.mm.ui.chatting.k9(this));
    }

    public final void a(int i17) {
        android.app.Activity activity = this.f201926g;
        if (activity == null) {
            return;
        }
        android.view.View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        this.f201924e = viewGroup;
        this.f201925f = viewGroup.getChildAt(0);
        android.view.ViewGroup viewGroup2 = this.f201924e;
        kotlin.jvm.internal.o.d(viewGroup2);
        viewGroup2.removeView(this.f201925f);
        addView(this.f201925f);
        android.view.ViewGroup viewGroup3 = this.f201924e;
        kotlin.jvm.internal.o.d(viewGroup3);
        viewGroup3.addView(this);
        fq1.e.f265507a.g(this.f201925f, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
        this.f201929m = i17;
        this.f201928i = i17 * 0.3f;
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f201927h;
        boolean z17 = false;
        if (lVar != null && lVar.h(true)) {
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    public final com.tencent.mm.ui.chatting.j9 getDialogActivityPullDownCallback() {
        return this.f201931o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        androidx.customview.widget.l lVar;
        kotlin.jvm.internal.o.g(event, "event");
        if (!((java.lang.Boolean) this.f201923d.invoke(event)).booleanValue() || (lVar = this.f201927h) == null) {
            return false;
        }
        return lVar.t(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        androidx.customview.widget.l lVar = this.f201927h;
        if (lVar == null) {
            return true;
        }
        lVar.m(event);
        return true;
    }

    public final void setDialogActivityPullDownCallback(com.tencent.mm.ui.chatting.j9 j9Var) {
        this.f201931o = j9Var;
    }
}
