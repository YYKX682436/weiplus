package sm4;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409926d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409927e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.in6 f409928f;

    /* renamed from: g, reason: collision with root package name */
    public final long f409929g;

    /* JADX WARN: Multi-variable type inference failed */
    public b(r45.in6 in6Var, int i17) {
        r45.qn6 qn6Var;
        java.lang.String str;
        int i18;
        com.tencent.mm.protobuf.g byteString;
        java.lang.String str2 = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStory", "Create NetSceneTopStory Home channelId:%s, %s %s %s", java.lang.Integer.valueOf(in6Var.f377194s), java.lang.Integer.valueOf(i17), in6Var.f377191p, in6Var.f377183e);
        this.f409929g = java.lang.System.currentTimeMillis();
        this.f409928f = in6Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1943;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/mmwebrecommend";
        lVar.f70664a = new r45.r97();
        lVar.f70665b = new r45.s97();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409927e = a17;
        r45.r97 r97Var = (r45.r97) a17.f70710a.f70684a;
        r97Var.f384663d = in6Var.f377185g;
        r97Var.f384664e = com.tencent.mm.plugin.websearch.l2.a(1);
        r97Var.f384666g = in6Var.f377186h;
        r97Var.f384667h = su4.r2.i();
        r97Var.f384668i = in6Var.f377187i;
        r97Var.f384669m = in6Var.f377182d;
        java.util.LinkedList linkedList = r97Var.f384672p;
        linkedList.addAll(in6Var.f377190o);
        r97Var.f384675s = in6Var.f377194s;
        r97Var.f384681y = i17;
        r97Var.f384682z = in6Var.A;
        r97Var.f384673q = in6Var.f377183e;
        java.lang.String str3 = in6Var.B;
        str3 = com.tencent.mm.sdk.platformtools.t8.K0(str3) ? in6Var.C : str3;
        if (pm4.w.m(in6Var.f377194s)) {
            r45.qn6 qn6Var2 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346433a;
            if (qn6Var2 != null) {
                str3 = qn6Var2.f384113d;
            }
        } else if (pm4.w.l(in6Var.f377194s)) {
            r45.qn6 qn6Var3 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346434b;
            if (qn6Var3 != null) {
                str3 = qn6Var3.f384113d;
            }
        } else if (pm4.w.n(in6Var.f377194s) && (qn6Var = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346435c) != null) {
            str3 = qn6Var.f384113d;
        }
        r97Var.f384677u = str3;
        r97Var.f384676t = in6Var.f377195t;
        r97Var.f384678v = in6Var.f377200y;
        r97Var.C = j65.e.b() ? 1 : 0;
        r97Var.D = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() ? 1 : 0;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("oaid", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
            ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
            jSONObject.put("imei", "");
            jSONObject.put("devIdInfo", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai());
            int i19 = o45.wf.f343023a;
            jSONObject.put("device_type", wo.q.f447780a);
            str = jSONObject.toString();
        } catch (org.json.JSONException unused) {
            str = "";
        }
        r97Var.E = str;
        r45.x50 x50Var = new r45.x50();
        x50Var.f389788d = "client_system_version";
        x50Var.f389789e = android.os.Build.VERSION.SDK_INT;
        linkedList.add(x50Var);
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f389788d = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE;
        x50Var2.f389790f = com.tencent.mm.plugin.websearch.l2.b();
        linkedList.add(x50Var2);
        r45.x50 x50Var3 = new r45.x50();
        x50Var3.f389788d = "client_request_time";
        x50Var3.f389790f = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        linkedList.add(x50Var3);
        r45.x50 x50Var4 = new r45.x50();
        x50Var4.f389788d = "clicfg_topstory_top_tab_params";
        x50Var4.f389790f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_topstory_top_tab_params_3, "{\"tabs\":[{\"wording\":\"在看\",\"wording_cn\":\"在看\",\"wording_en\":\"Wow\",\"wording_hk\":\"在看\",\"wording_tw\":\"在看\",\"category\":700,\"showWhenRedDot\":1,\"tabInfo\":\"{\\\"category\\\":700}\",\"bypass\":\"700\"},{\"wording\":\"热点\",\"wording_cn\":\"热点\",\"wording_en\":\"Top\",\"wording_hk\":\"熱點\",\"wording_tw\":\"熱點\",\"category\":100,\"showWhenRedDot\":0,\"tabInfo\":\"{\\\"category\\\":100}\"}]}", true);
        linkedList.add(x50Var4);
        en3.v vVar = (en3.v) ((ra0.v) i95.n0.c(ra0.v.class));
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f255324d, "isNewLifeRedDotEntranceShow() called " + ra0.b0.f393463f);
        boolean z17 = ra0.b0.f393463f;
        ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).getClass();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
        if ((L0 != null && L0.e1()) != false) {
            r45.ez2 D0 = L0.D0();
            java.lang.String i27 = (D0 == null || (byteString = D0.getByteString(4)) == null) ? null : byteString.i();
            if (i27 != null) {
                str2 = i27;
            }
        }
        int i28 = in6Var.f377194s;
        ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).getClass();
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
        if ((L02 != null && L02.e1()) == true) {
            ((wm4.z) ((pm4.v) i95.n0.c(pm4.v.class))).getClass();
            i18 = wm4.u.h(L02);
        } else {
            i18 = 0;
        }
        boolean z18 = i28 == i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStory", "NetSceneTopStory: isNewLifeRedDotEntranceShow:%s,byPassInfo:%s enterCategory:%s redDotCategory:%s isEnterMatchRedDotCategory:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(str2)), java.lang.Integer.valueOf(in6Var.f377194s), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z18));
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && z18) {
            r45.x50 x50Var5 = new r45.x50();
            x50Var5.f389788d = "ReddotBypassInfo";
            x50Var5.f389790f = str2;
            linkedList.add(x50Var5);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.x50 x50Var6 = (r45.x50) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStory", "key: %s unit_value %s text_value %s", x50Var6.f389788d, java.lang.Long.valueOf(x50Var6.f389789e), x50Var6.f389790f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStory", "request params offset %d h5Version %d CheckDocListSize: %d", java.lang.Integer.valueOf(r97Var.f384663d), java.lang.Integer.valueOf(r97Var.f384664e), java.lang.Integer.valueOf(r97Var.f384678v.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        su4.k3.f(this.f409928f.f377187i, 2);
        this.f409926d = u0Var;
        return dispatch(sVar, this.f409927e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1943;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409929g));
        r45.in6 in6Var = this.f409928f;
        if (i19 == -1) {
            su4.k3.f(in6Var.f377187i, 4);
        } else if (i18 == 0 && i19 == 0) {
            su4.k3.f(in6Var.f377187i, 3);
        } else {
            su4.k3.f(in6Var.f377187i, 8);
        }
        this.f409926d.onSceneEnd(i18, i19, str, this);
    }
}
