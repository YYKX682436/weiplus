package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class q6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f199754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(android.app.Activity activity, java.lang.String str) {
        super(0);
        this.f199754d = activity;
        this.f199755e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f199754d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
        u1Var.n("不再显示");
        android.widget.TextView textView = new android.widget.TextView(activity);
        textView.setText(this.f199755e);
        textView.setTextIsSelectable(true);
        textView.setGravity(8388611);
        u1Var.d(textView);
        u1Var.a(true);
        u1Var.b(com.tencent.mm.ui.chatting.component.p6.f199676a);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
