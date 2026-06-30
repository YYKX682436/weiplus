package rl2;

/* loaded from: classes3.dex */
public final class w extends be2.j {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f397218e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f397219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l75.k0 db6) {
        super(db6, ce2.n.f40786p, "FinderLiveVideoDefinitionInfo", dm.t4.f240083g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = ce2.n.f40786p;
        this.f397218e = db6;
        this.f397219f = new com.tencent.mm.sdk.platformtools.r2(zl2.q4.f473933a.E() ? 5 : 100);
    }

    @Override // be2.j
    public void D0(long j17, int i17) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397219f;
        r2Var.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        zl2.r4.f473950a.M2("FinderLiveVideoDefinitionStorage", "updateDefinition liveId:" + j17 + ",level:" + i17 + ",cache size:" + r2Var.size());
    }

    @Override // be2.j
    public void y0() {
        ce2.n nVar;
        boolean z17;
        boolean z18;
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397219f;
        java.util.Set<java.util.Map.Entry> p17 = r2Var.p();
        kotlin.jvm.internal.o.f(p17, "entrySet(...)");
        for (java.util.Map.Entry entry : p17) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            long longValue = ((java.lang.Number) key).longValue();
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            int intValue = ((java.lang.Number) value).intValue();
            java.lang.String concat = "SELECT * FROM FinderLiveVideoDefinitionInfo where FinderLiveVideoDefinitionInfo.liveId=".concat(pm0.v.u(longValue));
            l75.k0 k0Var = this.f397218e;
            android.database.Cursor f17 = k0Var.f(concat, null, 2);
            boolean z19 = true;
            if (f17.moveToNext()) {
                nVar = new ce2.n();
                nVar.convertFrom(f17);
                z18 = nVar.field_definition != intValue;
                nVar.field_definition = intValue;
                z17 = false;
            } else {
                ce2.n nVar2 = new ce2.n();
                nVar2.field_liveId = longValue;
                nVar2.field_definition = intValue;
                com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionStorage", "create new video definition info:" + nVar2);
                nVar = nVar2;
                z17 = true;
                z18 = false;
            }
            f17.close();
            if (z18) {
                z19 = replace(nVar);
            } else if (!z17 || k0Var.l("FinderLiveVideoDefinitionInfo", "liveId", nVar.convertTo()) <= 0) {
                z19 = false;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionStorage", "saveCache " + nVar.field_liveId + ',' + nVar.field_definition + ",needReplay:" + z18 + ", needInsert:" + z17 + ", result:" + z19);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionStorage", "saveDefinition finish size:" + r2Var.size() + '!');
    }

    @Override // be2.j
    public int z0(long j17) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397219f;
        java.lang.Integer num = (java.lang.Integer) r2Var.get(java.lang.Long.valueOf(j17));
        int intValue = num == null ? -1 : num.intValue();
        zl2.r4.f473950a.M2("FinderLiveVideoDefinitionStorage", "selectDefinition liveId:" + j17 + ",level:" + intValue + ",cache size:" + r2Var.size());
        return intValue;
    }
}
