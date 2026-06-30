package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jd implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f118752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118753e;

    public jd(android.widget.TextView textView, int i17) {
        this.f118752d = textView;
        this.f118753e = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.tencent.mm.ui.tools.v4.b(this.f118753e, str) / 2;
        if (b17 < 0) {
            b17 = 0;
        }
        this.f118752d.setText(java.lang.String.valueOf(b17));
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        this.f118752d.setText("0");
    }
}
