package sc5;

/* loaded from: classes9.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f406565d;

    public d(java.util.List list) {
        this.f406565d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.tencent.mm.storage.f9> list = this.f406565d;
        java.lang.String Q0 = ((com.tencent.mm.storage.f9) kz5.n0.X(list)).Q0();
        sc5.f fVar = sc5.f.f406567a;
        kotlin.jvm.internal.o.d(Q0);
        java.util.Set b17 = sc5.f.b(fVar, Q0, sc5.f.f406570d);
        java.util.ArrayList<com.tencent.mm.storage.f9> arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.f9 f9Var : list) {
            long msgId = f9Var.getMsgId();
            if (msgId > 0 && b17.add(java.lang.Long.valueOf(msgId))) {
                arrayList.add(f9Var);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (com.tencent.mm.storage.f9 f9Var2 : arrayList) {
            if (c01.id.c() - f9Var2.getCreateTime() <= sc5.f.f406568b * 1 * 1000 && !g95.e0.i(f9Var2)) {
                long msgId2 = f9Var2.getMsgId();
                sc5.f fVar2 = sc5.f.f406567a;
                sc5.f.c(fVar2, "chat_message_event", sc5.f.a(fVar2, f9Var2, 2));
                sc5.f.b(fVar2, Q0, sc5.f.f406570d).add(java.lang.Long.valueOf(msgId2));
            }
        }
    }
}
