package rq4;

/* loaded from: classes14.dex */
public final class j {
    public long A;
    public int B;
    public int C;
    public int D;
    public long E;
    public long F;
    public long G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f398987J;
    public long K;
    public long L;
    public long M;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f398991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f398992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f398993f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f398994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f398995h;

    /* renamed from: o, reason: collision with root package name */
    public int f399002o;

    /* renamed from: p, reason: collision with root package name */
    public int f399003p;

    /* renamed from: q, reason: collision with root package name */
    public int f399004q;

    /* renamed from: r, reason: collision with root package name */
    public long f399005r;

    /* renamed from: s, reason: collision with root package name */
    public long f399006s;

    /* renamed from: t, reason: collision with root package name */
    public long f399007t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f399008u;

    /* renamed from: v, reason: collision with root package name */
    public long f399009v;

    /* renamed from: w, reason: collision with root package name */
    public long f399010w;

    /* renamed from: x, reason: collision with root package name */
    public int f399011x;

    /* renamed from: y, reason: collision with root package name */
    public int f399012y;

    /* renamed from: z, reason: collision with root package name */
    public int f399013z;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f398988a = vq4.b0.f439270a.a();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f398989b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f398990c = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f398996i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f398997j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashSet f398998k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashSet f398999l = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f399000m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f399001n = new java.util.HashSet();

