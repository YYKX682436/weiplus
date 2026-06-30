package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.model.q1 f156984d = new com.tencent.mm.plugin.remittance.model.q1();

    public q1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        return java.lang.Boolean.valueOf(textView != null && textView.getVisibility() == 0);
    }
}
