package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class v7 extends ej4.r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(com.tencent.mm.ui.chatting.component.w7 owner, java.lang.String userName) {
        super(owner, userName, null, 4, null);
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(userName, "userName");
    }

    @Override // ej4.r
    public void b() {
        xe0.l0 l0Var;
        java.lang.Object obj = a().get();
        com.tencent.mm.ui.chatting.component.w7 w7Var = obj instanceof com.tencent.mm.ui.chatting.component.w7 ? (com.tencent.mm.ui.chatting.component.w7) obj : null;
        if (w7Var == null) {
            return;
        }
        java.lang.String str = w7Var.f200158f;
        if ((str == null || str.length() == 0) || w7Var.f198580d == null || (l0Var = (xe0.l0) i95.n0.c(xe0.l0.class)) == null) {
            return;
        }
        if (!di4.i.d()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "onTalkerStatusChanged skip: iconStyleUpgrade=false username=" + str);
            return;
        }
        boolean aj6 = ((we0.j1) l0Var).aj(str);
        if (aj6 == w7Var.f200159g) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "onTalkerStatusChanged migrate username=" + str + " oldHasStatus=" + w7Var.f200159g + " newHasStatus=" + aj6);
        w7Var.f200159g = aj6;
        try {
            yb5.d dVar = w7Var.f198580d;
            sb5.z0 z0Var = dVar != null ? (sb5.z0) dVar.f460708c.a(sb5.z0.class) : null;
            if (z0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingTextStatusHeaderComponent", "invokeUpdateStaticTitle skip: IHeaderComponent null");
            } else {
                ((com.tencent.mm.ui.chatting.component.pe) z0Var).C();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingTextStatusHeaderComponent", th6, "invokeUpdateStaticTitle err", new java.lang.Object[0]);
        }
    }
}
