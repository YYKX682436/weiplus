package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class z3 extends com.tencent.mm.pluginsdk.model.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f189179e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f189180f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f189181g;

    /* renamed from: h, reason: collision with root package name */
    public final int f189182h;

    public z3(int i17, int i18, int i19, java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "offset: " + i18 + ", limit = " + i19 + ", lang = " + str + "installedApp list size: " + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "install id:[%s]", (java.lang.String) it.next());
        }
        this.f189182h = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.to3();
        lVar.f70665b = new r45.uo3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getsuggestionapplist";
        lVar.f70667d = 409;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189090d = a17;
        r45.to3 to3Var = (r45.to3) a17.f70710a.f70684a;
        to3Var.f386627d = i17;
        to3Var.f386628e = i18;
        to3Var.f386629f = i19;
        to3Var.f386630g = str;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                linkedList2.add(x51.j1.i(str2));
            }
        }
        to3Var.f386631h = linkedList2.size();
        to3Var.f386632i = linkedList2;
        this.f189179e = new java.util.LinkedList();
        this.f189180f = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        this.f189181g = linkedList3;
        linkedList3.addAll(linkedList);
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "buf is null");
            return;
        }
        try {
            this.f189090d.f70711b.fromProtoBuf(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public int b() {
        return 4;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.u3
    public byte[] c() {
        try {
            return ((com.tencent.mm.modelbase.m) this.f189090d.getReqObj()).toProtoBuf();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final void d(com.tencent.mm.pluginsdk.model.app.m mVar, r45.m2 m2Var) {
        mVar.z0(m2Var.f380078f);
        mVar.y0(m2Var.f380079g);
        mVar.M = m2Var.f380082m;
        mVar.A = true;
        mVar.field_appName = m2Var.f380080h;
        mVar.field_appIconUrl = m2Var.f380081i;
        mVar.A0(m2Var.f380084o);
        mVar.f238380p0 = m2Var.f380086q;
        mVar.A = true;
        f(mVar, m2Var.f380085p);
    }

    public final void e(com.tencent.mm.pluginsdk.model.app.m mVar, r45.ti5 ti5Var) {
        mVar.z0(ti5Var.f386477h);
        mVar.field_appIconUrl = ti5Var.f386475f;
        mVar.I = ti5Var.f386479m;
        mVar.field_appName = ti5Var.f386474e;
        mVar.M = ti5Var.f386482p;
        mVar.A = true;
        mVar.field_appType = ti5Var.f386486t;
        mVar.y0(ti5Var.f386487u);
        mVar.field_packageName = ti5Var.f386488v;
        mVar.A0(ti5Var.f386491y);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ti5Var.f386491y)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "google play download url is : %s, download flag is %d", ti5Var.f386491y, java.lang.Integer.valueOf(ti5Var.D));
            mVar.w0(ti5Var.D);
        }
        mVar.R = ti5Var.f386492z;
        mVar.S = ti5Var.A;
        mVar.A = true;
        f(mVar, ti5Var.B);
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appType)) {
            return;
        }
        if (mVar.field_appType.startsWith("1") || mVar.field_appType.startsWith("6")) {
            if (!mVar.field_appType.endsWith(",")) {
                mVar.field_appType += ",";
            }
            mVar.field_appType = "," + mVar.field_appType;
        }
    }

    public final void f(com.tencent.mm.pluginsdk.model.app.m mVar, r45.og7 og7Var) {
        java.lang.String str = mVar.field_appId;
        if (og7Var != null) {
            mVar.w0(og7Var.f382245d);
            mVar.W = og7Var.f382246e;
            mVar.X = og7Var.f382247f;
            mVar.U = og7Var.f382248g;
            mVar.V = og7Var.f382249h;
            mVar.Y = og7Var.f382250i;
            mVar.Z = og7Var.f382251m;
            mVar.A = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", java.lang.Integer.valueOf(og7Var.f382245d), og7Var.f382246e, og7Var.f382247f, og7Var.f382248g, og7Var.f382249h, og7Var.f382250i, java.lang.Integer.valueOf(og7Var.f382251m));
        }
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean insert;
        boolean update;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + i18 + ", errCode = " + i19);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + i18 + ", errCode = " + i19);
            return;
        }
        r45.uo3 uo3Var = (r45.uo3) this.f189090d.f70711b.f70700a;
        if (uo3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "resp == null");
            return;
        }
        ((kt.a) ap3.e.a()).getClass();
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        java.util.LinkedList linkedList = uo3Var.f387527e;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ti5 ti5Var = (r45.ti5) it.next();
                if (com.tencent.mm.sdk.platformtools.t8.K0(ti5Var.f386473d)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "error appinfo, the appid is null");
                } else {
                    com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(ti5Var.f386473d);
                    int i27 = this.f189182h;
                    boolean z17 = true;
                    if (h17 != null) {
                        e(h17, ti5Var);
                        if (i27 == 3) {
                            h17.field_status = 5;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(h17.S) || com.tencent.mm.sdk.platformtools.t8.K0(h17.R)) {
                                java.lang.Object[] objArr = new java.lang.Object[2];
                                objArr[0] = java.lang.Boolean.valueOf(h17.S != null);
                                objArr[1] = java.lang.Boolean.valueOf(h17.R != null);
                                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", objArr);
                                update = false;
                                z17 = false;
                            } else {
                                update = Ri.update(h17, new java.lang.String[0]);
                            }
                        } else {
                            update = Ri.update(h17, new java.lang.String[0]);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", ti5Var.f386473d, java.lang.Boolean.valueOf(update), java.lang.Boolean.valueOf(z17));
                    } else {
                        h17 = new com.tencent.mm.pluginsdk.model.app.m();
                        h17.field_appId = ti5Var.f386473d;
                        e(h17, ti5Var);
                        if (i27 == 3) {
                            h17.field_status = 5;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(h17.S) || com.tencent.mm.sdk.platformtools.t8.K0(h17.R)) {
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[0] = java.lang.Boolean.valueOf(h17.S != null);
                                objArr2[1] = java.lang.Boolean.valueOf(h17.R != null);
                                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", objArr2);
                                insert = false;
                                z17 = false;
                            } else {
                                insert = Ri.insert(h17);
                            }
                        } else {
                            insert = Ri.insert(h17);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", ti5Var.f386473d, java.lang.Boolean.valueOf(insert), java.lang.Boolean.valueOf(z17));
                    }
                    if (z17 && !this.f189181g.contains(ti5Var.f386473d)) {
                        java.util.LinkedList linkedList2 = this.f189179e;
                        if (!linkedList2.contains(h17)) {
                            linkedList2.add(h17);
                        }
                    }
                }
            }
        }
        java.util.LinkedList linkedList3 = uo3Var.f387530h;
        if (linkedList3 == null || linkedList3.size() <= 0) {
            return;
        }
        java.util.Iterator it6 = linkedList3.iterator();
        while (it6.hasNext()) {
            r45.m2 m2Var = (r45.m2) it6.next();
            com.tencent.mm.pluginsdk.model.app.m h18 = com.tencent.mm.pluginsdk.model.app.w.h(m2Var.f380076d);
            if (h18 != null) {
                d(h18, m2Var);
                Ri.update(h18, new java.lang.String[0]);
            } else {
                h18 = new com.tencent.mm.pluginsdk.model.app.m();
                h18.field_appId = m2Var.f380076d;
                d(h18, m2Var);
                Ri.insert(h18);
            }
            this.f189180f.add(h18);
        }
    }
}
