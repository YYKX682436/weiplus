package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/widget/InsectLinearLayout;", "Landroid/widget/LinearLayout;", "", "g", "Z", "getDiscardKeyboard", "()Z", "setDiscardKeyboard", "(Z)V", "discardKeyboard", "Lkotlin/Function1;", "", "h", "Lyz5/l;", "getInsectCallback", "()Lyz5/l;", "setInsectCallback", "(Lyz5/l;)V", "insectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class InsectLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211276d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f211277e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f211278f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean discardKeyboard;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l insectCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsectLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211276d = "MicroMsg.InsectLayout";
        this.f211277e = new android.graphics.Rect();
        this.f211278f = new int[2];
    }

    public final boolean getDiscardKeyboard() {
        return this.discardKeyboard;
    }

    public final yz5.l getInsectCallback() {
        return this.insectCallback;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean z18;
        com.tencent.mars.xlog.Log.i(this.f211276d, "InsectRelativeLayout onLayout");
        android.graphics.Rect rect = this.f211277e;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.f211278f;
        getLocationOnScreen(iArr);
        boolean z19 = true;
        int i28 = ((i27 - i18) + iArr[1]) - rect.bottom;
        yz5.l lVar = this.insectCallback;
        if (lVar != null) {
            kotlin.jvm.internal.o.d(lVar);
            z18 = ((java.lang.Boolean) lVar.invoke(java.lang.Integer.valueOf(i28))).booleanValue();
        } else {
            z18 = false;
        }
        boolean z27 = i28 > com.tencent.mm.ui.bl.c(getContext()) * 3;
        if (!z18 && (!z27 || !this.discardKeyboard)) {
            z19 = false;
        }
        if (!z19 && getPaddingBottom() != i28) {
            post(new al5.h0(this, i28));
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public final void setDiscardKeyboard(boolean z17) {
        this.discardKeyboard = z17;
    }

    public final void setInsectCallback(yz5.l lVar) {
        this.insectCallback = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsectLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
