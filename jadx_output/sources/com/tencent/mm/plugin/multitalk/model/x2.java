package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f150205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.plugin.multitalk.model.b3 b3Var) {
        super(0);
        this.f150205d = b3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f150205d;
        os0.c cVar = b3Var.f149896i;
        if (cVar != null) {
            is0.c cVar2 = b3Var.f149888a;
            cVar.H = cVar2 != null ? cVar2.f294395e : 0;
            cVar.w(b3Var.f149894g, b3Var.f149895h);
            cVar.u(b3Var.f149894g, b3Var.f149895h);
            cVar.f348013v = true;
            cVar.o();
            rs0.h hVar = b3Var.f149892e;
            if (hVar != null) {
                rs0.i.f399296a.x(hVar.f399292a, hVar.f399293b);
            }
        }
        return jz5.f0.f302826a;
    }
}
