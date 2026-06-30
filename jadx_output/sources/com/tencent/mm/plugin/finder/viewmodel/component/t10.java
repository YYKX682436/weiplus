package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t10 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.uj f135958d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f135959e;

    /* renamed from: f, reason: collision with root package name */
    public int f135960f;

    /* renamed from: g, reason: collision with root package name */
    public in5.s0 f135961g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.k8 f135962h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer[] f135963i;

    /* renamed from: m, reason: collision with root package name */
    public final sc2.a9 f135964m;

    /* renamed from: n, reason: collision with root package name */
    public final db5.t4 f135965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135963i = new java.lang.Integer[]{108};
        this.f135964m = new sc2.a9();
        this.f135965n = new com.tencent.mm.plugin.finder.viewmodel.component.h10(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var, db5.g4 g4Var) {
        java.util.List list;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = t10Var.f135959e;
        if (!(baseFinderFeed != null && baseFinderFeed.F0()) || g4Var == null || (list = g4Var.f228344d) == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
            if (!kz5.z.G(t10Var.f135963i, java.lang.Integer.valueOf(menuItem.getItemId()))) {
                db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
                if (h4Var != null) {
                    h4Var.f228375s = true;
                }
            }
        }
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, zy2.gc gcVar) {
        t10Var.getClass();
        boolean z18 = !hc2.o0.g(baseFinderFeed.getFeedObject().getFeedObject());
        if (z17) {
            java.lang.String string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.nim);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.nil);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            t10Var.Q6(appCompatActivity, string, string2, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.Red_100), new com.tencent.mm.plugin.finder.viewmodel.component.o10(baseFinderFeed, z17, gcVar));
            return;
        }
        if (z18) {
            java.lang.String string3 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491963ny2);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String string4 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491962ny1);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            t10Var.Q6(appCompatActivity, string3, string4, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9), new com.tencent.mm.plugin.finder.viewmodel.component.p10(baseFinderFeed, z17, gcVar));
            return;
        }
        java.lang.String string5 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491964ny3);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        java.lang.String string6 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491961ny0);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        t10Var.Q6(appCompatActivity, string5, string6, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9), new com.tencent.mm.plugin.finder.viewmodel.component.q10(baseFinderFeed, z17, gcVar));
    }

    public final void Q6(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, java.lang.String str2, int i17, yz5.a aVar) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appCompatActivity, 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(appCompatActivity).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(str);
        k0Var.s(inflate, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.viewmodel.component.r10(i17, str2);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.viewmodel.component.s10(aVar);
        k0Var.v();
    }
}
