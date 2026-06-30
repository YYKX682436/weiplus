package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.luckymoney.ui.ka f147101d = new com.tencent.mm.plugin.luckymoney.ui.ka();

    public ka() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1a);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1b);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j1_);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(textView != null ? textView.getText() : null);
        sb6.append(textView2 != null ? textView2.getText() : null);
        sb6.append(textView3 != null ? textView3.getText() : null);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
