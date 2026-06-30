package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanNewStyleSharedMaskView;", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView;", "", "getLayoutId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ScanNewStyleSharedMaskView extends com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanNewStyleSharedMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView
    public int f() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479679cf);
    }

    @Override // com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView
    public int g() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
    }

    @Override // com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eii;
    }

    @Override // com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView
    public int j() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by);
    }

    public void o() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(getLayoutId(), this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.che);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159787d = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f486735ma5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f159788e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f486734ma4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f159789f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ma6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f159790g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.cqc);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.mac);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f159791h = (com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.f486819mj5);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f159792i = findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.aal);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f159793m = (android.widget.ImageView) findViewById8;
        android.view.View view = this.f159792i;
        if (view == null) {
            kotlin.jvm.internal.o.o("galleryButton");
            throw null;
        }
        view.setOnClickListener(new d04.b3(this));
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159791h;
        if (scannerFlashSwitcher == null) {
            kotlin.jvm.internal.o.o("flashSwitcher");
            throw null;
        }
        scannerFlashSwitcher.setOnClickListener(new d04.c3(this));
        android.widget.TextView textView = this.f159788e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("scanTitle");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        e();
        android.view.View galleryButton = getGalleryButton();
        android.view.ViewGroup.LayoutParams layoutParams = galleryButton.getLayoutParams();
        int a17 = e04.e3.a(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479725dh));
        layoutParams.width = a17;
        layoutParams.height = a17;
        galleryButton.setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanNewStyleSharedMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
