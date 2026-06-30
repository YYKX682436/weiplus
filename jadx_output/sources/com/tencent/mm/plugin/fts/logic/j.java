package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class j implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.k f137566d;

    public j(com.tencent.mm.plugin.fts.logic.k kVar) {
        this.f137566d = kVar;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        o13.y yVar;
        if (kotlin.jvm.internal.o.b(str, "*") || kotlin.jvm.internal.o.b(str, "chatroomname")) {
            return;
        }
        java.lang.Object obj = w0Var.f316976d;
        com.tencent.mm.storage.a3 a3Var = obj instanceof com.tencent.mm.storage.a3 ? (com.tencent.mm.storage.a3) obj : null;
        if (a3Var != null) {
            byte[] bytes = (a3Var.field_memberlist + a3Var.field_chatroomStatus).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            int i17 = w0Var.f316974b;
            com.tencent.mm.plugin.fts.logic.k kVar = this.f137566d;
            if (i17 != 5) {
                if (!kVar.f137579i.add(g17) || (yVar = kVar.f137575e) == null) {
                    return;
                }
                ((com.tencent.mm.plugin.fts.t) yVar).b(kVar.f137578h, new com.tencent.mm.plugin.fts.logic.f(kVar, a3Var));
                return;
            }
            kVar.f137579i.remove(g17);
            o13.y yVar2 = kVar.f137575e;
            if (yVar2 != null) {
                ((com.tencent.mm.plugin.fts.t) yVar2).b(kVar.f137578h, new com.tencent.mm.plugin.fts.logic.f(kVar, a3Var));
            }
        }
    }
}
