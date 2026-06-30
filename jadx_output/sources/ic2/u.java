package ic2;

/* loaded from: classes10.dex */
public final class u implements com.tencent.mm.modelbase.h1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ic2.u f290370d = new ic2.u();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f290371e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f290372f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f290373g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile int f290374h;

    @Override // com.tencent.mm.modelbase.n0
    public void b(r45.tp tpVar) {
        if (gm0.j1.a() && f290374h > 0) {
            int i17 = 0;
            for (ce2.l lVar : ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj().J0()) {
                if (lVar.field_exposureStatus == 0 && lVar.field_liveStatus == 0) {
                    i17++;
                }
            }
            if (f290374h > i17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1552L, 89L, 1L);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.n0
    public void c(int i17, com.tencent.mm.modelbase.m0 m0Var) {
        if (gm0.j1.a()) {
            r45.tp tpVar = m0Var != null ? m0Var.f70687a : null;
            if (tpVar == null) {
                return;
            }
            r45.a41 a41Var = new r45.a41();
            a41Var.set(1, 0);
            a41Var.set(0, db2.t4.f228171a.a(i17));
            f290374h = 0;
            if (m0Var != null) {
                if (kotlin.jvm.internal.o.b(f290371e, m0Var.f70688b)) {
                    a41Var.set(2, f290373g);
                    a41Var.set(1, 1);
                    f290373g = "";
                    f290371e = "";
                }
                if (kotlin.jvm.internal.o.b(f290372f, m0Var.f70688b)) {
                    a41Var.set(1, 2);
                    f290372f = "";
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams scene[" + a41Var.getInteger(1) + ']');
            java.util.ArrayList<ce2.l> J0 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj().J0();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (ce2.l lVar : J0) {
                if (lVar.field_exposureStatus == 0 && lVar.field_liveStatus == 0) {
                    f290374h++;
                }
                r45.ex4 ex4Var = new r45.ex4();
                ex4Var.set(3, java.lang.Long.valueOf(lVar.field_insertTime));
                ex4Var.set(2, lVar.field_tipsId);
                ex4Var.set(5, java.lang.Integer.valueOf(lVar.field_exposureStatus));
                ex4Var.set(6, java.lang.Integer.valueOf(lVar.field_liveStatus));
                ex4Var.set(0, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(lVar.field_liveId)));
                ex4Var.set(4, java.lang.Integer.valueOf(lVar.field_ctrlInfoType));
                ex4Var.set(7, lVar.field_bypInfo);
                ex4Var.set(1, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(lVar.field_feedId)));
                linkedList.add(ex4Var);
            }
            a41Var.set(4, linkedList);
            java.util.LinkedList list = a41Var.getList(4);
            kotlin.jvm.internal.o.f(list, "getList(...)");
            a41Var.set(4, new java.util.LinkedList(kz5.n0.F0(list, new ic2.t())));
            ae2.in inVar = ae2.in.f3688a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3724d5).getValue()).r()).intValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams limit = " + intValue);
            if (a41Var.getList(4).size() > intValue) {
                java.util.LinkedList list2 = a41Var.getList(4);
                kotlin.jvm.internal.o.f(list2, "getList(...)");
                a41Var.set(4, new java.util.LinkedList(kz5.n0.K0(list2, intValue)));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList list3 = a41Var.getList(4);
            kotlin.jvm.internal.o.f(list3, "getList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.ex4) it.next()).getString(2));
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sb6.append((java.lang.String) it6.next());
                sb6.append(",");
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "onBuildFetchParams list = [" + ((java.lang.Object) sb6) + ']');
            tpVar.f386637e = new com.tencent.mm.protobuf.g(a41Var.toByteArray());
        }
    }
}
