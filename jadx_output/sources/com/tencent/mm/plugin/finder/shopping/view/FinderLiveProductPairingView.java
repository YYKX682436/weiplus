package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveProductPairingView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveProductPairingView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f126292d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f126293e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f126294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductPairingView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ebg, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l78);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126292d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.u8h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126293e = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u4e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126294f = (android.widget.TextView) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductPairingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ebg, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l78);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126292d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.u8h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126293e = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u4e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126294f = (android.widget.TextView) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductPairingView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ebg, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l78);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126292d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.u8h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126293e = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u4e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126294f = (android.widget.TextView) findViewById3;
    }
}
