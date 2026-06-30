package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes.dex */
public class NearPoiHeader extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f152290d;

    public NearPoiHeader(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c5u, this);
        this.f152290d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485543i16);
    }

    public void setText(java.lang.CharSequence charSequence) {
        this.f152290d.setText(charSequence);
    }

    public NearPoiHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c5u, this);
        this.f152290d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485543i16);
    }
}
