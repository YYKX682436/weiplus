package com.tencent.mm.plugin.webview.ui.tools.browser.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView;", "Landroid/widget/RelativeLayout;", "Lix4/b;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setBrowserSettingDialogClickListener", "", "Lhx4/x;", "dataList", "setBrowserList", "", ya.b.INDEX, "setSelectedBrowser", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lx4/m", "lx4/n", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class BrowserSettingDialogView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f184011d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f184012e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f184013f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f184014g;

    /* renamed from: h, reason: collision with root package name */
    public lx4.m f184015h;

    /* renamed from: i, reason: collision with root package name */
    public lx4.a f184016i;

    /* renamed from: m, reason: collision with root package name */
    public ix4.b f184017m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f184018n;

    /* renamed from: o, reason: collision with root package name */
    public int f184019o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserSettingDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setBrowserList(java.util.List<hx4.x> list) {
        if (list == null) {
            return;
        }
        java.util.List dataList = this.f184018n;
        ((java.util.ArrayList) dataList).clear();
        ((java.util.ArrayList) dataList).add(0, new hx4.x(2));
        ((java.util.ArrayList) dataList).addAll(list);
        lx4.m mVar = this.f184015h;
        if (mVar != null) {
            kotlin.jvm.internal.o.g(dataList, "dataList");
            java.util.ArrayList arrayList = mVar.f322148e;
            arrayList.clear();
            arrayList.addAll(dataList);
        }
    }

    public final void setBrowserSettingDialogClickListener(ix4.b bVar) {
        this.f184017m = bVar;
    }

    public final void setSelectedBrowser(int i17) {
        if (i17 < 0) {
            this.f184019o = 0;
        } else {
            this.f184019o = i17 + 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserSettingDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f184018n = new java.util.ArrayList();
        this.f184019o = -1;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bnx, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ayv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f184011d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ayy);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f184014g = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ayu);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f184013f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ayt);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f184012e = (android.widget.TextView) findViewById4;
        android.widget.TextView textView = this.f184011d;
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            this.f184015h = new lx4.m(this, context);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f184014g;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
                recyclerView.setAdapter(this.f184015h);
                recyclerView.setOverScrollMode(2);
                recyclerView.setVerticalFadingEdgeEnabled(false);
                recyclerView.setNestedScrollingEnabled(false);
                androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(context, 1);
                i0Var.d(new lx4.o(recyclerView.getResources().getColor(com.tencent.mm.R.color.f478898k7)));
                recyclerView.N(i0Var);
                if (recyclerView instanceof com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView) {
                    com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView maxHeightRecyclerView = (com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView) recyclerView;
                    maxHeightRecyclerView.setMaxHeight((((int) ((i65.a.k(context) * 3.0f) / 4.0f)) - maxHeightRecyclerView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn)) - maxHeightRecyclerView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by));
                }
                android.widget.TextView textView2 = this.f184013f;
                if (textView2 != null) {
                    textView2.setOnClickListener(new lx4.q(this));
                    android.widget.TextView textView3 = this.f184012e;
                    if (textView3 != null) {
                        textView3.setOnClickListener(new lx4.p(this));
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("cancelButton");
                        throw null;
                    }
                }
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            kotlin.jvm.internal.o.o("browserRecyclerView");
            throw null;
        }
        kotlin.jvm.internal.o.o("dialogTitle");
        throw null;
    }
}
