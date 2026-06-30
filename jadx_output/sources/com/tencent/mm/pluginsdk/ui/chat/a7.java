package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class a7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190176d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190176d;
        android.view.View c17 = c8Var.e().c(com.tencent.mm.R.id.b0i);
        c17.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.z6(c8Var));
        return c17;
    }
}
