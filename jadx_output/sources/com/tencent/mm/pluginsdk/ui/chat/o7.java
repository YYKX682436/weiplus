package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class o7 implements com.tencent.mm.pluginsdk.ui.chat.j5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190539a;

    public o7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190539a = c8Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.j5
    public final void a(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190539a;
        if (c8Var.n()) {
            c8Var.h().post(new com.tencent.mm.pluginsdk.ui.chat.u7(c8Var));
        }
    }
}
