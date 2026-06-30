package r01;

/* loaded from: classes9.dex */
public class x extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f368269f = {l75.n0.getCreateSQLs(qk.o.f364298y1, "bizinfo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f368270g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f368271h = {"CREATE  INDEX IF NOT EXISTS type_username_index ON bizinfo ( type,username ) ", "CREATE  INDEX IF NOT EXISTS  username_acceptType_index ON bizinfo ( username,acceptType ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.v0 f368272d;

    /* renamed from: e, reason: collision with root package name */
    public final r01.s f368273e;

    public x(l75.k0 k0Var) {
        super(k0Var, qk.o.f364298y1, "bizinfo", f368271h);
        this.f368272d = new r01.r(this);
        this.f368273e = new r01.s(this, null);
    }

    @Override // l75.n0
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public boolean replace(qk.o oVar) {
        qk.f e17;
        oVar.field_updateTime = java.lang.System.currentTimeMillis();
        oVar.t0();
        qk.n D0 = oVar.D0(false);
        if (D0 != null && (e17 = D0.e()) != null) {
            oVar.field_specialType = e17.f364101c;
        }
        boolean replace = super.replace(oVar);
        if (replace && !com.tencent.mm.storage.z3.R4(oVar.field_username)) {
            r01.u uVar = new r01.u();
            uVar.f368253b = oVar.field_username;
            oVar.P0();
            uVar.f368252a = r01.t.UPDATE;
            uVar.f368254c = oVar;
            l75.v0 v0Var = this.f368272d;
            v0Var.d(uVar);
            v0Var.c();
        }
        return replace;
    }

    public final void D0(java.lang.StringBuilder sb6) {
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" = ");
        sb6.append(3);
        sb6.append(" ");
    }

    public final void J0(java.lang.StringBuilder sb6, boolean z17) {
        sb6.append(" and (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("brandFlag");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") ");
        sb6.append(z17 ? "==" : "!=");
        sb6.append(" 0 ");
    }

    public final void K1(java.lang.StringBuilder sb6) {
        sb6.append("select ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("brandIconURL");
        sb6.append(", ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(", ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("status");
        sb6.append(", ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("enterpriseFather");
        sb6.append(", ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("brandFlag");
        sb6.append(", ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("extInfo");
        sb6.append(", ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append(dm.i4.COL_USERNAME);
        sb6.append(", ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("conRemark");
        sb6.append(", ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("quanPin");
        sb6.append(", ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("nickname");
        sb6.append(", ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("alias");
        sb6.append(", ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" ");
    }

    public final void L0(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" = ");
        sb6.append(3);
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("enterpriseFather");
        sb6.append(" = '");
        sb6.append(str);
        sb6.append("' ");
    }

    public void P0(qk.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", java.lang.Boolean.valueOf(super.delete(oVar, dm.i4.COL_USERNAME)), oVar.field_username);
        r01.u uVar = new r01.u();
        uVar.f368253b = oVar.field_username;
        uVar.f368252a = r01.t.DELETE;
        uVar.f368254c = oVar;
        l75.v0 v0Var = this.f368272d;
        v0Var.d(uVar);
        v0Var.c();
    }

    public final void P1(java.lang.StringBuilder sb6) {
        sb6.append("select ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append(dm.i4.COL_USERNAME);
        sb6.append(" ");
    }

    public final void W0(java.lang.StringBuilder sb6) {
        sb6.append(" from ");
        sb6.append("rcontact");
        sb6.append(", ");
        sb6.append("bizinfo");
        sb6.append(" where ");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append(dm.i4.COL_USERNAME);
        sb6.append(" = ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append(dm.i4.COL_USERNAME);
        sb6.append(" and (");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("verifyFlag");
        sb6.append(" & ");
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
        sb6.append(8);
        sb6.append(") != 0 ");
        sb6.append(" and (");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") != 0 ");
    }

    public qk.o b1(java.lang.String str) {
        r01.s sVar = this.f368273e;
        qk.o oVar = null;
        if (sVar.f368232b && str != null) {
            oVar = (qk.o) sVar.f368231a.a(str);
        }
        if (oVar != null) {
            return oVar;
        }
        qk.o oVar2 = new qk.o();
        oVar2.field_username = str;
        super.get(oVar2, new java.lang.String[0]);
        if (sVar.f368232b) {
            sVar.f368231a.b(str, oVar2);
        }
        return oVar2;
    }

    public void d(java.lang.String str) {
        qk.o oVar = new qk.o();
        oVar.field_username = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", java.lang.Boolean.valueOf(super.delete(oVar, dm.i4.COL_USERNAME)), str);
        r01.u uVar = new r01.u();
        uVar.f368253b = str;
        uVar.f368252a = r01.t.DELETE;
        uVar.f368254c = oVar;
        l75.v0 v0Var = this.f368272d;
        v0Var.d(uVar);
        v0Var.c();
    }

    public java.lang.String d1(java.lang.String str) {
        java.lang.String str2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizInfoStorage", "getBizChatBrandUserName userName is null");
            return null;
        }
        java.util.Map map = f368270g;
        if (map != null && ((java.util.HashMap) map).containsKey(str)) {
            java.lang.String str3 = (java.lang.String) ((java.util.HashMap) map).get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || !c01.e2.J(str3)) {
                return null;
            }
            return str3;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        P1(sb6);
        W0(sb6);
        L0(sb6, str);
        z0(sb6, true);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatChild sql %s", sb7);
        android.database.Cursor f17 = gm0.j1.u().f273153f.f(sb7, null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            str2 = f17.getString(0);
            ((java.util.HashMap) map).put(str, str2);
        }
        f17.close();
        return str2;
    }

    public android.database.Cursor f1(java.lang.String str) {
        qk.g d17;
        java.util.List i17 = i1(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) i17).iterator();
        while (true) {
            java.lang.String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            qk.o b17 = b1(str3);
            b17.A0();
            qk.n nVar = b17.f364301x1;
            if (nVar != null && (d17 = nVar.d()) != null) {
                str2 = d17.f364119d;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                arrayList.add(str3);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        K1(sb6);
        W0(sb6);
        L0(sb6, str);
        J0(sb6, true);
        sb6.append(" and (");
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            java.lang.String str4 = (java.lang.String) arrayList.get(i18);
            if (i18 > 0) {
                sb6.append(" or ");
            }
            sb6.append("rcontact");
            sb6.append(".");
            sb6.append(dm.i4.COL_USERNAME);
            sb6.append(" = '");
            sb6.append(str4);
            sb6.append("'");
        }
        sb6.append(") order by ");
        sb6.append("rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseChatConnector sql %s", sb7);
        return gm0.j1.u().f273153f.B(sb7, null);
    }

    public java.util.List i1(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        P1(sb6);
        W0(sb6);
        L0(sb6, str);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseChildNameList sql %s", sb7);
        android.database.Cursor f17 = gm0.j1.u().f273153f.f(sb7, null, 2);
        if (f17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            arrayList.add(f17.getString(0));
        }
        f17.close();
        return arrayList;
    }

    public android.database.Cursor k1(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        K1(sb6);
        W0(sb6);
        L0(sb6, str);
        z0(sb6, false);
        J0(sb6, true);
        sb6.append(" and (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("acceptType");
        sb6.append(" & ");
        sb6.append(i17);
        sb6.append(") > 0 ");
        sb6.append(" order by ");
        sb6.append("rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseChildOfAcceptType sql %s", sb7);
        return gm0.j1.u().f273153f.B(sb7, null);
    }

    public java.util.List n1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select rcontact.username, bizinfo.enterpriseFather, bizinfo.bitFlag & 1");
        W0(sb6);
        D0(sb6);
        sb6.append(" and (");
        sb6.append(" (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("bitFlag");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") != 0");
        sb6.append(" or ");
        sb6.append(" (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("acceptType");
        sb6.append(" & ");
        sb6.append(128);
        sb6.append(") > 0 ");
        sb6.append(" and (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("brandFlag");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") == 0) ");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseConnectorList sql %s", sb7);
        android.database.Cursor f17 = gm0.j1.u().f273153f.f(sb7, null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f17 == null) {
            return arrayList;
        }
        while (f17.moveToNext()) {
            arrayList.add(f17.getString((f17.getInt(2) > 0 ? 1 : 0) ^ 1));
        }
        f17.close();
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().H(arrayList);
    }

    public android.database.Cursor o1(java.lang.String str, boolean z17) {
        java.util.List arrayList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        K1(sb6);
        W0(sb6);
        L0(sb6, str);
        J0(sb6, true);
        if (z17) {
            z0(sb6, false);
        }
        try {
            try {
                r01.m y07 = r01.q3.bj().y0(str);
                r45.ik ikVar = new r45.ik();
                ikVar.parseFrom(y07.field_raw_attrs);
                arrayList = ikVar.f377103e;
            } catch (java.lang.Throwable unused) {
                arrayList = new java.util.ArrayList(0);
            }
            if (!arrayList.isEmpty()) {
                y0(sb6, arrayList);
            }
        } catch (java.lang.Throwable unused2) {
        }
        sb6.append(" order by ");
        sb6.append("rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseEnableChild sql %s", sb7);
        return gm0.j1.u().f273153f.B(sb7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().H(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r0.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        r5.add(r0.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (r0.moveToNext() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        r0.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getMyAcceptList: type[%d], use time[%d ms]", java.lang.Integer.valueOf(r9), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List p1(int r9) {
        /*
            r8 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "acceptType"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = "username"
            java.lang.String r4 = "bizinfo"
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r1, r2}
            java.lang.String r2 = "select %s from %s where %s & %d > 0"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            java.lang.String r1 = "getList: sql[%s]"
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "MicroMsg.BizInfoStorage"
            com.tencent.mars.xlog.Log.i(r3, r1, r2)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            android.database.Cursor r0 = r8.rawQuery(r0, r5)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            if (r0 == 0) goto L75
            boolean r6 = r0.moveToFirst()
            if (r6 == 0) goto L49
        L3c:
            java.lang.String r6 = r0.getString(r4)
            r5.add(r6)
            boolean r6 = r0.moveToNext()
            if (r6 != 0) goto L3c
        L49:
            r0.close()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r1
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r0}
            java.lang.String r0 = "getMyAcceptList: type[%d], use time[%d ms]"
            com.tencent.mars.xlog.Log.i(r3, r0, r9)
            java.lang.Class<vg3.x3> r9 = vg3.x3.class
            lm0.a r9 = gm0.j1.s(r9)
            vg3.x3 r9 = (vg3.x3) r9
            com.tencent.mm.plugin.messenger.foundation.h2 r9 = (com.tencent.mm.plugin.messenger.foundation.h2) r9
            com.tencent.mm.storage.k4 r9 = r9.Bi()
            java.util.List r9 = r9.H(r5)
            return r9
        L75:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r1
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r0}
            java.lang.String r0 = "getMyAcceptList: cursor not null, type[%d], use time[%d ms]"
            com.tencent.mars.xlog.Log.i(r3, r0, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.x.p1(int):java.util.List");
    }

    public int u1(int i17) {
        java.util.List p17 = p1(i17);
        if (com.tencent.mm.sdk.platformtools.t8.L0(p17)) {
            return 0;
        }
        return ((java.util.LinkedList) p17).size();
    }

    public final void y0(java.lang.StringBuilder sb6, java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        sb6.append(" and (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append(dm.i4.COL_USERNAME);
        sb6.append(" NOT IN (");
        int size = list.size();
        int i17 = size - 1;
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.String str = (java.lang.String) list.get(i18);
            sb6.append("'");
            sb6.append(str);
            sb6.append("'");
            if (i18 != i17) {
                sb6.append(",");
            }
        }
        sb6.append(")) ");
    }

    public final void z0(java.lang.StringBuilder sb6, boolean z17) {
        sb6.append(" and (");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("bitFlag");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") ");
        sb6.append(z17 ? "!=" : "==");
        sb6.append(" 0 ");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public boolean insert(qk.o oVar) {
        qk.f e17;
        oVar.field_updateTime = java.lang.System.currentTimeMillis();
        oVar.t0();
        qk.n D0 = oVar.D0(false);
        if (D0 != null && (e17 = D0.e()) != null) {
            oVar.field_specialType = e17.f364101c;
        }
        boolean insert = super.insert(oVar);
        if (insert && !com.tencent.mm.storage.z3.R4(oVar.field_username)) {
            r01.u uVar = new r01.u();
            uVar.f368253b = oVar.field_username;
            oVar.P0();
            uVar.f368252a = r01.t.INSTERT;
            uVar.f368254c = oVar;
            l75.v0 v0Var = this.f368272d;
            v0Var.d(uVar);
            v0Var.c();
        }
        return insert;
    }
}
