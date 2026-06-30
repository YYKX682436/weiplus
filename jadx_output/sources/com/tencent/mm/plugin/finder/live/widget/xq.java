package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xq implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120369e;

    public xq(android.widget.TextView textView, int i17) {
        this.f120368d = textView;
        this.f120369e = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int f17 = com.tencent.mm.ui.tools.v4.f(str) / 2;
        if (f17 < 0) {
            f17 = 0;
        }
        this.f120368d.setText(java.lang.String.valueOf((this.f120369e / 2) - f17));
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        this.f120368d.setText("0");
    }
}
