package sp2;

/* loaded from: classes2.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.z3 f411300a = new sp2.z3();

    /* renamed from: b, reason: collision with root package name */
    public static r45.xs2 f411301b;

    public final java.util.ArrayList a(r45.fa2 container, boolean z17, r45.qt2 contextObj) {
        r45.wz2 wz2Var;
        java.lang.String str;
        r45.yk2 yk2Var;
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.ea2> card_list = container.f374129h;
        kotlin.jvm.internal.o.f(card_list, "card_list");
        for (r45.ea2 ea2Var : card_list) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
            so2.j5 j5Var = null;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = finderObject != null ? (com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.Z(cu2.u.f222441a.j(kz5.b0.c(finderObject), hc2.d0.d(0), contextObj)) : null;
            int integer = ea2Var.getInteger(1);
            if (integer != 4) {
                if (integer != 6) {
                    if (integer == 11) {
                        r45.le1 le1Var = (r45.le1) ea2Var.getCustom(12);
                        if (le1Var != null && (wz2Var = le1Var.A) != null) {
                            xq2.b bVar = (xq2.b) pf5.u.f353936a.e(c61.l7.class).a(xq2.b.class);
                            r45.le1 le1Var2 = (r45.le1) ea2Var.getCustom(12);
                            if (le1Var2 == null || (str = le1Var2.f379355o) == null) {
                                str = "";
                            }
                            bVar.getClass();
                            bVar.f456041i.put(str, wz2Var);
                        }
                        r45.le1 le1Var3 = (r45.le1) ea2Var.getCustom(12);
                        if (le1Var3 != null) {
                            j5Var = new vp2.w(le1Var3, container);
                        }
                    } else if (integer != 15) {
                        if (integer == 16 && (yk2Var = (r45.yk2) ea2Var.getCustom(17)) != null) {
                            j5Var = new vp2.y(yk2Var, container);
                        }
                    } else if (finderItem != null) {
                        j5Var = new vp2.a0(finderItem, ea2Var, container, ea2Var.getString(8), z17);
                    }
                } else if (finderItem != null) {
                    java.util.LinkedList list = ea2Var.getList(5);
                    kotlin.jvm.internal.o.f(list, "getRelate_living(...)");
                    j5Var = new vp2.z(finderItem, ea2Var, container, list, (r45.c72) ea2Var.getCustom(9), ea2Var.getString(8), z17);
                }
            } else if (finderItem != null) {
                j5Var = new vp2.x(finderItem, ea2Var, container, ea2Var.getString(8), z17);
            }
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
        }
        return arrayList;
    }

    public final boolean b(java.util.List targetList, r45.ea2 card, yp2.a item, r45.qt2 qt2Var, boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2;
        r45.pw1 pw1Var;
        kotlin.jvm.internal.o.g(targetList, "targetList");
        kotlin.jvm.internal.o.g(card, "card");
        kotlin.jvm.internal.o.g(item, "item");
        int integer = card.getInteger(1);
        if (integer == 4) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) card.getCustom(2);
            if (finderObject != null && (finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.Z(cu2.u.f222441a.j(kz5.b0.c(finderObject), hc2.d0.d(0), qt2Var))) != null) {
                targetList.add(new vp2.d0(finderItem, card, item.e(), card.getString(8), z17));
                return true;
            }
        } else if (integer == 5) {
            r45.oa2 oa2Var = (r45.oa2) card.getCustom(4);
            if (oa2Var != null) {
                targetList.add(new vp2.e0(oa2Var, item.e()));
                return true;
            }
        } else if (integer == 6) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) card.getCustom(2);
            if (finderObject2 != null && (finderItem2 = (com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.Z(cu2.u.f222441a.j(kz5.b0.c(finderObject2), hc2.d0.d(0), qt2Var))) != null) {
                r45.fa2 e17 = item.e();
                java.util.LinkedList list = card.getList(5);
                kotlin.jvm.internal.o.f(list, "getRelate_living(...)");
                targetList.add(new vp2.j0(finderItem2, card, e17, list, (r45.c72) card.getCustom(9), card.getString(8), z17));
                return true;
            }
        } else if (integer == 7) {
            r45.na2 na2Var = (r45.na2) card.getCustom(6);
            if (na2Var != null) {
                targetList.add(new vp2.r(na2Var, item.e()));
                return true;
            }
        } else if (integer == 17 && (pw1Var = (r45.pw1) card.getCustom(18)) != null) {
            targetList.add(new vp2.s(pw1Var, item.e()));
            return true;
        }
        return false;
    }

    public final void c(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof vp2.x) {
                com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2.f122043n.a((wp2.b) j5Var, true);
            } else if (j5Var instanceof vp2.z) {
                com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x4.f122030n.a((vp2.j0) j5Var, true);
            } else if (j5Var instanceof vp2.a0) {
                wp2.b item = (wp2.b) j5Var;
                kotlin.jvm.internal.o.g(item, "item");
                java.lang.String str = item.f448386r;
                java.lang.String str2 = str == null ? "" : str;
                r45.mb4 mb4Var = item.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.X(item.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.X(item.getFeedObject().getMediaList());
                if (str2.length() == 0) {
                    str2 = zl2.q4.f473933a.y(mb4Var, 1);
                    if (!(str2.length() > 0)) {
                        if (str == null) {
                            java.lang.String string = mb4Var.getString(16);
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (string == null) {
                                string = "";
                            }
                            java.lang.String string2 = mb4Var.getString(20);
                            if (string2 == null) {
                                string2 = "";
                            }
                            str = string.concat(string2);
                        }
                        str2 = str;
                    }
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(mb4Var.getString(1));
                    java.lang.String string3 = mb4Var.getString(19);
                    sb6.append(string3 != null ? string3 : "");
                    str2 = sb6.toString();
                }
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329968v)).a();
            }
        }
    }
}
