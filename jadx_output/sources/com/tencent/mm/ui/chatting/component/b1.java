package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class b1 implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 notify) {
        kotlin.jvm.internal.o.g(notify, "notify");
        sc5.f fVar = sc5.f.f406567a;
        if (sc5.f.f406569c && kotlin.jvm.internal.o.b(notify.f454411b, "insert")) {
            java.util.ArrayList<com.tencent.mm.storage.f9> msgList = notify.f454412c;
            kotlin.jvm.internal.o.f(msgList, "msgList");
            for (com.tencent.mm.storage.f9 f9Var : msgList) {
                sc5.f fVar2 = sc5.f.f406567a;
                kotlin.jvm.internal.o.d(f9Var);
                fVar2.e(f9Var, 1);
            }
        }
    }
}
