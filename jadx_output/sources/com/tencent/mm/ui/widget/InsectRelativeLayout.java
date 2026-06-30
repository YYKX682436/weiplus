package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010&R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006'"}, d2 = {"Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "g", "Z", "getDiscardKeyboard", "()Z", "setDiscardKeyboard", "(Z)V", "discardKeyboard", "Lkotlin/Function1;", "", "h", "Lyz5/l;", "getInsectCallback", "()Lyz5/l;", "setInsectCallback", "(Lyz5/l;)V", "insectCallback", "i", "getForbidLayout", "setForbidLayout", "forbidLayout", "m", "getLayoutOnce", "setLayoutOnce", "layoutOnce", "n", "getHasLaidOut", "setHasLaidOut", "hasLaidOut", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class InsectRelativeLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211281d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f211282e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f211283f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean discardKeyboard;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l insectCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean forbidLayout;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean layoutOnce;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasLaidOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsectRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211281d = "MicroMsg.InsectLayout";
        this.f211282e = new android.graphics.Rect();
        this.f211283f = new int[2];
    }

    public boolean a(int i17) {
        return false;
    }

    public final boolean getDiscardKeyboard() {
        return this.discardKeyboard;
    }

    public final boolean getForbidLayout() {
        return this.forbidLayout;
    }

    public final boolean getHasLaidOut() {
        return this.hasLaidOut;
    }

    public final yz5.l getInsectCallback() {
        return this.insectCallback;
    }

    public final boolean getLayoutOnce() {
        return this.layoutOnce;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yz5.l lVar;
        com.tencent.mars.xlog.Log.i(this.f211281d, "InsectRelativeLayout onLayout " + this.forbidLayout);
        if (this.forbidLayout) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        if (this.layoutOnce && this.hasLaidOut) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        boolean z18 = true;
        this.hasLaidOut = true;
        android.graphics.Rect rect = this.f211282e;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.f211283f;
        getLocationOnScreen(iArr);
        int i28 = ((i27 - i18) + iArr[1]) - rect.bottom;
        boolean a17 = a(i28);
        if (!a17 && (lVar = this.insectCallback) != null) {
            kotlin.jvm.internal.o.d(lVar);
            a17 = ((java.lang.Boolean) lVar.invoke(java.lang.Integer.valueOf(i28))).booleanValue();
        }
        boolean z19 = i28 > com.tencent.mm.ui.bl.c(getContext()) * 3;
        if (!a17 && (!z19 || !this.discardKeyboard)) {
            z18 = false;
        }
        if (!z18 && i28 >= 0 && getPaddingBottom() != i28) {
            post(new al5.i0(this, i28));
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public final void setDiscardKeyboard(boolean z17) {
        this.discardKeyboard = z17;
    }

    public final void setForbidLayout(boolean z17) {
        this.forbidLayout = z17;
    }

    public final void setHasLaidOut(boolean z17) {
        this.hasLaidOut = z17;
    }

    public final void setInsectCallback(yz5.l lVar) {
        this.insectCallback = lVar;
    }

    public final void setLayoutOnce(boolean z17) {
        this.layoutOnce = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsectRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
