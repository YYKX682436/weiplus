package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class y7 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f164775p = java.util.regex.Pattern.compile("(\n){3,}");

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f164776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f164777b;

    /* renamed from: c, reason: collision with root package name */
    public int f164778c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f164779d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f164780e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.TimeLineObject f164781f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.kj4 f164782g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f164783h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.SnsObject f164784i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.q1 f164785j;

    /* renamed from: k, reason: collision with root package name */
    public r45.vh4 f164786k;

    /* renamed from: l, reason: collision with root package name */
    public r45.y97 f164787l;

    /* renamed from: m, reason: collision with root package name */
    public int f164788m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f164789n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.ref.WeakReference f164790o;

    public y7(int i17, android.content.Context context) {
        com.tencent.mm.protocal.protobuf.TimeLineObject i18 = m21.y.i();
        this.f164781f = i18;
        r45.kj4 kj4Var = new r45.kj4();
        this.f164782g = kj4Var;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        this.f164783h = snsInfo;
        this.f164784i = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createAction", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.q1 q1Var = new r45.q1();
        q1Var.f383556m = new r45.m1();
        q1Var.f383558o = new r45.g8();
        q1Var.f383559p = new r45.a9();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAction", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164785j = q1Var;
        new r45.tf6();
        this.f164786k = new r45.vh4();
        this.f164787l = null;
        this.f164788m = 1;
        this.f164789n = "";
        java.lang.String sj6 = com.tencent.mm.plugin.sns.model.l4.sj();
        this.f164777b = i17;
        i18.ContentObj.f369837e = i17;
        if (context != null) {
            this.f164790o = new java.lang.ref.WeakReference(context);
        }
        i18.Privated = 0;
        i18.UserName = sj6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sns.model.l4.sj());
        sb6.append("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(java.lang.System.currentTimeMillis());
        kj4Var.f378744g = kk.k.g(sb6.toString().getBytes());
        kj4Var.f378741d = 0;
        kj4Var.f378742e = 0;
        kj4Var.f378743f = 0;
        kj4Var.f378747m = 0;
        kj4Var.f378748n = 0;
        kj4Var.f378750p = 0;
        kj4Var.f378752r = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
        snsObject.Id = 0L;
        snsObject.CreateTime = 0;
        snsObject.LikeFlag = 0;
        snsObject.Username = com.tencent.mm.plugin.sns.model.l4.sj();
        snsObject.LikeUserList = new java.util.LinkedList<>();
        snsObject.LikeCount = 0;
        snsObject.LikeUserListCount = 0;
        snsObject.WithUserList = new java.util.LinkedList<>();
        snsObject.WithUserCount = 0;
        snsObject.WithUserListCount = 0;
        snsObject.CommentUserList = new java.util.LinkedList<>();
        snsObject.CommentCount = 0;
        snsObject.CommentUserListCount = 0;
        snsObject.ExtFlag = 1;
        snsObject.LikeFlag = 0;
        snsObject.NoChange = 0;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        snsObject.ObjectDesc = cu5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164784i = snsObject;
        snsInfo.setPostWaiting();
        snsInfo.setCreateTime((int) (java.lang.System.currentTimeMillis() / 1000));
        snsInfo.setTypeFlag(i17);
        snsInfo.setUserName(sj6);
        snsInfo.setPravited(0);
        snsInfo.setStringSeq("0000099999999999999999999");
        snsInfo.addSourceFlag(2);
        snsInfo.setExtFlag();
        if (i17 == 1 || i17 == 2) {
            snsInfo.addSourceFlag(4);
        }
        if (i17 == 7) {
            snsInfo.removeSourceFlag(2);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f164780e = linkedList;
        kj4Var.f378751q = linkedList;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            r45.a96 a96Var = new r45.a96();
            a96Var.f369859d = longValue;
            this.f164784i.GroupList.add(a96Var);
        }
        this.f164784i.GroupCount = this.f164780e.size();
    }

    public com.tencent.mm.plugin.sns.model.y7 A(r45.ed4 ed4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (ed4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return this;
        }
        this.f164781f.Location = ed4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 B(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setObjDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164781f.ContentObj.f369836d = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setObjDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 C(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setObjTitle", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164781f.ContentObj.f369838f = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setObjTitle", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 D(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setObjUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164781f.ContentObj.f369839g = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setObjUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 E(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenSdkInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164788m = i17;
        this.f164789n = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenSdkInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public void F(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostFrom", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164782g.f378750p = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostFrom", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public com.tencent.mm.plugin.sns.model.y7 G(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrivated", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrivated", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public void H(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPublisherId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164782g.f378759y = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPublisherId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public com.tencent.mm.plugin.sns.model.y7 I(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f164781f;
        r45.y8 y8Var = timeLineObject.AppInfo;
        if (y8Var == null) {
            y8Var = new r45.y8();
        }
        y8Var.f390848f = str;
        timeLineObject.AppInfo = y8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 J(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSdkId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f164781f;
        r45.y8 y8Var = timeLineObject.AppInfo;
        if (y8Var == null) {
            y8Var = new r45.y8();
        }
        y8Var.f390846d = str;
        timeLineObject.AppInfo = y8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSdkId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public void K(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164782g.A = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public void L(m21.h hVar) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareFinderLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (hVar != null) {
            r45.g92 b17 = hVar.b();
            r45.a90 a90Var = this.f164781f.ContentObj;
            a90Var.f369848s = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genShareInfoForLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            try {
                r45.i46 i46Var = new r45.i46();
                i46Var.f376726e = 1;
                i46Var.f376725d = b17.getString(41);
                i46Var.f376727f = pm0.v.Z(b17.getString(2));
                str = android.util.Base64.encodeToString(i46Var.toByteArray(), 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genShareInfoForLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UploadPackHelper", e17, "genShareInfoForLive failed", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genShareInfoForLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                str = "";
            }
            a90Var.D = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareFinderLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public void M(m21.k kVar) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareFinderObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (kVar != null) {
            r45.kv2 kv2Var = kVar.f322992a;
            r45.a90 a90Var = this.f164781f.ContentObj;
            a90Var.f369844o = kv2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            try {
                r45.i46 i46Var = new r45.i46();
                i46Var.f376726e = 2;
                i46Var.f376725d = kv2Var.getString(27);
                i46Var.f376727f = pm0.v.Z(kv2Var.getString(0));
                str = android.util.Base64.encodeToString(i46Var.toByteArray(), 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UploadPackHelper", e17, "genShareInfoForLive failed", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                str = "";
            }
            a90Var.D = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareFinderObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public com.tencent.mm.plugin.sns.model.y7 N(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareSources", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164782g.f378752r = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareSources", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public void O(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsPostOperation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.y96 y96Var = new r45.y96();
        y96Var.f390893d = str;
        y96Var.f390894e = str2;
        y96Var.f390895f = str3;
        y96Var.f390896g = i17;
        y96Var.f390897h = i18;
        this.f164782g.f378758x = y96Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsPostOperation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public com.tencent.mm.plugin.sns.model.y7 P(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSourceNickName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f164781f.sourceNickName = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSourceNickName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 Q(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSourceUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f164781f.sourceUserName = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSourceUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 R(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStaticData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164781f.statisticsData = str;
        this.f164785j.f383556m.f380055e = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStaticData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 S(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSyncFlag", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164782g.f378742e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncFlag", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 T(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThirdAppMsg", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.q1 q1Var = this.f164785j;
        r45.m1 m1Var = q1Var.f383556m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        m1Var.f380054d = str;
        r45.m1 m1Var2 = q1Var.f383556m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "";
        }
        m1Var2.f380056f = str2;
        r45.m1 m1Var3 = q1Var.f383556m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = "";
        }
        m1Var3.f380057g = str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThirdAppMsg", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 U(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTwitterInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.kj4 kj4Var = this.f164782g;
        kj4Var.f378754t = str;
        kj4Var.f378755u = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTwitterInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public void V(java.util.List list) {
        boolean z17;
        boolean fj6;
        r45.lj4 lj4Var;
        float f17;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "setUploadList: elements size=%d", java.lang.Integer.valueOf(list.size()));
        this.f164776a = list;
        java.util.List<ca4.w0> K1 = com.tencent.mm.plugin.sns.model.l4.Hj().K1(this.f164776a);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (K1 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "setUploadList: elements list null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int i19 = 0;
        int i27 = 0;
        for (ca4.w0 w0Var : K1) {
            r45.ec4 ec4Var = new r45.ec4();
            ec4Var.f373266d = w0Var.f40038f;
            linkedList.add(ec4Var);
            com.tencent.mm.plugin.sns.model.g6.f164210a.a(java.lang.String.valueOf(ec4Var.f373266d), w0Var.f40049q);
            if (w0Var.f40053u != null) {
                i19++;
            }
            if (!android.text.TextUtils.isEmpty(w0Var.f40055w)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(ya.b.INDEX, i27);
                    jSONObject.put("yb_template_id", w0Var.f40055w);
                    jSONArray.put(jSONObject);
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "yuanbao write json error");
                }
            }
            i27++;
        }
        dx1.f fVar = dx1.g.f244489a;
        fVar.i("SnsPublishProcess", "is_have_goods_btn", java.lang.Integer.valueOf(i19));
        fVar.i("SnsPublishProcess", "yb_retouch_list", jSONArray.toString().replace(",", ";"));
        r45.kj4 kj4Var = this.f164782g;
        kj4Var.f378745h = linkedList;
        java.util.Iterator it = K1.iterator();
        int i28 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f164781f;
            if (!hasNext) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "setUploadList: MediaObjList size=%d, postinfo LocalMediaId size=%d", java.lang.Integer.valueOf(timeLineObject.ContentObj.f369840h.size()), java.lang.Integer.valueOf(kj4Var.f378745h.size()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                return;
            }
            ca4.w0 w0Var2 = (ca4.w0) it.next();
            r45.lj4 lj4Var2 = new r45.lj4();
            lj4Var2.f379521e = 0.0f;
            lj4Var2.f379520d = 0.0f;
            lj4Var2.f379522f = 0.0f;
            int i29 = w0Var2.f40040h;
            if (i29 > 0 && (i17 = w0Var2.f40039g) > 0 && (i18 = w0Var2.f40041i) > 0) {
                lj4Var2.f379521e = i29;
                lj4Var2.f379520d = i17;
                lj4Var2.f379522f = i18;
            }
            r45.jj4 g17 = m21.y.g("Locall_path" + w0Var2.f40038f, w0Var2.f40037e, "", "", 0, 0, this.f164778c, "", lj4Var2, w0Var2.f40050r, w0Var2.f40053u, null, w0Var2.f40054v, w0Var2.f40055w);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            if (gm0.j1.a()) {
                z17 = false;
                int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
                fj6 = r17 != 1 ? r17 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false) : false : true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
                fj6 = false;
                z17 = false;
            }
            if (fj6) {
                java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(g17);
                g17.f377858g = com.tencent.mm.vfs.w6.i(l17, z17);
                g17.f377856e = ca4.z0.C(l17);
                g17.f377860i = com.tencent.mm.vfs.w6.i(com.tencent.mm.plugin.sns.model.i1.u(g17), z17);
            }
            ca4.w0 w0Var3 = w0Var2.f40051s;
            if (w0Var3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "livePhotoElement != null >> path: %s thumbPath: %s，fileSize: %d, height: %d, width: %d coverTimeStamps: %d", w0Var3.f40033a, w0Var3.f40045m, java.lang.Integer.valueOf(w0Var3.f40041i), java.lang.Integer.valueOf(w0Var3.f40040h), java.lang.Integer.valueOf(w0Var3.f40039g), java.lang.Long.valueOf(w0Var3.f40052t));
                r45.jj4 f18 = m21.y.f();
                if (w0Var3.f40040h <= 0 || w0Var3.f40039g <= 0 || w0Var3.f40041i <= 0) {
                    lj4Var = null;
                } else {
                    lj4Var = new r45.lj4();
                    lj4Var.f379521e = w0Var3.f40040h;
                    lj4Var.f379520d = w0Var3.f40039g;
                    lj4Var.f379522f = w0Var3.f40041i;
                }
                f18.f377855d = "Locall_path" + w0Var3.f40038f;
                f18.f377865p = lj4Var;
                f18.f377870s = w0Var3.f40038f;
                f18.Z = w0Var3.f40052t;
                dw3.d0 a17 = dw3.e0.f244202a.a(w0Var3.f40033a);
                if (a17 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "addLivePhoto commit video_info:" + a17);
                    f17 = ((float) a17.f244192c) / 1000.0f;
                } else {
                    f17 = 0.0f;
                }
                f18.R = f17;
                g17.X = f18;
            }
            g17.Y = i28;
            timeLineObject.ContentObj.f369840h.add(g17);
            i28++;
        }
    }

    public com.tencent.mm.plugin.sns.model.y7 W(java.util.LinkedList linkedList) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWithList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164779d = linkedList;
        this.f164782g.f378746i = linkedList;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            snsObject = this.f164784i;
            if (!hasNext) {
                break;
            }
            r45.jb6 jb6Var = (r45.jb6) it.next();
            r45.e86 e86Var = new r45.e86();
            e86Var.f373126d = jb6Var.f377690d;
            snsObject.WithUserList.add(e86Var);
            if (com.tencent.mm.plugin.sns.model.j4.a()) {
                r45.du5 du5Var = new r45.du5();
                du5Var.c(e86Var.f373126d);
                snsObject.WithTaList.add(du5Var);
                snsObject.NewWithTaList.add(e86Var);
            }
        }
        if (com.tencent.mm.plugin.sns.model.j4.a() && snsObject.NewWithTaListCount != this.f164779d.size()) {
            snsObject.NewWithTaListCount = this.f164779d.size();
        }
        snsObject.WithUserCount = this.f164779d.size();
        snsObject.WithUserListCount = this.f164779d.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWithList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public boolean a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        java.lang.String str3 = com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g(str.getBytes());
        h(str3);
        com.tencent.mm.vfs.w6.c(str, str3);
        r45.jj4 o17 = o("", 2, str3);
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        o17.f377857f = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17.f377864o)) {
            o17.f377864o = str2;
        }
        this.f164781f.ContentObj.f369840h.add(o17);
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f373266d = o17.f377870s;
        this.f164782g.f378745h.add(ec4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    public boolean b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 p17 = p("", 2, str, str2);
        p17.f377857f = str3;
        if (i17 > 0) {
            p17.f377873v = i17;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            p17.f377872u = str4;
        }
        this.f164781f.ContentObj.f369840h.add(p17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    public boolean c(byte[] bArr, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        boolean d17 = d(bArr, str, str2, -1, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return d17;
    }

    public boolean d(byte[] bArr, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 n17 = n("", 2, bArr);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "share img o.data is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        n17.f377857f = str;
        if (i17 > 0) {
            n17.f377873v = i17;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            n17.f377872u = str3;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            n17.f377864o = str2;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            n17.f377857f = str;
        }
        this.f164781f.ContentObj.f369840h.add(n17);
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f373266d = n17.f377870s;
        this.f164782g.f378745h.add(ec4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    public boolean e(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 n17 = n("", 2, bArr);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "share music/video  appmsg.thumbData is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "share music/video url is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f164781f;
        if (!K0) {
            timeLineObject.ContentObj.f369839g = str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            n17.f377858g = str3;
            n17.f377859h = 0;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            n17.f377858g = str2;
            n17.f377859h = 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            n17.f377868q = str2;
            n17.f377869r = 0;
        }
        n17.f377856e = i17;
        if (str4 == null) {
            str4 = "";
        }
        n17.f377864o = str4;
        if (str5 == null) {
            str5 = "";
        }
        n17.f377857f = str5;
        n17.P = str6;
        n17.Q = str7;
        timeLineObject.ContentObj.f369840h.add(n17);
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f373266d = n17.f377870s;
        this.f164782g.f378745h.add(ec4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    public boolean f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        dw3.d0 a17 = dw3.e0.f244202a.a(str);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "addSightObjectByPath commit video_info:" + a17);
            f17 = ((float) a17.f244192c) / 1000.0f;
        } else {
            f17 = 0.0f;
        }
        float f18 = f17;
        java.lang.String str5 = com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g(str.getBytes());
        h(str5);
        com.tencent.mm.vfs.w6.c(str, str5);
        java.lang.String str6 = com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g(str2.getBytes());
        com.tencent.mm.vfs.w6.c(str2, str6);
        int i17 = this.f164777b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 q17 = q("", 6, str5, str6, str4, "", "", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (q17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        q17.f377857f = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(q17.f377864o)) {
            q17.f377864o = str3;
        }
        q17.R = f18;
        this.f164781f.ContentObj.f369840h.add(q17);
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f373266d = q17.f377870s;
        this.f164782g.f378745h.add(ec4Var);
        com.tencent.mm.plugin.sns.model.g6 g6Var = com.tencent.mm.plugin.sns.model.g6.f164210a;
        g6Var.a(java.lang.String.valueOf(q17.f377870s), g6Var.b(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    public void g(r45.ea6 ea6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSnsReportInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("||index: ");
        r45.kj4 kj4Var = this.f164782g;
        sb6.append(kj4Var.f378760z.size());
        stringBuffer.append(sb6.toString());
        stringBuffer.append("||item poi lat " + ea6Var.f373197f + " " + ea6Var.f373198g);
        stringBuffer.append("||item pic lat " + ea6Var.f373195d + " " + ea6Var.f373196e);
        stringBuffer.append("||item exitime:" + ea6Var.f373200i + " filetime: " + ea6Var.f373201m);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("||item source: ");
        sb7.append(ea6Var.f373199h);
        stringBuffer.append(sb7.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "addSnsReportInfo item : " + stringBuffer.toString());
        kj4Var.f378760z.add(ea6Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsReportInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public final void h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public int i() {
        int i17;
        r45.m1 m1Var;
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = this.f164781f.ContentObj.f369840h;
        int i18 = 0;
        if (linkedList != null) {
            i17 = linkedList.size();
            for (int i19 = 0; i19 < i17; i19++) {
                if (((r45.jj4) this.f164781f.ContentObj.f369840h.get(i19)) != null) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                }
            }
        } else {
            i17 = 0;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo m17 = m();
        int t37 = com.tencent.mm.plugin.sns.model.l4.Fj().t3(m17);
        if (this.f164777b != 7) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).h7(t37, o75.b.f343582c);
        }
        int i27 = this.f164781f.ContentObj.f369837e;
        com.tencent.mm.plugin.sns.statistics.u0 u0Var = com.tencent.mm.plugin.sns.statistics.v0.f164987a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSendQueue", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.statistics.u0 u0Var2 = com.tencent.mm.plugin.sns.statistics.v0.f164987a;
        com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct snsUploadReportStruct = u0Var2.f164979a;
        long j17 = t37;
        snsUploadReportStruct.f60748d = j17;
        snsUploadReportStruct.f60752h = i17;
        snsUploadReportStruct.f60751g = i27;
        u0Var2.f164981c = currentTimeMillis;
        snsUploadReportStruct.f60760p = currentTimeMillis - u0Var2.f164980b;
        snsUploadReportStruct.f60753i = 2L;
        com.tencent.mm.plugin.sns.statistics.v0.b(u0Var2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSendQueue", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        com.tencent.mm.plugin.sns.model.l4.Dj().z0(t37);
        java.util.Iterator it = this.f164782g.f378745h.iterator();
        java.lang.String str = null;
        int i28 = 0;
        while (it.hasNext()) {
            r45.ec4 ec4Var = (r45.ec4) it.next();
            com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(ec4Var.f373266d);
            try {
                r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
                r45.y8 y8Var = this.f164781f.AppInfo;
                if (y8Var != null) {
                    mj4Var.f380580x = y8Var.f390846d;
                }
                r45.q1 q1Var = this.f164785j;
                if (q1Var != null && (m1Var = q1Var.f383556m) != null && !com.tencent.mm.sdk.platformtools.t8.K0(m1Var.f380054d)) {
                    mj4Var.f380580x = this.f164785j.f383556m.f380054d;
                }
                r45.vh4 vh4Var = this.f164786k;
                if (vh4Var != null) {
                    vh4Var.f388236f = i18;
                }
                mj4Var.B = vh4Var;
                int i29 = this.f164781f.ContentObj.f369837e;
                mj4Var.f380581y = i29;
                if (i29 == 1 || i29 == 15 || i29 == 54) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(mj4Var.f380580x)) {
                        r45.vh4 vh4Var2 = mj4Var.B;
                        if (vh4Var2 == null || mj4Var.f380581y != 15) {
                            mj4Var.C = ((ca4.w0) this.f164776a.get(i28)).f40047o ? 1 : 2;
                        } else {
                            mj4Var.C = vh4Var2.f388235e ? 1 : 2;
                        }
                    } else {
                        mj4Var.C = 5;
                    }
                }
                n17.m(mj4Var.toByteArray());
                com.tencent.mm.plugin.sns.model.l4.Hj().Y2(ec4Var.f373266d, n17);
                str = mj4Var.f380579w;
                if (mj4Var.f380581y == 54 && t37 > 0) {
                    if (mj4Var.D != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "localId: %d is MMSNS_OBJECT_PHOTO_EX index: %d is LivePhoto go to add Video", java.lang.Integer.valueOf(t37), java.lang.Integer.valueOf(i28));
                    }
                    com.tencent.mm.plugin.sns.model.y6.x(com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17), str, i28);
                }
                i28++;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            }
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s", java.lang.Integer.valueOf(t37), java.lang.Integer.valueOf(this.f164783h.getTypeFlag()), str);
        if (t37 > 0 && this.f164783h.getTypeFlag() == 15) {
            java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17);
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.sns.model.y6.f164773a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            com.tencent.mm.plugin.sns.model.y6.x(j18, str, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        }
        oi0.e.f345591d.c(t37, m17);
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (t37 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        } else {
            java.lang.ref.WeakReference weakReference = this.f164790o;
            if (weakReference == null || weakReference.get() == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else {
                wa4.u uVar = (wa4.u) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai((android.content.Context) weakReference.get(), 2, wa4.u.class);
                if (uVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                } else {
                    uVar.f444286e = t37;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            }
        }
        int i37 = this.f164784i.ExtFlag;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return t37;
    }

    public void j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSpringContent", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.a90 a90Var = this.f164781f.ContentObj;
        xa4.g gVar = xa4.g.f452830d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildXmlSpringFestivalNode", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.fd6 fd6Var = new r45.fd6();
        fd6Var.f374245f = 2025;
        fd6Var.f374244e = i17;
        int i18 = xa4.g.f452833g.f375142d;
        if (i18 == 0 || i18 == 1 || i18 == 2) {
            fd6Var.f374243d = xa4.g.r();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildDragon2024:");
        sb6.append(fd6Var.f374243d == null);
        sb6.append(", Source:");
        sb6.append(i17);
        sb6.append(" Year:2025");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpringLogic", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildXmlSpringFestivalNode", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        a90Var.B = fd6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSpringContent", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public final void k(bw5.nk0 nk0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillCommonVisibilityInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        boolean isEmpty = nk0Var.f30714g.isEmpty();
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f164784i;
        if (!isEmpty) {
            snsObject.ExtFlag |= 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = nk0Var.f30714g.iterator();
            while (it.hasNext()) {
                arrayList.add(((bw5.ok0) it.next()).b());
            }
            java.util.LinkedList<r45.du5> k17 = ca4.f1.k(arrayList);
            snsObject.GroupUser = k17;
            snsObject.GroupUserCount = k17.size();
        }
        if (!nk0Var.f30712e.isEmpty()) {
            snsObject.ExtFlag |= 512;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = nk0Var.f30712e.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf((int) ((bw5.pk0) it6.next()).f31708d));
            }
            java.util.LinkedList<java.lang.Integer> linkedList = new java.util.LinkedList<>(new java.util.HashSet(arrayList2));
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "setLabelInfo:%s", com.tencent.mm.sdk.platformtools.t8.v0(linkedList));
            snsObject.GroupContactTagIdListCount = linkedList.size();
            snsObject.GroupContactTagIdList = linkedList;
        }
        if (!nk0Var.f30720p.isEmpty()) {
            snsObject.ExtFlag |= 2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = nk0Var.f30720p.iterator();
            while (it7.hasNext()) {
                arrayList3.add(((bw5.ok0) it7.next()).b());
            }
            java.util.LinkedList<r45.du5> k18 = ca4.f1.k(arrayList3);
            snsObject.BlackList = k18;
            snsObject.BlackListCount = k18.size();
        }
        if (!nk0Var.f30718n.isEmpty()) {
            snsObject.ExtFlag |= 1024;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it8 = nk0Var.f30718n.iterator();
            while (it8.hasNext()) {
                arrayList4.add(java.lang.Integer.valueOf((int) ((bw5.pk0) it8.next()).f31708d));
            }
            java.util.LinkedList<java.lang.Integer> linkedList2 = new java.util.LinkedList<>(new java.util.HashSet(arrayList4));
            snsObject.BlackContactTagIdListCount = linkedList2.size();
            snsObject.BlackContactTagIdList = linkedList2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillCommonVisibilityInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this.f164777b;
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo m() {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f164784i;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f164783h;
        r45.kj4 kj4Var = this.f164782g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        try {
            kj4Var.f378749o = java.lang.System.currentTimeMillis();
            kj4Var.f378748n = 0;
            r45.s15 s15Var = new r45.s15();
            s15Var.f385401d = this.f164788m;
            s15Var.f385402e = this.f164789n;
            kj4Var.I = s15Var;
            snsInfo.setAttrBuf(snsObject.toByteArray());
            snsInfo.setPostBuf(kj4Var.toByteArray());
            snsObject.toString();
            kj4Var.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UploadPackHelper", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f164781f;
        timeLineObject.toString();
        r45.q1 q1Var = this.f164785j;
        if (q1Var != null) {
            timeLineObject.actionInfo = q1Var;
        }
        r45.y97 y97Var = this.f164787l;
        if (y97Var != null) {
            timeLineObject.webSearchInfo = y97Var;
        }
        snsInfo.setTimeLine(timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return snsInfo;
    }

    public final r45.jj4 n(java.lang.String str, int i17, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", fp.k.c() + " attachBuf is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        sb6.append(kk.k.g((" " + java.lang.System.currentTimeMillis()).getBytes()));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.sns.model.l4.Ni());
        fp.k.c();
        if (com.tencent.mm.vfs.w6.S(sb7, bArr, 0, bArr.length) >= 0) {
            r45.jj4 o17 = o(str, i17, sb7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return o17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", fp.k.c() + " writeFile error file:" + sb7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return null;
    }

    public final r45.jj4 o(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 f17 = m21.y.f();
        f17.f377855d = str;
        f17.f377856e = i17;
        r45.lj4 lj4Var = null;
        if (com.tencent.mm.vfs.w6.k(str2) <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        sb6.append(kk.k.g((str2 + java.lang.System.currentTimeMillis()).getBytes()));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.c(str2, sb7);
        ca4.w0 w0Var = new ca4.w0(sb7, 2);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(w0Var);
        java.util.List K1 = com.tencent.mm.plugin.sns.model.l4.Hj().K1(linkedList);
        if (K1 != null) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) K1;
            if (linkedList2.size() != 0) {
                ca4.w0 w0Var2 = (ca4.w0) linkedList2.get(0);
                if (w0Var2.f40040h > 0 && w0Var2.f40039g > 0 && w0Var2.f40041i > 0) {
                    lj4Var = new r45.lj4();
                    lj4Var.f379521e = w0Var2.f40040h;
                    lj4Var.f379520d = w0Var2.f40039g;
                    lj4Var.f379522f = w0Var2.f40041i;
                }
                f17.f377855d = "Locall_path" + w0Var2.f40038f;
                f17.f377865p = lj4Var;
                f17.f377870s = w0Var2.f40038f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                return f17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return null;
    }

    public final r45.jj4 p(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 f17 = m21.y.f();
        f17.f377855d = str;
        f17.f377856e = i17;
        f17.f377858g = str2;
        f17.f377859h = 0;
        f17.f377860i = str3;
        f17.f377862m = 0;
        f17.f377871t = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return f17;
    }

    public final r45.jj4 q(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 f17 = m21.y.f();
        f17.f377855d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", java.lang.Integer.valueOf(i17), str2, str4, str5, str6);
        f17.f377856e = i17;
        r45.lj4 lj4Var = null;
        if (com.tencent.mm.vfs.w6.k(str2) <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        ca4.w0 w0Var = new ca4.w0(str2, 6);
        w0Var.f40046n = str4;
        w0Var.f40048p = i18;
        com.tencent.mm.plugin.sns.model.l4.Hj().P1(w0Var, str2, str3, str5, str6);
        if (w0Var.f40040h > 0 && w0Var.f40039g > 0 && w0Var.f40041i > 0) {
            lj4Var = new r45.lj4();
            lj4Var.f379521e = w0Var.f40040h;
            lj4Var.f379520d = w0Var.f40039g;
            lj4Var.f379522f = w0Var.f40041i;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            z17 = true;
            if (r17 != 1) {
                if (r17 != 2) {
                    z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
                } else {
                    z17 = false;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            z17 = false;
        }
        if (z17) {
            f17.f377858g = com.tencent.mm.vfs.w6.i(str2, false);
            f17.f377860i = com.tencent.mm.vfs.w6.i(str3, false);
        }
        f17.f377855d = "Locall_path" + w0Var.f40038f;
        f17.f377865p = lj4Var;
        f17.f377870s = w0Var.f40038f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return f17;
    }

    public void r(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppBrandUsername", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164781f.weappInfo.f390864d = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppBrandUsername", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    public com.tencent.mm.plugin.sns.model.y7 s(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanvasInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f164781f.canvasInfo = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanvasInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 t(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentDes", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (str == null) {
            str = "";
        }
        try {
            str = f164775p.matcher(str.trim().replace(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, "\n")).replaceAll("\n\n");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadPackHelper", "filter desc error ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        this.f164781f.ContentDesc = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentDes", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 u(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentTypeScene", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f164781f;
        timeLineObject.contentDescShowType = i17;
        timeLineObject.contentDescScene = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentTypeScene", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 v(java.util.List list, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEcsMediaShareFromInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (list != null && !list.isEmpty() && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            r45.a90 a90Var = this.f164781f.ContentObj;
            java.lang.String str2 = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genEcsMediaShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            try {
                r45.i46 i46Var = new r45.i46();
                i46Var.f376726e = 4;
                i46Var.f376725d = str;
                if (list.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.UploadPackHelper", "genEcsMediaShareInfoForFeed ecsMediaJumpInfoList is empty");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genEcsMediaShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                } else {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        java.lang.String str3 = (java.lang.String) it.next();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.UploadPackHelper", "genEcsMediaShareInfoForFeed ecsMediaJumpInfo is null or empty");
                        } else {
                            linkedList.add(str3);
                        }
                    }
                    i46Var.f376731m = linkedList;
                    str2 = android.util.Base64.encodeToString(i46Var.toByteArray(), 2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genEcsMediaShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UploadPackHelper", e17, "genEcsMediaShareInfoForFeed failed", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genEcsMediaShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            }
            a90Var.D = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEcsMediaShareFromInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 w(r45.lh0 lh0Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEcsShareInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.a90 a90Var = this.f164781f.ContentObj;
        a90Var.F = lh0Var;
        if (lh0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genEcsShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            try {
                r45.i46 i46Var = new r45.i46();
                i46Var.f376726e = 4;
                i46Var.f376725d = lh0Var.f379477h;
                i46Var.f376730i = com.tencent.mm.sdk.platformtools.t8.V(lh0Var.f379475f, 0L);
                str = android.util.Base64.encodeToString(i46Var.toByteArray(), 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genEcsShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UploadPackHelper", e17, "genEcsShareInfoForFeed failed", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genEcsShareInfoForFeed", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                str = "";
            }
            a90Var.D = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEcsShareInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 x(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupIds", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupIds", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 y(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupUser", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupUser", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    public com.tencent.mm.plugin.sns.model.y7 z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsBlackGroup", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsBlackGroup", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }
}
