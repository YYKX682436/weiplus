package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class NetStatGroup extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f160151d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f160152e;

    public NetStatGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View.inflate(context, com.tencent.mm.R.layout.c7g, this);
        this.f160151d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gtt);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cql);
        this.f160152e = textView;
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2));
    }
}
