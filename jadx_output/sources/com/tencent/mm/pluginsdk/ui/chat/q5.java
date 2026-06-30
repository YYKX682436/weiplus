package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.s5 f190573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.tencent.mm.pluginsdk.ui.chat.s5 s5Var, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        super(0);
        this.f190573d = s5Var;
        this.f190574e = chatFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.s5 s5Var = this.f190573d;
        android.view.View findViewById = s5Var.f().findViewById(com.tencent.mm.R.id.b0i);
        findViewById.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.p5(s5Var, this.f190574e));
        return findViewById;
    }
}
