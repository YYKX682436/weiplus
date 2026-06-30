package rl2;

/* loaded from: classes3.dex */
public final class d extends be2.c {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f397189e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f397190f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f397191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, ce2.c.f40774v, "FinderLiveChargeInfo", dm.l4.f238229m);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = ce2.c.f40774v;
        this.f397189e = db6;
        this.f397191g = new com.tencent.mm.sdk.platformtools.r2(zl2.q4.f473933a.E() ? 5 : 600);
    }

    @Override // be2.c
    public boolean D0(long j17) {
        if (!this.f397190f) {
            z0();
        }
        rl2.c cVar = (rl2.c) this.f397191g.get(java.lang.Long.valueOf(j17));
        return cVar != null && cVar.f397188e == 1;
    }

    @Override // be2.c
    public void J0() {
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397191g;
        java.util.Set<java.util.Map.Entry> p17 = r2Var.p();
        kotlin.jvm.internal.o.f(p17, "entrySet(...)");
        for (java.util.Map.Entry entry : p17) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            long longValue = ((java.lang.Number) key).longValue();
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            P0(longValue, (rl2.c) value);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "saveChargeInfo finish size:" + r2Var.size() + '!');
    }

    @Override // be2.c
    public void L0(long j17) {
        if (!this.f397190f) {
            z0();
        }
        rl2.c cVar = (rl2.c) this.f397191g.get(java.lang.Long.valueOf(j17));
        if (cVar == null) {
        } else if (cVar.f397187d != 1) {
            cVar.f397188e = 1;
        }
        java.lang.Object obj = this.f397191g.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.f(obj, "get(...)");
        P0(j17, (rl2.c) obj);
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "setInvalid liveId:" + j17 + ",cache size:" + this.f397191g.size());
    }

    public final void P0(long j17, rl2.c cVar) {
        ce2.c cVar2;
        boolean z17;
        boolean z18;
        java.lang.String concat = "SELECT * FROM FinderLiveChargeInfo where FinderLiveChargeInfo.liveId=".concat(pm0.v.u(j17));
        l75.k0 k0Var = this.f397189e;
        android.database.Cursor f17 = k0Var.f(concat, null, 2);
        boolean z19 = true;
        if (f17.moveToNext()) {
            cVar2 = new ce2.c();
            cVar2.convertFrom(f17);
            int i17 = cVar2.field_freeTimeForLive;
            int i18 = cVar.f397185b;
            z18 = (i17 == i18 && cVar2.field_freeTimeForReplay == cVar.f397186c && cVar2.field_payForLive == cVar.f397187d && cVar2.field_invalid == cVar.f397188e) ? false : true;
            cVar2.field_freeTimeForLive = i18;
            cVar2.field_freeTimeForReplay = cVar.f397186c;
            cVar2.field_payForLive = cVar.f397187d;
            cVar2.field_invalid = cVar.f397188e;
            z17 = false;
        } else {
            ce2.c cVar3 = new ce2.c();
            cVar3.field_liveId = j17;
            cVar3.field_freeTimeForLive = cVar.f397185b;
            cVar3.field_freeTimeForReplay = cVar.f397186c;
            cVar3.field_payForLive = cVar.f397187d;
            cVar3.field_invalid = cVar.f397188e;
            com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "create new charge info:" + cVar3);
            cVar2 = cVar3;
            z17 = true;
            z18 = false;
        }
        f17.close();
        if (z18) {
            z19 = replace(cVar2);
        } else if (!z17 || k0Var.l("FinderLiveChargeInfo", "liveId", cVar2.convertTo()) <= 0) {
            z19 = false;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "saveCache " + cVar2.field_liveId + ",liveTime:" + cVar2.field_freeTimeForLive + ",replay:" + cVar2.field_freeTimeForReplay + ",payForLive:" + cVar2.field_payForLive + ",invalid:" + cVar2.field_invalid + ", needReplace:" + z18 + ",needInsert:" + z17 + ",result:" + z19);
    }

    @Override // be2.c
    public boolean y0(long j17) {
        if (!this.f397190f) {
            z0();
        }
        rl2.c cVar = (rl2.c) this.f397191g.get(java.lang.Long.valueOf(j17));
        return cVar != null && cVar.f397187d == 1;
    }

    @Override // be2.c
    public void z0() {
        boolean isEmpty = this.f397191g.p().isEmpty();
        if (isEmpty) {
            android.database.Cursor f17 = this.f397189e.f("SELECT * FROM FinderLiveChargeInfo", null, 2);
            while (f17.moveToNext()) {
                ce2.c cVar = new ce2.c();
                cVar.convertFrom(f17);
                long j17 = cVar.field_liveId;
                rl2.c cVar2 = new rl2.c(j17, cVar.field_freeTimeForLive, cVar.field_freeTimeForReplay, cVar.field_payForLive, cVar.field_invalid);
                this.f397191g.put(java.lang.Long.valueOf(j17), cVar2);
                zl2.r4.f473950a.M2("FinderLiveChargeInfoStorage", "initChargeInfo " + cVar2);
            }
            f17.close();
        }
        this.f397190f = true;
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "initChargeInfo: " + c01.z1.r() + ", isEmpty:" + isEmpty + ", cache size:" + this.f397191g.size());
    }
}
