package com.tencent.mm.plugin.location.ui;

/* loaded from: classes.dex */
public class TipSayingWidget extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144668d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f144669e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f144670f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144671g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Chronometer f144672h;

    public TipSayingWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144668d = context;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d18, this);
        this.f144669e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.m_5);
        this.f144670f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m_7);
        this.f144672h = (android.widget.Chronometer) findViewById(com.tencent.mm.R.id.bwf);
    }

    public void setCurSaying(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(this.f144669e, str, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f144671g)) {
            this.f144671g = c01.z1.r();
        }
        boolean equals = this.f144671g.equals(str);
        android.content.Context context = this.f144668d;
        if (equals) {
            this.f144670f.setText(context.getString(com.tencent.mm.R.string.k1s, str));
            this.f144672h.setVisibility(0);
        } else {
            this.f144670f.setText(context.getString(com.tencent.mm.R.string.k1s, str));
            this.f144672h.setVisibility(8);
        }
    }
}
