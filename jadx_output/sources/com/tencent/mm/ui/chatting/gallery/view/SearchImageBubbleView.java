package com.tencent.mm.ui.chatting.gallery.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/view/SearchImageBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "anchorView", "Ljz5/f0;", "setAnchorView", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setBubbleText", "", "width", "setViewWidth", "Landroid/view/View$OnClickListener;", "onClickListener", "setBubbleClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SearchImageBubbleView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f201517d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f201518e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f201519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f201520g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Point f201521h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Point f201522i;

    /* renamed from: m, reason: collision with root package name */
    public int f201523m;

    /* renamed from: n, reason: collision with root package name */
    public int f201524n;

    /* renamed from: o, reason: collision with root package name */
    public int f201525o;

    /* renamed from: p, reason: collision with root package name */
    public int f201526p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchImageBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView.onMeasure(int, int):void");
    }

    public final void setAnchorView(android.view.View view) {
        this.f201519f = view;
    }

    public final void setBubbleClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.f201517d;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("bubbleTextView");
            throw null;
        }
    }

    public final void setBubbleText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        android.widget.TextView textView = this.f201517d;
        if (textView != null) {
            textView.setText(text);
        } else {
            kotlin.jvm.internal.o.o("bubbleTextView");
            throw null;
        }
    }

    public final void setViewWidth(int i17) {
        this.f201523m = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchImageBubbleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f201520g = true;
        this.f201521h = new android.graphics.Point(0, 0);
        this.f201522i = new android.graphics.Point(0, 0);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bkg, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.mee);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.mef);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f201517d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.b1q);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f201518e = findViewById3;
        this.f201525o = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480227ry);
        this.f201524n = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480225rw);
    }
}
