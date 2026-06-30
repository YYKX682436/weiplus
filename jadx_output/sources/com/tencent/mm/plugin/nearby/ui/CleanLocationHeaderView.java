package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class CleanLocationHeaderView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f152080d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f152081e;

    public CleanLocationHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c5z, this);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k5z);
        this.f152080d = textView;
        textView.setSingleLine(false);
        this.f152081e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.k5f);
        this.f152080d.setText(com.tencent.mm.R.string.b8t);
        this.f152081e.setImageResource(com.tencent.mm.R.raw.peoplenearby_icon);
    }

    public CleanLocationHeaderView(android.content.Context context) {
        super(context);
        a(context);
    }
}
