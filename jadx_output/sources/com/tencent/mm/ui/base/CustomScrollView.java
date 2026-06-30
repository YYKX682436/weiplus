package com.tencent.mm.ui.base;

/* loaded from: classes9.dex */
public class CustomScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public db5.i f197234d;

    public CustomScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        db5.i iVar = this.f197234d;
        if (iVar != null) {
            iVar.a(this, i17, i18, i19, i27);
        }
    }

    public void setOnScrollChangeListener(db5.i iVar) {
        this.f197234d = iVar;
    }

    public CustomScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
