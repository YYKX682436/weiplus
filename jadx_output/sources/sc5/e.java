package sc5;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f406566d;

    public e(java.util.List list) {
        this.f406566d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<jz5.l> list = this.f406566d;
        java.lang.String Q0 = ((com.tencent.mm.storage.f9) ((jz5.l) kz5.n0.X(list)).f302833d).Q0();
        sc5.f fVar = sc5.f.f406567a;
        kotlin.jvm.internal.o.d(Q0);
        java.util.Set b17 = sc5.f.b(fVar, Q0, sc5.f.f406571e);
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList();
        for (jz5.l lVar : list) {
            long msgId = ((com.tencent.mm.storage.f9) lVar.f302833d).getMsgId();
            if (msgId > 0 && b17.add(java.lang.Long.valueOf(msgId))) {
                arrayList.add(lVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (jz5.l lVar2 : arrayList) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) lVar2.f302833d;
            long longValue = ((java.lang.Number) lVar2.f302834e).longValue();
            if (c01.id.c() - f9Var.getCreateTime() <= sc5.f.f406568b * 1 * 1000 && !g95.e0.i(f9Var)) {
                long msgId2 = f9Var.getMsgId();
                sc5.f fVar2 = sc5.f.f406567a;
                java.util.Map a17 = sc5.f.a(fVar2, f9Var, 4);
                a17.put("unexp_time", java.lang.Long.valueOf(longValue));
                sc5.f.c(fVar2, "chat_message_event", a17);
                sc5.f.b(fVar2, Q0, sc5.f.f406571e).add(java.lang.Long.valueOf(msgId2));
            }
        }
    }
}
