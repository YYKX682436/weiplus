package mv2;

/* loaded from: classes10.dex */
public final class p implements mv2.n {
    @Override // mv2.n
    public java.util.List a() {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mv2.q.c(mv2.q.f331618a, gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "").toString(), arrayList);
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        Oj.getClass();
        java.util.ArrayList<com.tencent.mm.plugin.finder.storage.x80> arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = Oj.f222428i.f("SELECT * FROM FinderDraftItem  WHERE " + Oj.f222424e + " ORDER BY " + Oj.f222423d + ".localId DESC", null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
            x80Var.convertFrom(f17);
            arrayList2.add(x80Var);
        }
        f17.close();
        for (com.tencent.mm.plugin.finder.storage.x80 x80Var2 : arrayList2) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x80Var2.field_postIntent) && ((i17 = x80Var2.field_objectType) == 1 || i17 == 0)) {
                mv2.q qVar = mv2.q.f331618a;
                java.lang.String field_postIntent = x80Var2.field_postIntent;
                kotlin.jvm.internal.o.f(field_postIntent, "field_postIntent");
                mv2.q.c(qVar, field_postIntent, arrayList);
            }
            mv2.q.b(mv2.q.f331618a, x80Var2.t0(), arrayList);
        }
        return arrayList;
    }

    @Override // mv2.n
    public java.lang.String name() {
        return "draftFileClaimer";
    }
}
