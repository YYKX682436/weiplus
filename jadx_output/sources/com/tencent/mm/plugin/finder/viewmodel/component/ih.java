package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ih implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f134743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f134744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f134745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.kh f134746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f134747h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134748i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134750n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f134751o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134752p;

    public ih(boolean[] zArr, yz5.a aVar, android.widget.TextView textView, com.tencent.mm.plugin.finder.viewmodel.component.kh khVar, boolean z17, android.view.View view, android.view.View view2, in5.s0 s0Var, long j17, java.lang.String str) {
        this.f134743d = zArr;
        this.f134744e = aVar;
        this.f134745f = textView;
        this.f134746g = khVar;
        this.f134747h = z17;
        this.f134748i = view;
        this.f134749m = view2;
        this.f134750n = s0Var;
        this.f134751o = j17;
        this.f134752p = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ec2.d e27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f134743d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_follow", "<FeedFollow>");
            sVar.H2("ce_feed_follow", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_follow");
        }
        this.f134744e.invoke();
        android.widget.TextView followTv = this.f134745f;
        followTv.setText(com.tencent.mm.R.string.f492274fw4);
        com.tencent.mm.plugin.finder.viewmodel.component.kh khVar = this.f134746g;
        android.content.res.Resources resources = khVar.getContext().getResources();
        boolean z17 = this.f134747h;
        followTv.setTextColor(resources.getColor(z17 ? com.tencent.mm.R.color.BW_0_Alpha_0_3 : com.tencent.mm.R.color.f479252u4));
        kotlin.jvm.internal.o.f(followTv, "$followTv");
        com.tencent.mm.ui.fk.c(followTv);
        android.view.View view2 = this.f134748i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        in5.s0 s0Var = this.f134750n;
        android.graphics.drawable.Drawable drawable = s0Var.f293121e.getDrawable(z17 ? com.tencent.mm.R.drawable.f481642yx : com.tencent.mm.R.drawable.f481641yw);
        android.view.View view3 = this.f134749m;
        view3.setBackground(drawable);
        int dimensionPixelOffset = s0Var.f293121e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);
        view3.setPadding(dimensionPixelOffset, view3.getPaddingTop(), dimensionPixelOffset, view3.getPaddingBottom());
        view3.setOnClickListener(null);
        kotlin.jvm.internal.o.d(view);
        hc2.f1.d(view);
        android.app.Activity context = khVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            e27.a(new ec2.a(25, this.f134751o, this.f134752p));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$showFollowAnim$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
