package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var) {
        super(0);
        this.f154129d = h0Var;
        this.f154130e = h0Var2;
        this.f154131f = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = this.f154129d;
        if (h0Var.f310123d == null) {
            com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154131f;
            this.f154130e.f310123d = kotlinx.coroutines.l.d(i0Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.s(h0Var, i0Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
