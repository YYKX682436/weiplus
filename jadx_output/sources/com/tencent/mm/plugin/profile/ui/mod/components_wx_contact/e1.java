package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.a f154052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var, r61.a aVar) {
        super(0);
        this.f154051d = j1Var;
        this.f154052e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = this.f154051d.f154086u;
        java.lang.String h17 = this.f154052e.h();
        kotlin.jvm.internal.o.f(h17, "getRealName(...)");
        ((java.util.ArrayList) list).add(h17);
        return jz5.f0.f302826a;
    }
}
