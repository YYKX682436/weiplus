package om4;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public r45.qn6 f346433a;

    /* renamed from: b, reason: collision with root package name */
    public r45.qn6 f346434b;

    /* renamed from: c, reason: collision with root package name */
    public r45.qn6 f346435c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f346436d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public mf0.c0 f346437e;

    public p() {
        r45.qn6 qn6Var = new r45.qn6();
        this.f346434b = qn6Var;
        C(qn6Var);
        r45.qn6 qn6Var2 = this.f346434b;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_TOP_STORY_RED_XML_REC_STRING;
        java.lang.String str = (java.lang.String) c17.m(u3Var, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String[] split = str.split(",");
            if (split != null) {
                try {
                    if (split.length >= 13) {
                        p(qn6Var2, split);
                    }
                } catch (java.lang.Exception unused) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_RED_XML_REC_STRING, "");
                    gm0.j1.u().c().i(true);
                }
            }
            gm0.j1.u().c().x(u3Var, "");
            gm0.j1.u().c().i(true);
        }
        r45.qn6 qn6Var3 = new r45.qn6();
        this.f346433a = qn6Var3;
        C(qn6Var3);
        r45.qn6 qn6Var4 = this.f346433a;
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING;
        java.lang.String str2 = (java.lang.String) c18.m(u3Var2, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.String[] split2 = str2.split(",");
            if (split2 != null) {
                try {
                    if (split2.length >= 13) {
                        p(qn6Var4, split2);
                    }
                } catch (java.lang.Exception unused2) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING, "");
                    gm0.j1.u().c().i(true);
                }
            }
            gm0.j1.u().c().x(u3Var2, "");
            gm0.j1.u().c().i(true);
        }
        r45.qn6 qn6Var5 = new r45.qn6();
        this.f346435c = qn6Var5;
        C(qn6Var5);
        r45.qn6 qn6Var6 = this.f346435c;
        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VIDEO_TAB_RED_XML_REC_STRING;
        java.lang.String str3 = (java.lang.String) c19.m(u3Var3, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            java.lang.String[] split3 = str3.split(",");
            if (split3 != null) {
                try {
                    if (split3.length >= 13) {
                        p(qn6Var6, split3);
                    }
                } catch (java.lang.Exception unused3) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VIDEO_TAB_RED_XML_REC_STRING, "");
                    gm0.j1.u().c().i(true);
                }
            }
            gm0.j1.u().c().x(u3Var3, "");
            gm0.j1.u().c().i(true);
        }
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_CMT_RED_XML_REC_STRING, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            return;
        }
        try {
            for (java.lang.String str5 : str4.split(";")) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    java.lang.String[] split4 = str5.split(",");
                    r45.qn6 qn6Var7 = new r45.qn6();
                    p(qn6Var7, split4);
                    this.f346436d.addLast(qn6Var7);
                }
            }
        } catch (java.lang.Exception unused4) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_CMT_RED_XML_REC_STRING, "");
            gm0.j1.u().c().i(true);
        }
    }

    public long A() {
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, ""))) {
            return 0L;
        }
        try {
            return new org.json.JSONObject(r0).optInt("ts", 0);
        } catch (org.json.JSONException unused) {
            return 0L;
        }
    }

    public int B(r45.qn6 qn6Var, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(qn6Var.f384113d)) {
            return -5;
        }
        boolean z17 = true;
        if (qn6Var.f384123q == 1) {
            return -1;
        }
        int i18 = qn6Var.f384115f;
        if (i18 > o45.wf.f343029g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s clientVersion %d invalid ,curVer is %d", qn6Var.f384113d, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(o45.wf.f343029g));
            return -2;
        }
        long j17 = qn6Var.f384116g;
        if (j17 != 0) {
            if (java.lang.System.currentTimeMillis() > qn6Var.f384124r + (j17 * 1000)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s expired", qn6Var.f384113d);
                return -3;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.plugin.websearch.l2.a(1) >= qn6Var.f384117h);
        objArr[1] = java.lang.Integer.valueOf(qn6Var.f384117h);
        objArr[2] = java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1));
        objArr[3] = java.lang.Long.valueOf(qn6Var.f384121o);
        objArr[4] = java.lang.Long.valueOf(x());
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d", objArr);
        boolean z18 = com.tencent.mm.plugin.websearch.l2.a(1) >= qn6Var.f384117h;
        if (110 == i17) {
            z18 = z18 && this.f346434b.f384121o > x();
        }
        if (!z18) {
            z17 = false;
        } else if (!((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ai()) {
            ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        }
        return !z17 ? -4 : 0;
    }

    public final void C(r45.qn6 qn6Var) {
        qn6Var.f384120n = "";
        qn6Var.f384113d = "";
        qn6Var.f384119m = "";
    }

    public boolean D() {
        long j17 = c01.z1.j();
        boolean z17 = (67108864 & j17) == 0;
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        boolean f17 = u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "isShowRecEntry %s %s %s %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(isTeenMode), java.lang.Boolean.valueOf(f17));
        return (!z17 || isTeenMode || f17) ? false : true;
    }

    public final void E() {
        synchronized (this.f346436d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = this.f346436d.iterator();
            while (it.hasNext()) {
                sb6.append(q((r45.qn6) it.next()));
                sb6.append(";");
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_CMT_RED_XML_REC_STRING, sb6.toString());
            gm0.j1.u().c().i(true);
        }
    }

    public void F(r45.qn6 qn6Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "setHomeTabRedDot %s", qn6Var.f384113d);
        if (!D()) {
            su4.k3.i(qn6Var, 108, 1, 0, 0L, "");
        }
        try {
            org.json.JSONArray jSONArray = su4.o2.d("topstoryTopTabParam").getJSONArray("tabs");
            z17 = false;
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                if (pm4.w.m(jSONArray.getJSONObject(i17).getInt("category"))) {
                    break;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryRedDotImpl", "parse topstoryTopTabParam failed: %s", e17.getMessage());
        }
        z17 = true;
        if (z17) {
            su4.k3.i(qn6Var, 109, 1, 0, 0L, "no exist home tab");
        }
        if (g()) {
            return;
        }
        this.f346433a = qn6Var;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING, q(this.f346433a));
        gm0.j1.u().c().i(true);
        su4.k3.i(qn6Var, 101, 3, 0, 0L, "");
        mf0.c0 c0Var = this.f346437e;
        if (c0Var != null) {
            ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var).b(this.f346433a, 100);
        }
        new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent().e();
    }

    public void G(java.lang.String str, java.lang.String str2, long j17) {
        mf0.c0 c0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "setUserIconRedDot %s, extInfo %s", str, str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("msgId", str);
            jSONObject.put("extInfo", str2);
            jSONObject.put("ts", j17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryRedDotImpl", e17, "setUserIconRedDot error", new java.lang.Object[0]);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, jSONObject.toString());
        gm0.j1.u().c().i(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (c0Var = this.f346437e) == null) {
            return;
        }
        com.tencent.mm.plugin.topstory.ui.home.l0 l0Var = (com.tencent.mm.plugin.topstory.ui.home.l0) c0Var;
        l0Var.f175032a.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.k0(l0Var, str, j17));
    }

    public void H() {
        if (s() > 0) {
            r45.qn6 r17 = r();
            if (r17 != null) {
                su4.k3.j(r17.f384113d, r17.f384121o, 201, 2, s(), 0L, "", r17.f384126t);
                return;
            }
            return;
        }
        if (!b() || !d()) {
            if (b()) {
                r45.qn6 qn6Var = this.f346434b;
                su4.k3.j(qn6Var.f384113d, qn6Var.f384121o, 201, 1, 0, 0L, "", 0);
                return;
            } else {
                if (d()) {
                    r45.qn6 qn6Var2 = this.f346433a;
                    su4.k3.j(qn6Var2.f384113d, qn6Var2.f384121o, 201, 1, 0, 0L, "", 0);
                    return;
                }
                return;
            }
        }
        r45.qn6 qn6Var3 = this.f346433a;
        int i17 = qn6Var3.f384128v;
        r45.qn6 qn6Var4 = this.f346434b;
        int i18 = qn6Var4.f384128v;
        if (i17 > i18) {
            su4.k3.j(qn6Var3.f384113d, qn6Var3.f384121o, 201, 1, 0, 0L, "", 0);
            return;
        }
        if (i17 < i18) {
            su4.k3.j(qn6Var4.f384113d, qn6Var4.f384121o, 201, 1, 0, 0L, "", 0);
            return;
        }
        long j17 = qn6Var3.f384124r;
        long j18 = qn6Var4.f384124r;
        if (j17 > j18) {
            su4.k3.j(qn6Var3.f384113d, qn6Var3.f384121o, 201, 1, 0, 0L, "", 0);
        } else if (j17 < j18) {
            su4.k3.j(qn6Var4.f384113d, qn6Var4.f384121o, 201, 1, 0, 0L, "", 0);
        } else {
            su4.k3.j(qn6Var4.f384113d, qn6Var4.f384121o, 201, 1, 0, 0L, "", 0);
        }
    }

    public void I() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG, java.lang.Long.valueOf(c01.id.c()));
    }

    public void J(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateHaokanRedDotTimestamp %s", java.lang.Long.valueOf(j17));
        K(j17, true);
    }

    public void K(long j17, boolean z17) {
        r45.qn6 qn6Var = this.f346434b;
        if (qn6Var == null || com.tencent.mm.sdk.platformtools.t8.K0(qn6Var.f384113d)) {
            return;
        }
        long c17 = c01.id.c() / 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "rec updateRedDotTimestamp %d, cur %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c17));
        if (j17 < x() || j17 <= 0 || c17 + 3600 < j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateRedDotTimestamp invalid, getRedDotTimestamp:%s", java.lang.Long.valueOf(x()));
            return;
        }
        r45.qn6 qn6Var2 = this.f346434b;
        if (qn6Var2 != null) {
            long j18 = qn6Var2.f384121o;
            if (j17 < j18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateRedDotTimestamp invalid, showTime:%s", java.lang.Long.valueOf(j18));
                return;
            }
        }
        if (z17) {
            su4.k3.i(qn6Var2, 106, 1, 0, j17, "");
        }
        i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_REDDOT_TIMESTAMP_LONG, java.lang.Long.valueOf(j17));
        gm0.j1.u().c().i(true);
    }

    public final void L(r45.qn6 qn6Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(qn6Var.f384127u)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateInitTab %s", qn6Var.f384127u);
        try {
            if (new org.json.JSONObject(qn6Var.f384127u).optBoolean("has_wow_contents", true)) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 0);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public boolean a() {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG, 0L);
        long j17 = this.f346434b.f384124r;
        if (j17 >= t17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "canShowHaokanFindMoreEntryRedDot already click find more entry receiveTime:%s clickTime:%s", k35.m1.e(j17), k35.m1.e(t17));
        return false;
    }

    public boolean b() {
        int B = B(this.f346434b, 110);
        if (B == 0) {
            return D();
        }
        if (B != -3) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "canShowHaokanRedDot");
        su4.k3.i(this.f346434b, 104, 1, 0, 0L, "");
        i();
        return false;
    }

    public boolean c() {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG, 0L);
        long j17 = this.f346433a.f384124r;
        if (j17 >= t17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "canShowHomeFindMoreEntryRedDot already click find more entry receiveTime:%s clickTime:%s", k35.m1.e(j17), k35.m1.e(t17));
        return false;
    }

    public boolean d() {
        int B = B(this.f346433a, 100);
        if (B == 0) {
            return D();
        }
        if (B != -3) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearHomeTabRedDot");
        su4.k3.i(this.f346433a, 104, 1, 0, 0L, "");
        h();
        return false;
    }

    public boolean e() {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG, 0L);
        long j17 = this.f346435c.f384124r;
        if (j17 >= t17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "canShowVideoFindMoreEntryRedDot already click find more entry receiveTime:%s clickTime:%s", k35.m1.e(j17), k35.m1.e(t17));
        return false;
    }

    public boolean f() {
        int B = B(this.f346435c, ma1.i.CTRL_INDEX);
        if (B == 0) {
            return D();
        }
        if (B != -3) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearVideoTabRedDot");
        su4.k3.i(this.f346435c, 104, 1, 0, 0L, "");
        j();
        return false;
    }

    public final boolean g() {
        boolean z17 = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).f318216e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "checkIsTopStoryForeground() called isTopStoryForeground");
        }
        return z17;
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearHomeTabRedDot");
        r45.qn6 qn6Var = new r45.qn6();
        this.f346433a = qn6Var;
        C(qn6Var);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HOME_TAB_RED_XML_REC_STRING, "");
        gm0.j1.u().c().i(true);
    }

    public final void i() {
        r45.qn6 qn6Var = new r45.qn6();
        this.f346434b = qn6Var;
        C(qn6Var);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_RED_XML_REC_STRING, "");
        gm0.j1.u().c().i(true);
        mf0.c0 c0Var = this.f346437e;
        if (c0Var != null) {
            x();
            com.tencent.mm.plugin.topstory.ui.home.l0 l0Var = (com.tencent.mm.plugin.topstory.ui.home.l0) c0Var;
            com.tencent.mm.plugin.topstory.ui.home.j jVar = l0Var.f175032a;
            for (wm4.y yVar : jVar.f174999q) {
                if (pm4.w.l(yVar.f447318b)) {
                    jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.h0(l0Var, yVar));
                    return;
                }
            }
        }
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clearHomeTabRedDot");
        r45.qn6 qn6Var = new r45.qn6();
        this.f346435c = qn6Var;
        C(qn6Var);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VIDEO_TAB_RED_XML_REC_STRING, "");
        gm0.j1.u().c().i(true);
    }

    public void k(java.lang.String str, long j17, boolean z17, int i17, boolean z18) {
        if (this.f346436d.size() == 0) {
            return;
        }
        if (i17 <= t()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickCmtRedDot invalid, seq:%s, curSeq:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(t()));
            return;
        }
        int size = this.f346436d.size();
        java.lang.String str2 = "";
        synchronized (this.f346436d) {
            while (this.f346436d.size() > 0 && ((r45.qn6) this.f346436d.getFirst()).f384126t <= i17) {
                str2 = ((r45.qn6) this.f346436d.getFirst()).f384113d;
                this.f346436d.removeFirst();
            }
        }
        if (size != this.f346436d.size()) {
            E();
        }
        if (this.f346437e != null) {
            if (this.f346436d.size() > 0) {
                ((com.tencent.mm.plugin.topstory.ui.home.l0) this.f346437e).c(this.f346436d.size(), ((r45.qn6) this.f346436d.getFirst()).f384113d, ((r45.qn6) this.f346436d.getLast()).f384113d, ((r45.qn6) this.f346436d.getFirst()).f384126t, ((r45.qn6) this.f346436d.getLast()).f384126t, ((r45.qn6) this.f346436d.getLast()).f384127u, z17);
            } else {
                ((com.tencent.mm.plugin.topstory.ui.home.l0) this.f346437e).c(0, "", "", 0, 0, "", z17);
            }
        }
        if (z18) {
            r45.qn6 qn6Var = new r45.qn6();
            qn6Var.f384113d = str2;
            qn6Var.f384121o = j17;
            qn6Var.f384126t = i17;
            su4.k3.i(qn6Var, 106, 2, size, j17, "");
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_CMTREDDOT_TIMESTAMP_LONG, java.lang.Long.valueOf(j17));
        gm0.j1.u().c().i(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateCmtRedDotSeq %s", java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_CMTREDDOT_SEQ_INT, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().i(true);
    }

    public void l() {
        boolean z17;
        r45.qn6 qn6Var = this.f346433a;
        mf0.c0 c0Var = this.f346437e;
        if (c0Var != null) {
            z17 = ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var).a(100);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickHomeTabRedDot redDotListener = null");
            z17 = true;
        }
        if (z17) {
            su4.k3.i(qn6Var, 106, 3, 0, 0L, "");
        }
        h();
    }

    public void m() {
        boolean z17;
        r45.qn6 qn6Var = this.f346435c;
        mf0.c0 c0Var = this.f346437e;
        if (c0Var != null) {
            z17 = ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var).a(ma1.i.CTRL_INDEX);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickVideoTabRedDot redDotListener = null");
            z17 = true;
        }
        if (z17) {
            su4.k3.i(qn6Var, 106, 3, 0, 0L, "");
        }
        j();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x02d8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x039e  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(java.util.Map r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 2268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.p.n(java.util.Map, java.lang.String):void");
    }

    public final int o(r45.qn6 qn6Var, r45.qn6 qn6Var2, int i17) {
        int i18 = qn6Var.f384128v;
        int i19 = qn6Var2.f384128v;
        if (i18 > i19) {
            return w(qn6Var);
        }
        if (i18 >= i19 && qn6Var.f384124r >= qn6Var2.f384124r) {
            return w(qn6Var);
        }
        return w(qn6Var2);
    }

    public final void p(r45.qn6 qn6Var, java.lang.String[] strArr) {
        qn6Var.f384113d = strArr[0];
        qn6Var.f384123q = java.lang.Integer.valueOf(strArr[1]).intValue();
        qn6Var.f384115f = java.lang.Integer.valueOf(strArr[2]).intValue();
        qn6Var.f384122p = java.lang.Integer.valueOf(strArr[3]).intValue();
        qn6Var.f384114e = java.lang.Integer.valueOf(strArr[4]).intValue();
        qn6Var.f384116g = java.lang.Long.valueOf(strArr[5]).longValue();
        qn6Var.f384117h = java.lang.Integer.valueOf(strArr[6]).intValue();
        qn6Var.f384124r = java.lang.Long.valueOf(strArr[7]).longValue();
        qn6Var.f384119m = strArr[8];
        qn6Var.f384118i = java.lang.Integer.valueOf(strArr[9]).intValue();
        qn6Var.f384125s = java.lang.Integer.valueOf(strArr[10]).intValue();
        qn6Var.f384121o = java.lang.Long.valueOf(strArr[11]).longValue();
        qn6Var.f384120n = strArr[12];
        if (strArr.length > 13) {
            qn6Var.f384126t = java.lang.Integer.valueOf(strArr[13]).intValue();
        } else {
            qn6Var.f384126t = 0;
            if (qn6Var.f384118i == 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "no seq");
            }
        }
        if (strArr.length > 14) {
            qn6Var.f384127u = strArr[14];
        } else {
            qn6Var.f384127u = "";
        }
    }

    public java.lang.String q(r45.qn6 qn6Var) {
        return java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", qn6Var.f384113d, java.lang.Integer.valueOf(qn6Var.f384123q), java.lang.Integer.valueOf(qn6Var.f384115f), java.lang.Integer.valueOf(qn6Var.f384122p), java.lang.Integer.valueOf(qn6Var.f384114e), java.lang.Long.valueOf(qn6Var.f384116g), java.lang.Integer.valueOf(qn6Var.f384117h), java.lang.Long.valueOf(qn6Var.f384124r), qn6Var.f384119m, java.lang.Integer.valueOf(qn6Var.f384118i), java.lang.Integer.valueOf(qn6Var.f384125s), java.lang.Long.valueOf(qn6Var.f384121o), qn6Var.f384120n, java.lang.Integer.valueOf(qn6Var.f384126t), qn6Var.f384127u);
    }

    public r45.qn6 r() {
        synchronized (this.f346436d) {
            if (com.tencent.mm.sdk.platformtools.t8.L0(this.f346436d)) {
                return null;
            }
            return (r45.qn6) this.f346436d.getLast();
        }
    }

    public int s() {
        java.util.LinkedList linkedList = this.f346436d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCount %s", java.lang.Integer.valueOf(linkedList.size()));
        if (!((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            return linkedList.size();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCount: showNewK1KEntry, don't show old red dot count");
        return 0;
    }

    public int t() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_CMTREDDOT_SEQ_INT, null);
        if (m17 == null) {
            return -1;
        }
        return ((java.lang.Integer) m17).intValue();
    }

    public int u(int i17) {
        if (s() > 0) {
            return 110;
        }
        boolean b17 = b();
        boolean d17 = d();
        boolean f17 = f();
        if (!b17 || !d17 || !f17) {
            if (b17 && d17) {
                return o(this.f346434b, this.f346433a, i17);
            }
            if (b17 && f17) {
                return o(this.f346434b, this.f346435c, i17);
            }
            if (d17 && f17) {
                return o(this.f346435c, this.f346433a, i17);
            }
            if (b17) {
                return 110;
            }
            if (d17) {
                return 100;
            }
            return f17 ? ma1.i.CTRL_INDEX : i17;
        }
        int max = java.lang.Math.max(java.lang.Math.max(this.f346433a.f384128v, this.f346434b.f384128v), this.f346435c.f384128v);
        long max2 = java.lang.Math.max(java.lang.Math.max(this.f346433a.f384124r, this.f346434b.f384124r), this.f346435c.f384124r);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(this.f346433a.f384128v));
        hashSet.add(java.lang.Integer.valueOf(this.f346434b.f384128v));
        hashSet.add(java.lang.Integer.valueOf(this.f346435c.f384128v));
        if (hashSet.size() == 1) {
            if (this.f346433a.f384124r == max2) {
                return 100;
            }
            if (this.f346434b.f384124r == max2) {
                return 110;
            }
            if (this.f346435c.f384124r == max2) {
                return ma1.i.CTRL_INDEX;
            }
        }
        if (hashSet.size() == 2) {
            r45.qn6 qn6Var = this.f346433a;
            int i18 = qn6Var.f384128v;
            if (i18 == max) {
                r45.qn6 qn6Var2 = this.f346434b;
                if (qn6Var2.f384128v == max) {
                    return qn6Var.f384124r > qn6Var2.f384124r ? 100 : 110;
                }
                r45.qn6 qn6Var3 = this.f346435c;
                if (qn6Var3.f384128v != max || qn6Var.f384124r > qn6Var3.f384124r) {
                    return 100;
                }
                return ma1.i.CTRL_INDEX;
            }
            r45.qn6 qn6Var4 = this.f346434b;
            int i19 = qn6Var4.f384128v;
            if (i19 == max) {
                if (i18 == max) {
                    return qn6Var4.f384124r >= qn6Var.f384124r ? 110 : 100;
                }
                r45.qn6 qn6Var5 = this.f346435c;
                if (qn6Var5.f384128v != max || qn6Var4.f384124r >= qn6Var5.f384124r) {
                    return 110;
                }
                return ma1.i.CTRL_INDEX;
            }
            r45.qn6 qn6Var6 = this.f346435c;
            if (qn6Var6.f384128v == max) {
                if (i19 == max) {
                    if (qn6Var6.f384124r > qn6Var4.f384124r) {
                        return ma1.i.CTRL_INDEX;
                    }
                    return 110;
                }
                if (i18 != max || qn6Var6.f384124r >= qn6Var.f384124r) {
                    return ma1.i.CTRL_INDEX;
                }
                return 100;
            }
        }
        if (hashSet.size() == 3) {
            if (this.f346434b.f384128v == max) {
                return 110;
            }
            if (this.f346435c.f384128v == max) {
                return ma1.i.CTRL_INDEX;
            }
            if (this.f346433a.f384128v == max) {
                return 100;
            }
        }
        return i17;
    }

    public r45.qn6 v(int i17) {
        if (i17 == 100) {
            return this.f346433a;
        }
        if (i17 == 110) {
            return this.f346434b;
        }
        if (i17 != 666) {
            return null;
        }
        return this.f346435c;
    }

    public final int w(r45.qn6 qn6Var) {
        if (qn6Var == this.f346433a) {
            return 100;
        }
        if (qn6Var != this.f346434b && qn6Var == this.f346435c) {
            return ma1.i.CTRL_INDEX;
        }
        return 110;
    }

    public long x() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_REDDOT_TIMESTAMP_LONG, null);
        if (m17 == null) {
            return 0L;
        }
        return ((java.lang.Long) m17).longValue();
    }

    public java.lang.String y() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            return new org.json.JSONObject(str).optString("extInfo");
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    public java.lang.String z() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_USER_ICON_RED_XML_REC_STRING, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            return new org.json.JSONObject(str).optString("msgId", "");
        } catch (org.json.JSONException unused) {
            return "";
        }
    }
}
