package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.view.h0 f116340d = new com.tencent.mm.plugin.finder.live.view.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ce2.k kVar;
        boolean z17;
        rl2.j jVar = (rl2.j) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f66996t).getValue();
        for (java.util.Map.Entry entry : jVar.f397200f.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            java.util.Set set = (java.util.Set) entry.getValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLuckyMoneyStorage", "saveCacheInternal: liveId:" + longValue);
            java.lang.String concat = "SELECT * FROM FinderLiveLuckyMoneyInfo where FinderLiveLuckyMoneyInfo.liveId=".concat(pm0.v.u(longValue));
            l75.k0 k0Var = jVar.f397199e;
            android.database.Cursor f17 = k0Var.f(concat, null, 2);
            boolean z18 = true;
            if (f17.moveToNext()) {
                kVar = new ce2.k();
                kVar.convertFrom(f17);
                z17 = false;
            } else {
                ce2.k kVar2 = new ce2.k();
                kVar2.field_liveId = pm0.v.u(longValue);
                kVar2.field_luckyMoneyData = new r45.kz1().toByteArray();
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveLuckyMoneyStorage", "create new luckyMoneyInfo:" + kVar2);
                kVar = kVar2;
                z17 = true;
            }
            r45.kz1 kz1Var = new r45.kz1();
            byte[] bArr = kVar.field_luckyMoneyData;
            if (bArr != null) {
                try {
                    kz1Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            kz1Var.getList(1).addAll(set);
            kVar.field_luckyMoneyData = kz1Var.toByteArray();
            f17.close();
            if (!z17) {
                z18 = jVar.replace(kVar);
            } else if (k0Var.l("FinderLiveLuckyMoneyInfo", "liveId", kVar.convertTo()) <= 0) {
                z18 = false;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLuckyMoneyStorage", "saveCache result:" + z18);
        }
        return jz5.f0.f302826a;
    }
}
