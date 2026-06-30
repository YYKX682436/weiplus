package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u2 f186882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.webview.ui.tools.u2 u2Var) {
        super(1);
        this.f186882d = u2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.a_f);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.a9v);
        android.widget.ImageView imageView = (android.widget.ImageView) it.findViewById(com.tencent.mm.R.id.a_i);
        java.lang.String text = textView.getVisibility() == 0 ? textView.getText() : "";
        java.lang.String text2 = textView2.getVisibility() == 0 ? textView2.getText() : "";
        java.lang.String string = imageView.getVisibility() == 0 ? this.f186882d.getContext().getResources().getString(com.tencent.mm.R.string.igy) : "";
        kotlin.jvm.internal.o.d(string);
        return ((java.lang.Object) text) + (char) 65292 + ((java.lang.Object) text2) + (char) 65292 + string;
    }
}
