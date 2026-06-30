package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.s5 f190599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.pluginsdk.ui.chat.s5 s5Var) {
        super(0);
        this.f190599d = s5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.s5 s5Var = this.f190599d;
        android.view.View inflate = com.tencent.mm.ui.id.b(s5Var.f()).inflate(com.tencent.mm.R.layout.f488385rv, (android.view.ViewGroup) null);
        android.view.View decorView = s5Var.f().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        return inflate;
    }
}
