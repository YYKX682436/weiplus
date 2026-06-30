package com.tencent.mm.plugin.recordvideo.ui;

/* loaded from: classes3.dex */
public class BubbleViewLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f155883d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.ui.RecordBubbleView f155884e;

    public BubbleViewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.eh9, this);
        this.f155883d = inflate;
        this.f155884e = (com.tencent.mm.plugin.recordvideo.ui.RecordBubbleView) inflate.findViewById(com.tencent.mm.R.id.sng);
    }

    public void setOffset(int i17) {
        this.f155884e.setOffset(i17);
    }
}
