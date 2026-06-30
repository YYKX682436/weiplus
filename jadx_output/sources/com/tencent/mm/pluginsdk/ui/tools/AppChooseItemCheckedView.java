package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR#\u0010\u0012\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0015\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/AppChooseItemCheckedView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getRoot", "Landroid/widget/ImageView;", "getIconImg", "Landroid/widget/TextView;", "getTitleTv", "getCheckImg", "", "checked", "Ljz5/f0;", "setChecked", "e", "Ljz5/g;", "getNotSetRoot", "()Landroid/view/View;", "notSetRoot", "f", "getAppRoot", "appRoot", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppChooseItemCheckedView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f191326d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g notSetRoot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g appRoot;

    /* renamed from: g, reason: collision with root package name */
    public boolean f191329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppChooseItemCheckedView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.notSetRoot = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.d(this));
        this.appRoot = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.c(this));
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.acv, (android.view.ViewGroup) this, false);
        setSelected(false);
    }

    private final android.view.View getAppRoot() {
        return (android.view.View) this.appRoot.getValue();
    }

    private final android.view.View getNotSetRoot() {
        return (android.view.View) this.notSetRoot.getValue();
    }

    public final void a() {
        android.view.View root = getRoot();
        if (getChildCount() == 0 || !kotlin.jvm.internal.o.b(getChildAt(0), root)) {
            removeAllViews();
            addView(root);
        }
        getCheckImg().setVisibility(this.f191329g ? 0 : 8);
    }

    public final android.widget.ImageView getCheckImg() {
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.e1l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final android.widget.ImageView getIconImg() {
        return (android.widget.ImageView) getRoot().findViewById(com.tencent.mm.R.id.e1q);
    }

    public final android.view.View getRoot() {
        return this.f191326d ? getAppRoot() : getNotSetRoot();
    }

    public final android.widget.TextView getTitleTv() {
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.e1x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.TextView) findViewById;
    }

    public final void setChecked(boolean z17) {
        this.f191329g = z17;
        setSelected(z17);
        if (z17) {
            getCheckImg().setVisibility(0);
        } else {
            getCheckImg().setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppChooseItemCheckedView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.notSetRoot = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.d(this));
        this.appRoot = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.c(this));
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.acv, (android.view.ViewGroup) this, false);
        setSelected(false);
    }
}