    public final void a() {
        char c17;
        long j17;
        java.lang.String str;
        java.util.Iterator it;
        sq4.b bVar;
        sq4.b bVar2;
        sq4.b bVar3;
        sq4.b bVar4;
        sq4.b bVar5;
        long j18 = gq4.v.wi().f365984r;
        long j19 = gq4.v.wi().f365983q;
        com.tencent.mm.autogen.mmdata.rpt.VoipRenderReportStruct voipRenderReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipRenderReportStruct();
        cl0.g gVar = new cl0.g();
        java.lang.String str2 = this.f398995h;
        java.util.HashMap hashMap = this.f398989b;
        if (str2 != null && (bVar5 = (sq4.b) hashMap.get(str2)) != null) {
            bVar5.a();
        }
        java.lang.String str3 = this.f398991d;
        if (str3 != null && (bVar4 = (sq4.b) hashMap.get(str3)) != null) {
            bVar4.a();
        }
        java.lang.String str4 = this.f398993f;
        if (str4 != null && (bVar3 = (sq4.b) hashMap.get(str4)) != null) {
            bVar3.a();
        }
        java.lang.String str5 = this.f398992e;
        if (str5 != null && (bVar2 = (sq4.b) hashMap.get(str5)) != null) {
            bVar2.a();
        }
        java.lang.String str6 = this.f398994g;
        if (str6 != null && (bVar = (sq4.b) hashMap.get(str6)) != null) {
            bVar.a();
        }
        java.util.Iterator it6 = this.f398997j.iterator();
        while (true) {
            c17 = '*';
            if (!it6.hasNext()) {
                break;
            }
            android.util.Size size = (android.util.Size) it6.next();
            sq4.b bVar6 = (sq4.b) hashMap.get("LocalDrawSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (bVar6 != null) {
                sq4.c c18 = bVar6.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                gVar.h(sb6.toString(), q(size, c18.f411385b, c18.f411384a));
            }
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        java.lang.String str7 = ";";
        voipRenderReportStruct.f61835k = voipRenderReportStruct.b("LocalDrawSize", r26.i0.t(gVar2, ",", ";", false), true);
        cl0.g gVar3 = new cl0.g();
        java.util.Iterator it7 = this.f398999l.iterator();
        while (it7.hasNext()) {
            android.util.Size size2 = (android.util.Size) it7.next();
            sq4.b bVar7 = (sq4.b) hashMap.get("RemoteDrawSizeChange_" + size2.getWidth() + c17 + size2.getHeight());
            if (bVar7 != null) {
                sq4.c c19 = bVar7.c();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                it = it7;
                sb7.append(size2.getWidth());
                sb7.append(c17);
                sb7.append(size2.getHeight());
                str = str7;
                gVar3.h(sb7.toString(), q(size2, c19.f411385b, c19.f411384a));
            } else {
                str = str7;
                it = it7;
            }
            it7 = it;
            str7 = str;
            c17 = '*';
        }
        java.lang.String gVar4 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        voipRenderReportStruct.f61837m = voipRenderReportStruct.b("RemoteDrawSize", r26.i0.t(gVar4, ",", str7, false), true);
        cl0.g gVar5 = new cl0.g();
        java.util.Iterator it8 = this.f398996i.iterator();
        while (it8.hasNext()) {
            android.util.Size size3 = (android.util.Size) it8.next();
            sq4.b bVar8 = (sq4.b) hashMap.get("LocalTextureSizeChange_" + size3.getWidth() + '*' + size3.getHeight());
            if (bVar8 != null) {
                sq4.c c27 = bVar8.c();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(size3.getWidth());
                sb8.append('*');
                sb8.append(size3.getHeight());
                j17 = j18;
                gVar5.h(sb8.toString(), q(size3, c27.f411385b, c27.f411384a));
            } else {
                j17 = j18;
            }
            j18 = j17;
        }
        long j27 = j18;
        java.lang.String gVar6 = gVar5.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        voipRenderReportStruct.f61836l = voipRenderReportStruct.b("LocalTextureSize", r26.i0.t(gVar6, ",", str7, false), true);
        cl0.g gVar7 = new cl0.g();
        java.util.Iterator it9 = this.f398998k.iterator();
        while (it9.hasNext()) {
            android.util.Size size4 = (android.util.Size) it9.next();
            sq4.b bVar9 = (sq4.b) hashMap.get("RemoteTextureSizeChange_" + size4.getWidth() + '*' + size4.getHeight());
            if (bVar9 != null) {
                sq4.c c28 = bVar9.c();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(size4.getWidth());
                sb9.append('*');
                sb9.append(size4.getHeight());
                gVar7.h(sb9.toString(), q(size4, c28.f411385b, c28.f411384a));
            }
        }
        java.lang.String gVar8 = gVar7.toString();
        kotlin.jvm.internal.o.f(gVar8, "toString(...)");
        voipRenderReportStruct.f61838n = voipRenderReportStruct.b("RemoteTextureSize", r26.i0.t(gVar8, ",", str7, false), true);
        cl0.g gVar9 = new cl0.g();
        java.util.Iterator it10 = this.f399000m.iterator();
        while (it10.hasNext()) {
            int intValue = ((java.lang.Number) it10.next()).intValue();
            sq4.b bVar10 = (sq4.b) hashMap.get("DrawLocalRotateChange" + intValue);
            if (bVar10 != null) {
                sq4.c c29 = bVar10.c();
                gVar9.h(java.lang.String.valueOf(intValue), r(intValue, c29.f411385b, c29.f411384a));
            }
        }
        java.lang.String gVar10 = gVar9.toString();
        kotlin.jvm.internal.o.f(gVar10, "toString(...)");
        voipRenderReportStruct.f61839o = voipRenderReportStruct.b("LocalRotate", r26.i0.t(gVar10, ",", str7, false), true);
        cl0.g gVar11 = new cl0.g();
        java.util.Iterator it11 = this.f399001n.iterator();
        while (it11.hasNext()) {
            int intValue2 = ((java.lang.Number) it11.next()).intValue();
            sq4.b bVar11 = (sq4.b) hashMap.get("DrawRemoteRotateChange" + intValue2);
            if (bVar11 != null) {
                sq4.c c37 = bVar11.c();
                gVar11.h(java.lang.String.valueOf(intValue2), r(intValue2, c37.f411385b, c37.f411384a));
            }
        }
        java.lang.String gVar12 = gVar11.toString();
        kotlin.jvm.internal.o.f(gVar12, "toString(...)");
        voipRenderReportStruct.f61840p = voipRenderReportStruct.b("RemoteRotate", r26.i0.t(gVar12, ",", str7, false), true);
        sq4.b bVar12 = (sq4.b) hashMap.get("DecodeChangeSoft");
        if (bVar12 != null) {
            bVar12.a();
        }
        sq4.b bVar13 = (sq4.b) hashMap.get("DecodeChangeSoft");
        if (bVar13 != null) {
            sq4.c c38 = bVar13.c();
            voipRenderReportStruct.f61833i = c38.f411384a;
            voipRenderReportStruct.f61834j = (int) c38.f411385b;
        }
        sq4.b bVar14 = (sq4.b) hashMap.get("DecodeChangeHard");
        if (bVar14 != null) {
            bVar14.a();
        }
        sq4.b bVar15 = (sq4.b) hashMap.get("DecodeChangeHard");
        if (bVar15 != null) {
            sq4.c c39 = bVar15.c();
            voipRenderReportStruct.f61830f = c39.f411384a;
            voipRenderReportStruct.f61832h = (int) c39.f411385b;
        }
        java.util.HashMap hashMap2 = this.f398990c;
        sq4.b bVar16 = (sq4.b) hashMap2.get("LocalSourceTimeoutNoFrame");
        if (bVar16 != null) {
            sq4.c c47 = bVar16.c();
            voipRenderReportStruct.f61841q = c47.f411384a;
            voipRenderReportStruct.f61842r = (int) c47.f411385b;
        }
        sq4.b bVar17 = (sq4.b) hashMap2.get("RemoteSourceTimeoutNoFrame");
        if (bVar17 != null) {
            sq4.c c48 = bVar17.c();
            voipRenderReportStruct.f61845u = c48.f411384a;
            voipRenderReportStruct.f61846v = (int) c48.f411385b;
        }
        sq4.b bVar18 = (sq4.b) hashMap2.get("LocalOnScreenTimeoutNoFrame");
        if (bVar18 != null) {
            sq4.c c49 = bVar18.c();
            voipRenderReportStruct.f61843s = c49.f411384a;
            voipRenderReportStruct.f61844t = (int) c49.f411385b;
        }
        sq4.b bVar19 = (sq4.b) hashMap2.get("RemoteOnScreenTimeoutNoFrame");
        if (bVar19 != null) {
            sq4.c c57 = bVar19.c();
            voipRenderReportStruct.f61847w = c57.f411384a;
            voipRenderReportStruct.f61848x = (int) c57.f411385b;
        }
        sq4.b bVar20 = (sq4.b) hashMap2.get("LocalTextureError");
        if (bVar20 != null) {
            bVar20.a();
        }
        sq4.b bVar21 = (sq4.b) hashMap2.get("LocalTextureError");
        if (bVar21 != null) {
            sq4.c c58 = bVar21.c();
            voipRenderReportStruct.f61849y = c58.f411384a;
            voipRenderReportStruct.f61850z = (int) c58.f411385b;
        }
        sq4.b bVar22 = (sq4.b) hashMap2.get("LocalDrawError");
        if (bVar22 != null) {
            bVar22.a();
        }
        sq4.b bVar23 = (sq4.b) hashMap2.get("LocalDrawError");
        if (bVar23 != null) {
            sq4.c c59 = bVar23.c();
            voipRenderReportStruct.A = c59.f411384a;
            voipRenderReportStruct.B = (int) c59.f411385b;
        }
        sq4.b bVar24 = (sq4.b) hashMap2.get("RemoteTextureError");
        if (bVar24 != null) {
            bVar24.a();
        }
        sq4.b bVar25 = (sq4.b) hashMap2.get("RemoteTextureError");
        if (bVar25 != null) {
            sq4.c c67 = bVar25.c();
            voipRenderReportStruct.C = c67.f411384a;
            voipRenderReportStruct.D = (int) c67.f411385b;
        }
        sq4.b bVar26 = (sq4.b) hashMap2.get("RemoteDrawError");
        if (bVar26 != null) {
            bVar26.a();
        }
        sq4.b bVar27 = (sq4.b) hashMap2.get("RemoteDrawError");
        if (bVar27 != null) {
            sq4.c c68 = bVar27.c();
            voipRenderReportStruct.E = c68.f411384a;
            voipRenderReportStruct.F = (int) c68.f411385b;
        }
        long currentTimeMillis = j19 == 0 ? 0L : java.lang.System.currentTimeMillis() - j19;
        long currentTimeMillis2 = j27 == 0 ? 0L : java.lang.System.currentTimeMillis() - j27;
        cl0.g gVar13 = new cl0.g();
        gVar13.o("total", this.f399013z);
        gVar13.o("less", this.f399011x);
        gVar13.o("serious", this.f399012y);
        long j28 = currentTimeMillis2;
        gVar13.p("lessTotal", this.f399009v);
        gVar13.p("lessSerious", this.f399010w);
        gVar13.p("totalTime", currentTimeMillis);
        java.lang.String gVar14 = gVar13.toString();
        kotlin.jvm.internal.o.f(gVar14, "toString(...)");
        voipRenderReportStruct.G = voipRenderReportStruct.b("LocalFrameInfo", r26.i0.t(gVar14, ",", str7, false), true);
        cl0.g gVar15 = new cl0.g();
        gVar15.o("count", this.f399004q);
        gVar15.o("less", this.f399002o);
        gVar15.o("serious", this.f399003p);
        long j29 = currentTimeMillis;
        gVar15.p("lessTotal", this.f399005r);
        gVar15.p("lessSerious", this.f399006s);
        gVar15.p("totalTime", j28);
        java.lang.String gVar16 = gVar15.toString();
        kotlin.jvm.internal.o.f(gVar16, "toString(...)");
        voipRenderReportStruct.H = voipRenderReportStruct.b("RemoteFrameInfo", r26.i0.t(gVar16, ",", str7, false), true);
        cl0.g gVar17 = new cl0.g();
        gVar17.o("total", this.D);
        gVar17.o("less", this.B);
        gVar17.o("serious", this.C);
        gVar17.p("lessTotal", this.E);
        gVar17.p("lessSerious", this.F);
        gVar17.p("totalTime", j28);
        java.lang.String gVar18 = gVar17.toString();
        kotlin.jvm.internal.o.f(gVar18, "toString(...)");
        voipRenderReportStruct.I = voipRenderReportStruct.b("DecodeFrameInfo", r26.i0.t(gVar18, ",", str7, false), true);
        cl0.g gVar19 = new cl0.g();
        gVar19.o("total", this.f398987J);
        gVar19.o("less", this.H);
        gVar19.o("serious", this.I);
        gVar19.p("lessTotal", this.K);
        gVar19.p("lessSerious", this.L);
        gVar19.p("totalTime", j28);
        java.lang.String gVar20 = gVar19.toString();
        kotlin.jvm.internal.o.f(gVar20, "toString(...)");
        voipRenderReportStruct.f61827J = voipRenderReportStruct.b("EncodeFrameInfo", r26.i0.t(gVar20, ",", str7, false), true);
        voipRenderReportStruct.f61831g = this.f398988a ? 0L : 1L;
        voipRenderReportStruct.f61828d = j29;
        voipRenderReportStruct.f61829e = java.lang.Math.max(100 - (hashMap2.size() * 20), 0);
        voipRenderReportStruct.k();
        com.tencent.mm.plugin.voip.ui.s0 s0Var = com.tencent.mm.plugin.voip.ui.s0.f176982a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "reportRender");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("localSourceNoFrameTimes", voipRenderReportStruct.f61841q);
        jSONObject.put("localSourceNoFrameTotalTime", voipRenderReportStruct.f61842r);
        jSONObject.put("localOnScreenNoFrameTimes", voipRenderReportStruct.f61843s);
        jSONObject.put("localOnScreenNoFrameTotalTime", voipRenderReportStruct.f61844t);
        jSONObject.put("remoteOnScreenNoFrameTimes", voipRenderReportStruct.f61847w);
        jSONObject.put("remoteOnScreenNoFrameTotalTime", voipRenderReportStruct.f61848x);
        jSONObject.put("remoteSourceNoFrameTimes", voipRenderReportStruct.f61845u);
        jSONObject.put("remoteSourceNoFrameTotalTime", voipRenderReportStruct.f61846v);
        com.tencent.mm.plugin.voip.ui.s0.f176984c = jSONObject;
        s0Var.a();
    }

