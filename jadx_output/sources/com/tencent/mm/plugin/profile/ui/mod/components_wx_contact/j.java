package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var) {
        super(1);
        this.f154081d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mr3.l it = (mr3.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154081d;
        i0Var.f154078y++;
        ((java.util.ArrayList) i0Var.f154072s).remove(it);
        i0Var.d7();
        return jz5.f0.f302826a;
    }
}
