package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class IPCallAddressCountView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f142535d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142536e;

    public IPCallAddressCountView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.blj, this);
        this.f142535d = findViewById(com.tencent.mm.R.id.cak);
        this.f142536e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.caj);
    }

    public void setAddressCount(int i17) {
        this.f142536e.setText(getContext().getResources().getQuantityString(com.tencent.mm.R.plurals.f489665b, i17, java.lang.Integer.valueOf(i17)));
    }

    public IPCallAddressCountView(android.content.Context context, int i17) {
        super(context);
        a();
        setAddressCount(i17);
    }
}
