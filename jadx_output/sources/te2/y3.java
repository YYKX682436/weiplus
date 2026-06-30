package te2;

/* loaded from: classes3.dex */
public final class y3 {
    public y3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(long j17) {
        ce2.k kVar;
        rl2.j jVar = (rl2.j) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f66996t).getValue();
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLuckyMoneyStorage", "initCache: liveId:" + j17);
        android.database.Cursor f17 = jVar.f397199e.f("SELECT * FROM FinderLiveLuckyMoneyInfo where FinderLiveLuckyMoneyInfo.liveId=".concat(pm0.v.u(j17)), null, 2);
        if (f17.moveToNext()) {
            kVar = new ce2.k();
            kVar.convertFrom(f17);
        } else {
            kVar = null;
        }
        r45.kz1 kz1Var = new r45.kz1();
        byte[] bArr = kVar != null ? kVar.field_luckyMoneyData : null;
        if (bArr != null) {
            try {
                kz1Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        java.util.LinkedList list = kz1Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getOpenedIdList(...)");
        synchronizedSet.addAll(list);
        jVar.f397200f.put(java.lang.Long.valueOf(j17), synchronizedSet);
        f17.close();
    }
}
