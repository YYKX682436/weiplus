package mv2;

/* loaded from: classes10.dex */
public final class o implements mv2.n {
    @Override // mv2.n
    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((c61.l7) i95.n0.c(c61.l7.class)).Pj().D0().iterator();
        while (it.hasNext()) {
            mv2.q.b(mv2.q.f331618a, (com.tencent.mm.plugin.finder.storage.FinderItem) it.next(), arrayList);
        }
        com.tencent.mm.plugin.finder.storage.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
        Pj.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = Pj.f126760f.f("SELECT * FROM FinderFeedItem  WHERE localFlag IN (64);", null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
            finderItem.convertFrom(f17);
            arrayList2.add(finderItem);
        }
        f17.close();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            mv2.q.b(mv2.q.f331618a, (com.tencent.mm.plugin.finder.storage.FinderItem) it6.next(), arrayList);
        }
        return arrayList;
    }

    @Override // mv2.n
    public java.lang.String name() {
        return "unsentFileClaimer";
    }
}
