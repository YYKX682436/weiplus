package com.tencent.mm.plugin.location.ui;

/* loaded from: classes5.dex */
public class ShareHeader extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144658d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f144659e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMImageButton f144660f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMImageButton f144661g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f144662h;

    public ShareHeader(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144658d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f144658d, com.tencent.mm.R.layout.f489459cn2, this);
        this.f144659e = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.gy8);
        this.f144660f = (com.tencent.mm.ui.base.MMImageButton) inflate.findViewById(com.tencent.mm.R.id.ocq);
        this.f144661g = (com.tencent.mm.ui.base.MMImageButton) inflate.findViewById(com.tencent.mm.R.id.f487343od2);
        this.f144662h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
    }

    public android.view.ViewGroup getHeaderBar() {
        return this.f144659e;
    }

    public void setOnLeftClickListener(android.view.View.OnClickListener onClickListener) {
        this.f144660f.setOnClickListener(onClickListener);
    }

    public void setOnRightClickListener(android.view.View.OnClickListener onClickListener) {
        this.f144661g.setOnClickListener(onClickListener);
    }

    public void setTitle(java.lang.String str) {
        this.f144662h.setText(str);
    }

    public void setTitleColor(int i17) {
        this.f144662h.setTextColor(i17);
    }

    public ShareHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144658d = context;
        a();
    }
}
