package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes2.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.j7 f146933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.plugin.luckymoney.ui.j7 j7Var) {
        super(1);
        this.f146933d = j7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.luckymoney.ui.j7 j7Var = this.f146933d;
        android.widget.TextView textView = (android.widget.TextView) j7Var.findViewById(com.tencent.mm.R.id.f485771j06);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) (textView != null ? textView.getText() : null));
        sb6.append(j7Var.getString(com.tencent.mm.R.string.gju));
        return sb6.toString();
    }
}
