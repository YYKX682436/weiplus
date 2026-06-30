package r21;

/* loaded from: classes11.dex */
public abstract class a {
    public static java.util.ArrayList a(final java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
        final java.lang.String X8 = g9Var.X8(str);
        android.database.Cursor c17 = g9Var.Da(X8) ? ot0.c3.l().c("getCursor", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z4
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return ot0.z2.f348822a.K(com.tencent.mm.storage.g9.this.f193989r, X8, str);
            }
        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i5
            @Override // yz5.a
            public final java.lang.Object invoke() {
                java.lang.String str2 = X8;
                com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                return g9Var2.f193989r.E(str2, null, g9Var2.Z8(str), null, null, null, "createTime ASC ");
            }
        }) : g9Var.Pb(X8) ? ot0.z2.f348822a.K(g9Var.f193989r, X8, str) : g9Var.f193989r.E(X8, null, g9Var.Z8(str), null, null, null, "createTime ASC ");
        if (c17 != null && c17.getCount() != 0) {
            if (c17.moveToFirst()) {
                int i17 = 0;
                while (!c17.isAfterLast()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(c17);
                    c17.moveToNext();
                    if (f9Var.b3()) {
                        arrayList.add(f9Var.j());
                    } else {
                        arrayList.add("");
                    }
                    i17++;
                    if (i17 == 10) {
                        break;
                    }
                }
            }
            c17.close();
        }
        return arrayList;
    }

    public static java.util.ArrayList b(int i17, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.p7[] d17 = r21.w.Ai().d1(str, 10);
        if (d17 != null) {
            for (com.tencent.mm.storage.p7 p7Var : d17) {
                if (p7Var.field_type == 1) {
                    java.lang.String str2 = com.tencent.mm.storage.e9.f(p7Var.field_msgContent).f193864f;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static java.util.ArrayList c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.t8[] L0 = r21.w.Bi().L0(str, 10);
        if (L0 != null) {
            for (com.tencent.mm.storage.t8 t8Var : L0) {
                arrayList.add(t8Var.field_sayhicontent);
            }
        }
        return arrayList;
    }

    public static java.util.ArrayList d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.pa[] D0 = r21.w.Di().D0(str, 10);
        if (D0 != null) {
            for (com.tencent.mm.storage.pa paVar : D0) {
                arrayList.add(paVar.field_sayhicontent);
            }
        }
        return arrayList;
    }
}
