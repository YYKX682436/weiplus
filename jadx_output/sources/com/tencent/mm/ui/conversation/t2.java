package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.p2 f208072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f208073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f208074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.ui.conversation.p2 p2Var, com.tencent.mm.storage.l4 l4Var, android.os.Bundle bundle) {
        super(1);
        this.f208072d = p2Var;
        this.f208073e = l4Var;
        this.f208074f = bundle;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.conversation.p2 p2Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue() && (p2Var = this.f208072d) != null) {
            java.lang.String h17 = this.f208073e.h1();
            kotlin.jvm.internal.o.f(h17, "getUsername(...)");
            p2Var.c(h17, this.f208074f);
        }
        return jz5.f0.f302826a;
    }
}
