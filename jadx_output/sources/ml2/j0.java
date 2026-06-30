package ml2;

@j95.b
/* loaded from: classes3.dex */
public final class j0 extends i95.w implements zy2.zb {

    /* renamed from: i */
    public static final ml2.y4 f327583i = new ml2.y4();

    /* renamed from: m */
    public static final ml2.d f327584m = new ml2.d();

    /* renamed from: n */
    public static final ml2.x f327585n = new ml2.x();

    /* renamed from: o */
    public static final ml2.h f327586o = new ml2.h();

    /* renamed from: d */
    public org.json.JSONObject f327587d;

    /* renamed from: f */
    public boolean f327589f;

    /* renamed from: g */
    public boolean f327590g;

    /* renamed from: e */
    public final int f327588e = -100;

    /* renamed from: h */
    public final java.util.List f327591h = kz5.c0.i(1001, 1002, 1003);

    public static /* synthetic */ void Dj(ml2.j0 j0Var, ml2.b5 b5Var, dk2.zf zfVar, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            zfVar = null;
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        j0Var.Cj(b5Var, zfVar, map);
    }

    public static void Oj(ml2.j0 j0Var, ml2.i3 type, int i17, ml2.i0 i0Var, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        if ((i18 & 4) != 0) {
            i0Var = null;
        }
        j0Var.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f327559d);
        if (i17 > 0) {
            jSONObject.put("money", i17);
        }
        if (i0Var != null) {
            jSONObject.put("errortype", i0Var.f327544a);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i0Var.f327545b);
            jSONObject.put("errormsg", i0Var.f327546c);
        }
        zy2.zb.y6(j0Var, ml2.z4.V, jSONObject.toString(), null, 4, null);
    }

    public static /* synthetic */ void Qj(ml2.j0 j0Var, int i17, int i18, long j17, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i27 & 8) != 0) {
            i19 = 0;
        }
        j0Var.Pj(i17, i18, j18, i19);
    }

    public final void Ai(ml2.w0 enterData) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        ml2.y4 y4Var = f327583i;
        y4Var.f328290c = false;
        y4Var.f328286a = "";
        ml2.d dVar = f327584m;
        dVar.getClass();
        kotlin.jvm.internal.o.g(enterData, "enterData");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vi(finderLiveEntranceLogStruct, enterData.f328158c);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.t(b52.b.q(enterData.f328156a));
        long j17 = enterData.f328157b;
        finderLiveEntranceLogStruct.f57122e = j17;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.u(b52.b.q(j17));
        ml2.x1 x1Var = enterData.f328161f;
        finderLiveEntranceLogStruct.f57126i = x1Var.f328220d;
        java.lang.String str3 = enterData.f328162g;
        finderLiveEntranceLogStruct.r(str3);
        finderLiveEntranceLogStruct.f57128k = enterData.f328159d;
        finderLiveEntranceLogStruct.f57129l = enterData.f328163h;
        finderLiveEntranceLogStruct.f57130m = enterData.f328164i;
        finderLiveEntranceLogStruct.w(enterData.f328165j);
        finderLiveEntranceLogStruct.f57138u = finderLiveEntranceLogStruct.b("SnsFeedId", enterData.f328166k, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.s(b52.b.b());
        finderLiveEntranceLogStruct.f57133p = enterData.f328160e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.q(b52.b.c());
        finderLiveEntranceLogStruct.f57143z = finderLiveEntranceLogStruct.b("ClickSubTabContextId", enterData.f328171p, true);
        boolean A = r26.i0.A(str3, "temp_", false, 2, null);
        java.lang.String str4 = enterData.f328169n;
        if (A) {
            finderLiveEntranceLogStruct.v(str4);
            if (android.text.TextUtils.isEmpty(finderLiveEntranceLogStruct.f57136s) && kotlin.jvm.internal.o.b(finderLiveEntranceLogStruct.f57127j, "temp_2")) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                finderLiveEntranceLogStruct.v(y4Var.f328318z);
            }
            str = str4;
            z17 = true;
        } else {
            str = str4;
            z17 = true;
            finderLiveEntranceLogStruct.v(ml2.d.d(dVar, enterData.f328156a, com.tencent.mm.sdk.platformtools.b8.c(finderLiveEntranceLogStruct.f57127j), null, 4, null));
        }
        if (android.text.TextUtils.isEmpty(finderLiveEntranceLogStruct.f57136s)) {
            finderLiveEntranceLogStruct.v(str);
        }
        finderLiveEntranceLogStruct.f57139v = enterData.f328167l;
        finderLiveEntranceLogStruct.p(r26.i0.v(dVar.e(x1Var, enterData.f328172q), ",", ";", false, 4, null));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        finderLiveEntranceLogStruct.f57140w = y4Var.e(finderLiveEntranceLogStruct.f57127j, enterData.f328168m.f327569d);
        if (kotlin.jvm.internal.o.b(finderLiveEntranceLogStruct.f57127j, com.tencent.maas.MJMaasVersion.BUILD_NUMBER) || kotlin.jvm.internal.o.b(((m30.o) ((n30.s) i95.n0.c(n30.s.class))).wi(), "123")) {
            if (android.text.TextUtils.isEmpty(p52.h.f352027l)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str2 = v52.c.g().d();
            } else {
                str2 = p52.h.f352027l;
            }
            finderLiveEntranceLogStruct.f57141x = finderLiveEntranceLogStruct.b("SnsSessionID", str2, z17);
        }
        finderLiveEntranceLogStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.Audience21053Report", "report21053OnEnter, struct=\nfeedId=" + finderLiveEntranceLogStruct.f57123f + "\nliveId=" + finderLiveEntranceLogStruct.f57137t + "\nuserName=" + finderLiveEntranceLogStruct.f57121d + "\nisPrivate=" + finderLiveEntranceLogStruct.f57135r + "\nsessionID=" + finderLiveEntranceLogStruct.f57124g + "\nactionTS=" + finderLiveEntranceLogStruct.f57125h + "\naction=" + finderLiveEntranceLogStruct.f57126i + "\ncommentScene=" + finderLiveEntranceLogStruct.f57127j + "\nindex=" + finderLiveEntranceLogStruct.f57128k + "\nenterStatus=" + finderLiveEntranceLogStruct.f57129l + "\ncontextId=" + finderLiveEntranceLogStruct.f57132o + "\nonlineNum=" + finderLiveEntranceLogStruct.f57133p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f57134q + "\nclickSubTabContextId=" + finderLiveEntranceLogStruct.f57143z + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f57136s + "\nshareType=" + finderLiveEntranceLogStruct.f57130m + "\nshareUserName=" + finderLiveEntranceLogStruct.f57131n + "\nenterSessionId=" + finderLiveEntranceLogStruct.f57139v + "\nenterIconType=" + finderLiveEntranceLogStruct.f57140w + "\nsnsSessionID=" + finderLiveEntranceLogStruct.f57141x + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f57138u);
    }

    public final void Aj(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i17 == 2) {
            jSONObject.put("times", i18);
        }
        zy2.zb.y6(this, ml2.z4.F, jSONObject.toString(), null, 4, null);
    }

    public final java.lang.String Bi(java.util.Map map, boolean z17) {
        if (z17) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) map.get("liveId");
            boolean z18 = charSequence == null || charSequence.length() == 0;
            ml2.y4 y4Var = f327583i;
            if (z18) {
                map.put("liveId", y4Var.D);
            }
            java.lang.CharSequence charSequence2 = (java.lang.CharSequence) map.get("feedId");
            if (charSequence2 == null || charSequence2.length() == 0) {
                map.put("feedId", y4Var.E);
            }
            java.lang.CharSequence charSequence3 = (java.lang.CharSequence) map.get("share_id");
            if (charSequence3 == null || charSequence3.length() == 0) {
                map.put("share_id", y4Var.F);
            }
            mm2.d dVar = (mm2.d) dk2.ef.f233372a.i(mm2.d.class);
            map.put("is_mmbiz_live", dVar != null && dVar.f328942f ? "1" : "0");
        }
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.s(map)).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return r26.i0.t(jSONObject, ",", ";", false);
    }

    public final void Bj(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.putOpt("result", str);
        zy2.zb.y6(this, ml2.z4.G, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0.put("source_type", 1) == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cj(ml2.b5 r8, dk2.zf r9, java.util.Map r10) {
        /*
            r7 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.o.g(r8, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "type"
            int r8 = r8.f327305d
            r0.put(r1, r8)
            boolean r8 = r9 instanceof dk2.fg
            if (r8 == 0) goto L19
            dk2.fg r9 = (dk2.fg) r9
            goto L1a
        L19:
            r9 = 0
        L1a:
            java.lang.String r8 = "source_type"
            if (r9 == 0) goto L38
            jz5.l r9 = r9.q()
            if (r9 == 0) goto L38
            zl2.r4 r1 = zl2.r4.f473950a
            java.lang.Object r2 = r9.f302833d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r9.f302834e
            com.tencent.mm.protobuf.g r9 = (com.tencent.mm.protobuf.g) r9
            r1.O(r0, r2, r9)
            r9 = 1
            org.json.JSONObject r9 = r0.put(r8, r9)
            if (r9 != 0) goto L3c
        L38:
            r9 = 2
            r0.put(r8, r9)
        L3c:
            if (r10 == 0) goto L62
            java.util.Set r8 = r10.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L46:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L62
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r0.put(r10, r9)
            goto L46
        L62:
            ml2.z4 r2 = ml2.z4.L
            java.lang.String r3 = r0.toString()
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            zy2.zb.y6(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.Cj(ml2.b5, dk2.zf, java.util.Map):void");
    }

    public ml2.y4 Di() {
        return f327583i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ej(ml2.z4 z4Var, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject;
        java.lang.String jSONObject2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = z4Var.ordinal();
        ml2.y4 y4Var = f327583i;
        if (ordinal == 0) {
            y4Var.f328311s = currentTimeMillis;
            y4Var.T.f327657d = currentTimeMillis;
        } else if (ordinal == 2) {
            ml2.z1 z1Var = ml2.z1.f328331e;
            if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(1))) {
                y4Var.f328296f = false;
                y4Var.f328298g = false;
            }
        } else if (ordinal != 8) {
            if (ordinal == 18) {
                ml2.g2[] g2VarArr = ml2.g2.f327477d;
                if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(2))) {
                    ml2.n2 n2Var = ml2.n2.f327732e;
                    y4Var.getClass();
                    y4Var.f328310r = n2Var;
                }
            } else if (ordinal == 19) {
                ml2.r3 r3Var = ml2.r3.f327900e;
                if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(1))) {
                    this.f327590g = true;
                } else if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(3))) {
                    this.f327590g = false;
                }
            }
        } else if (y4Var.S <= 0) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveActionStruct finderLiveActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveActionStruct();
        finderLiveActionStruct.f57023d = finderLiveActionStruct.b("FinderUsrname", y4Var.f(), true);
        finderLiveActionStruct.f57024e = finderLiveActionStruct.b("FinderWxAppInfo", y4Var.i(), true);
        finderLiveActionStruct.f57025f = y4Var.k();
        finderLiveActionStruct.f57026g = finderLiveActionStruct.b("FinderSessionId", y4Var.h(), true);
        finderLiveActionStruct.f57027h = currentTimeMillis;
        gk2.e eVar = gk2.e.f272471n;
        finderLiveActionStruct.f57038s = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).O7() : 0;
        finderLiveActionStruct.f57028i = finderLiveActionStruct.b("LiveId", y4Var.c(), true);
        finderLiveActionStruct.f57029j = finderLiveActionStruct.b("FeedId", y4Var.b(), true);
        ml2.k5 k5Var = y4Var.T;
        finderLiveActionStruct.f57030k = finderLiveActionStruct.b("Description", android.text.TextUtils.isEmpty(k5Var.f327656c) ? y4Var.d() : k5Var.f327656c, true);
        finderLiveActionStruct.f57031l = y4Var.S;
        finderLiveActionStruct.f57032m = y4Var.Q;
        finderLiveActionStruct.f57033n = y4Var.R;
        finderLiveActionStruct.f57034o = z4Var.f328397d;
        int ordinal2 = z4Var.ordinal();
        java.lang.String str3 = "";
        if (ordinal2 == 13) {
            y4Var.getClass();
            finderLiveActionStruct.f57035p = finderLiveActionStruct.b("ActionResult", "0;0;0;0;0", true);
        } else if (ordinal2 != 14) {
            finderLiveActionStruct.f57035p = finderLiveActionStruct.b("ActionResult", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        } else {
            finderLiveActionStruct.f57035p = finderLiveActionStruct.b("ActionResult", Zi(), true);
        }
        finderLiveActionStruct.f57036q = y4Var.f328291c0.f328284d;
        try {
            jSONObject = new org.json.JSONObject(str2 != null ? r26.i0.t(str2, ";", ",", false) : "");
        } catch (java.lang.Throwable unused) {
            jSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject cj6 = cj(this.f327587d, jSONObject);
        if (cj6 != null && (jSONObject2 = cj6.toString()) != null) {
            str3 = r26.i0.t(jSONObject2, ",", ";", false);
        }
        finderLiveActionStruct.f57037r = finderLiveActionStruct.b("ChnlExtra", str3, true);
        finderLiveActionStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21054: finderUsrname=" + finderLiveActionStruct.f57023d + ", finderWxAppInfo=" + finderLiveActionStruct.f57024e + ", isPrivate=" + finderLiveActionStruct.f57025f + ", finderSessionId=" + finderLiveActionStruct.f57026g + ", actionTimeMs=" + finderLiveActionStruct.f57027h + ", liveId=" + finderLiveActionStruct.f57028i + ", feedId=" + finderLiveActionStruct.f57029j + ", description=" + finderLiveActionStruct.f57030k + ", sourceScene=" + finderLiveActionStruct.f57036q + ", liveTime=" + finderLiveActionStruct.f57031l + ", likeCount=" + finderLiveActionStruct.f57032m + ", onlineCount=" + finderLiveActionStruct.f57033n + ", actionType=" + finderLiveActionStruct.f57034o + ", actionResult=" + finderLiveActionStruct.f57035p + ", chnlExtra=" + finderLiveActionStruct.f57037r + ",ScreenType=" + finderLiveActionStruct.f57038s);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fj(ml2.j1 r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.Fj(ml2.j1, java.lang.String):void");
    }

    public void Gj(int i17) {
        ml2.z4 z4Var = ml2.z4.R1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        zy2.zb.y6(this, z4Var, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.tencent.mm.autogen.mmdata.rpt.FinderLiveResultStruct, jx3.a] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void Hj() {
        java.lang.String str;
        ml2.y4 y4Var = f327583i;
        long j17 = y4Var.T.f327657d;
        long j18 = 0;
        if (j17 <= 0) {
            return;
        }
        ?? finderLiveResultStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveResultStruct();
        ?? r86 = 1;
        finderLiveResultStruct.f57329d = finderLiveResultStruct.b("FinderUsrname", y4Var.f(), true);
        finderLiveResultStruct.f57330e = finderLiveResultStruct.b("FinderWxAppInfo", y4Var.i(), true);
        finderLiveResultStruct.f57331f = y4Var.k();
        finderLiveResultStruct.f57332g = finderLiveResultStruct.b("FinderSessionId", y4Var.h(), true);
        finderLiveResultStruct.f57333h = java.lang.System.currentTimeMillis();
        ml2.k5 k5Var = y4Var.T;
        finderLiveResultStruct.f57341p = k5Var.f327661h;
        finderLiveResultStruct.f57342q = k5Var.f327662i;
        finderLiveResultStruct.f57343r = k5Var.f327663j;
        finderLiveResultStruct.f57339n = k5Var.f327660g;
        java.lang.String str2 = k5Var.f327654a;
        if (android.text.TextUtils.isEmpty(str2) || kotlin.jvm.internal.o.b(str2, "0") || kotlin.jvm.internal.o.b(str2, "-1")) {
            str2 = y4Var.c();
        }
        finderLiveResultStruct.f57334i = finderLiveResultStruct.b("LiveId", str2, true);
        java.lang.String str3 = k5Var.f327655b;
        if (android.text.TextUtils.isEmpty(str3) || kotlin.jvm.internal.o.b(str3, "0") || kotlin.jvm.internal.o.b(str3, "-1")) {
            str3 = y4Var.b();
        }
        finderLiveResultStruct.f57335j = finderLiveResultStruct.b("FeedId", str3, true);
        finderLiveResultStruct.f57336k = finderLiveResultStruct.b("Description", android.text.TextUtils.isEmpty(k5Var.f327656c) ? y4Var.d() : k5Var.f327656c, true);
        finderLiveResultStruct.f57337l = j17;
        finderLiveResultStruct.f57338m = k5Var.f327658e;
        finderLiveResultStruct.f57340o = k5Var.f327659f;
        finderLiveResultStruct.f57344s = k5Var.f327664k;
        finderLiveResultStruct.f57345t = k5Var.f327665l;
        finderLiveResultStruct.f57346u = k5Var.f327666m;
        finderLiveResultStruct.f57347v = k5Var.f327667n;
        finderLiveResultStruct.f57348w = k5Var.f327668o;
        finderLiveResultStruct.f57349x = k5Var.f327669p;
        finderLiveResultStruct.f57350y = k5Var.f327670q;
        finderLiveResultStruct.f57351z = k5Var.f327671r;
        finderLiveResultStruct.A = k5Var.f327672s;
        finderLiveResultStruct.B = k5Var.f327673t;
        finderLiveResultStruct.C = k5Var.f327674u;
        java.util.HashMap hashMap = k5Var.f327675v;
        if (hashMap.isEmpty()) {
            str = "";
        } else {
            str = "";
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.util.Iterator it = ((java.util.LinkedList) entry.getValue()).iterator();
                long j19 = j18;
                while (it.hasNext()) {
                    ml2.u0 u0Var = (ml2.u0) it.next();
                    if (u0Var.f328030b) {
                        j19 += u0Var.f328029a;
                    }
                }
                str = str + ((java.lang.Number) entry.getKey()).longValue() + ':' + j19 + '#';
                j18 = 0;
            }
            if (r26.i0.o(str, "#", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
        }
        finderLiveResultStruct.D = finderLiveResultStruct.b("PromoteGoodsJson", str, true);
        finderLiveResultStruct.E = k5Var.f327675v.size();
        finderLiveResultStruct.F = finderLiveResultStruct.b("ShopWindowId", k5Var.f327678y, true);
        finderLiveResultStruct.G = k5Var.f327676w;
        finderLiveResultStruct.f57328J = k5Var.f327677x;
        finderLiveResultStruct.I = y4Var.f328294e;
        finderLiveResultStruct.H = y4Var.f328291c0.f328284d;
        finderLiveResultStruct.K = y4Var.f328302j;
        finderLiveResultStruct.M = finderLiveResultStruct.b("Tag", fp.s0.b(y4Var.f328315w, com.tencent.mapsdk.internal.rv.f51270c), true);
        finderLiveResultStruct.N = finderLiveResultStruct.b("SubTag", fp.s0.b(y4Var.f328316x, com.tencent.mapsdk.internal.rv.f51270c), true);
        java.util.ArrayList arrayList = y4Var.f328303k;
        if (arrayList.isEmpty()) {
            finderLiveResultStruct.L = finderLiveResultStruct.b("ConnectDuration", "", true);
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            java.lang.String str4 = "";
            while (it6.hasNext()) {
                nm5.c cVar = (nm5.c) it6.next();
                java.lang.Object a17 = cVar.a(2);
                kotlin.jvm.internal.o.f(a17, "$3(...)");
                if (((java.lang.Boolean) a17).booleanValue()) {
                    str4 = str4 + ((ml2.s2) cVar.a(0)).f327923d + '|' + cVar.a(1) + ';';
                }
            }
            if (!kotlin.jvm.internal.o.b(str4, "")) {
                str4 = str4.substring(0, str4.length() - 1);
                kotlin.jvm.internal.o.f(str4, "substring(...)");
            }
            finderLiveResultStruct.L = finderLiveResultStruct.b("ConnectDuration", str4, true);
        }
        java.util.ArrayList arrayList2 = y4Var.f328305m;
        if (arrayList2.isEmpty()) {
            finderLiveResultStruct.P = finderLiveResultStruct.b("MicWithAnchor", "", true);
        } else {
            java.util.Iterator it7 = arrayList2.iterator();
            java.lang.String str5 = "";
            while (it7.hasNext()) {
                nm5.c cVar2 = (nm5.c) it7.next();
                java.lang.Object a18 = cVar2.a(2);
                kotlin.jvm.internal.o.f(a18, "$3(...)");
                if (((java.lang.Boolean) a18).booleanValue()) {
                    str5 = str5 + ((java.lang.String) cVar2.a(0)) + '|' + cVar2.a(1) + ';';
                    r86 = 1;
                } else {
                    r86 = 1;
                }
            }
            if (!kotlin.jvm.internal.o.b(str5, "")) {
                str5 = str5.substring(0, str5.length() - r86);
                kotlin.jvm.internal.o.f(str5, "substring(...)");
            }
            finderLiveResultStruct.P = finderLiveResultStruct.b("MicWithAnchor", str5, r86);
        }
        finderLiveResultStruct.O = y4Var.f328310r.f327735d;
        ml2.a4 a4Var = y4Var.A;
        finderLiveResultStruct.Q = a4Var.f327207d;
        finderLiveResultStruct.S = a4Var == ml2.a4.f327205f ? y4Var.B : 0L;
        finderLiveResultStruct.R = p52.h.f352020e;
        java.lang.String eVar = y4Var.f328299g0.toString();
        kotlin.jvm.internal.o.f(eVar, "toString(...)");
        finderLiveResultStruct.T = finderLiveResultStruct.b("PresentationJson", r26.i0.t(eVar, ",", ";", false), true);
        finderLiveResultStruct.k();
        k5Var.f327654a = "";
        k5Var.f327655b = "";
        k5Var.f327656c = "";
        k5Var.f327657d = 0L;
        k5Var.f327658e = 0L;
        k5Var.f327660g = 0L;
        k5Var.f327659f = 0L;
        k5Var.f327661h = 0L;
        k5Var.f327662i = 0L;
        k5Var.f327663j = 0L;
        k5Var.f327664k = 0;
        k5Var.f327665l = 0L;
        k5Var.f327666m = 0L;
        k5Var.f327667n = 0L;
        k5Var.f327668o = 0L;
        k5Var.f327669p = 0L;
        k5Var.f327670q = 0L;
        k5Var.f327671r = 0L;
        k5Var.f327672s = 0L;
        k5Var.f327673t = 0L;
        k5Var.f327674u = 0L;
        k5Var.f327678y = "";
        k5Var.f327676w = 0L;
        k5Var.f327677x = 0L;
        k5Var.f327675v.clear();
        y4Var.Q = 0L;
        y4Var.R = 0L;
        y4Var.S = 0L;
        y4Var.U = false;
        y4Var.V = false;
        y4Var.W = false;
        y4Var.X = false;
        y4Var.Y = false;
        y4Var.f328302j = 0;
        arrayList.clear();
        y4Var.f328304l = false;
        arrayList2.clear();
        y4Var.Z.clear();
        y4Var.f328294e = 0L;
        y4Var.f328296f = false;
        y4Var.f328298g = false;
        y4Var.f328315w = "";
        y4Var.f328316x = "";
        y4Var.A = ml2.a4.f327204e;
        y4Var.B = 0L;
        y4Var.f328310r = ml2.n2.f327733f;
        p52.h.f352020e = 0;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21056: finderUsrname=" + finderLiveResultStruct.f57329d + ", finderWxAppInfo=" + finderLiveResultStruct.f57330e + ", isPrivate=" + finderLiveResultStruct.f57331f + ", finderSessionId=" + finderLiveResultStruct.f57332g + ", actionTimeMs=" + finderLiveResultStruct.f57333h + ", audienceCount=" + finderLiveResultStruct.f57341p + ", likeCount=" + finderLiveResultStruct.f57342q + ", newFansNum=" + finderLiveResultStruct.f57343r + ", liveDurationSeconds=" + finderLiveResultStruct.f57339n + ", liveId=" + finderLiveResultStruct.f57334i + ", feedId=" + finderLiveResultStruct.f57335j + ", description=" + finderLiveResultStruct.f57336k + ", liveStartTimeMs=" + finderLiveResultStruct.f57337l + ", liveEndTimeMs=" + finderLiveResultStruct.f57338m + ", oriFansCount=" + finderLiveResultStruct.f57340o + ", errorCode=" + finderLiveResultStruct.f57344s + ", floatingCount=" + finderLiveResultStruct.f57345t + ", shareSnsCount=" + finderLiveResultStruct.f57346u + ", shareSessionCount=" + finderLiveResultStruct.f57347v + ", exchangeCameraCount=" + finderLiveResultStruct.f57348w + ", complainCount=" + finderLiveResultStruct.f57349x + ", allCommentCloseCount=" + finderLiveResultStruct.f57350y + ", allCommentOpenCount=" + finderLiveResultStruct.f57351z + ", personalCommentCloseCount=" + finderLiveResultStruct.A + ", personalCommentOpenCount=" + finderLiveResultStruct.B + ", kickOutCount=" + finderLiveResultStruct.C + ", promoteGoodsJson=" + finderLiveResultStruct.D + ", promoteGoodsCount=" + finderLiveResultStruct.E + ", shopWindowId=" + finderLiveResultStruct.F + ", nudgeCount=" + finderLiveResultStruct.f57328J + ", lotteryCount=" + finderLiveResultStruct.I + ", connectCount=" + finderLiveResultStruct.K + ", connectDuration=" + finderLiveResultStruct.L + ", micWithAnchor=" + finderLiveResultStruct.P + ", sourceScene=" + finderLiveResultStruct.H + ", isGift=" + finderLiveResultStruct.O + ", tag=" + y4Var.f328315w + ", subTag=" + y4Var.f328316x + ", visibleRange=" + finderLiveResultStruct.Q + ", topComment=" + finderLiveResultStruct.G + ", presentationJson=" + finderLiveResultStruct.T);
    }

    public void Ij(ml2.y2 actionType, java.lang.String str, java.lang.String description, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (actionType == ml2.y2.f328256i) {
            ((q30.i) ((r30.q) i95.n0.c(r30.q.class))).Ai(0);
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderNoticeLiveStreamStruct finderNoticeLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderNoticeLiveStreamStruct();
        ml2.y4 y4Var = f327583i;
        finderNoticeLiveStreamStruct.f57447d = finderNoticeLiveStreamStruct.b("FinderUsrname", y4Var.f(), true);
        finderNoticeLiveStreamStruct.f57448e = finderNoticeLiveStreamStruct.b("FinderWxAppInfo", y4Var.i(), true);
        finderNoticeLiveStreamStruct.f57449f = y4Var.k();
        finderNoticeLiveStreamStruct.f57450g = finderNoticeLiveStreamStruct.b("FinderSessionId", y4Var.h(), true);
        finderNoticeLiveStreamStruct.f57451h = java.lang.System.currentTimeMillis();
        finderNoticeLiveStreamStruct.f57452i = actionType.f328269d;
        finderNoticeLiveStreamStruct.f57453j = finderNoticeLiveStreamStruct.b("ActionJson", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        finderNoticeLiveStreamStruct.f57454k = y4Var.f328295e0.f327692d;
        finderNoticeLiveStreamStruct.f57456m = 1L;
        byte[] bytes = description.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        finderNoticeLiveStreamStruct.f57455l = finderNoticeLiveStreamStruct.b("Description", android.util.Base64.encodeToString(bytes, 0), true);
        finderNoticeLiveStreamStruct.f57450g = finderNoticeLiveStreamStruct.b("FinderSessionId", sessionId, true);
        finderNoticeLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21106: finderUsrname=" + finderNoticeLiveStreamStruct.f57447d + ", finderWxAppInfo=" + finderNoticeLiveStreamStruct.f57448e + ", isPrivate=" + finderNoticeLiveStreamStruct.f57449f + ", finderSessionId=" + finderNoticeLiveStreamStruct.f57450g + ", actionTimeMs=" + finderNoticeLiveStreamStruct.f57451h + ", actionType=" + finderNoticeLiveStreamStruct.f57452i + ", sourceScene=" + finderNoticeLiveStreamStruct.f57454k + ", actionJson=" + finderNoticeLiveStreamStruct.f57453j + ", finderSessionId=" + finderNoticeLiveStreamStruct.f57450g);
    }

    public final void Jj(ml2.d3 actionType, java.lang.String str) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            com.tencent.mm.autogen.mmdata.rpt.FinderFaceVerifyStreamStruct finderFaceVerifyStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFaceVerifyStreamStruct();
            finderFaceVerifyStreamStruct.f56756d = finderFaceVerifyStreamStruct.b("FinderUsrname", str == null ? "" : str, true);
            ml2.y4 y4Var = f327583i;
            finderFaceVerifyStreamStruct.f56757e = finderFaceVerifyStreamStruct.b("FinderWxAppInfo", y4Var.i(), true);
            finderFaceVerifyStreamStruct.f56758f = y4Var.l(str);
            finderFaceVerifyStreamStruct.f56759g = finderFaceVerifyStreamStruct.b("FinderSessionId", y4Var.h(), true);
            finderFaceVerifyStreamStruct.f56760h = java.lang.System.currentTimeMillis();
            finderFaceVerifyStreamStruct.f56761i = actionType.f327360d;
            finderFaceVerifyStreamStruct.k();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21113: finderUsrname=" + finderFaceVerifyStreamStruct.f56756d + ", finderWxAppInfo=" + finderFaceVerifyStreamStruct.f56757e + ", isPrivate=" + finderFaceVerifyStreamStruct.f56758f + ", finderSessionId=" + finderFaceVerifyStreamStruct.f56759g + ", actionTimeMs=" + finderFaceVerifyStreamStruct.f56760h + ", actionJson=" + finderFaceVerifyStreamStruct.f56761i);
        }
    }

    public void Kj(ml2.l3 action) {
        kotlin.jvm.internal.o.g(action, "action");
        int ordinal = action.ordinal();
        ml2.y4 y4Var = f327583i;
        if (ordinal == 0) {
            this.f327589f = false;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                this.f327589f = true;
                ml2.y3 y3Var = ml2.y3.f328271f;
                y4Var.getClass();
                y4Var.f328291c0 = y3Var;
            }
        } else if (this.f327589f) {
            this.f327589f = false;
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveNearbyStartLiveLogStruct finderLiveNearbyStartLiveLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveNearbyStartLiveLogStruct();
        finderLiveNearbyStartLiveLogStruct.f57181e = java.lang.System.currentTimeMillis();
        finderLiveNearbyStartLiveLogStruct.f57182f = action.f327698d;
        finderLiveNearbyStartLiveLogStruct.f57180d = y4Var.f328289b0.f327716d;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderLiveNearbyStartLiveLogStruct.f57185i = finderLiveNearbyStartLiveLogStruct.b("Session_Id", Ri, true);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        rq2.x xVar = rq2.x.f398914a;
        finderLiveNearbyStartLiveLogStruct.f57183g = finderLiveNearbyStartLiveLogStruct.b("ContextID", rq2.x.f398915b, true);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        finderLiveNearbyStartLiveLogStruct.f57184h = finderLiveNearbyStartLiveLogStruct.b("ClickTabContextId", rq2.x.f398919f, true);
        finderLiveNearbyStartLiveLogStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21631: actionTS=" + finderLiveNearbyStartLiveLogStruct.f57181e + ", pageType=" + finderLiveNearbyStartLiveLogStruct.f57180d + ", action=" + finderLiveNearbyStartLiveLogStruct.f57182f + ", clickid=0, session_Id=" + finderLiveNearbyStartLiveLogStruct.f57185i + ", contextID=" + finderLiveNearbyStartLiveLogStruct.f57183g + ", clickTabContextId=" + finderLiveNearbyStartLiveLogStruct.f57184h);
    }

    public final void Lj(ml2.i1 action, java.lang.String actionResult) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(actionResult, "actionResult");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = action.ordinal();
        ml2.y4 y4Var = f327583i;
        if (ordinal == 1) {
            ml2.p1 p1Var = ml2.p1.f327779e;
            if (kotlin.jvm.internal.o.b(actionResult, java.lang.String.valueOf(2))) {
                p52.h.f352025j = java.lang.String.valueOf(y4Var.f328311s);
                p52.h.f352026k = currentTimeMillis;
            } else {
                ml2.p1 p1Var2 = ml2.p1.f327779e;
                if (kotlin.jvm.internal.o.b(actionResult, java.lang.String.valueOf(1))) {
                    y4Var.f328312t = true;
                } else {
                    ml2.p1 p1Var3 = ml2.p1.f327779e;
                    if (kotlin.jvm.internal.o.b(actionResult, java.lang.String.valueOf(3)) && !y4Var.f328312t) {
                        return;
                    }
                }
            }
        } else if (ordinal == 2) {
            y4Var.f328312t = false;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveOverPageReportStruct finderLiveOverPageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveOverPageReportStruct();
        finderLiveOverPageReportStruct.f57223d = action.f327552d;
        finderLiveOverPageReportStruct.f57224e = finderLiveOverPageReportStruct.b("ActionResult", r26.i0.t(actionResult, ",", ";", false), true);
        finderLiveOverPageReportStruct.f57225f = currentTimeMillis;
        finderLiveOverPageReportStruct.f57226g = finderLiveOverPageReportStruct.b("SessionId", java.lang.String.valueOf(y4Var.f328311s), true);
        finderLiveOverPageReportStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21919: actionType=" + finderLiveOverPageReportStruct.f57223d + ", actionResult=" + finderLiveOverPageReportStruct.f57224e + ", actionTimeMs=" + finderLiveOverPageReportStruct.f57225f + ", sessionId=" + finderLiveOverPageReportStruct.f57226g);
    }

    public final void Mj(ml2.p1 action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellLiveReport", "report21919OnVest, action: " + action.name());
        if (action == ml2.p1.f327779e) {
            return;
        }
        Lj(ml2.i1.f327548f, java.lang.String.valueOf(action.f327786d));
    }

    public final void Ni() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ml2.y4 y4Var = f327583i;
        for (int size = y4Var.f328305m.size() - 1; -1 < size; size--) {
            java.lang.Object obj = y4Var.f328305m.get(size);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            nm5.c cVar = (nm5.c) obj;
            java.lang.Object a17 = cVar.a(1);
            kotlin.jvm.internal.o.f(a17, "$2(...)");
            if (((java.lang.Number) a17).longValue() > 0 && kotlin.jvm.internal.o.b(cVar.a(2), java.lang.Boolean.FALSE)) {
                java.lang.Object a18 = cVar.a(1);
                kotlin.jvm.internal.o.f(a18, "$2(...)");
                long longValue = (currentTimeMillis - ((java.lang.Number) a18).longValue()) / 1000;
                if (longValue >= 0) {
                    y4Var.f328305m.set(size, nm5.j.d(cVar.a(0), java.lang.Long.valueOf(longValue), java.lang.Boolean.TRUE));
                    return;
                }
            }
        }
    }

    public final void Nj(java.lang.String viewId, java.lang.String eventId, java.util.Map map) {
        java.util.Map l17;
        kn0.p pVar;
        kn0.p pVar2;
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        dk2.ef efVar = dk2.ef.f233372a;
        in0.q e17 = efVar.e();
        boolean z17 = false;
        boolean h17 = (e17 == null || (pVar2 = e17.D) == null) ? false : pVar2.h();
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (h17) {
            l17 = r0Var.f327880s;
        } else {
            jz5.l[] lVarArr = new jz5.l[4];
            java.lang.String str = r0Var.f327867f;
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("finder_usnername", str);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            lVarArr[1] = new jz5.l("finder_context_id", b17);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String c17 = b52.b.c();
            if (c17 == null) {
                c17 = "";
            }
            lVarArr[2] = new jz5.l("finder_tab_context_id", c17);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            lVarArr[3] = new jz5.l("behaviour_session_id", Ri != null ? Ri : "");
            l17 = kz5.c1.l(lVarArr);
        }
        l17.put("view_id", viewId);
        in0.q e18 = efVar.e();
        if (e18 != null && (pVar = e18.D) != null && pVar.h()) {
            z17 = true;
        }
        l17.put("set_stage", java.lang.Integer.valueOf(z17 ? 2 : 1));
        if (map != null) {
            l17.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(eventId, l17, 25561);
    }

    public final void Pj(int i17, int i18, long j17, int i19) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i18 == 0) {
            jSONObject.put("result", 1);
        } else if (i18 == 1) {
            jSONObject.put("result", 2);
        } else if (i18 > 0) {
            jSONObject.put("result", i18);
        }
        if (j17 > 0) {
            jSONObject.put("product", j17);
        }
        if (i19 > 0) {
            jSONObject.put("total_during", i19);
        }
        zy2.zb.y6(this, ml2.z4.Z, jSONObject.toString(), null, 4, null);
    }

    public final void Ri(ml2.s2 s2Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ml2.y4 y4Var = f327583i;
        for (int size = y4Var.f328303k.size() - 1; -1 < size; size--) {
            java.lang.Object obj = y4Var.f328303k.get(size);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            nm5.c cVar = (nm5.c) obj;
            if (cVar.a(0) == s2Var) {
                java.lang.Object a17 = cVar.a(1);
                kotlin.jvm.internal.o.f(a17, "$2(...)");
                if (((java.lang.Number) a17).longValue() > 0 && kotlin.jvm.internal.o.b(cVar.a(2), java.lang.Boolean.FALSE)) {
                    java.lang.Object a18 = cVar.a(1);
                    kotlin.jvm.internal.o.f(a18, "$2(...)");
                    long longValue = (currentTimeMillis - ((java.lang.Number) a18).longValue()) / 1000;
                    if (longValue >= 0) {
                        y4Var.f328303k.set(size, nm5.j.d(s2Var, java.lang.Long.valueOf(longValue), java.lang.Boolean.TRUE));
                        return;
                    }
                }
            }
        }
    }

    public final void Rj(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "reportDeviceStatus liveId:" + str + " liveScene:" + j17 + " finderNickname:" + str2 + " isAnchor:" + z17);
        ml2.h hVar = f327586o;
        hVar.a();
        hVar.f327501a = str;
        hVar.f327502b = j17;
        hVar.f327503c = str2;
        hVar.f327512l = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3464b0).getValue()).r()).intValue() == 1;
        com.tencent.mm.sdk.platformtools.b4 b4Var = hVar.f327504d;
        if (z17) {
            b4Var.c(0L, 5000L);
        } else {
            b4Var.c(0L, u04.d.f423477c);
        }
        com.tencent.mars.xlog.Log.i("Finder.DeviceStatusReporter", "startReportDeviceStatus switch:" + hVar.f327512l);
    }

    public void Sj(java.lang.String elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(elementId, "elementId");
        kotlin.jvm.internal.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = f327583i.C;
        }
        finderBroadcastEidClickStruct.u(str4);
        finderBroadcastEidClickStruct.p("");
        finderBroadcastEidClickStruct.B("");
        finderBroadcastEidClickStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidClickStruct.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        finderBroadcastEidClickStruct.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f1584l;
        }
        finderBroadcastEidClickStruct.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderBroadcastEidClickStruct.A(c17);
        finderBroadcastEidClickStruct.x("");
        finderBroadcastEidClickStruct.v("");
        finderBroadcastEidClickStruct.s(elementId);
        finderBroadcastEidClickStruct.t(Bi(eidUdfKVMap, true));
        finderBroadcastEidClickStruct.f56536r = finderBroadcastEidClickStruct.b("session_buffer", str3, true);
        finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidClickStruct.k();
    }

    public void Tj(java.lang.String elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(elementId, "elementId");
        kotlin.jvm.internal.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidExposeStruct.f56537d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = f327583i.C;
        }
        finderBroadcastEidExposeStruct.u(str4);
        finderBroadcastEidExposeStruct.p("");
        finderBroadcastEidExposeStruct.A("");
        finderBroadcastEidExposeStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidExposeStruct.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        finderBroadcastEidExposeStruct.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f1584l;
        }
        finderBroadcastEidExposeStruct.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderBroadcastEidExposeStruct.f56545l = finderBroadcastEidExposeStruct.b("TabContextID", c17, true);
        finderBroadcastEidExposeStruct.x("");
        finderBroadcastEidExposeStruct.v("");
        finderBroadcastEidExposeStruct.f56548o = finderBroadcastEidExposeStruct.b("ref_commentscene", "", true);
        finderBroadcastEidExposeStruct.s(elementId);
        finderBroadcastEidExposeStruct.t(Bi(eidUdfKVMap, true));
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidExposeStruct.f56552s = finderBroadcastEidExposeStruct.b("session_buffer", str3, true);
        finderBroadcastEidExposeStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidExposeStruct.k();
    }

    public final void Ui(long j17, java.lang.String commentscene) {
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d(commentscene);
        ml2.y4 y4Var = f327583i;
        y4Var.getClass();
        y4Var.f328286a = commentscene;
        y4Var.f328288b = j17;
    }

    public void Uj(int i17, int i18, int i19, java.lang.String audienceFinderUsername) {
        int i27;
        kotlin.jvm.internal.o.g(audienceFinderUsername, "audienceFinderUsername");
        cl0.g gVar = new cl0.g();
        int i28 = 3;
        if (i18 == 1) {
            ml2.j2[] j2VarArr = ml2.j2.f327610d;
            i27 = 1;
        } else if (i18 == 2) {
            ml2.j2[] j2VarArr2 = ml2.j2.f327610d;
            i27 = 2;
        } else if (i18 != 3) {
            i27 = 0;
        } else {
            ml2.j2[] j2VarArr3 = ml2.j2.f327610d;
            i27 = 3;
        }
        if (i19 == 0 || i19 == 1) {
            ml2.k2[] k2VarArr = ml2.k2.f327647d;
        } else if (i19 == 2) {
            ml2.k2[] k2VarArr2 = ml2.k2.f327647d;
            i28 = 2;
        } else if (i19 != 3) {
            i28 = 0;
        } else {
            ml2.k2[] k2VarArr3 = ml2.k2.f327647d;
            i28 = 1;
        }
        gVar.s("result", java.lang.Integer.valueOf(i17));
        gVar.s(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i27));
        gVar.s("type", java.lang.Integer.valueOf(i28));
        if (!(audienceFinderUsername.length() == 0)) {
            gVar.s("audience_finder_username", audienceFinderUsername);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        zy2.zb.y6(this, ml2.z4.P, gVar2, null, 4, null);
    }

    public final void Vi(com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct struct, java.lang.String str) {
        kotlin.jvm.internal.o.g(struct, "struct");
        struct.f57121d = struct.b("UserName", str == null ? "" : str, true);
        ml2.y4 y4Var = f327583i;
        struct.f57135r = y4Var.l(str);
        struct.f57124g = struct.b("SessionID", y4Var.h(), true);
        struct.f57125h = java.lang.System.currentTimeMillis();
        struct.A = struct.b("switch_extra", ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
    }

    public final void Vj(ml2.q2 linkOp, java.lang.String str, int i17, int i18) {
        kotlin.jvm.internal.o.g(linkOp, "linkOp");
        int ordinal = linkOp.ordinal();
        ml2.y4 y4Var = f327583i;
        if (ordinal == 1) {
            y4Var.f328302j++;
            y4Var.f328303k.add(nm5.j.d(ml2.s2.f327920f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
        } else if (ordinal == 2) {
            y4Var.f328302j++;
            y4Var.f328303k.add(nm5.j.d(ml2.s2.f327921g, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                switch (ordinal) {
                    case 10:
                        if (str != null) {
                            y4Var.f328304l = true;
                            y4Var.f328305m.add(nm5.j.d(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE));
                            break;
                        } else {
                            return;
                        }
                    case 11:
                        if (y4Var.f328304l) {
                            Ni();
                            return;
                        }
                        break;
                    case 12:
                        Ni();
                        return;
                }
            } else {
                if (y4Var.f328309q) {
                    Ri(ml2.s2.f327921g);
                    y4Var.f328309q = false;
                    return;
                }
                Ri(ml2.s2.f327921g);
            }
        } else if (!y4Var.f328307o) {
            Ri(ml2.s2.f327920f);
            return;
        } else {
            y4Var.f328307o = false;
            Ri(ml2.s2.f327920f);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", linkOp.f327845d);
        if (str == null) {
            str = "";
        }
        jSONObject.put("result", str);
        jSONObject.put("MicType", i17);
        jSONObject.put("InviteType", i18);
        zy2.zb.y6(this, ml2.z4.f328390y, jSONObject.toString(), null, 4, null);
    }

    public void Wj(java.lang.String event, java.lang.String paramsJson) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        com.tencent.mm.autogen.mmdata.rpt.LiveRecordRelatedStruct liveRecordRelatedStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveRecordRelatedStruct();
        liveRecordRelatedStruct.f58649d = liveRecordRelatedStruct.b("Event", event, true);
        liveRecordRelatedStruct.f58650e = liveRecordRelatedStruct.b("Params", r26.i0.t(paramsJson, ",", ";", false), true);
        liveRecordRelatedStruct.k();
    }

    public final void Xj(ml2.r3 action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellLiveReport", "reportVest, action: " + action.name());
        int ordinal = action.ordinal();
        ml2.y4 y4Var = f327583i;
        if ((ordinal != 7 && ordinal != 8 && ordinal != 9) || this.f327590g || y4Var.f328312t) {
            if (!y4Var.f328312t) {
                zy2.zb.y6(this, ml2.z4.A, java.lang.String.valueOf(action.f327909d), null, 4, null);
                return;
            }
            y4Var.getClass();
            int ordinal2 = action.ordinal();
            Mj(ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? ordinal2 != 6 ? ordinal2 != 10 ? ml2.p1.f327779e : ml2.p1.f327784m : ml2.p1.f327783i : ml2.p1.f327782h : ml2.p1.f327781g : ml2.p1.f327780f);
        }
    }

    public final void Yj(ml2.w1 exitType) {
        kotlin.jvm.internal.o.g(exitType, "exitType");
        ml2.y4 y4Var = f327583i;
        y4Var.getClass();
        y4Var.f328285J = exitType;
    }

    public final java.lang.String Zi() {
        lo0.b0 b0Var = ko0.c0.f309825a.b().f319996e;
        java.lang.String str = b0Var.f319967a;
        ml2.y4 y4Var = f327583i;
        y4Var.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        y4Var.f328300h = str;
        y4Var.f328301i = b0Var.f319974h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", y4Var.f328300h);
        jSONObject.put("result", y4Var.f328301i);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final void Zj(java.lang.String enterJsonstr) {
        kotlin.jvm.internal.o.g(enterJsonstr, "enterJsonstr");
        try {
            int optInt = new org.json.JSONObject(enterJsonstr).optInt("entericontype");
            ml2.i4 i4Var = ml2.i4.f327567o;
            if (optInt == 1001) {
                ml2.y4 y4Var = f327583i;
                y4Var.getClass();
                y4Var.I = i4Var;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellLiveReport", "setEnterType error:" + e17.getMessage());
        }
    }

    public final void aj(java.lang.String str, long j17, long j18) {
        ml2.y4 y4Var = f327583i;
        y4Var.getClass();
        if (str == null) {
            str = "";
        }
        y4Var.C = str;
        y4Var.D = pm0.v.u(j17);
        y4Var.E = pm0.v.u(j18);
    }

    public final void ak(int i17) {
        f327583i.N = i17;
    }

    public final java.util.Map bj(ml2.s1 status) {
        kotlin.jvm.internal.o.g(status, "status");
        return kz5.c1.l(new jz5.l("anchor_status", java.lang.String.valueOf(status.f327918d)));
    }

    public final void bk(ml2.x3 coverType) {
        kotlin.jvm.internal.o.g(coverType, "coverType");
        int ordinal = coverType.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "invalid setStartLiveCoverSourceType! " + coverType);
                    return;
            }
        }
        ml2.y4 y4Var = f327583i;
        y4Var.getClass();
        y4Var.P = coverType;
    }

    public final org.json.JSONObject cj(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        if (jSONObject == null && jSONObject2 != null) {
            return jSONObject2;
        }
        if (jSONObject != null && jSONObject2 == null) {
            return jSONObject;
        }
        if (jSONObject != null && jSONObject2 != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        }
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        return jSONObject2;
    }

    public final void ck(ml2.y3 source) {
        kotlin.jvm.internal.o.g(source, "source");
        ml2.y4 y4Var = f327583i;
        y4Var.getClass();
        y4Var.f328291c0 = source;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r1.equals("999") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r1.equals("102") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r1.equals("101") == false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String dk(java.lang.String r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "commentscene"
            kotlin.jvm.internal.o.g(r4, r0)
            r0 = 0
            if (r5 == 0) goto L13
            java.lang.String r1 = "tab_type"
            int r5 = r5.getIntExtra(r1, r0)
            r1 = 9
            if (r5 != r1) goto L13
            r0 = 1
        L13:
            java.lang.String r5 = "25"
            boolean r1 = kotlin.jvm.internal.o.b(r4, r5)
            if (r1 == 0) goto L81
            java.lang.Class<n30.r> r1 = n30.r.class
            i95.m r1 = i95.n0.c(r1)
            n30.r r1 = (n30.r) r1
            m30.m r1 = (m30.m) r1
            r1.getClass()
            v52.c r1 = v52.c.g()
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L81
            java.lang.Class<r30.n> r2 = r30.n.class
            i95.m r2 = i95.n0.c(r2)
            r30.n r2 = (r30.n) r2
            q30.i r2 = (q30.i) r2
            boolean r2 = r2.wi(r1)
            if (r2 != 0) goto L81
            int r4 = r1.hashCode()
            switch(r4) {
                case 48626: goto L73;
                case 48627: goto L6a;
                case 48690: goto L5e;
                case 48780: goto L53;
                case 56601: goto L4a;
                default: goto L49;
            }
        L49:
            goto L7b
        L4a:
            java.lang.String r4 = "999"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
            goto L7b
        L53:
            java.lang.String r4 = "150"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L7b
            java.lang.String r4 = "15"
            goto L81
        L5e:
            java.lang.String r4 = "123"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L67
            goto L7b
        L67:
            java.lang.String r4 = "38"
            goto L81
        L6a:
            java.lang.String r4 = "102"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
            goto L7b
        L73:
            java.lang.String r4 = "101"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L80
        L7b:
            if (r0 == 0) goto L80
            java.lang.String r4 = "39"
            goto L81
        L80:
            r4 = r5
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.dk(java.lang.String, android.content.Intent):java.lang.String");
    }

    public final void ek(org.json.JSONObject chnlExtra) {
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "updateAnchorBaseChnlExtra chnlExtra: " + chnlExtra + " anchorBaseChnlExtra: " + this.f327587d);
        org.json.JSONObject jSONObject = this.f327587d;
        if (jSONObject == null) {
            this.f327587d = chnlExtra;
        } else {
            this.f327587d = cj(chnlExtra, jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fj(km2.m r17, dk2.x4 r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.fj(km2.m, dk2.x4, int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void hj(long j17, java.lang.String str, java.lang.String str2) {
        ml2.c1 c1Var = ml2.c1.f327325e;
        ml2.y4 y4Var = f327583i;
        if (j17 == 2) {
            ml2.y3 y3Var = y4Var.f328317y;
            kotlin.jvm.internal.o.g(y3Var, "<set-?>");
            y4Var.f328291c0 = y3Var;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        finderLiveStreamStruct.f57382d = finderLiveStreamStruct.b("FinderUsrname", y4Var.f(), true);
        finderLiveStreamStruct.f57383e = finderLiveStreamStruct.b("FinderWxAppInfo", y4Var.i(), true);
        finderLiveStreamStruct.f57384f = y4Var.k();
        finderLiveStreamStruct.f57385g = finderLiveStreamStruct.b("FinderSessionId", y4Var.h(), true);
        finderLiveStreamStruct.f57386h = java.lang.System.currentTimeMillis();
        gk2.e eVar = gk2.e.f272471n;
        finderLiveStreamStruct.f57392n = eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).O7() : 0;
        if (j17 == 15) {
            ml2.r2 r2Var = ml2.r2.f327896e;
            if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(1))) {
                y4Var.f328308p = r2Var;
            } else {
                ml2.r2 r2Var2 = ml2.r2.f327897f;
                if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(2))) {
                    y4Var.f328308p = r2Var2;
                }
            }
        }
        finderLiveStreamStruct.f57387i = j17;
        finderLiveStreamStruct.p(str != null ? r26.i0.t(str, ",", ";", false) : "");
        finderLiveStreamStruct.f57389k = y4Var.f328291c0.f328284d;
        finderLiveStreamStruct.f57391m = finderLiveStreamStruct.b("Params", str2, true);
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21017: finderUsrname=" + finderLiveStreamStruct.f57382d + ", finderWxAppInfo=" + finderLiveStreamStruct.f57383e + ", isPrivate=" + finderLiveStreamStruct.f57384f + ", finderSessionId=" + finderLiveStreamStruct.f57385g + ", actionTimeMs=" + finderLiveStreamStruct.f57386h + ", actionType=" + finderLiveStreamStruct.f57387i + ", sourceScene=" + finderLiveStreamStruct.f57389k + ", actionJson=" + finderLiveStreamStruct.f57388j + ", params=" + finderLiveStreamStruct.f57391m + ",ScreenType=" + finderLiveStreamStruct.f57392n);
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }

    public void ij(int i17, int i18, long j17, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("entrance_type", i18);
        jSONObject.put("entrance_id", j17);
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f233372a.i(mm2.g1.class);
        if (g1Var != null) {
            java.lang.Integer num = g1Var.f329082w;
            java.lang.Long l17 = g1Var.f329083x;
            java.lang.String str = g1Var.f329084y;
            if (num != null && l17 != null && str != null) {
                long longValue = l17.longValue();
                jSONObject.put("strategy_id", num.intValue());
                jSONObject.put("guide_live_id", longValue);
                jSONObject.put("guide_finderusername", str);
            }
        }
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "#report21017ForAnchorLivePath " + jSONObject);
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(this, 36L, jSONObject.toString(), null, 4, null);
    }

    public void mj(int i17) {
        ml2.c1 c1Var = ml2.c1.f327325e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        zy2.zb.j5(this, 52L, jSONObject.toString(), null, 4, null);
    }

    public final void nj(ml2.w1 type) {
        java.lang.String str;
        kotlinx.coroutines.flow.j2 j2Var;
        r45.aa0 aa0Var;
        java.lang.String jSONObject;
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.autogen.mmdata.rpt.FinderStartLiveResultStruct finderStartLiveResultStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderStartLiveResultStruct();
        ml2.y4 y4Var = f327583i;
        finderStartLiveResultStruct.f57849d = finderStartLiveResultStruct.b("FinderUsrname", y4Var.f(), true);
        finderStartLiveResultStruct.f57850e = finderStartLiveResultStruct.b("FinderWxAppInfo", y4Var.i(), true);
        finderStartLiveResultStruct.f57851f = y4Var.k();
        finderStartLiveResultStruct.f57852g = finderStartLiveResultStruct.b("FinderSessionId", y4Var.h(), true);
        finderStartLiveResultStruct.f57853h = java.lang.System.currentTimeMillis();
        finderStartLiveResultStruct.f57864s = type.f328180d;
        finderStartLiveResultStruct.f57854i = g92.a.I1(g92.b.f269769e, false, 1, null) != null ? r2.u0().getInteger(20) : 0;
        finderStartLiveResultStruct.f57855j = vn0.b.f438174a.b().f455410a == 0 ? 2 : 1;
        finderStartLiveResultStruct.f57856k = y4Var.K;
        finderStartLiveResultStruct.f57857l = java.lang.System.currentTimeMillis() - finderStartLiveResultStruct.f57856k;
        finderStartLiveResultStruct.f57859n = y4Var.L;
        org.json.JSONObject jSONObject2 = y4Var.M;
        java.lang.String t17 = (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : r26.i0.t(jSONObject, ",", ";", false);
        y4Var.M = null;
        finderStartLiveResultStruct.f57860o = finderStartLiveResultStruct.b("PoiJson", t17, true);
        java.lang.String str2 = y4Var.O;
        java.lang.String t18 = str2 != null ? r26.i0.t(str2, ",", ";", false) : "";
        y4Var.O = null;
        finderStartLiveResultStruct.f57861p = finderStartLiveResultStruct.b("Description", t18, true);
        finderStartLiveResultStruct.f57858m = y4Var.P.f328233d;
        finderStartLiveResultStruct.f57867v = finderStartLiveResultStruct.b("ShopWindowId", "", true);
        finderStartLiveResultStruct.f57866u = finderStartLiveResultStruct.b("GoodsListJson", "", true);
        java.util.Iterator it = y4Var.Z.iterator();
        while (it.hasNext()) {
            finderStartLiveResultStruct.f57866u = finderStartLiveResultStruct.b("GoodsListJson", finderStartLiveResultStruct.f57866u + ((java.lang.Long) it.next()).longValue() + '#', true);
        }
        java.lang.String str3 = finderStartLiveResultStruct.f57866u;
        kotlin.jvm.internal.o.f(str3, "getGoodsListJson(...)");
        if (r26.i0.n(str3, "#", false)) {
            java.lang.String str4 = finderStartLiveResultStruct.f57866u;
            kotlin.jvm.internal.o.f(str4, "getGoodsListJson(...)");
            java.lang.String substring = str4.substring(0, finderStartLiveResultStruct.f57866u.length() - 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            finderStartLiveResultStruct.f57866u = finderStartLiveResultStruct.b("GoodsListJson", substring, true);
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            ml2.y4 y4Var2 = f327583i;
            synchronized (y4Var2.f328293d0) {
                for (java.util.Map.Entry entry : y4Var2.f328293d0.entrySet()) {
                    jSONObject3.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
            jSONObject3.put("detail_set_list", dk2.ug.f234218a.a());
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
            jSONObject3.put("display_mode", (e1Var == null || (j2Var = e1Var.E) == null || (aa0Var = (r45.aa0) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null) ? 0 : aa0Var.f369868d);
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        finderStartLiveResultStruct.I = finderStartLiveResultStruct.b("ChnlExtra", r26.i0.t(jSONObject4, ",", ";", false), true);
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            ml2.y4 y4Var3 = f327583i;
            finderStartLiveResultStruct.f57862q = finderStartLiveResultStruct.b("LiveId", y4Var3.c(), true);
            finderStartLiveResultStruct.f57863r = finderStartLiveResultStruct.b("FeedId", y4Var3.b(), true);
            finderStartLiveResultStruct.f57865t = finderStartLiveResultStruct.b("ErrorCode", "0", true);
        } else if (ordinal == 1) {
            ml2.y4 y4Var4 = f327583i;
            finderStartLiveResultStruct.f57862q = finderStartLiveResultStruct.b("LiveId", y4Var4.c(), true);
            finderStartLiveResultStruct.f57863r = finderStartLiveResultStruct.b("FeedId", y4Var4.b(), true);
            finderStartLiveResultStruct.f57865t = finderStartLiveResultStruct.b("ErrorCode", java.lang.String.valueOf(y4Var4.N), true);
        } else if (ordinal == 2) {
            finderStartLiveResultStruct.f57862q = finderStartLiveResultStruct.b("LiveId", "0", true);
            finderStartLiveResultStruct.f57863r = finderStartLiveResultStruct.b("FeedId", "0", true);
            finderStartLiveResultStruct.f57865t = finderStartLiveResultStruct.b("ErrorCode", java.lang.String.valueOf(f327583i.N), true);
        } else if (ordinal == 3) {
            finderStartLiveResultStruct.f57862q = finderStartLiveResultStruct.b("LiveId", "0", true);
            finderStartLiveResultStruct.f57863r = finderStartLiveResultStruct.b("FeedId", "0", true);
            finderStartLiveResultStruct.f57865t = finderStartLiveResultStruct.b("ErrorCode", "0", true);
            ml2.y4 y4Var5 = f327583i;
            y4Var5.getClass();
            y4Var5.f328315w = "";
            y4Var5.f328316x = "";
            y4Var5.A = ml2.a4.f327204e;
            y4Var5.B = 0L;
        }
        ml2.y4 y4Var6 = f327583i;
        y4Var6.getClass();
        finderStartLiveResultStruct.f57869x = finderStartLiveResultStruct.b("RetouchResult", "0;0;0;0;0", true);
        finderStartLiveResultStruct.f57870y = finderStartLiveResultStruct.b("FiltersResult", Zi(), true);
        finderStartLiveResultStruct.B = finderStartLiveResultStruct.b("ConnectSwitch", java.lang.String.valueOf(y4Var6.f328308p.f327899d), true);
        finderStartLiveResultStruct.f57868w = y4Var6.f328291c0.f328284d;
        finderStartLiveResultStruct.f57871z = finderStartLiveResultStruct.b("Tag", fp.s0.b(y4Var6.f328315w, com.tencent.mapsdk.internal.rv.f51270c), true);
        finderStartLiveResultStruct.A = finderStartLiveResultStruct.b("SubTag", fp.s0.b(y4Var6.f328316x, com.tencent.mapsdk.internal.rv.f51270c), true);
        ml2.a4 a4Var = y4Var6.A;
        finderStartLiveResultStruct.C = a4Var.f327207d;
        finderStartLiveResultStruct.D = a4Var == ml2.a4.f327205f ? y4Var6.B : 0L;
        finderStartLiveResultStruct.E = finderStartLiveResultStruct.b("BeautyResult", dk2.b.f233228a.a(), true);
        lo0.k0 k0Var = ko0.l0.f309878a.b().f320063d;
        lo0.b0 b0Var = ko0.c0.f309825a.b().f319996e;
        try {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("Beautytype", k0Var.f320035a);
            jSONObject5.put("Filtertype", b0Var.f319967a);
            jSONObject5.put("Filtervalue", a06.d.a(b0Var.f319974h * 100.0d));
            java.lang.String jSONObject6 = jSONObject5.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            str = r26.i0.t(jSONObject6, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MakeupSuitDataManager", e17.toString());
            str = "";
        }
        finderStartLiveResultStruct.H = finderStartLiveResultStruct.b("MeizhuangResult", str, true);
        finderStartLiveResultStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", "report21024: chnl_extra:" + finderStartLiveResultStruct.I);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report21024: finderUsrname=");
        sb6.append(finderStartLiveResultStruct.f57849d);
        sb6.append(", finderWxAppInfo=");
        sb6.append(finderStartLiveResultStruct.f57850e);
        sb6.append(", isPrivate=");
        sb6.append(finderStartLiveResultStruct.f57851f);
        sb6.append(", finderSessionId=");
        sb6.append(finderStartLiveResultStruct.f57852g);
        sb6.append(", actionTimeMs=");
        sb6.append(finderStartLiveResultStruct.f57853h);
        sb6.append(", exitType=");
        sb6.append(finderStartLiveResultStruct.f57864s);
        sb6.append(", fansCount=");
        sb6.append(finderStartLiveResultStruct.f57854i);
        sb6.append(", cameraStatus=");
        sb6.append(finderStartLiveResultStruct.f57855j);
        sb6.append(", enterUITimeMs=");
        sb6.append(finderStartLiveResultStruct.f57856k);
        sb6.append(", stayTimeMs=");
        sb6.append(finderStartLiveResultStruct.f57857l);
        sb6.append(", coverType=");
        sb6.append(finderStartLiveResultStruct.f57858m);
        sb6.append(", ruleType=");
        sb6.append(finderStartLiveResultStruct.f57859n);
        sb6.append(", poiJson=");
        sb6.append(finderStartLiveResultStruct.f57860o);
        sb6.append(", description=");
        sb6.append(finderStartLiveResultStruct.f57861p);
        sb6.append(", liveId=");
        sb6.append(finderStartLiveResultStruct.f57862q);
        sb6.append(", feedId=");
        sb6.append(finderStartLiveResultStruct.f57863r);
        sb6.append(", errorCode=");
        sb6.append(finderStartLiveResultStruct.f57865t);
        sb6.append(", goodsListJson=");
        sb6.append(finderStartLiveResultStruct.f57866u);
        sb6.append(", retouchResult=");
        sb6.append(finderStartLiveResultStruct.f57869x);
        sb6.append(", filtersResult=");
        sb6.append(finderStartLiveResultStruct.f57870y);
        sb6.append(", connectSwitch=");
        sb6.append(finderStartLiveResultStruct.B);
        sb6.append(", sourceScene=");
        sb6.append(finderStartLiveResultStruct.f57868w);
        sb6.append(", tag=");
        ml2.y4 y4Var7 = f327583i;
        sb6.append(y4Var7.f328315w);
        sb6.append(", subTag=");
        sb6.append(y4Var7.f328316x);
        sb6.append(", visibleRange=");
        sb6.append(finderStartLiveResultStruct.C);
        sb6.append(", beautyResult=");
        sb6.append(finderStartLiveResultStruct.E);
        sb6.append(", shopWindowId=");
        sb6.append(finderStartLiveResultStruct.f57867v);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveReport", sb6.toString());
    }

    public void oj(androidx.recyclerview.widget.RecyclerView recyclerView, ml2.x1 actionType, java.lang.String commentscene, ml2.y event, int i17, long j17, int i18) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(event, "event");
        android.content.Context context = recyclerView != null ? recyclerView.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String dk6 = dk(commentscene, activity != null ? activity.getIntent() : null);
        com.tencent.mars.xlog.Log.i("Audience21053ReportKarl", "before commentScene: " + commentscene + ", new commentScene: " + dk6);
        f327584m.g(recyclerView, actionType, dk6, event, i17, j17, i18);
    }

    public void pj(long j17, long j18, java.lang.String str, java.lang.String str2, long j19, long j27, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra, int i17, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        wi(new ml2.v0(j17, j18, str, str2 == null ? "" : str2, j19, j27, actionType, commentscene, 0L, 0L, null, null, i17, "", "", chnlExtra, null, finderObject, 69376, null), null);
    }

    public void qj(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra, java.lang.String str) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        long itemId = feed.getItemId();
        r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
        wi(new ml2.v0(itemId, liveInfo != null ? liveInfo.getLong(0) : 0L, feed.w(), feed.getFeedObject().getUserName(), j17, feed.getFeedObject().getLiveInfo() != null ? r2.getInteger(1) : -1L, actionType, commentscene, 0L, 0L, null, null, 0, null, null, chnlExtra, null, feed.getFeedObject().getFeedObject(), 98048, null), str);
    }

    public void rj(so2.j1 j1Var, java.lang.String str, long j17, ml2.x1 actionType, java.lang.String commentscene) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        if (j1Var == null) {
            wi(new ml2.v0(0L, 0L, null, str == null ? "" : str, j17, -1L, actionType, commentscene, 0L, 0L, null, null, 0, null, null, null, null, null, 261888, null), null);
            return;
        }
        long itemId = j1Var.getItemId();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = j1Var.f410439d;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        long j18 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        r45.dm2 object_extend = finderObject.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        java.lang.String username = finderObject.getUsername();
        if (username == null) {
            username = "";
        }
        wi(new ml2.v0(itemId, j18, string, username, j17, finderObject.getLiveInfo() != null ? r2.getInteger(1) : -1L, actionType, commentscene, 0L, 0L, null, null, 0, null, null, null, null, j1Var.f410439d, 130816, null), null);
    }

    public void sj(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, long j17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String clickTabContextId, java.lang.String clickSubTabContextId, java.lang.String chnlExtra) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        r45.nw1 liveInfo2;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(clickSubTabContextId, "clickSubTabContextId");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        ae2.in inVar = ae2.in.f3688a;
        java.lang.String sessionBuffer = (baseFinderFeed == null || !(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).getValue()).r()).intValue() == 1)) ? "" : baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer();
        long j18 = 0;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        if (baseFinderFeed != null && (feedObject4 = baseFinderFeed.getFeedObject()) != null && (liveInfo2 = feedObject4.getLiveInfo()) != null) {
            j18 = liveInfo2.getLong(0);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = null;
        java.lang.String w17 = baseFinderFeed != null ? baseFinderFeed.w() : null;
        if (baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null || (str = feedObject3.getUserName()) == null) {
            str = "";
        }
        long integer = (baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject2.getLiveInfo()) == null) ? -1L : liveInfo.getInteger(1);
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null) {
            finderObject = feedObject.getFeedObject();
        }
        wi(new ml2.v0(itemId, j18, w17, str, j17, integer, actionType, commentscene, 0L, 0L, null, null, 0, clickTabContextId, clickSubTabContextId, chnlExtra, null, finderObject, 73472, null), sessionBuffer);
    }

    public void tj(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, java.lang.String commentscene) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        ml2.x1 x1Var = feed.h() == 9 ? ml2.x1.f328205i : ml2.x1.f328206m;
        long itemId = feed.getItemId();
        r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
        wi(new ml2.v0(itemId, liveInfo != null ? liveInfo.getLong(0) : 0L, feed.w(), feed.getFeedObject().getUserName(), j17, feed.getFeedObject().getLiveInfo() != null ? r2.getInteger(1) : -1L, x1Var, commentscene, 0L, 0L, null, null, 0, null, null, null, null, feed.getFeedObject().getFeedObject(), 130816, null), null);
    }

    public void uj(ml2.w0 enterData) {
        java.lang.String Gj;
        java.lang.String str;
        kotlin.jvm.internal.o.g(enterData, "enterData");
        long j17 = enterData.f328159d;
        java.lang.String str2 = enterData.f328162g;
        Ui(j17, str2);
        ml2.y4 y4Var = f327583i;
        ml2.y4.o(y4Var, enterData.f328161f, enterData.f328168m.f327569d, null, 4, null);
        ml2.d dVar = f327584m;
        dVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vi(finderLiveEntranceLogStruct, enterData.f328158c);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.t(b52.b.q(enterData.f328156a));
        long j18 = enterData.f328157b;
        finderLiveEntranceLogStruct.f57122e = j18;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.u(b52.b.q(j18));
        ml2.x1 x1Var = enterData.f328161f;
        finderLiveEntranceLogStruct.f57126i = x1Var.f328220d;
        finderLiveEntranceLogStruct.r(str2);
        finderLiveEntranceLogStruct.f57128k = j17;
        finderLiveEntranceLogStruct.f57129l = enterData.f328163h;
        finderLiveEntranceLogStruct.f57130m = enterData.f328164i;
        finderLiveEntranceLogStruct.w(enterData.f328165j);
        finderLiveEntranceLogStruct.f57138u = finderLiveEntranceLogStruct.b("SnsFeedId", enterData.f328166k, true);
        finderLiveEntranceLogStruct.f57133p = enterData.f328160e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderLiveEntranceLogStruct.q(b52.b.c());
        java.lang.String str3 = enterData.f328173r;
        if (str3.length() == 0) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            Gj = b52.b.b();
        } else {
            Gj = c01.e2.S(str3) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(31, 2, 65) : com.tencent.mm.storage.z3.R4(str3) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65) : com.tencent.mm.storage.z3.p4(str3) ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(58, 2, 65) : ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(2, 2, 65);
        }
        finderLiveEntranceLogStruct.s(Gj);
        finderLiveEntranceLogStruct.p(dVar.e(x1Var, dVar.a(r26.i0.v(dVar.f(enterData.f328172q, str3), ",", ";", false, 4, null), "entrance_gmsg_id", enterData.f328174s)));
        if (!r26.i0.y(str2, "temp_", false)) {
            finderLiveEntranceLogStruct.v(ml2.d.d(dVar, enterData.f328156a, com.tencent.mm.sdk.platformtools.b8.c(finderLiveEntranceLogStruct.f57127j), null, 4, null));
        } else if (kotlin.jvm.internal.o.b(finderLiveEntranceLogStruct.f57127j, "temp_2")) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            finderLiveEntranceLogStruct.v(y4Var.f328318z);
        } else {
            finderLiveEntranceLogStruct.v(enterData.f328169n);
        }
        finderLiveEntranceLogStruct.f57139v = enterData.f328167l;
        finderLiveEntranceLogStruct.f57140w = r12.f327569d;
        if (kotlin.jvm.internal.o.b(finderLiveEntranceLogStruct.f57127j, com.tencent.maas.MJMaasVersion.BUILD_NUMBER) || kotlin.jvm.internal.o.b(((m30.o) ((n30.s) i95.n0.c(n30.s.class))).wi(), "123")) {
            if (android.text.TextUtils.isEmpty(p52.h.f352027l)) {
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                str = v52.c.g().d();
            } else {
                str = p52.h.f352027l;
            }
            finderLiveEntranceLogStruct.f57141x = finderLiveEntranceLogStruct.b("SnsSessionID", str, true);
        }
        finderLiveEntranceLogStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.Audience21053Report", "report21053OnClickOnShare, struct=\nfeedId=" + finderLiveEntranceLogStruct.f57123f + "\nliveId=" + finderLiveEntranceLogStruct.f57137t + "\nuserName=" + finderLiveEntranceLogStruct.f57121d + "\nisPrivate=" + finderLiveEntranceLogStruct.f57135r + "\nsessionID=" + finderLiveEntranceLogStruct.f57124g + "\nactionTS=" + finderLiveEntranceLogStruct.f57125h + "\naction=" + finderLiveEntranceLogStruct.f57126i + "\ncommentScene=" + finderLiveEntranceLogStruct.f57127j + "\nindex=" + finderLiveEntranceLogStruct.f57128k + "\nenterStatus=" + finderLiveEntranceLogStruct.f57129l + "\ncontextId=" + finderLiveEntranceLogStruct.f57132o + "\nonlineNum=" + finderLiveEntranceLogStruct.f57133p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f57134q + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f57136s + "\nshareType=" + finderLiveEntranceLogStruct.f57130m + "\nshareUserName=" + finderLiveEntranceLogStruct.f57131n + "\nenterSessionId=" + finderLiveEntranceLogStruct.f57139v + "\nenterIconType=" + finderLiveEntranceLogStruct.f57140w + "\nsnsSessionID=" + finderLiveEntranceLogStruct.f57141x + "\nchnl_extra=" + finderLiveEntranceLogStruct.f57142y + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f57138u);
    }

    public final void vj(long j17, long j18, java.lang.String str, long j19, long j27, ml2.x1 actionType, java.lang.String commentscene, long j28, long j29, ml2.i4 enterType, java.lang.String str2, java.lang.String clickSubTabContextId, java.lang.String chnlExtra) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(enterType, "enterType");
        kotlin.jvm.internal.o.g(clickSubTabContextId, "clickSubTabContextId");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        if (!android.text.TextUtils.isEmpty(commentscene)) {
            Ai(new ml2.w0(j17, j18, str == null ? "" : str, j19, j27, actionType, commentscene, j28, -1L, "", "", j29, enterType, str2 == null ? "" : str2, null, clickSubTabContextId, chnlExtra, null, null, com.tencent.tmassistantsdk.downloadservice.Downloads.SPLIT_RANGE_SIZE_WAP, null));
            return;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String e17 = v52.c.g().e();
        if (((q30.i) ((r30.n) i95.n0.c(r30.n.class))).wi(e17)) {
            java.lang.String str3 = str == null ? "" : str;
            ml2.q1 q1Var = ml2.q1.f327812e;
            ((q30.i) ((r30.n) i95.n0.c(r30.n.class))).getClass();
            long a17 = p52.j.f352042a.a(e17);
            java.lang.String str4 = p52.h.f352021f;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = p52.h.f352022g;
            Ai(new ml2.w0(j17, j18, str3, 0L, j27, actionType, "temp_6", j28, a17, str5, str6 == null ? "" : str6, j29, enterType, null, null, clickSubTabContextId, chnlExtra, null, null, 417792, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(ml2.v0 r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.j0.wi(ml2.v0, java.lang.String):void");
    }

    public void wj(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, ml2.x1 actionType, java.lang.String commentscene, java.lang.String chnlExtra, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        long itemId = feed.getItemId();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(itemId);
        ml2.d0 d0Var = ml2.f0.A;
        nm5.c a17 = d0Var.a(feed);
        java.lang.String userName = feed.getFeedObject().getUserName();
        kotlin.jvm.internal.o.d(q17);
        java.lang.Object a18 = a17.a(0);
        kotlin.jvm.internal.o.f(a18, "$1(...)");
        long longValue = ((java.lang.Number) a18).longValue();
        java.lang.Object a19 = a17.a(1);
        kotlin.jvm.internal.o.f(a19, "$2(...)");
        int intValue = ((java.lang.Number) a19).intValue();
        java.lang.String b17 = d0Var.b(feed);
        ml2.e0 e0Var = ml2.e0.f327370e;
        java.lang.Object a27 = a17.a(2);
        kotlin.jvm.internal.o.f(a27, "$3(...)");
        f327584m.i(new ml2.f0(feed, userName, i17, q17, itemId, longValue, actionType, commentscene, intValue, b17, e0Var, true, ((java.lang.Boolean) a27).booleanValue(), 0, null, null, chnlExtra, null, 0L, null, 0, 0L, 0, null, null, null, 67035136, null), str);
    }

    public final void xj(androidx.recyclerview.widget.RecyclerView recyclerView, ml2.x1 actionType, java.lang.String commentscene, ml2.y event, int i17, int i18) {
        java.lang.String str;
        ml2.y yVar;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(event, "event");
        if (kotlin.jvm.internal.o.b(commentscene, "80") || kotlin.jvm.internal.o.b(commentscene, "94")) {
            p52.c cVar = p52.h.f352016a;
            str = p52.h.f352017b ? "80" : "94";
        } else {
            str = commentscene;
        }
        ml2.y yVar2 = ml2.y.f328240e;
        if (event == yVar2) {
            f327583i.getClass();
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        rq2.x xVar = rq2.x.f398914a;
        ((m30.m) rVar).Bi(rq2.x.f398915b);
        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        ((m30.m) rVar2).Di(rq2.x.f398919f);
        if (i17 == -1 && this.f327591h.contains(java.lang.Integer.valueOf(i18))) {
            p52.h.f352028m = i18;
            return;
        }
        int i19 = this.f327588e;
        if (i17 != i19 && i18 != i19) {
            p52.h.f352028m = i18;
            if (i17 == 1001) {
                yVar2 = ml2.y.f328241f;
            } else if (i18 != 1001) {
                return;
            }
            yVar = yVar2;
        } else if ((event == yVar2 || event == ml2.y.f328241f) && p52.h.f352028m != 1001) {
            return;
        } else {
            yVar = event;
        }
        f327584m.g(recyclerView, actionType, str, yVar, 0, -1L, 0);
    }

    public void yj(ml2.z4 actionType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        if (zl2.r4.f473950a.w1()) {
            Ej(actionType, str, str2);
        }
    }

    public final void zj(ml2.c5 action) {
        kotlin.jvm.internal.o.g(action, "action");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", action.f327347d);
        zy2.zb.y6(this, ml2.z4.D2, jSONObject.toString(), null, 4, null);
    }
}
