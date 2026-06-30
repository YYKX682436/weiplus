package ku;

/* loaded from: classes9.dex */
public final class k extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490596zi);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 1, g17);
        java.lang.String b17 = b(simpleMsgInfo);
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(b17);
        jz5.f0 f0Var = null;
        if (h17 != null) {
            recordDataItem.set(i17 + 2, 4);
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String Af = tg3.u0.Af((tg3.u0) c17, simpleMsgInfo, bm5.f0.f22571s, b17, false, 8, null);
            if (!com.tencent.mm.vfs.w6.j(Af)) {
                if (((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Vi(simpleMsgInfo.getLong(simpleMsgInfo.f345617d + 2)) <= 0) {
                    recordDataItem.set(i17 + 2, 1);
                }
            }
            if (recordDataItem.getInteger(i17 + 2) == 4) {
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(Af);
                if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                    n17 = d61.c.a(Af) ? "mp4" : "";
                } else {
                    kotlin.jvm.internal.o.d(n17);
                }
                recordDataItem.j0(n17);
                java.lang.String str = h17.F;
                recordDataItem.X0(str != null ? str : "");
                y15.d dVar = new y15.d();
                java.lang.String g18 = h17.g();
                kotlin.jvm.internal.o.f(g18, "getRecvXml(...)");
                dVar.fromXml(g18);
                y15.c n18 = dVar.n();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(n18.getInteger(n18.f458922d + 10));
                boolean z17 = false;
                java.lang.Integer num = java.lang.Boolean.valueOf(valueOf.intValue() > 0).booleanValue() ? valueOf : null;
                recordDataItem.o0(num != null ? num.intValue() : h17.f415015m);
                y15.c n19 = dVar.n();
                if (n19.getString(n19.f458922d + 4) != null && (!r26.n0.N(r2))) {
                    z17 = true;
                }
                if (z17) {
                    y15.c n27 = dVar.n();
                    recordDataItem.set(i17 + 11, java.lang.Long.valueOf(n27.getInteger(n27.f458922d + 9)));
                    y15.c n28 = dVar.n();
                    recordDataItem.set(i17 + 7, java.lang.Long.valueOf(n28.getInteger(n28.f458922d + 12)));
                    y15.c n29 = dVar.n();
                    recordDataItem.e1(n29.getInteger(n29.f458922d + 15));
                    y15.c n37 = dVar.n();
                    recordDataItem.d1(n37.getInteger(n37.f458922d + 16));
                } else {
                    recordDataItem.set(i17 + 11, java.lang.Long.valueOf(h17.f415008f));
                    y15.c n38 = dVar.n();
                    recordDataItem.set(i17 + 7, java.lang.Long.valueOf(n38.getInteger(n38.f458922d + 11)));
                    y15.c n39 = dVar.n();
                    recordDataItem.e1(n39.getInteger(n39.f458922d + 13));
                    y15.c n47 = dVar.n();
                    recordDataItem.d1(n47.getInteger(n47.f458922d + 14));
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            recordDataItem.set(i17 + 2, 1);
        }
        return true;
    }
}
