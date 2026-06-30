package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes2.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.j7 f146982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.tencent.mm.plugin.luckymoney.ui.j7 j7Var) {
        super(1);
        this.f146982d = j7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.iz_);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (!(bool != null ? bool.booleanValue() : false)) {
            view.setImportantForAccessibility(2);
            return "";
        }
        view.setImportantForAccessibility(1);
        com.tencent.mm.plugin.luckymoney.ui.j7 j7Var = this.f146982d;
        java.lang.String string = j7Var.getString(com.tencent.mm.R.string.jar);
        if (!(view.getAlpha() == 1.0f)) {
            return string;
        }
        return string + j7Var.getString(com.tencent.mm.R.string.gjv);
    }
}
