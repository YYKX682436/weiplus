package ek2;

/* loaded from: classes2.dex */
public final class y0 extends ek2.x {

    /* renamed from: t, reason: collision with root package name */
    public final zy2.k5 f253571t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253572u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f253573v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f253574w;

    /* renamed from: x, reason: collision with root package name */
    public final r45.y61 f253575x;

    public /* synthetic */ y0(java.lang.String str, zy2.k5 k5Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? null : k5Var);
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.nw1 liveInfo;
        r45.z61 resp = (r45.z61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253572u;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "GetLastObject result:" + pm0.b0.g(resp));
        }
        org.json.JSONObject jSONObject = this.f253573v;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        jSONObject.put("liveId", (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? null : java.lang.Long.valueOf(liveInfo.getLong(0)));
        zy2.k5 k5Var = this.f253571t;
        if (k5Var != null) {
            k5Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.z61 resp = (r45.z61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        return finderObject != null ? kz5.b0.c(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0)) : kz5.p0.f313996d;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = (r45.kv0) this.f253575x.getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253574w;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253573v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String username, zy2.k5 k5Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(username, "username");
        this.f253571t = k5Var;
        this.f253572u = "Finder.CgiFinderLiveGetLastObject";
        this.f253573v = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253574w = jSONObject;
        r45.y61 y61Var = new r45.y61();
        this.f253575x = y61Var;
        y61Var.set(2, username);
        y61Var.set(1, db2.t4.f228171a.a(6482));
        y61Var.set(5, zl2.q4.d(zl2.q4.f473933a, null, null, 3, null));
        jSONObject.put(dm.i4.COL_USERNAME, username);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = y61Var;
        r45.z61 z61Var = new r45.z61();
        z61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) z61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = z61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlatestliveobject";
        lVar.f70667d = 6482;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetLastObject", "CgiFinderLiveGetLastObject init username:" + y61Var.getString(2));
    }
}
