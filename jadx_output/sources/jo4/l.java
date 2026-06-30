package jo4;

/* loaded from: classes10.dex */
public final class l implements t21.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f300920a = "MicroMsg.CompositionVideoTranscoderImpl@" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public d11.n f300921b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f300922c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300923d;

    public l() {
        com.tencent.tav.decoder.logger.Logger.setLogProxy(new p05.f2());
        com.tencent.tav.decoder.logger.Logger.setLevel(2);
        xm5.b.f455398a = new p05.g2();
        this.f300923d = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v27, types: [uo4.f, uo4.e] */
    public static final void a(jo4.l lVar, int i17, float f17, rm5.v vVar, t21.c cVar, rm5.q qVar, long j17, java.lang.String str, int i18) {
        uo4.g gVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        lVar.getClass();
        int i19 = i17 < 0 ? -i17 : i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report export result: ");
        sb6.append(i17);
        sb6.append(" message:[");
        java.util.Map map = xo4.a.f455767a;
        sb6.append(map.containsKey(java.lang.Integer.valueOf(i19)) ? java.lang.String.valueOf(((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i19))) : "");
        sb6.append("] path:");
        sb6.append(lVar.f300923d);
        com.tencent.mars.xlog.Log.i(lVar.f300920a, sb6.toString());
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct c17 = xo4.d.f455770a.c(uuid);
        c17.f61565g = qVar.f397538c;
        c17.f61570l = i19;
        c17.f61573o = j17;
        c17.f61571m = 1L;
        c17.A = 0L;
        if (lVar.f300921b == null) {
            c17.B = 0L;
        } else {
            c17.B = ((d11.d) r0).f225656a;
        }
        uo4.h hVar = new uo4.h();
        hVar.f429708d = false;
        java.util.Iterator it = vVar.f397584l.iterator();
        while (it.hasNext()) {
            rm5.j it6 = (rm5.j) it.next();
            xo4.d dVar = xo4.d.f455770a;
            kotlin.jvm.internal.o.g(it6, "it");
            int i27 = it6.f397500b;
            if (i27 == 2) {
                uo4.g gVar2 = new uo4.g();
                gVar2.f429689f = it6.f397506h;
                dVar.e(gVar2, it6.f397499a);
                gVar = gVar2;
            } else if (i27 == 1) {
                ?? eVar = new uo4.e();
                java.util.ArrayList arrayList3 = eVar.f429685b;
                arrayList3.add(java.lang.Integer.valueOf(it6.f397509k));
                arrayList3.add(java.lang.Integer.valueOf(it6.f397510l));
                gVar = eVar;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                gVar.f429684a = i27;
            }
            if (gVar != null && (arrayList2 = gVar.f429686c) != null) {
                arrayList2.add(java.lang.Long.valueOf(it6.f397502d));
            }
            if (gVar != null && (arrayList = gVar.f429686c) != null) {
                arrayList.add(java.lang.Long.valueOf(it6.f397503e));
            }
            uo4.g gVar3 = gVar instanceof uo4.g ? gVar : null;
            if (gVar3 != null) {
                gVar3.f429701r = vVar.f397586n != null;
                java.lang.String d17 = com.tencent.mm.plugin.vlog.model.f.f175589a.d(gVar.f429692i);
                kotlin.jvm.internal.o.g(d17, "<set-?>");
                gVar3.f429702s = d17;
            }
            if (gVar != null) {
                hVar.f429705a.add(gVar);
            }
        }
        java.lang.String jSONObject = hVar.b().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        c17.C = c17.b("OriginMediaInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("colorRange", qVar.f397549n);
        jSONObject2.put("colorStandard", qVar.f397550o);
        jSONObject2.put("colorTransfer", qVar.f397551p);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        c17.D = c17.b(androidx.exifinterface.media.ExifInterface.TAG_COLOR_SPACE, r26.i0.t(jSONObject3, ",", ";", false), true);
        t21.x1 x1Var = cVar.f414713g;
        c17.G = x1Var.f415061a ? x1Var.f415062b : -1;
        c17.N = i18;
        xo4.d dVar2 = xo4.d.f455770a;
        dVar2.d(uuid, str);
        if (cVar.f414711e && cVar.f414710d) {
            c17.f61580v = 1;
        } else if (cVar.f414710d) {
            c17.f61580v = 2;
        }
        com.tencent.tav.codec.IMediaFactory iMediaFactory = vVar.f397590r;
        com.tencent.tav.codec.DefaultMediaFactory defaultMediaFactory = iMediaFactory instanceof com.tencent.tav.codec.DefaultMediaFactory ? (com.tencent.tav.codec.DefaultMediaFactory) iMediaFactory : null;
        com.tencent.tav.codec.IDecoderFactory decoderFactory = defaultMediaFactory != null ? defaultMediaFactory.getDecoderFactory() : null;
        ko4.e eVar2 = decoderFactory instanceof ko4.e ? (ko4.e) decoderFactory : null;
        if (eVar2 != null) {
            c17.T = eVar2.f310069f;
            c17.U = eVar2.f310070g;
        }
        c17.f61583y = cVar.f414711e ? 1L : 0L;
        c17.E = c17.b("CpuName", r26.i0.v(st3.n.f412556b, ",", ";", false, 4, null), true);
        wm5.h hVar2 = vVar.f397582j;
        wm5.e eVar3 = hVar2 != null ? hVar2.f447364n : null;
        if (eVar3 != null) {
            c17.f61564f = ((java.lang.Number) ((wm5.d) eVar3.f447351d).invoke()).longValue();
            c17.f61578t = eVar3.f447350c;
            c17.f61579u = eVar3.f447349b;
        }
        float f18 = 100;
        c17.f61581w = com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.a(str, qVar.f397540e / 1000.0f, qVar.f397541f, qVar.f397542g, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_quality_analysis_switch, 0) == 1, vVar.f397585m) * f18;
        c17.f61582x = f17 * f18;
        cl0.g gVar4 = new cl0.g();
        gVar4.r("appUIStatus", com.tencent.mm.app.w.INSTANCE.f53889n);
        c17.Y = c17.b("errorDesc", gVar4.toString(), true);
        dVar2.b(uuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0627 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0299  */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v44, types: [int] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r47, java.lang.String r48, t21.c r49, t21.f0 r50) {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jo4.l.b(java.lang.String, java.lang.String, t21.c, t21.f0):boolean");
    }

    public boolean c(java.lang.String sourcePath, java.lang.String outputPath, t21.c params, yz5.l outputCallback) {
        kotlin.jvm.internal.o.g(sourcePath, "sourcePath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(outputCallback, "outputCallback");
        return b(sourcePath, outputPath, params, new jo4.c(outputCallback));
    }
}
