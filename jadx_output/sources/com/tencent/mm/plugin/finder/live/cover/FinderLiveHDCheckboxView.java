package com.tencent.mm.plugin.finder.live.cover;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView;", "Landroid/widget/FrameLayout;", "", "checked", "Ljz5/f0;", "setChecked", "visible", "setRedDotVisible", "Lkotlin/Function1;", "g", "Lyz5/l;", "getOnCheckedChangeListener", "()Lyz5/l;", "setOnCheckedChangeListener", "(Lyz5/l;)V", "onCheckedChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveHDCheckboxView extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f111646h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.CheckBox f111647d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f111648e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111649f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l onCheckedChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveHDCheckboxView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final yz5.l getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public final void setChecked(boolean z17) {
        this.f111649f = true;
        this.f111647d.setChecked(z17);
        this.f111649f = false;
    }

    public final void setOnCheckedChangeListener(yz5.l lVar) {
        this.onCheckedChangeListener = lVar;
    }

    public final void setRedDotVisible(boolean z17) {
        android.view.View view = this.f111648e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView", "setRedDotVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView", "setRedDotVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public /* synthetic */ FinderLiveHDCheckboxView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveHDCheckboxView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.e_r, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tiw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById;
        this.f111647d = checkBox;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.tiz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.tiy);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f111648e = findViewById3;
        checkBox.setOnCheckedChangeListener(new eg2.j0(this));
        setOnClickListener(new eg2.k0(this));
    }
}
