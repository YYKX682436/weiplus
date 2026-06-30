package db2;

/* loaded from: classes10.dex */
public final class t3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.k6 f228169t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228170u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(db2.k6 params, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(params, "params");
        this.f228169t = params;
        this.f228170u = "Finder.CgiFinderThank";
        r45.sz2 sz2Var = new r45.sz2();
        java.lang.String str = params.f228044b;
        sz2Var.set(2, str);
        sz2Var.set(3, java.lang.Integer.valueOf(params.f228046d));
        sz2Var.set(6, java.lang.Integer.valueOf(params.f228043a ? 1 : 2));
        java.lang.String str2 = params.f228045c;
        sz2Var.set(4, str2);
        sz2Var.set(7, java.lang.Integer.valueOf(params.f228047e));
        java.lang.Long l17 = params.f228048f;
        if (l17 != null) {
            sz2Var.set(5, java.lang.Long.valueOf(l17.longValue()));
        }
        java.lang.Long l18 = params.f228049g;
        if (l18 != null) {
            sz2Var.set(8, java.lang.Long.valueOf(l18.longValue()));
        }
        r45.nv2 nv2Var = params.f228050h;
        if (nv2Var != null) {
            sz2Var.set(9, nv2Var);
        }
        sz2Var.set(1, db2.t4.f228171a.b(3867, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) sz2Var.getCustom(1);
        if (kv0Var != null) {
            r45.qt2 qt2Var2 = this.f16135n;
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var2 != null ? qt2Var2.getInteger(5) : 0));
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = sz2Var;
        r45.tz2 tz2Var = new r45.tz2();
        tz2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tz2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tz2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderthank";
        lVar.f70667d = 7283;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderThank init, username=");
        sb6.append(str);
        sb6.append(" opType=");
        sb6.append(sz2Var.getInteger(6));
        sb6.append(" scene=");
        r45.kv0 kv0Var2 = (r45.kv0) sz2Var.getCustom(1);
        sb6.append(kv0Var2 != null ? java.lang.Integer.valueOf(kv0Var2.getInteger(1)) : null);
        sb6.append(" wxUsername=");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderThank", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tz2 resp = (r45.tz2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = this.f228170u;
        com.tencent.mars.xlog.Log.i(str2, "onCgiEnd errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ' ');
        if (i17 == 0 && i18 == 0) {
            db2.k6 k6Var = this.f228169t;
            java.lang.Long l17 = k6Var.f228048f;
            dm.pd pdVar = null;
            if (l17 != null) {
                long longValue = l17.longValue();
                l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i19 = dm.x4.f241026a3;
                sb6.append("SELECT rowid, * FROM ".concat("FinderIdentityMsg"));
                sb6.append(" WHERE svrMentionId = ");
                sb6.append(longValue);
                android.database.Cursor rawQuery = fk6.rawQuery(sb6.toString(), new java.lang.String[0]);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.moveToNext()) {
                            dm.pd pdVar2 = new dm.pd();
                            pdVar2.convertFrom(rawQuery);
                            vz5.b.a(rawQuery, null);
                            pdVar = pdVar2;
                        } else {
                            vz5.b.a(rawQuery, null);
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(rawQuery, th6);
                            throw th7;
                        }
                    }
                }
            }
            if (pdVar != null) {
                int i27 = pdVar.field_extFlag;
                pdVar.field_extFlag = k6Var.f228043a ? i27 | 32 : i27 & (-33);
                com.tencent.mars.xlog.Log.i(str2, "CgiFinderThank updateExtFlag mentionId=" + pdVar.field_svrMentionId + " originalFlag=" + i27 + " newFlag=" + pdVar.field_extFlag);
                cu2.b0.f222371a.l(pdVar, 1);
            }
        }
    }
}
