package xj1;

/* loaded from: classes7.dex */
public class h0 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f454794d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f454795e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f454796f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f454797g;

    /* renamed from: h, reason: collision with root package name */
    public final xj1.d0 f454798h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f454799i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo f454800m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.view.View itemView, xj1.d0 d0Var) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f454798h = d0Var;
        this.f454799i = true;
        itemView.setOnClickListener(this);
        if (k()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                itemView.setOnLongClickListener(this);
            }
        }
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.l5_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f454794d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.nx7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f454795e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f454796f = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.d0v);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f454797g = findViewById4;
    }

    public final void i(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo dataItem) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        this.f454800m = dataItem;
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.p.a(dataItem.f76363f);
        boolean z17 = a17 == null || a17.length() == 0;
        android.widget.TextView textView = this.f454795e;
        if (z17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(a17);
        }
        j();
        l01.b bVar = l01.d0.f314761a;
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f454800m;
        kotlin.jvm.internal.o.d(localUsageInfo);
        bVar.b(this.f454796f, localUsageInfo.f76368n, l01.a.h(), l01.q0.f314787d);
    }

    public final void j() {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f454800m;
        kotlin.jvm.internal.o.d(localUsageInfo);
        java.lang.String str = localUsageInfo.f76365h;
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = this.f454800m;
            kotlin.jvm.internal.o.d(localUsageInfo2);
            java.lang.String username = localUsageInfo2.f76361d;
            kotlin.jvm.internal.o.f(username, "username");
            java.lang.String quote = java.util.regex.Pattern.quote("@app");
            kotlin.jvm.internal.o.f(quote, "quote(...)");
            str = r26.i0.w(username, quote, "", false);
        }
        this.f454794d.setText(str);
    }

    public boolean k() {
        return this.f454799i;
    }

    public final void l(android.view.View view, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f454800m;
        if (localUsageInfo != null) {
            com.tencent.mm.plugin.appbrand.launching.precondition.x xVar = com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a;
            kotlin.jvm.internal.o.d(view);
            android.content.Context context = view.getContext();
            java.lang.String str2 = localUsageInfo.f76361d;
            java.lang.String str3 = localUsageInfo.f76362e;
            int i17 = localUsageInfo.f76363f;
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject.f87790f = 1103;
            ((com.tencent.mm.plugin.appbrand.launching.a) xVar).b(context, str2, str3, str, i17, 0, appBrandStatObject, null, null);
            xj1.d0 d0Var = this.f454798h;
            if (d0Var != null) {
                ((com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList) d0Var).f89643o = true;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l(view, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            kotlin.jvm.internal.o.d(view);
            new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, new xj1.e0("?wechat_appbrand_test=1"), new xj1.f0(this, view, "?wechat_appbrand_test=1"), xj1.g0.f454789d);
            z17 = true;
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
