package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class k7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190449d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190449d;
        android.view.View inflate = com.tencent.mm.ui.id.b(c8Var.f()).inflate(com.tencent.mm.R.layout.f488385rv, (android.view.ViewGroup) null);
        android.view.View decorView = c8Var.e().f460717l.getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        return inflate;
    }
}
