package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f169889a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f169890b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f169891c;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Animation f169893e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f169894f;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.AbsoluteLayout f169892d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f169895g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f169896h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f169897i = -1;

    public m7(android.content.Context context, com.tencent.mm.plugin.sns.ui.listener.i iVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f169889a = context;
        this.f169890b = iVar.O;
        this.f169891c = frameLayout;
        this.f169893e = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f169893e = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477758an);
        this.f169894f = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f169894f = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477759ao);
    }

    public static /* synthetic */ boolean a(com.tencent.mm.plugin.sns.ui.m7 m7Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        m7Var.f169895g = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return z17;
    }

    public boolean b(android.view.View view, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        if (this.f169895g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        android.widget.AbsoluteLayout absoluteLayout = this.f169892d;
        if (absoluteLayout != null) {
            if (absoluteLayout.getTag() instanceof com.tencent.mm.plugin.sns.ui.l7) {
                android.view.View view2 = ((com.tencent.mm.plugin.sns.ui.l7) this.f169892d.getTag()).f169731a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
                this.f169895g = true;
                android.view.animation.Animation animation = this.f169894f;
                view2.startAnimation(animation);
                animation.setAnimationListener(new com.tencent.mm.plugin.sns.ui.k7(this, view2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            } else {
                c();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        if (view.getTag() == null || !(view.getTag() instanceof ca4.n)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        ca4.n nVar = (ca4.n) view.getTag();
        java.lang.String str = nVar.f40001b;
        android.content.Context context = this.f169889a;
        android.widget.AbsoluteLayout absoluteLayout2 = new android.widget.AbsoluteLayout(context);
        this.f169892d = absoluteLayout2;
        absoluteLayout2.setId(com.tencent.mm.R.id.f482733md);
        this.f169891c.addView(this.f169892d);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 88.0f);
        int d18 = com.tencent.mm.sdk.platformtools.j.d(context, 30.0f);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.c8l, (android.view.ViewGroup) null);
        inflate.setOnClickListener(this.f169890b);
        inflate.setTag(nVar);
        int a17 = z17 ? com.tencent.mm.ui.bl.a(context) : 0;
        int[] iArr = new int[2];
        int titleLocation = context instanceof com.tencent.mm.ui.MMActivity ? ((com.tencent.mm.ui.MMActivity) context).getTitleLocation() : 0;
        if (titleLocation <= 0) {
            titleLocation = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
        }
        nVar.f40000a.getLocationInWindow(iArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        int q17 = com.tencent.mm.ui.bk.q(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        this.f169897i = q17;
        if (this.f169896h) {
            titleLocation = i65.a.b(context, 2);
            this.f169897i = 0;
        }
        android.widget.AbsoluteLayout.LayoutParams layoutParams = new android.widget.AbsoluteLayout.LayoutParams(-2, -2, iArr[0] - d17, (((iArr[1] - this.f169897i) - titleLocation) + d18) - a17);
        this.f169892d.setTag(new com.tencent.mm.plugin.sns.ui.l7(this, str, inflate));
        this.f169892d.addView(inflate, layoutParams);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "addUnLikeView", "(Landroid/view/View;ZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "addUnLikeView", "(Landroid/view/View;ZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f169895g = true;
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.i7(this, view, inflate));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return true;
    }

    public boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        android.widget.AbsoluteLayout absoluteLayout = this.f169892d;
        if (absoluteLayout == null) {
            this.f169895g = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        this.f169891c.removeView(absoluteLayout);
        this.f169892d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return true;
    }

    public m7(android.content.Context context, android.view.View.OnClickListener onClickListener, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f169889a = context;
        this.f169890b = onClickListener;
        this.f169891c = frameLayout;
        this.f169893e = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f169893e = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477758an);
        this.f169894f = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f169894f = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477759ao);
    }
}
