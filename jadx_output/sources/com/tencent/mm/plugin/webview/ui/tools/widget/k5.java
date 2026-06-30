package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.c5 f187366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.l5 f187367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ck f187368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.webview.ui.tools.widget.c5 c5Var, com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var, r45.ck ckVar) {
        super(1);
        this.f187366d = c5Var;
        this.f187367e = l5Var;
        this.f187368f = ckVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.webview.ui.tools.widget.c5 c5Var = this.f187366d;
        if (intValue == 0) {
            c5Var.f187128c.setVisibility(0);
            c5Var.f187132g.setVisibility(8);
            return java.lang.Boolean.FALSE;
        }
        c5Var.f187128c.setVisibility(8);
        c5Var.f187129d.setVisibility(8);
        c5Var.f187130e.setVisibility(8);
        c5Var.f187127b.setVisibility(8);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f187367e.f187382d;
        java.lang.String str = this.f187368f.f371603g;
        android.widget.TextView textView = c5Var.f187126a;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        c5Var.f187132g.setVisibility(0);
        c5Var.f187133h.setVisibility(8);
        c5Var.f187131f.setVisibility(8);
        return java.lang.Boolean.TRUE;
    }
}
