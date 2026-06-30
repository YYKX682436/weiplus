package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveProductPairingTagView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveProductPairingTagView extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f126290e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f126291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductPairingTagView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ebi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nwz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126291d = (android.widget.TextView) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductPairingTagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ebi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nwz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126291d = (android.widget.TextView) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductPairingTagView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ebi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nwz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126291d = (android.widget.TextView) findViewById;
    }
}
