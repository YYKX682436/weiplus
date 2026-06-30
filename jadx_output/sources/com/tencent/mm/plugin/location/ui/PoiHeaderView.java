package com.tencent.mm.plugin.location.ui;

/* loaded from: classes3.dex */
public class PoiHeaderView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f144625d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144626e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144627f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.SimpleImageView f144628g;

    public PoiHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144626e = "";
        this.f144627f = "";
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c_1, this);
        this.f144625d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gz9);
        this.f144628g = (com.tencent.mm.plugin.location.ui.SimpleImageView) inflate.findViewById(com.tencent.mm.R.id.gyt);
        this.f144625d.setVisibility(8);
        this.f144628g.setVisibility(8);
        setVisibility(8);
        setOnClickListener(new za3.k(this));
    }

    public void setViewUrl(java.lang.String str) {
        this.f144627f = str;
    }
}
