package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes.dex */
public class BindMobileOrQQHeaderView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f152077d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.nearby.ui.b f152078e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f152079f;

    public BindMobileOrQQHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f152079f = new com.tencent.mm.plugin.nearby.ui.a(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c5z, this);
        this.f152077d = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.k5f);
        int ordinal = this.f152078e.ordinal();
        android.view.View.OnClickListener onClickListener = this.f152079f;
        if (ordinal == 0) {
            setOnClickListener(onClickListener);
            this.f152077d.setImageResource(com.tencent.mm.R.raw.icons_outlined_cellphone);
        } else {
            if (ordinal != 1) {
                return;
            }
            setOnClickListener(onClickListener);
            this.f152077d.setImageResource(com.tencent.mm.R.raw.icons_outlined_contacts);
        }
    }

    public BindMobileOrQQHeaderView(android.content.Context context) {
        super(context);
        this.f152079f = new com.tencent.mm.plugin.nearby.ui.a(this);
        this.f152078e = com.tencent.mm.plugin.nearby.ui.b.Mobile;
        a(context);
    }
}
