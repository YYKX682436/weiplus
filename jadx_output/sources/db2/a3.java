package db2;

/* loaded from: classes2.dex */
public final class a3 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final r45.mx2 f227887t;

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f227888u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f227889v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(db2.n3 n3Var, r45.mx2 mx2Var, com.tencent.mm.protobuf.g gVar) {
        super(n3Var.f228082g, null, 2, null);
        this.f227889v = n3Var;
        this.f227887t = mx2Var;
        this.f227888u = new org.json.JSONObject();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.u61 u61Var = new r45.u61();
        n3Var.B.getClass();
        u61Var.set(1, xy2.c.f(this.f16135n));
        u61Var.set(4, java.lang.Integer.valueOf(n3Var.f228079d));
        u61Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f228171a;
        u61Var.set(5, t4Var.n());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[request#historyCgi] isPreload=");
        sb6.append(n3Var.f228084i);
        sb6.append(" tabType=");
        sb6.append(n3Var.f228079d);
        sb6.append(" pullType=");
        sb6.append(n3Var.f228080e);
        sb6.append(" lastBuffer=");
        sb6.append(gVar == null ? "null" : com.tencent.mm.sdk.platformtools.w2.b(gVar.f192156a));
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb6.toString());
        u61Var.set(3, t4Var.b(3814, this.f16135n));
        lVar.f70664a = u61Var;
        r45.v61 v61Var = new r45.v61();
        v61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = v61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergethistory";
        lVar.f70667d = 3814;
        p(lVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r29v0, types: [az2.o, az2.j, db2.a3] */
    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        db2.c3 c3Var;
        java.util.LinkedList list;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.util.LinkedList list2;
        r45.sq2 sq2Var;
        java.util.LinkedList list3;
        int i19;
        int i27;
        long j17;
        java.util.Iterator it;
        r45.v61 resp = (r45.v61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        boolean z17 = false;
        com.tencent.mm.plugin.finder.report.v1.f125393a.h(this.f227889v.f228079d, false);
        this.f227888u.put("size", resp.getList(1).size());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList list4 = resp.getList(1);
        kotlin.jvm.internal.o.f(list4, "getObject(...)");
        db2.n3 n3Var = this.f227889v;
        java.util.Iterator it6 = list4.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) it6.next();
            kotlin.jvm.internal.o.d(finderObject2);
            if (hc2.o0.D(finderObject2, z17)) {
                com.tencent.mm.plugin.finder.viewmodel.component.m1 a17 = com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a();
                r45.qt2 qt2Var = this.f16135n;
                ?? integer = qt2Var != null ? qt2Var.getInteger(5) : z17;
                int i28 = n3Var.f228079d;
                boolean z18 = n3Var.f228084i;
                it = it6;
                java.lang.String string = n3Var.B.getString(7);
                if (string == null) {
                    string = "";
                }
                a17.b(new com.tencent.mm.plugin.finder.viewmodel.component.j1(finderObject2, integer, i28, z18, string, 1, currentTimeMillis, 0L, 0L, 0L, ce1.h.CTRL_INDEX, null));
            } else {
                it = it6;
            }
            it6 = it;
            z17 = false;
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        v1Var.n(this.f227889v.f228079d, false);
        db2.d3 d3Var = this.f227889v.f228092t;
        r45.rq2 rq2Var = null;
        if (d3Var == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        boolean isResultConsume = d3Var.isResultConsume(i17, i18, resp);
        if (isResultConsume) {
            com.tencent.mars.xlog.Log.w("FinderFeedCgi", "[onCgiBack#historyCgi] return! isPreload=" + this.f227889v.f228084i + " tabType=" + this.f227889v.f228079d + " pullType=" + this.f227889v.f228080e + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " isConsume=" + isResultConsume);
            db2.e3 e3Var = this.f227889v.f228093u;
            if (e3Var != null) {
                ((db2.k3) e3Var).a(i17, i18, str, resp);
                return;
            }
            return;
        }
        db2.n3 n3Var2 = this.f227889v;
        r45.mx2 mx2Var = this.f227887t;
        if (mx2Var != null) {
            c3Var = n3Var2.f(mx2Var);
        } else {
            n3Var2.getClass();
            c3Var = new db2.c3();
        }
        db2.b3 b3Var = n3Var2.B;
        kotlin.jvm.internal.o.g(b3Var, "<set-?>");
        c3Var.f227921i = b3Var;
        c3Var.getList(1).addAll(resp.getList(1));
        c3Var.f227916d = resp.getInteger(3);
        c3Var.set(2, resp.getByteString(2));
        r45.sq2 sq2Var2 = (r45.sq2) c3Var.getCustom(9);
        if (sq2Var2 == null) {
            sq2Var2 = new r45.sq2();
        }
        c3Var.set(9, sq2Var2);
        r45.sq2 sq2Var3 = (r45.sq2) c3Var.getCustom(9);
        if (sq2Var3 != null) {
            r45.sq2 sq2Var4 = (r45.sq2) resp.getCustom(4);
            if (sq2Var4 != null) {
                i27 = 0;
                j17 = sq2Var4.getLong(0);
            } else {
                i27 = 0;
                j17 = 0;
            }
            sq2Var3.set(i27, java.lang.Long.valueOf(j17));
        }
        r45.sq2 sq2Var5 = (r45.sq2) c3Var.getCustom(9);
        if (sq2Var5 != null) {
            r45.sq2 sq2Var6 = (r45.sq2) resp.getCustom(4);
            if (sq2Var6 != null) {
                i19 = 1;
                rq2Var = (r45.rq2) sq2Var6.getCustom(1);
            } else {
                i19 = 1;
            }
            sq2Var5.set(i19, rq2Var);
        }
        r45.sq2 sq2Var7 = (r45.sq2) resp.getCustom(4);
        if (sq2Var7 != null && (list2 = sq2Var7.getList(2)) != null && (sq2Var = (r45.sq2) c3Var.getCustom(9)) != null && (list3 = sq2Var.getList(2)) != null) {
            list3.addAll(list2);
        }
        if (!this.f227889v.B.f227908d) {
            r45.mx2 mx2Var2 = this.f227887t;
            c3Var.f227918f = (mx2Var2 == null || (list = mx2Var2.getList(1)) == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.k0(list)) == null) ? -1L : finderObject.getId();
        }
        int size = resp.getList(1).size();
        c3Var.f227919g = size;
        v1Var.a(this.f227889v.f228079d, size);
        c3Var.f227920h = true;
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 153L, 1L, false);
            so2.h3.f410392d.k(this.f227889v.B.getList(9));
        } else if (i17 == 4) {
            jx3.f.INSTANCE.idkeyStat(1279L, 154L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 155L, 1L, false);
        }
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", "[onCgiBack#historyCgi] errCode=" + i18 + " errMsg=" + str + " isConsume=" + isResultConsume + ", isPreload=" + this.f227889v.f228084i + " tabType=" + this.f227889v.f228079d + " pullType=" + this.f227889v.f228080e + ", historySize=" + c3Var.f227919g + " continue_flag=" + resp.getInteger(3) + ' ' + hc2.o0.k(resp.getList(1)));
        bu2.j jVar = bu2.j.f24534a;
        int i29 = this.f227889v.f228079d;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list5 = resp.getList(1);
        kotlin.jvm.internal.o.f(list5, "getObject(...)");
        java.util.HashMap hashMap = bu2.j.f24537d;
        synchronized (hashMap) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i29);
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new android.util.LongSparseArray();
                hashMap.put(valueOf, obj);
            }
            android.util.LongSparseArray longSparseArray = (android.util.LongSparseArray) obj;
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject3 : list5) {
                longSparseArray.append(finderObject3.getId(), java.lang.Long.valueOf(finderObject3.getId()));
            }
        }
        this.f227889v.g(i17, i18, str, c3Var);
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.v61 resp = (r45.v61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = (r45.kv0) this.f227889v.B.getCustom(4);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225004f;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        db2.n3 n3Var = this.f227889v;
        jSONObject.put("tabType", n3Var.f228079d);
        jSONObject.put("pullType", n3Var.f228080e);
        return jSONObject;
    }

    @Override // az2.j
    public boolean y() {
        return true;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f227888u;
    }
}
