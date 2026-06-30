package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190679d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190679d;
        android.view.View findViewById = c8Var.i().findViewById(com.tencent.mm.R.id.f483488b04);
        findViewById.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.t6(c8Var));
        return findViewById;
    }
}