    public final java.lang.String b() {
        cl0.g gVar = new cl0.g();
        sq4.b bVar = (sq4.b) this.f398990c.get("EncoderSourceTimeoutNotFrame");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f411384a);
            gVar.p("total", c17.f411385b);
        }
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String c() {
        java.util.HashMap hashMap;
        cl0.g gVar = new cl0.g();
        java.util.Iterator it = this.f398996i.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f398989b;
            if (!hasNext) {
                break;
            }
            android.util.Size size = (android.util.Size) it.next();
            sq4.b bVar = (sq4.b) hashMap.get("LocalTextureSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (bVar != null) {
                sq4.c c17 = bVar.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                gVar.h(sb6.toString(), q(size, c17.f411385b, c17.f411384a));
            }
        }
        cl0.g gVar2 = new cl0.g();
        for (android.util.Size size2 : this.f398997j) {
            sq4.b bVar2 = (sq4.b) hashMap.get("LocalDrawSizeChange_" + size2.getWidth() + '*' + size2.getHeight());
            if (bVar2 != null) {
                sq4.c c18 = bVar2.c();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(size2.getWidth());
                sb7.append('*');
                sb7.append(size2.getHeight());
                gVar2.h(sb7.toString(), q(size2, c18.f411385b, c18.f411384a));
            }
        }
        cl0.g gVar3 = new cl0.g();
        java.util.Iterator it6 = this.f399000m.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            sq4.b bVar3 = (sq4.b) hashMap.get("DrawLocalRotateChange" + intValue);
            if (bVar3 != null) {
                sq4.c c19 = bVar3.c();
                gVar3.h(java.lang.String.valueOf(intValue), r(intValue, c19.f411385b, c19.f411384a));
            }
        }
        cl0.g gVar4 = new cl0.g();
        java.lang.String gVar5 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar5, "toString(...)");
        gVar4.h("textureSize", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        gVar4.h("drawSize", r26.i0.t(gVar6, ",", ";", false));
        java.lang.String gVar7 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar7, "toString(...)");
        gVar4.h(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, r26.i0.t(gVar7, ",", ";", false));
        java.lang.String gVar8 = gVar4.toString();
        kotlin.jvm.internal.o.f(gVar8, "toString(...)");
        return r26.i0.t(gVar8, ",", ";", false);
    }

    public final java.lang.String d() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get("LocalSourceTimeoutNoFrame");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f411384a);
            gVar.p("total", c17.f411385b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("LocalOnScreenTimeoutNoFrame");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f411384a);
            gVar2.p("total", c18.f411385b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        gVar3.h(ya.b.SOURCE, r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar5, "toString(...)");
        gVar3.h("screen", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String e() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get("LocalTextureError");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f411384a);
            gVar.p("total", c17.f411385b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("LocalDrawError");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f411384a);
            gVar2.p("total", c18.f411385b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        gVar3.h("texture", r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar5, "toString(...)");
        gVar3.h("draw", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String f() {
        java.util.HashMap hashMap;
        cl0.g gVar = new cl0.g();
        java.util.Iterator it = this.f398998k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f398989b;
            if (!hasNext) {
                break;
            }
            android.util.Size size = (android.util.Size) it.next();
            sq4.b bVar = (sq4.b) hashMap.get("RemoteTextureSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (bVar != null) {
                sq4.c c17 = bVar.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                gVar.h(sb6.toString(), q(size, c17.f411385b, c17.f411384a));
            }
        }
        cl0.g gVar2 = new cl0.g();
        for (android.util.Size size2 : this.f398999l) {
            sq4.b bVar2 = (sq4.b) hashMap.get("RemoteDrawSizeChange_" + size2.getWidth() + '*' + size2.getHeight());
            if (bVar2 != null) {
                sq4.c c18 = bVar2.c();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(size2.getWidth());
                sb7.append('*');
                sb7.append(size2.getHeight());
                gVar2.h(sb7.toString(), q(size2, c18.f411385b, c18.f411384a));
            }
        }
        cl0.g gVar3 = new cl0.g();
        java.util.Iterator it6 = this.f399001n.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            sq4.b bVar3 = (sq4.b) hashMap.get("DrawRemoteRotateChange" + intValue);
            if (bVar3 != null) {
                sq4.c c19 = bVar3.c();
                gVar3.h(java.lang.String.valueOf(intValue), r(intValue, c19.f411385b, c19.f411384a));
            }
        }
        cl0.g gVar4 = new cl0.g();
        java.lang.String gVar5 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar5, "toString(...)");
        gVar4.h("textureSize", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        gVar4.h("drawSize", r26.i0.t(gVar6, ",", ";", false));
        java.lang.String gVar7 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar7, "toString(...)");
        gVar4.h(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, r26.i0.t(gVar7, ",", ";", false));
        java.lang.String gVar8 = gVar4.toString();
        kotlin.jvm.internal.o.f(gVar8, "toString(...)");
        return r26.i0.t(gVar8, ",", ";", false);
    }

    public final java.lang.String g() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get("RemoteSourceTimeoutNoFrame");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f411384a);
            gVar.p("total", c17.f411385b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("RemoteOnScreenTimeoutNoFrame");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f411384a);
            gVar2.p("total", c18.f411385b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        gVar3.h(ya.b.SOURCE, r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar5, "toString(...)");
        gVar3.h("screen", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String h() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get("RemoteTextureError");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f411384a);
            gVar.p("total", c17.f411385b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("RemoteDrawError");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f411384a);
            gVar2.p("total", c18.f411385b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
        gVar3.h("texture", r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        kotlin.jvm.internal.o.f(gVar5, "toString(...)");
        gVar3.h("draw", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String i() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f398989b;
        sq4.b bVar = (sq4.b) hashMap.get("DecodeChangeHard");
        gVar.h("decodeHard", bVar != null ? java.lang.Long.valueOf(bVar.c().f411385b) : null);
        sq4.b bVar2 = (sq4.b) hashMap.get("DecodeChangeSoft");
        gVar.h("decodeSoft", bVar2 != null ? java.lang.Long.valueOf(bVar2.c().f411385b) : null);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final void j(boolean z17) {
        boolean z18 = false;
        if (z17) {
            if (this.A == 0) {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.A = java.lang.System.currentTimeMillis();
            }
            long j17 = this.A;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            if (201 <= currentTimeMillis && currentTimeMillis < 500) {
                z18 = true;
            }
            if (z18) {
                this.f399011x++;
                this.f399009v += currentTimeMillis;
            } else if (currentTimeMillis > 500) {
                this.f399012y++;
                this.f399010w += currentTimeMillis;
            }
            this.f399013z++;
            this.A = java.lang.System.currentTimeMillis();
            return;
        }
        if (this.f399008u) {
            return;
        }
        if (this.f399007t == 0) {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f399007t = java.lang.System.currentTimeMillis();
        }
        long j18 = this.f399007t;
        boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j18;
        if (201 <= currentTimeMillis2 && currentTimeMillis2 < 500) {
            z18 = true;
        }
        if (z18) {
            this.f399002o++;
            this.f399005r += currentTimeMillis2;
        } else if (currentTimeMillis2 > 500) {
            this.f399003p++;
            this.f399006s += currentTimeMillis2;
        }
        this.f399004q++;
        this.f399007t = java.lang.System.currentTimeMillis();
    }

    public final void k(android.util.Size size, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(size, "size");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onRenderSizeChanged " + size.getWidth() + '*' + size.getHeight());
        if (size.getWidth() * size.getHeight() <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onDrawSizeError");
            long j17 = gq4.v.wi().f365983q;
            java.lang.String str2 = z17 ? "LocalDrawError" : "RemoteDrawError";
            java.util.HashMap hashMap = this.f398990c;
            sq4.b bVar = (sq4.b) hashMap.get(str2);
            if (bVar == null) {
                bVar = new sq4.b();
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar.d(java.lang.System.currentTimeMillis() - j17);
            bVar.f411373a = str2;
            hashMap.put(str2, bVar);
        }
        if (z17) {
            this.f398997j.add(size);
        } else {
            this.f398999l.add(size);
        }
        long j18 = gq4.v.wi().f365983q;
        if (z17) {
            str = "LocalDrawSizeChange_" + size.getWidth() + '*' + size.getHeight();
        } else {
            str = "RemoteDrawSizeChange_" + size.getWidth() + '*' + size.getHeight();
        }
        java.lang.String str3 = z17 ? this.f398993f : this.f398994g;
        java.util.HashMap hashMap2 = this.f398989b;
        sq4.b bVar2 = (sq4.b) hashMap2.get(str);
        if (bVar2 == null) {
            bVar2 = new sq4.b();
        }
        sq4.b bVar3 = (sq4.b) hashMap2.get(str3);
        if (bVar3 != null) {
            bVar3.b();
            hashMap2.put(str, bVar3);
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar2.d(java.lang.System.currentTimeMillis() - j18);
        bVar2.f(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getWidth());
        sb6.append('*');
        sb6.append(size.getHeight());
        bVar2.g(sb6.toString());
        hashMap2.put(str, bVar2);
        if (z17) {
            this.f398993f = str;
        } else {
            this.f398994g = str;
        }
    }

    public final void l(android.util.Size size, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(size, "size");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onTextureSizeChanged " + size.getWidth() + '*' + size.getHeight());
        if (size.getWidth() * size.getHeight() <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onTextureSizeError");
            long j17 = gq4.v.wi().f365983q;
            java.lang.String str2 = z17 ? "LocalTextureError" : "RemoteTextureError";
            java.util.HashMap hashMap = this.f398990c;
            sq4.b bVar = (sq4.b) hashMap.get(str2);
            if (bVar == null) {
                bVar = new sq4.b();
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar.d(java.lang.System.currentTimeMillis() - j17);
            bVar.f411373a = str2;
            hashMap.put(str2, bVar);
        }
        if (z17) {
            this.f398996i.add(size);
        } else {
            this.f398998k.add(size);
        }
        long j18 = gq4.v.wi().f365983q;
        if (z17) {
            str = "LocalTextureSizeChange_" + size.getWidth() + '*' + size.getHeight();
        } else {
            str = "RemoteTextureSizeChange_" + size.getWidth() + '*' + size.getHeight();
        }
        java.lang.String str3 = z17 ? this.f398991d : this.f398992e;
        java.util.HashMap hashMap2 = this.f398989b;
        sq4.b bVar2 = (sq4.b) hashMap2.get(str);
        if (bVar2 == null) {
            bVar2 = new sq4.b();
        }
        sq4.b bVar3 = (sq4.b) hashMap2.get(str3);
        if (bVar3 != null) {
            bVar3.b();
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar2.d(java.lang.System.currentTimeMillis() - j18);
        bVar2.f(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getWidth());
        sb6.append('*');
        sb6.append(size.getHeight());
        bVar2.g(sb6.toString());
        hashMap2.put(str, bVar2);
        if (z17) {
            this.f398991d = str;
        } else {
            this.f398992e = str;
        }
    }

    public final void m(boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeOutOnScreenNoFrameResume");
        java.lang.String str = z17 ? "LocalOnScreenTimeoutNoFrame" : "RemoteOnScreenTimeoutNoFrame";
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            return;
        }
        bVar.e(j17);
        bVar.f411376d += j17;
        bVar.f411374b++;
        hashMap.put(str, bVar);
    }

    public final void n(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeoutOffScreenNoFrame");
        long j17 = gq4.v.wi().f365983q;
        java.lang.String str = z17 ? "LocalSourceTimeoutNoFrame" : "RemoteSourceTimeoutNoFrame";
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            bVar = new sq4.b();
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.d(java.lang.System.currentTimeMillis() - j17);
        bVar.f411373a = str;
        hashMap.put(str, bVar);
    }

    public final void o(boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeoutOffScreenNoFrameResume");
        java.lang.String str = z17 ? "LocalSourceTimeoutNoFrame" : "RemoteSourceTimeoutNoFrame";
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            return;
        }
        bVar.e(j17);
        bVar.f411376d += j17;
        bVar.f411374b++;
        hashMap.put(str, bVar);
    }

    public final void p(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeoutOnScreenNoFrame");
        long j17 = gq4.v.wi().f365983q;
        java.lang.String str = z17 ? "LocalOnScreenTimeoutNoFrame" : "RemoteOnScreenTimeoutNoFrame";
        java.util.HashMap hashMap = this.f398990c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            bVar = new sq4.b();
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.d(java.lang.System.currentTimeMillis() - j17);
        bVar.f411373a = str;
        hashMap.put(str, bVar);
    }

    public final java.lang.String q(android.util.Size size, long j17, int i17) {
        cl0.g gVar = new cl0.g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getWidth());
        sb6.append('*');
        sb6.append(size.getHeight());
        gVar.h("size", sb6.toString());
        gVar.p("totalTime", j17);
        gVar.o("times", i17);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String r(int i17, long j17, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, i17);
        gVar.p("totalTime", j17);
        gVar.o("times", i18);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }
}
