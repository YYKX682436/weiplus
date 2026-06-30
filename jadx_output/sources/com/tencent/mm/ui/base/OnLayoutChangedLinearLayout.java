package com.tencent.mm.ui.base;

/* loaded from: classes11.dex */
public class OnLayoutChangedLinearLayout extends com.tencent.mm.ui.widget.DrawnCallBackLinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public db5.x8 f197686d;

    public OnLayoutChangedLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.widget.DrawnCallBackLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        db5.x8 x8Var = this.f197686d;
        if (x8Var != null) {
            x8Var.a();
        }
    }

    public void setOnChattingLayoutChangedListener(db5.x8 x8Var) {
        this.f197686d = x8Var;
    }

    public OnLayoutChangedLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
