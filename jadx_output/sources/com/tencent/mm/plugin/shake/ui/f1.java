package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public abstract class f1 {
    public static java.lang.String a() {
        c34.u Ri = c34.h0.Ri();
        Ri.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = Ri.f38243d.f("SELECT * FROM " + Ri.getTableName() + " where status != 1", null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                c34.t tVar = new c34.t();
                tVar.convertFrom(f17);
                arrayList.add(tVar);
            }
            f17.close();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb6.append(((c34.t) it.next()).field_reserved1);
            sb6.append("|");
        }
        return sb6.toString();
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        if (imageView == null) {
            return;
        }
        imageView.setImageBitmap(null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        o11.f fVar = new o11.f();
        if (gm0.j1.a()) {
            if (c34.h0.f38192q == null) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c01.d9.b().f());
                c34.h0.f38192q = r6Var;
                r6Var.J();
            }
            str2 = java.lang.String.format("%s/Sk_%s", c01.d9.b().f(), kk.k.g(str.getBytes()));
        } else {
            str2 = "";
        }
        fVar.f342082f = str2;
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342096t = z17;
        if (i17 != 0) {
            fVar.f342093q = i17;
        }
        n11.a.b().h(str, imageView, fVar.a());
    }
}
