package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/widget/InsectFrameLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "", "g", "Lyz5/l;", "getInsectCallback", "()Lyz5/l;", "setInsectCallback", "(Lyz5/l;)V", "insectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class InsectFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211272d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f211273e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f211274f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l insectCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsectFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211272d = "MicroMsg.InsectLayout";
        this.f211273e = new android.graphics.Rect();
        this.f211274f = new int[2];
    }

    public boolean g(int i17) {
        return this instanceof com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer;
    }

    public final yz5.l getInsectCallback() {
        return this.insectCallback;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yz5.l lVar;
        android.graphics.Rect rect = this.f211273e;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.f211274f;
        getLocationOnScreen(iArr);
        int i28 = ((i27 - i18) + iArr[1]) - rect.bottom;
        boolean g17 = g(i28);
        if (!g17 && (lVar = this.insectCallback) != null) {
            kotlin.jvm.internal.o.d(lVar);
            g17 = ((java.lang.Boolean) lVar.invoke(java.lang.Integer.valueOf(i28))).booleanValue();
        }
        if (!g17 && getPaddingBottom() != i28) {
            post(new al5.g0(this, i28));
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public final void setInsectCallback(yz5.l lVar) {
        this.insectCallback = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsectFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsectFrameLayout(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
