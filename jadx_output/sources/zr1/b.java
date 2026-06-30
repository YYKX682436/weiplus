package zr1;

/* loaded from: classes11.dex */
public abstract class b {
    public static final java.util.LinkedList a(long j17) {
        jz5.g gVar = com.tencent.mm.storage.o1.f195190a;
        int o17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.storage.o1.f195190a).getValue()).o("RecycleCardMaxMsgCount", 10);
        if (o17 < 2) {
            o17 = 2;
        }
        if (o17 > 50) {
            o17 = 50;
        }
        java.util.List d17 = r01.q3.nj().d1(620757041, o17);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : d17) {
            if (((com.tencent.mm.storage.s1) obj).field_msgId != j17) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.s1 s1Var = (com.tencent.mm.storage.s1) it.next();
            r45.xl5 xl5Var = new r45.xl5();
            r45.sj6 u07 = s1Var.u0();
            xl5Var.f390215d = u07 != null ? u07.f385798s : null;
            long j18 = s1Var.field_msgId;
            xl5Var.f390216e = j18;
            xl5Var.f390219h = java.lang.String.valueOf(j18);
            linkedList.add(xl5Var);
        }
        return linkedList;
    }

    public static final void b(r45.jk resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        jz5.g gVar = com.tencent.mm.storage.o1.f195190a;
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.storage.o1.f195190a).getValue()).A("RecycleCardMaxMsgCount", resp.f377897e);
        pm0.v.L("MicroMsg.BizRecycleCardLogic", true, new zr1.a(resp));
    }
}
