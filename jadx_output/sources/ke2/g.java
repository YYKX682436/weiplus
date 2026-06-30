package ke2;

/* loaded from: classes3.dex */
public final class g extends az2.j {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f306946x = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306947t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.f f306948u;

    /* renamed from: v, reason: collision with root package name */
    public final long f306949v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.il4 f306950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, long j18, long j19, java.lang.String finderUserName, int i17, r45.il4 il4Var, r45.o63 o63Var, r45.a94 a94Var, r45.v94 v94Var, long j27, ke2.f fVar, r45.rw2 rw2Var, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        java.lang.String str;
        int i19;
        r45.il4 il4Var2;
        r45.j73 j73Var;
        r45.j73 j73Var2;
        byte[] bArr;
        int i27 = (i18 & 16) != 0 ? 0 : i17;
        r45.il4 il4Var3 = (i18 & 32) != 0 ? null : il4Var;
        r45.o63 o63Var2 = (i18 & 64) != 0 ? null : o63Var;
        r45.a94 a94Var2 = (i18 & 128) != 0 ? null : a94Var;
        r45.v94 v94Var2 = (i18 & 256) != 0 ? null : v94Var;
        long j28 = (i18 & 512) != 0 ? -1L : j27;
        r45.rw2 rw2Var2 = (i18 & 2048) != 0 ? null : rw2Var;
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f306947t = "Finder.CgiFinderLiveAnchorStatus";
        this.f306948u = fVar;
        r45.bv2 bv2Var = new r45.bv2();
        this.f306949v = j19;
        this.f306950w = il4Var3;
        bv2Var.set(2, java.lang.Long.valueOf(j17));
        bv2Var.set(4, java.lang.Long.valueOf(j18));
        bv2Var.set(5, finderUserName);
        bv2Var.set(1, db2.t4.f228171a.a(6443));
        bv2Var.set(6, java.lang.Integer.valueOf(i27));
        bv2Var.set(10, rw2Var2);
        r45.t74 t74Var = new r45.t74();
        t74Var.f386196e = j19;
        t74Var.f386195d = c01.id.c();
        if (il4Var3 != null) {
            t74Var.f386198g = il4Var3;
            str = "Finder.CgiFinderLiveAnchorStatus";
            bv2Var.set(9, java.lang.Long.valueOf(bv2Var.getLong(9) | 2));
        } else {
            str = "Finder.CgiFinderLiveAnchorStatus";
        }
        if (o63Var2 != null) {
            t74Var.f386197f = o63Var2;
            i19 = 9;
            bv2Var.set(9, java.lang.Long.valueOf(1 | bv2Var.getLong(9)));
        } else {
            i19 = 9;
        }
        if (a94Var2 != null) {
            t74Var.f386199h = a94Var2;
            il4Var2 = il4Var3;
            bv2Var.set(i19, java.lang.Long.valueOf(4 | bv2Var.getLong(i19)));
        } else {
            il4Var2 = il4Var3;
        }
        if (v94Var2 != null) {
            t74Var.f386201m = v94Var2;
            bv2Var.set(i19, java.lang.Long.valueOf(bv2Var.getLong(i19) | 8));
        }
        bv2Var.set(3, com.tencent.mm.protobuf.g.b(t74Var.toByteArray()));
        bv2Var.set(8, java.lang.Long.valueOf(j28));
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f233372a.i(mm2.g1.class);
        if (g1Var != null && (bArr = g1Var.f329081v) != null) {
            bv2Var.set(11, new com.tencent.mm.protobuf.g(bArr, 0, bArr.length));
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i(str2, "opFlag:".concat(pm0.v.u(j28)));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = bv2Var;
        r45.cv2 cv2Var = new r45.cv2();
        cv2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) cv2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = cv2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersetanchorstatus";
        lVar.f70667d = 6443;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(bv2Var.getLong(2));
        sb6.append(',');
        sb6.append(bv2Var.getString(5));
        sb6.append(',');
        sb6.append(j19);
        sb6.append(',');
        sb6.append(il4Var2 != null ? java.lang.Long.valueOf(il4Var2.f377129d) : null);
        sb6.append(",LiveLotterySetting:[");
        sb6.append(a94Var2 != null ? java.lang.Integer.valueOf(a94Var2.f369858e) : null);
        sb6.append(',');
        sb6.append(a94Var2 != null ? java.lang.Long.valueOf(a94Var2.f369857d) : null);
        sb6.append("],GameTeamSetting:[");
        sb6.append((o63Var2 == null || (j73Var2 = o63Var2.f381981e) == null) ? null : java.lang.Integer.valueOf(j73Var2.getInteger(1)));
        sb6.append(',');
        sb6.append((o63Var2 == null || (j73Var = o63Var2.f381981e) == null) ? null : java.lang.Integer.valueOf(j73Var.getInteger(0)));
        sb6.append(',');
        sb6.append(o63Var2 != null ? java.lang.Integer.valueOf(o63Var2.f381980d) : null);
        sb6.append("]，ReplaySetting:[");
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.getBoolean(0)) : null);
        sb6.append(',');
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.getBoolean(1)) : null);
        sb6.append(',');
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.getBoolean(2)) : null);
        sb6.append(',');
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.getBoolean(3)) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.cv2 resp = (r45.cv2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306947t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.f fVar2 = this.f306948u;
        if (i17 != 0 || i18 != 0) {
            if (fVar2 != null) {
                fVar2.a(i17, i18, str, this.f306949v, resp);
            }
        } else if (fVar2 != null) {
            long j17 = this.f306949v;
            r45.il4 il4Var = this.f306950w;
            fVar2.b(j17, il4Var != null ? il4Var.f377129d : 0L, resp);
        }
    }
}
