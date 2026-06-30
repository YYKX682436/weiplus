package zl2;

/* loaded from: classes3.dex */
public abstract class t {
    public static final r45.ov2 a(r45.h32 h32Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(h32Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFirstCouponInfoInJumpInfo jump_info,size=");
        java.util.LinkedList list = h32Var.getList(11);
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeInfoFuncObject", sb6.toString());
        java.util.LinkedList list2 = h32Var.getList(11);
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.k34) obj).getInteger(0) == 10) {
                    break;
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                try {
                    r45.pv2 pv2Var = new r45.pv2();
                    com.tencent.mm.protobuf.g byteString = k34Var.getByteString(1);
                    pv2Var.parseFrom(byteString != null ? byteString.g() : null);
                    java.util.LinkedList list3 = pv2Var.getList(0);
                    if (list3 != null) {
                        return (r45.ov2) kz5.n0.Z(list3);
                    }
                    return null;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("FinderLiveNoticeInfoFuncObject", "getFirstCouponInfoInJumpInfo " + e17);
                }
            }
        }
        return null;
    }

    public static final r45.l94 b(r45.h32 h32Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(h32Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getProducts jump_info,size=");
        java.util.LinkedList list = h32Var.getList(11);
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeInfoFuncObject", sb6.toString());
        java.util.LinkedList list2 = h32Var.getList(11);
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z17 = false;
                if (((r45.k34) obj).getInteger(0) == 22) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                try {
                    r45.l94 l94Var = new r45.l94();
                    com.tencent.mm.protobuf.g byteString = k34Var.getByteString(1);
                    l94Var.fromProtobuf(byteString != null ? byteString.g() : null);
                    return l94Var;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("FinderLiveNoticeInfoFuncObject", "getProducts " + e17);
                }
            }
        }
        return null;
    }

    public static final void c(r45.h32 h32Var, r45.q62 response, boolean z17) {
        r45.l1 l1Var;
        kotlin.jvm.internal.o.g(h32Var, "<this>");
        kotlin.jvm.internal.o.g(response, "response");
        r45.ov2 a17 = a(h32Var);
        if (a17 != null) {
            a17.set(3, java.lang.Integer.valueOf(response.getInteger(3)));
            a17.set(23, java.lang.Integer.valueOf(response.getInteger(5)));
            a17.set(21, java.lang.Integer.valueOf(response.getInteger(4)));
            if (z17 && (l1Var = (r45.l1) a17.getCustom(19)) != null) {
                com.tencent.mm.plugin.finder.assist.a.b(l1Var);
            }
            f(h32Var, a17);
        }
    }

    public static final boolean d(r45.h32 h32Var, java.lang.String username) {
        kotlin.jvm.internal.o.g(h32Var, "<this>");
        kotlin.jvm.internal.o.g(username, "username");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bj(username) || h32Var.getInteger(14) != 1) {
            return false;
        }
        if (((r45.ok4) h32Var.getCustom(19)) != null) {
            r45.ok4 ok4Var = (r45.ok4) h32Var.getCustom(19);
            if (!(ok4Var != null && ok4Var.getInteger(0) == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(r45.h32 h32Var) {
        kotlin.jvm.internal.o.g(h32Var, "<this>");
        return h32Var.getInteger(1) == 0;
    }

    public static final void f(r45.h32 h32Var, r45.ov2 r17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(h32Var, "<this>");
        kotlin.jvm.internal.o.g(r17, "r");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceFirstCouponInfoInJumpInfo jump_info,size=");
        java.util.LinkedList list = h32Var.getList(11);
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeInfoFuncObject", sb6.toString());
        java.util.LinkedList list2 = h32Var.getList(11);
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.k34) obj).getInteger(0) == 10) {
                        break;
                    }
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                try {
                    r45.pv2 pv2Var = new r45.pv2();
                    com.tencent.mm.protobuf.g byteString = k34Var.getByteString(1);
                    pv2Var.parseFrom(byteString != null ? byteString.g() : null);
                    java.util.LinkedList list3 = pv2Var.getList(0);
                    kotlin.jvm.internal.o.f(list3, "getInfo_list(...)");
                    kz5.h0.C(list3);
                    pv2Var.getList(0).addFirst(r17);
                    k34Var.set(1, hc2.b.a(pv2Var));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("FinderLiveNoticeInfoFuncObject", "replaceFirstCouponInfoInJumpInfo " + e17);
                }
            }
        }
    }
}
