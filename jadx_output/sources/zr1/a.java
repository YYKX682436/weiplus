package zr1;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jk f475178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.jk jkVar) {
        super(0);
        this.f475178d = jkVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        jz5.g gVar = com.tencent.mm.storage.o1.f195190a;
        java.util.LinkedList list = this.f475178d.f377896d;
        kotlin.jvm.internal.o.f(list, "list");
        com.tencent.mm.storage.j1[] j1VarArr = com.tencent.mm.storage.j1.f195039d;
        new java.util.HashSet();
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizRecycleCardLogic", "handleRecycleCardResult list is empty");
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                int i17 = ((r45.xl5) next).f390217f;
                com.tencent.mm.storage.i1[] i1VarArr = com.tencent.mm.storage.i1.f195020d;
                if (i17 == 2) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                r45.xl5 xl5Var = (r45.xl5) it6.next();
                com.tencent.mm.storage.s1 L0 = r01.q3.nj().L0(xl5Var.f390216e);
                if (L0 != null && L0.A0()) {
                    r45.yl5 yl5Var = new r45.yl5();
                    r45.sj6 u07 = L0.u0();
                    yl5Var.f391201d = u07 != null ? u07.f385798s : null;
                    yl5Var.f391202e = xl5Var.f390216e;
                    yl5Var.f391204g = xl5Var.f390218g;
                    linkedList.add(yl5Var);
                    r01.q3.nj().z0(xl5Var.f390216e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizRecycleCardLogic", "handleRecycleCardResult ok " + L0.field_msgId);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1534L, 12L, 1L);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizRecycleCardLogic", "handleRecycleCardResult recycleReportList fromScene=3, size = " + linkedList.size() + '/' + list.size());
            if (!linkedList.isEmpty()) {
                com.tencent.mm.storage.b2 nj6 = r01.q3.nj();
                com.tencent.mm.storage.b2 nj7 = r01.q3.nj();
                synchronized (nj7) {
                    j17 = nj7.f193767h;
                }
                int i18 = 0;
                int i19 = 0;
                for (com.tencent.mm.storage.s1 s1Var : nj6.J0(nj6.f193763d.E("BizTimeLineInfo", null, "orderFlag>=?", new java.lang.String[]{"" + (j17 << 32)}, null, null, "orderFlag DESC"))) {
                    i18 += s1Var.v0() ? 1 : 0;
                    i19 += s1Var.A0() ? 1 : 0;
                }
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                r45.zl5 zl5Var = new r45.zl5();
                zl5Var.f392198d = linkedList;
                zl5Var.f392199e = i18;
                zl5Var.f392200f = i19;
                lVar.f70664a = zl5Var;
                lVar.f70665b = new r45.am5();
                lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/recyclecardreport";
                lVar.f70667d = 4768;
                com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.storage.n1(linkedList, 0), false);
            }
        }
        return jz5.f0.f302826a;
    }
}
