package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jr implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113165e;

    public jr(com.tencent.mm.plugin.finder.live.plugin.et etVar, int i17) {
        this.f113164d = etVar;
        this.f113165e = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113164d;
        etVar.B.setVisibility(8);
        etVar.f112464z.setEnabled(true);
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.tencent.mm.ui.tools.v4.b(this.f113165e, str);
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113164d;
        if (b17 > 5) {
            etVar.B.setVisibility(8);
        } else {
            etVar.B.setText(java.lang.String.valueOf(b17));
            int color = etVar.R.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5);
            android.widget.TextView textView = etVar.B;
            textView.setTextColor(color);
            textView.setVisibility(0);
        }
        etVar.f112464z.setEnabled(true);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113164d;
        etVar.B.setText(java.lang.String.valueOf(com.tencent.mm.ui.tools.v4.b(this.f113165e, str)));
        int color = etVar.R.getResources().getColor(com.tencent.mm.R.color.f478532ac);
        android.widget.TextView textView = etVar.B;
        textView.setTextColor(color);
        textView.setVisibility(0);
        etVar.f112464z.setEnabled(false);
    }
}
