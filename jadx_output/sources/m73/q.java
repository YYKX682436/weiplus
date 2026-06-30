package m73;

@j95.b
/* loaded from: classes8.dex */
public final class q extends i95.w implements n73.e {
    public java.lang.String Ai(java.lang.String userName, int i17) {
        o73.j Bi = Bi();
        if (userName == null || r26.n0.N(userName)) {
            return "";
        }
        o73.f fVar = Bi.f343555n;
        fVar.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        o73.b a17 = fVar.a(new o73.e(userName));
        if (a17 == null) {
            p75.n0 TABLE = p73.a.f352501h;
            kotlin.jvm.internal.o.f(TABLE, "TABLE");
            p75.d USERNAME = p73.a.f352502i;
            kotlin.jvm.internal.o.f(USERNAME, "USERNAME");
            p75.i0 i18 = TABLE.i();
            com.tencent.mm.sdk.platformtools.t8.n(userName);
            i18.f352657d = USERNAME.j(userName);
            a17 = (o73.b) i18.a().o(Bi.f193147g.Q4(), o73.b.class);
            if (a17 != null) {
                fVar.b(a17);
            } else {
                a17 = new o73.b();
                a17.field_UserName = userName;
                a17.field_HashUserName = Bi.X6(userName, Bi.a7());
                a17.field_CommHashUserName = Bi.X6(userName, Bi.Z6());
                a17.field_HardCodeHashUserName = Bi.X6(userName, Bi.b7());
                fVar.b(a17);
            }
        }
        return i17 != 2 ? i17 != 3 ? a17.field_HashUserName : a17.field_HardCodeHashUserName : a17.field_CommHashUserName;
    }

    public final o73.j Bi() {
        jm0.i iVar = jm0.k.f300269h;
        o73.a aVar = (o73.a) iVar.a(o73.a.class);
        java.lang.String str = o73.j.f343551o;
        aVar.O6(o73.j.f343551o);
        return (o73.j) ((jm0.k) iVar.a(o73.a.class)).P6(o73.j.class);
    }

    public java.lang.String Di(java.lang.String str, int i17) {
        if (str != null) {
            str = r26.i0.t(str, "@weclaw", "", false);
        }
        return Bi().c7(str, i17);
    }

    public java.util.List Ni(java.util.List list, int i17) {
        o73.j Bi = Bi();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String c76 = Bi.c7((java.lang.String) it.next(), i17);
                if (c76 == null) {
                    c76 = "";
                }
                linkedList.add(c76);
            }
        }
        return linkedList;
    }

    public com.tencent.mm.storage.z3 wi(java.lang.String str, int i17) {
        if (str != null) {
            str = r26.i0.t(str, "@weclaw", "", false);
        }
        java.lang.String c76 = Bi().c7(str, i17);
        if (c76 != null) {
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(c76);
            if (q17.r2()) {
                return q17;
            }
        }
        return null;
    }
}
