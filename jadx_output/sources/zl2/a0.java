package zl2;

/* loaded from: classes3.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f473633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473634b;

    public a0(r45.br2 br2Var, yz5.l lVar) {
        this.f473633a = br2Var;
        this.f473634b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.y23 y23Var;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (y23Var = (r45.y23) ((r45.ea1) fVar.f70618d).getCustom(1)) != null) {
            r45.ce0 ce0Var = (r45.ce0) y23Var.getCustom(9);
            if (ce0Var == null || (str = ce0Var.getString(0)) == null) {
                str = "";
            }
            r45.br2 br2Var = this.f473633a;
            br2Var.set(5, str);
            r45.ce0 ce0Var2 = (r45.ce0) y23Var.getCustom(9);
            if (ce0Var2 == null || (str2 = ce0Var2.getString(1)) == null) {
                str2 = "";
            }
            br2Var.set(6, str2);
            br2Var.set(7, pm0.v.u(y23Var.getLong(0)));
            java.util.LinkedList list = y23Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getImg_urls(...)");
            java.lang.String str3 = (java.lang.String) kz5.n0.a0(list, 0);
            if (str3 == null) {
                str3 = "";
            }
            br2Var.set(8, str3);
            java.lang.String string = y23Var.getString(1);
            if (string == null) {
                string = "";
            }
            br2Var.set(9, string);
            br2Var.set(11, java.lang.Integer.valueOf(y23Var.getInteger(5)));
            br2Var.set(27, java.lang.Boolean.valueOf(y23Var.getInteger(36) != 0));
            br2Var.set(19, y23Var.getBoolean(63) ? y23Var.getString(64) : ((r45.ea1) fVar.f70618d).getString(5));
            java.util.LinkedList list2 = y23Var.getList(34);
            kotlin.jvm.internal.o.f(list2, "getIcon_urls(...)");
            br2Var.set(20, (java.lang.String) kz5.n0.Z(list2));
            java.util.LinkedList list3 = y23Var.getList(34);
            kotlin.jvm.internal.o.f(list3, "getIcon_urls(...)");
            br2Var.set(22, (java.lang.String) kz5.n0.a0(list3, 1));
            br2Var.set(34, y23Var.getBoolean(63) ? "1" : "");
            br2Var.set(35, y23Var.getString(65));
            r45.id5 id5Var = (r45.id5) y23Var.getCustom(74);
            br2Var.set(36, id5Var != null ? id5Var.getString(0) : null);
            br2Var.set(37, id5Var != null ? id5Var.getString(1) : null);
            br2Var.set(38, id5Var != null ? id5Var.getString(2) : null);
            br2Var.set(39, id5Var != null ? id5Var.getString(3) : null);
            if (y23Var.getInteger(31) != 0) {
                br2Var.set(10, java.lang.Integer.valueOf(y23Var.getInteger(4)));
            }
            java.util.LinkedList list4 = y23Var.getList(28);
            kotlin.jvm.internal.o.f(list4, "getShow_box_items(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list4) {
                if (((r45.p56) obj2).getInteger(0) == 6) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.p56 p56Var = (r45.p56) next;
                if (i17 == 0) {
                    r45.hu3 hu3Var = new r45.hu3();
                    com.tencent.mm.protobuf.g byteString = p56Var.getByteString(1);
                    hu3Var.parseFrom(byteString != null ? byteString.g() : null);
                    br2Var.set(24, hu3Var.getString(0));
                } else if (i17 == 1) {
                    r45.hu3 hu3Var2 = new r45.hu3();
                    com.tencent.mm.protobuf.g byteString2 = p56Var.getByteString(1);
                    hu3Var2.parseFrom(byteString2 != null ? byteString2.g() : null);
                    br2Var.set(25, hu3Var2.getString(0));
                } else if (i17 == 2) {
                    r45.hu3 hu3Var3 = new r45.hu3();
                    com.tencent.mm.protobuf.g byteString3 = p56Var.getByteString(1);
                    hu3Var3.parseFrom(byteString3 != null ? byteString3.g() : null);
                    br2Var.set(26, hu3Var3.getString(0));
                }
                i17 = i18;
            }
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d e17 = g1Var.e();
            java.lang.String string2 = br2Var.getString(20);
            com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128356f;
            mn2.q3 q3Var = new mn2.q3(string2, y90Var);
            mn2.f1 f1Var = mn2.f1.f329965s;
            wo0.c b17 = e17.b(q3Var, g1Var.h(f1Var));
            zl2.x xVar = new zl2.x(br2Var);
            b17.getClass();
            b17.f447873d = xVar;
            b17.f();
            wo0.c b18 = g1Var.e().b(new mn2.q3(br2Var.getString(22), y90Var), g1Var.h(f1Var));
            zl2.y yVar = new zl2.y(br2Var);
            b18.getClass();
            b18.f447873d = yVar;
            b18.f();
            r45.y64 d17 = cm2.a.f43328a.d(y23Var);
            if (d17 != null) {
                long c17 = c01.id.c();
                if (d17.getLong(1) <= c17 || d17.getInteger(0) <= 0) {
                    zl2.b0 b0Var = zl2.b0.f473663a;
                    com.tencent.mars.xlog.Log.i("Finder.FinderProductShareUtil", y23Var.getString(1) + ",discount_price:" + d17.getInteger(0) + ", serverTime:" + c17 + ",end_time_ms:" + d17.getLong(1));
                } else {
                    br2Var.set(15, java.lang.Integer.valueOf(d17.getInteger(0)));
                }
                br2Var.set(16, java.lang.Long.valueOf(d17.getLong(1)));
            }
            br2Var.set(31, y23Var.getList(28));
            br2Var.set(32, y23Var.getString(43));
            java.lang.String string3 = y23Var.getString(17);
            java.lang.String str4 = string3 != null ? string3 : "";
            zl2.b0.f473663a.f(br2Var, "Finder.FinderProductShareUtil_requestProductInfoOk");
            com.tencent.mars.xlog.Log.i("Finder.FinderProductShareUtil", "requestId:".concat(str4));
        }
        pm0.v.X(new zl2.z(this.f473634b, fVar));
        return jz5.f0.f302826a;
    }
}
