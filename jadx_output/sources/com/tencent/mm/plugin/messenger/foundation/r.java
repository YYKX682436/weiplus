package com.tencent.mm.plugin.messenger.foundation;

@j95.b
/* loaded from: classes11.dex */
public final class r extends i95.w implements vg3.p3 {
    public void Ai(vg3.o3 assembler) {
        kotlin.jvm.internal.o.g(assembler, "assembler");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateService", "removeContactRelationUpdateAssembler: ".concat(assembler.getClass().getSimpleName()));
        com.tencent.mm.plugin.messenger.foundation.n nVar = com.tencent.mm.plugin.messenger.foundation.n.f148699f;
        nVar.getClass();
        fm5.b bVar = new fm5.b(assembler, nVar);
        synchronized (nVar) {
            nVar.f264181d.remove(bVar);
        }
    }

    public void wi(vg3.o3 assembler) {
        boolean contains;
        kotlin.jvm.internal.o.g(assembler, "assembler");
        com.tencent.mm.plugin.messenger.foundation.n nVar = com.tencent.mm.plugin.messenger.foundation.n.f148699f;
        synchronized (nVar) {
            contains = nVar.f264181d.contains(new fm5.b(assembler, nVar));
        }
        if (contains) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactRelationUpdateService", "addContactRelationUpdateAssembler: assembler already exists");
        } else {
            nVar.v(assembler);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactRelationUpdateService", "addContactRelationUpdateAssembler: ".concat(assembler.getClass().getSimpleName()));
        }
    }
}
