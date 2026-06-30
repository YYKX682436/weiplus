package p32;

/* loaded from: classes12.dex */
public class l extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f351484f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f351485g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f351486h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f351487i;

    /* renamed from: m, reason: collision with root package name */
    public r32.a f351488m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f351489n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f351490o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f351491p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f351492q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f351493r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f351494s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f351495t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f351496u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f351497v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f351498w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f351499x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.ref.WeakReference f351500y;

    /* renamed from: z, reason: collision with root package name */
    public p32.k f351501z;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, h32.b bVar) {
        this.f351500y = new java.lang.ref.WeakReference(bVar);
        this.f351493r = str;
        this.f351485g = str;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f351486h = str2 == null ? "" : str2;
        this.f351484f = z17;
        this.f351487i = str3;
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f I() {
        return new r45.sq3();
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f J() {
        return new r45.tq3();
    }

    @Override // h32.a
    public void K(com.tencent.mm.protobuf.f fVar) {
        r45.sq3 sq3Var = (r45.sq3) fVar;
        sq3Var.f385923f = this.f351486h;
        sq3Var.f385922e = this.f351485g;
        sq3Var.f385921d = this.f351484f;
        sq3Var.f385924g = this.f351487i;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1042;
    }

    @Override // h32.a
    public java.lang.String getUri() {
        return "/cgi-bin/mmbiz-bin/rank/getuserranklike";
    }

    @Override // h32.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r32.a aVar;
        q32.f fVar;
        r32.e eVar;
        r32.d dVar;
        r32.c cVar;
        if (i18 == 0 && i19 == 0) {
            r45.tq3 tq3Var = (r45.tq3) H();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetRankInfo", "get rank info success, log_msg:%s", tq3Var.f386702y);
            this.f351490o = new java.util.ArrayList();
            java.util.LinkedList linkedList = tq3Var.f386694q;
            java.lang.String str2 = this.f351486h;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.e43 e43Var = (r45.e43) it.next();
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(e43Var.f373005e)) {
                        java.lang.String str3 = tq3Var.f386689i;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                            cVar = null;
                        } else {
                            cVar = new r32.c();
                            cVar.field_rankID = str3;
                            cVar.field_username = e43Var.f373005e;
                            cVar.field_step = e43Var.f373006f;
                            cVar.field_appusername = str2;
                        }
                        if (cVar != null) {
                            this.f351490o.add(cVar);
                        }
                    } else {
                        gm0.j1.n().f273288b.g(new p32.i(e43Var.f373005e, null));
                    }
                }
            }
            this.f351489n = new java.util.ArrayList();
            java.util.LinkedList linkedList2 = tq3Var.f386684d;
            java.lang.String str4 = "";
            if (linkedList2 != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.dh7 dh7Var = (r45.dh7) it6.next();
                    java.lang.String str5 = tq3Var.f386689i;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str5) || dh7Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                        dVar = null;
                    } else {
                        dVar = new r32.d();
                        dVar.field_appusername = str2;
                        dVar.field_rankID = str5;
                        dVar.field_likecount = dh7Var.f372478g;
                        dVar.field_ranknum = dh7Var.f372477f;
                        dVar.field_score = dh7Var.f372476e;
                        dVar.field_selfLikeState = dh7Var.f372479h;
                        dVar.field_username = dh7Var.f372475d;
                        dVar.field_sportRecord = dh7Var.f372480i;
                    }
                    if (dVar != null) {
                        if (dVar.field_ranknum == 1) {
                            str4 = dVar.field_username;
                        }
                        this.f351489n.add(dVar);
                    }
                }
            }
            this.f351491p = new java.util.ArrayList();
            java.util.LinkedList linkedList3 = tq3Var.f386685e;
            if (linkedList3 != null) {
                java.util.Iterator it7 = linkedList3.iterator();
                while (it7.hasNext()) {
                    r45.eh7 eh7Var = (r45.eh7) it7.next();
                    java.lang.String str6 = tq3Var.f386689i;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str6) || eh7Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                        eVar = null;
                    } else {
                        eVar = new r32.e();
                        eVar.field_appusername = str2;
                        eVar.field_rankID = str6;
                        eVar.field_timestamp = eh7Var.f373507d;
                        eVar.field_username = eh7Var.f373508e;
                    }
                    if (eVar != null) {
                        this.f351491p.add(eVar);
                    }
                }
            }
            this.f351492q = new java.util.ArrayList();
            java.util.LinkedList linkedList4 = tq3Var.f386686f;
            if (linkedList4 != null) {
                java.util.Iterator it8 = linkedList4.iterator();
                while (it8.hasNext()) {
                    this.f351492q.add((java.lang.String) it8.next());
                }
            }
            java.lang.String str7 = this.f351487i;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                str4 = str7;
            }
            java.lang.String str8 = tq3Var.f386687g;
            java.lang.String str9 = tq3Var.f386688h;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                aVar = null;
            } else {
                aVar = new r32.a();
                aVar.field_username = str4;
                aVar.field_championUrl = str8;
                aVar.field_championMotto = str9;
            }
            this.f351488m = aVar;
            java.lang.String str10 = tq3Var.f386689i;
            this.f351493r = str10;
            this.f351495t = tq3Var.f386693p;
            this.f351494s = tq3Var.f386691n;
            this.f351496u = tq3Var.f386692o;
            this.f351497v = tq3Var.f386698u == 1;
            this.f351498w = tq3Var.f386699v;
            this.f351499x = tq3Var.f386695r;
            java.lang.String str11 = this.f351485g;
            if ((str11 == null || !str11.equals(str10)) && (fVar = com.tencent.mm.plugin.exdevice.model.l3.cj().f359929d) != null) {
                ((com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI) fVar).f99350x = this.f351493r;
            }
            p32.k kVar = this.f351501z;
            boolean z17 = this.f351484f;
            if (kVar != null && z17) {
                com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = (com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI) kVar;
                exdeviceRankInfoUI.getClass();
                exdeviceRankInfoUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.i6(exdeviceRankInfoUI));
                exdeviceRankInfoUI.G = this.f351494s;
                exdeviceRankInfoUI.H = this.f351495t;
                exdeviceRankInfoUI.f99332J = this.f351498w;
                boolean z18 = this.f351497v;
                exdeviceRankInfoUI.I = z18;
                exdeviceRankInfoUI.P = this.f351499x;
                java.util.ArrayList arrayList = this.f351489n;
                exdeviceRankInfoUI.D = arrayList;
                java.util.ArrayList arrayList2 = this.f351490o;
                exdeviceRankInfoUI.C = arrayList2;
                exdeviceRankInfoUI.B = exdeviceRankInfoUI.f99334e.a(arrayList2, arrayList, z18);
                exdeviceRankInfoUI.R = ((r45.tq3) H()).f386701x;
                exdeviceRankInfoUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.j6(exdeviceRankInfoUI, this));
            }
            if (z17) {
                com.tencent.mm.plugin.exdevice.model.l3.Ri().P0(this.f351490o);
            }
            s32.d fj6 = com.tencent.mm.plugin.exdevice.model.l3.fj();
            java.lang.String str12 = this.f351493r;
            fj6.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId failed, rankId is null or nil.");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId (%s).(r : %d)", str12, java.lang.Integer.valueOf(fj6.f402464d.delete("HardDeviceRankInfo", "rankID = ? ", new java.lang.String[]{str12})));
            }
            s32.d fj7 = com.tencent.mm.plugin.exdevice.model.l3.fj();
            java.lang.String str13 = this.f351493r;
            java.util.ArrayList arrayList3 = this.f351489n;
            fj7.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str13) || arrayList3 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", str13, java.lang.Integer.valueOf(arrayList3.size()));
                for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                    fj7.z0((r32.d) arrayList3.get(i27), false);
                }
                com.tencent.mm.plugin.exdevice.model.l3.hj().a("HardDeviceRankInfo", new q32.d(str13, null, null));
            }
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Boolean.valueOf(this.f351496u);
            java.util.ArrayList arrayList4 = this.f351490o;
            objArr[1] = java.lang.Integer.valueOf(arrayList4 != null ? arrayList4.size() : 0);
            java.util.ArrayList arrayList5 = this.f351489n;
            objArr[2] = java.lang.Integer.valueOf(arrayList5 != null ? arrayList5.size() : 0);
            java.util.ArrayList arrayList6 = this.f351491p;
            objArr[3] = java.lang.Integer.valueOf(arrayList6 != null ? arrayList6.size() : 0);
            r45.dh7 dh7Var2 = tq3Var.f386700w;
            objArr[4] = dh7Var2;
            objArr[5] = java.lang.Integer.valueOf(dh7Var2 != null ? dh7Var2.f372476e : -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetRankInfo", "isCacheExist(%s), RankFollowInfo size(%s), RankInfo size(%d), LikeInfo size(%d). myInfo:%s myInfo.score:%s", objArr);
            s32.e bj6 = com.tencent.mm.plugin.exdevice.model.l3.bj();
            java.lang.String str14 = this.f351493r;
            java.util.ArrayList arrayList7 = this.f351491p;
            bj6.getClass();
            iz5.a.g(null, !com.tencent.mm.sdk.platformtools.t8.K0(str14));
            if (arrayList7 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankLikeUserStg", "batchInsertOrUpdate failed, data is null.");
            } else {
                java.util.Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    r32.e eVar2 = (r32.e) it9.next();
                    iz5.a.g(null, eVar2 != null);
                    if (!bj6.update(eVar2, "rankID", dm.i4.COL_USERNAME) && !bj6.insert(eVar2)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert or update failed");
                    }
                }
                com.tencent.mm.plugin.exdevice.model.l3.hj().a("HardDeviceLikeUser", new q32.d(str14, str2, null));
            }
            if (this.f351488m != null) {
                com.tencent.mm.plugin.exdevice.model.l3.wi().z0(this.f351488m, true);
            }
        }
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        h32.b bVar = (h32.b) this.f351500y.get();
        if (bVar != null) {
            bVar.a(i18, i19, str, this);
        }
    }
}
