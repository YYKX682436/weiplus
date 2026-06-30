package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveProductListOptionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveProductListOptionView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f126287d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f126288e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f126289f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductListOptionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(boolean z17) {
        if (z17) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.kjz);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductListOptionView", "select", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductListOptionView", "select", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kjz);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductListOptionView", "select", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveProductListOptionView", "select", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveProductListOptionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f126287d = -1;
        this.f126288e = "";
        this.f126289f = "";
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vd2.x5.f436009d, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f126287d = obtainStyledAttributes.getResourceId(0, -1);
        this.f126288e = obtainStyledAttributes.getString(2);
        this.f126289f = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.azg, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486199kk2);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kka);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kk8);
        textView2.setTextSize(1, 14.0f);
        imageView.setImageResource(this.f126287d);
        textView.setText(this.f126288e);
        textView2.setText(this.f126289f);
    }
}
