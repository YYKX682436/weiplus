package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class m7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190489d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190489d;
        android.app.Activity f17 = c8Var.f();
        kotlin.jvm.internal.o.f(f17, "getContext(...)");
        return new com.tencent.mm.pluginsdk.ui.chat.lb(f17, c8Var.i(), new com.tencent.mm.pluginsdk.ui.chat.l7(c8Var), 4);
    }
}
