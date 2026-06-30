package com.tencent.mm.plugin.webview.ui.tools.browser.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView;", "Landroid/widget/RelativeLayout;", "Lix4/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setBrowserClickListener", "", "Lhx4/x;", "dataList", "setBrowserList", "", "show", "setShowBrowserSettingEntry", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lx4/e", "lx4/f", "lx4/g", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class BrowserChooseDialogView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f184001d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f184002e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f184003f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f184004g;

    /* renamed from: h, reason: collision with root package name */
    public int f184005h;

    /* renamed from: i, reason: collision with root package name */
    public lx4.e f184006i;

    /* renamed from: m, reason: collision with root package name */
    public lx4.a f184007m;

    /* renamed from: n, reason: collision with root package name */
    public ix4.a f184008n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f184009o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserChooseDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setBrowserClickListener(ix4.a aVar) {
        this.f184008n = aVar;
    }

    public final void setBrowserList(java.util.List<hx4.x> list) {
        lx4.e eVar;
        if (list == null || (eVar = this.f184006i) == null) {
            return;
        }
        java.util.ArrayList arrayList = eVar.f322125e;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public final void setShowBrowserSettingEntry(boolean z17) {
        if (this.f184009o != z17) {
            this.f184009o = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogView", "updateBrowserSettingEntry %s", java.lang.Boolean.valueOf(z17));
            android.widget.ImageView imageView = this.f184003f;
            if (imageView != null) {
                imageView.setVisibility(this.f184009o ? 0 : 8);
            } else {
                kotlin.jvm.internal.o.o("moreButton");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserChooseDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.util.DisplayMetrics displayMetrics;
        kotlin.jvm.internal.o.g(context, "context");
        this.f184009o = true;
        setFitsSystemWindows(true);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bnv, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ayv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f184001d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ayp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f184002e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ays);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f184003f = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ayy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f184004g = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        android.widget.TextView textView = this.f184001d;
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.widget.ImageView imageView = this.f184002e;
            if (imageView != null) {
                imageView.setOnClickListener(new lx4.h(this, inflate));
                android.widget.ImageView imageView2 = this.f184003f;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new lx4.i(this, inflate));
                    android.content.res.Resources resources = getResources();
                    int B = (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(getContext()) : displayMetrics.widthPixels;
                    this.f184005h = (B - (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aek) * 4)) / 5;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogView", "configItemPadding width: %d, mItemPadding: %s", java.lang.Integer.valueOf(B), java.lang.Integer.valueOf(this.f184005h));
                    this.f184006i = new lx4.e(this, context);
                    androidx.recyclerview.widget.RecyclerView recyclerView = this.f184004g;
                    if (recyclerView != null) {
                        recyclerView.setItemAnimator(null);
                        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 4));
                        recyclerView.setAdapter(this.f184006i);
                        recyclerView.N(new lx4.f(context));
                        recyclerView.setOverScrollMode(2);
                        recyclerView.setVerticalFadingEdgeEnabled(false);
                        recyclerView.setNestedScrollingEnabled(false);
                        if (recyclerView instanceof com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView) {
                            com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView maxHeightRecyclerView = (com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView) recyclerView;
                            maxHeightRecyclerView.setMaxHeight((((int) ((i65.a.k(context) * 3.0f) / 4.0f)) - maxHeightRecyclerView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn)) - maxHeightRecyclerView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn));
                        }
                        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f184004g;
                        if (recyclerView2 != null) {
                            android.view.ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                            if (layoutParams == null || !(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                                return;
                            }
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            int i18 = this.f184005h / 2;
                            marginLayoutParams.leftMargin = i18;
                            marginLayoutParams.rightMargin = i18;
                            return;
                        }
                        kotlin.jvm.internal.o.o("browserRecyclerView");
                        throw null;
                    }
                    kotlin.jvm.internal.o.o("browserRecyclerView");
                    throw null;
                }
                kotlin.jvm.internal.o.o("moreButton");
                throw null;
            }
            kotlin.jvm.internal.o.o("closeButton");
            throw null;
        }
        kotlin.jvm.internal.o.o("dialogTitle");
        throw null;
    }
}
