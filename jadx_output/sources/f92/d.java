package f92;

/* loaded from: classes8.dex */
public final class d implements l92.a {
    @Override // l92.a
    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.lk2 resp = (r45.lk2) ny3Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(reportExt, "reportExt");
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<r45.ac5> list = resp.getList(20);
            kotlin.jvm.internal.o.f(list, "getFinder_list(...)");
            for (r45.ac5 ac5Var : list) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                r45.ya5 ya5Var = (r45.ya5) ac5Var.getCustom(6);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (ya5Var != null) {
                    java.util.LinkedList list2 = ya5Var.getList(0);
                    kotlin.jvm.internal.o.f(list2, "getSheets(...)");
                    pm0.v.d0(list2, ya2.f1.f460479d);
                    java.util.LinkedList<r45.xa5> list3 = ya5Var.getList(0);
                    kotlin.jvm.internal.o.f(list3, "getSheets(...)");
                    for (r45.xa5 xa5Var : list3) {
                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(xa5Var.getString(4), xa5Var.getString(9), null);
                    }
                }
                ac5Var.set(6, ya5Var);
            }
        }
    }

    @Override // l92.a
    public int b() {
        return 7289;
    }

    @Override // l92.a
    public void c(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        boolean z17;
        java.lang.Object obj;
        jz5.f0 f0Var;
        java.lang.String str2;
        r45.lk2 resp = (r45.lk2) ny3Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(reportExt, "reportExt");
        if (i17 == 0 && i18 == 0) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            java.util.LinkedList list = resp.getList(15);
            ((b92.d1) zbVar).getClass();
            zl2.r4.f473950a.U2(list);
            java.util.LinkedList list2 = resp.getList(15);
            kotlin.jvm.internal.o.f(list2, "getAlias_info(...)");
            java.util.Iterator it = list2.iterator();
            while (true) {
                z17 = false;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.of1) obj).getInteger(2) == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.of1 of1Var = (r45.of1) obj;
            if (of1Var != null) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Vk(of1Var, true, "UserPrepare");
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (resp.getList(15) != null && (!r11.isEmpty())) {
                    z17 = true;
                }
                if (z17) {
                    i95.m c17 = i95.n0.c(zy2.b6.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.b6.Pd((zy2.b6) c17, "UserPrepare", null, 2, null);
                }
            }
            g92.b.f269769e.k2().d().set(20, resp.getString(21));
            java.util.LinkedList<r45.ac5> list3 = resp.getList(20);
            kotlin.jvm.internal.o.f(list3, "getFinder_list(...)");
            for (r45.ac5 ac5Var : list3) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ac5Var.getCustom(1);
                if (finderContact == null || (str2 = finderContact.getUsername()) == null) {
                    str2 = "";
                }
                g92.b.f269769e.F1(str2, new m92.i(ac5Var.getInteger(11), ac5Var.getString(12), false, 4, null));
                ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(str2, zy2.y8.f477617m);
            }
            ((ku5.t0) ku5.t0.f312615d).a(f92.c.f260240d);
        }
    }
}
