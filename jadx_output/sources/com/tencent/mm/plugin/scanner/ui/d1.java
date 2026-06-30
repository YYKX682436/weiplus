package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ProductScrollView f159527a;

    /* renamed from: b, reason: collision with root package name */
    public int f159528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f159529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159530d;

    public d1(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159530d = productUI;
        com.tencent.mm.plugin.scanner.ui.c1 c1Var = new com.tencent.mm.plugin.scanner.ui.c1(this);
        com.tencent.mm.plugin.scanner.ui.ProductScrollView productScrollView = (com.tencent.mm.plugin.scanner.ui.ProductScrollView) productUI.findViewById(com.tencent.mm.R.id.lck);
        this.f159527a = productScrollView;
        productScrollView.setOnScrollListener(c1Var);
        int i17 = com.tencent.mm.plugin.scanner.ui.ProductUI.S;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.f159528b = productUI.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478062m, typedValue, true) ? android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, productUI.getResources().getDisplayMetrics()) : 0;
    }
}
