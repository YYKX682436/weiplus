package ey2;

/* loaded from: classes8.dex */
public final class c2 extends pf5.o0 implements xy2.n {

    /* renamed from: e, reason: collision with root package name */
    public bw5.nj0 f257332e;

    public java.util.List N6() {
        java.util.List f07 = r26.n0.f0(O6("client_sync_finder_reddot_config", "sync_ctrl_info_type_list"), new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            java.lang.Integer h17 = r26.h0.h((java.lang.String) it.next());
            if (h17 != null) {
                arrayList.add(h17);
            }
        }
        return arrayList;
    }

    public final java.lang.String O6(java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.util.LinkedList linkedList2;
        java.lang.Object obj2;
        bw5.nj0 nj0Var = this.f257332e;
        java.lang.String str3 = null;
        if (nj0Var != null && (linkedList = nj0Var.f30704d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                bw5.mj0 mj0Var = (bw5.mj0) obj;
                if (kotlin.jvm.internal.o.b(str, mj0Var.f30264f[1] ? mj0Var.f30262d : "")) {
                    break;
                }
            }
            bw5.mj0 mj0Var2 = (bw5.mj0) obj;
            if (mj0Var2 != null && (linkedList2 = mj0Var2.f30263e) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    bw5.lj0 lj0Var = (bw5.lj0) obj2;
                    if (kotlin.jvm.internal.o.b(str2, lj0Var.f29829f[1] ? lj0Var.f29827d : "")) {
                        break;
                    }
                }
                bw5.lj0 lj0Var2 = (bw5.lj0) obj2;
                if (lj0Var2 != null) {
                    str3 = lj0Var2.f29829f[2] ? lj0Var2.f29828e : "";
                }
            }
        }
        return str3 == null ? "" : str3;
    }

    public void P6(r45.xb1 resp) {
        java.lang.Object obj;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "simple_common_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var == null || (byteString = yy0Var.getByteString(1)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderSimpleCommonConfigVM", "[initSimpleCommonConfig]");
        bw5.nj0 nj0Var = new bw5.nj0();
        nj0Var.parseFrom(byteString.g());
        this.f257332e = nj0Var;
    }
}
