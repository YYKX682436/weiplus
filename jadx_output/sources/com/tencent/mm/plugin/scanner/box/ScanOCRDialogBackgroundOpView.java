package com.tencent.mm.plugin.scanner.box;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView;", "Landroid/widget/RelativeLayout;", "Luy3/q;", "", "getVieHeight", "Luy3/p;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ScanOCRDialogBackgroundOpView extends android.widget.RelativeLayout implements uy3.q {

    /* renamed from: d, reason: collision with root package name */
    public uy3.p f158712d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f158713e;

    /* renamed from: f, reason: collision with root package name */
    public int f158714f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanOCRDialogBackgroundOpView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uy3.q
    /* renamed from: getVieHeight, reason: from getter */
    public int getF158714f() {
        return this.f158714f;
    }

    @Override // uy3.q
    public void setOpListener(uy3.p pVar) {
        this.f158712d = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanOCRDialogBackgroundOpView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bow, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.ptf);
        this.f158713e = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new uy3.v0(this));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.sdk.platformtools.t8.q(this.f158713e, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f158714f = i65.a.b(context, 28);
    }
}
