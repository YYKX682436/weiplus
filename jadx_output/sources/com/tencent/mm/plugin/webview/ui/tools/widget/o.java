package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f187453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f187454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f187455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.view.View view, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        super(1);
        this.f187453d = view;
        this.f187454e = k0Var;
        this.f187455f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f187454e;
            android.view.View view = this.f187453d;
            if (view != null) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                kotlin.jvm.internal.o.d(k0Var);
                if (k0Var.P.size() > 0 && k0Var.D1 == null) {
                    k0Var.g();
                    k0Var.b(0);
                }
            } else {
                kotlin.jvm.internal.o.d(k0Var);
                int b17 = i65.a.b(this.f187455f, 4);
                android.widget.TextView textView = k0Var.Q1;
                if (textView != null) {
                    textView.setPadding(textView.getPaddingLeft(), k0Var.Q1.getPaddingTop(), k0Var.Q1.getPaddingRight(), b17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
