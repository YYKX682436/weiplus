package ek2;

/* loaded from: classes3.dex */
public final class z extends ek2.g0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f253577z = 0;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.p f253578u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253579v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f253580w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f253581x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.c81 f253582y;

    public /* synthetic */ z(long j17, long j18, java.lang.String str, java.lang.String str2, int i17, byte[] bArr, int i18, int i19, java.lang.Integer num, com.tencent.mm.protobuf.g gVar, yz5.p pVar, int i27, kotlin.jvm.internal.i iVar) {
        this(j17, j18, str, str2, i17, bArr, i18, i19, (i27 & 256) != 0 ? null : num, (i27 & 512) != 0 ? null : gVar, (i27 & 1024) != 0 ? null : pVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d81 resp = (r45.d81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] scene:");
        r45.c81 c81Var = this.f253582y;
        sb6.append(c81Var.getInteger(7));
        sb6.append(",errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f253579v;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (i17 != 0 || i18 != 0) {
            yz5.p pVar = this.f253578u;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "resp = " + pm0.b0.g(resp));
        ek2.k3 k3Var = ek2.k3.f253492a;
        int integer = c81Var.getInteger(12);
        int integer2 = c81Var.getInteger(11);
        int integer3 = c81Var.getInteger(7);
        yz5.p pVar2 = this.f253578u;
        je2.t tVar = (je2.t) dk2.ef.f233372a.i(je2.t.class);
        if (tVar != null) {
            tVar.f299265h = true;
        }
        dk2.u7 u7Var = dk2.u7.f234181a;
        dk2.u7.f234194n = (r45.aw1) resp.getCustom(5);
        dk2.u7.f234195o = (r45.zo0) resp.getCustom(8);
        dk2.u7.f234196p = (r45.wi6) resp.getCustom(9);
        ((ku5.f) ek2.k3.f253493b).execute(new ek2.i3(resp, integer, integer2, integer3, pVar2, i17, i18));
    }

    @Override // az2.j
    public java.util.List s() {
        r45.c81 c81Var = this.f253582y;
        return kz5.c0.i(new jz5.l("pull_scene", java.lang.String.valueOf(c81Var.getInteger(11))), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(c81Var.getInteger(7))));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253581x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253580w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, long j18, java.lang.String objectNonceId, java.lang.String str, int i17, byte[] bArr, int i18, int i19, java.lang.Integer num, com.tencent.mm.protobuf.g gVar, yz5.p pVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f253578u = pVar;
        this.f253579v = "Finder.CgiFinderGetLiveGiftList";
        this.f253580w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253581x = jSONObject;
        r45.c81 c81Var = new r45.c81();
        this.f253582y = c81Var;
        c81Var.set(1, db2.t4.f228171a.a(4053));
        c81Var.set(2, java.lang.Long.valueOf(j17));
        c81Var.set(3, java.lang.Long.valueOf(j18));
        c81Var.set(4, objectNonceId);
        c81Var.set(5, str);
        dk2.ef efVar = dk2.ef.f233372a;
        c81Var.set(6, dk2.ef.N);
        c81Var.set(7, java.lang.Integer.valueOf(i17));
        c81Var.set(8, bArr != null ? com.tencent.mm.protobuf.g.b(bArr) : null);
        c81Var.set(9, xy2.c.f(this.f16135n));
        c81Var.set(10, java.lang.Integer.valueOf(i18));
        c81Var.set(11, java.lang.Integer.valueOf(i19));
        if (num != null && num.intValue() > 0) {
            c81Var.set(12, java.lang.Integer.valueOf(num.intValue()));
            c81Var.set(6, gVar);
        }
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(dm.i4.COL_USERNAME, str);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetLiveGiftList", "liveId:" + j17 + " pull_scene:" + i19 + " objectId:" + j18 + " objectNonceId:" + objectNonceId + " username:" + str + ",scene:" + c81Var.getInteger(7));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = c81Var;
        r45.d81 d81Var = new r45.d81();
        d81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d81Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = d81Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliverewardgiftlist";
        lVar.f70667d = 4053;
        p(lVar.a());
    }
}
