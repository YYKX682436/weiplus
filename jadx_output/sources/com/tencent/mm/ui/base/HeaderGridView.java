package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public class HeaderGridView extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f197259d;

    public HeaderGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197259d = new java.util.ArrayList();
        super.setClipChildren(false);
    }

    public int getHeaderViewCount() {
        return this.f197259d.size();
    }

    @Override // android.widget.GridView
    public int getNumColumns() {
        return super.getNumColumns();
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z17) {
    }

    public HeaderGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197259d = new java.util.ArrayList();
        super.setClipChildren(false);
    }
}
