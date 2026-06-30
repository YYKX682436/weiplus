package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.storage.d5 f193836a = new com.tencent.mm.storage.d5();

    /* renamed from: b, reason: collision with root package name */
    public static final jt0.j f193837b = new jt0.j(500);

    public final com.tencent.mm.storage.e5 a(int i17) {
        z85.b bVar;
        jt0.j jVar = f193837b;
        com.tencent.mm.storage.e5 e5Var = (com.tencent.mm.storage.e5) jVar.get(java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.storage.e5 e5Var2 = new com.tencent.mm.storage.e5();
            e5Var2.f193857a = i17;
            return e5Var2;
        }
        if (e5Var != null) {
            return e5Var;
        }
        com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
        synchronized (f17.f195163a) {
            bVar = f17.f195177o;
        }
        bVar.getClass();
        com.tencent.mm.storage.e5 e5Var3 = new com.tencent.mm.storage.e5();
        e5Var3.f193857a = i17;
        try {
            android.database.Cursor E = bVar.f470783d.E("EmojiDesignerProduct", z85.a.f470781r.f316954c, "designerUin=? ", new java.lang.String[]{i17 + ""}, null, null, null);
            if (E != null) {
                while (E.moveToNext()) {
                    try {
                        z85.a aVar = new z85.a();
                        aVar.convertFrom(E);
                        e5Var3.f193858b.add(aVar);
                    } finally {
                    }
                }
            }
            if (E != null) {
                E.close();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiDesignerProductStorage", e17, "", new java.lang.Object[0]);
        }
        jVar.put(java.lang.Integer.valueOf(i17), e5Var3);
        return e5Var3;
    }
}
