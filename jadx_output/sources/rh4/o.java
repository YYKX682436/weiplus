package rh4;

/* loaded from: classes8.dex */
public class o extends rh4.n0 {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.FrameLayout f395772p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.RelativeLayout f395773q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f395774r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f395775s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f395776t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f395777u;

    /* renamed from: v, reason: collision with root package name */
    public final android.os.Vibrator f395778v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, lh4.b callback, int i17, android.util.AttributeSet attributeSet, int i18) {
        super(context, callback, i17, attributeSet, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f395772p = (android.widget.FrameLayout) getRoot().findViewById(com.tencent.mm.R.id.ng6);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) getRoot().findViewById(com.tencent.mm.R.id.ng7);
        this.f395773q = relativeLayout;
        this.f395774r = (android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.nga);
        this.f395775s = (android.widget.LinearLayout) getRoot().findViewById(com.tencent.mm.R.id.ng8);
        this.f395778v = (android.os.Vibrator) context.getSystemService("vibrator");
        relativeLayout.setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478677du : com.tencent.mm.R.color.f478676dt);
        getRecyclerView().setId(com.tencent.mm.R.id.f487232nz0);
        getMoreView().setAccessibilityTraversalBefore(getRecyclerView().getId());
        j();
    }

    @Override // rh4.n0, lh4.h
    public void d() {
        android.widget.TextView title = getTitle();
        android.view.ViewGroup.LayoutParams layoutParams = title != null ? title.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479718db);
            getTitle().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // rh4.n0, lh4.h
    public java.lang.String f() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f490310rf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // rh4.n0
    public com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView i() {
        return new com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView(getContext());
    }

    @Override // rh4.n0
    public void l() {
        rh4.j0 weAppCallback = getWeAppCallback();
        if (weAppCallback != null) {
            weAppCallback.r(2);
        }
    }

    @Override // rh4.n0
    public void m(float f17) {
        super.m(f17);
        android.widget.FrameLayout frameLayout = this.f395772p;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i17 = (int) f17;
        ((android.widget.FrameLayout.LayoutParams) layoutParams).leftMargin = i17;
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).rightMargin = i17;
    }

    public final void p(boolean z17) {
        android.widget.FrameLayout frameLayout = this.f395772p;
        if (frameLayout.getVisibility() != 4 || !z17) {
            if (frameLayout.getVisibility() != 0 || z17) {
                return;
            }
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(0.0f).setDuration(250L).setListener(new rh4.n(this)).start();
            return;
        }
        q(-1.0f, -1.0f);
        frameLayout.setVisibility(0);
        if (!this.f395777u) {
            int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480038ma) + i65.a.f(getContext(), com.tencent.mm.R.dimen.m_);
            android.graphics.Rect rect = new android.graphics.Rect();
            android.widget.LinearLayout linearLayout = this.f395775s;
            linearLayout.getGlobalVisibleRect(rect);
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            if (rect.bottom + i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv) > i65.a.k(getContext()) - f17) {
                this.f395777u = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionMyWeAppView", "need adjust mask view height");
                layoutParams2.removeRule(13);
                layoutParams2.addRule(14);
                layoutParams2.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
            } else {
                layoutParams2.addRule(13);
                layoutParams2.removeRule(14);
                layoutParams2.topMargin = 0;
            }
            linearLayout.setLayoutParams(layoutParams2);
        }
        frameLayout.setAlpha(0.0f);
        frameLayout.clearAnimation();
        frameLayout.animate().alpha(1.0f).setDuration(250L).setListener(null).start();
    }

    public final boolean q(float f17, float f18) {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f395772p.getGlobalVisibleRect(rect);
        boolean contains = rect.contains((int) f17, (int) f18);
        if (!this.f395776t && contains) {
            announceForAccessibility(getContext().getString(com.tencent.mm.R.string.f490099kv));
            android.os.Vibrator vibrator = this.f395778v;
            if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        }
        this.f395776t = contains;
        this.f395774r.setText(contains ? com.tencent.mm.R.string.f490306rb : com.tencent.mm.R.string.ra);
        this.f395773q.setBackgroundResource(contains ? com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478675ds : com.tencent.mm.R.color.f478674dr : com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478677du : com.tencent.mm.R.color.f478676dt);
        return contains;
    }
}
