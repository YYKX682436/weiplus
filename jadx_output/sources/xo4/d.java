package xo4;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final xo4.d f455770a = new xo4.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f455771b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer[] f455772c = {1, 2};

    public final uo4.f a(com.tencent.mm.plugin.vlog.model.i1 it) {
        uo4.f fVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.f175617b;
        rm5.j jVar = it.f175627l;
        if (i17 == 2) {
            uo4.g gVar = new uo4.g();
            gVar.f429689f = jVar.f397506h;
            e(gVar, it.f175616a);
            fVar = gVar;
        } else if (i17 == 1) {
            uo4.f eVar = new uo4.e();
            java.util.ArrayList arrayList3 = eVar.f429685b;
            arrayList3.add(java.lang.Integer.valueOf(it.f175621f));
            arrayList3.add(java.lang.Integer.valueOf(it.f175622g));
            fVar = eVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.f429684a = i17;
        }
        if (fVar != null && (arrayList2 = fVar.f429686c) != null) {
            arrayList2.add(java.lang.Long.valueOf(jVar.f397502d));
        }
        if (fVar != null && (arrayList = fVar.f429686c) != null) {
            arrayList.add(java.lang.Long.valueOf(jVar.f397503e));
        }
        return fVar;
    }

    public final void b(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = f455771b;
        com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = (com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct) hashMap.get(key);
        if (videoCompositionPerformanceStruct != null) {
            videoCompositionPerformanceStruct.k();
        }
        hashMap.remove(key);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionPerformance", "do report key:".concat(key));
    }

    public final com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct c(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = f455771b;
        if (!hashMap.containsKey(key)) {
            hashMap.put(key, new com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct());
            java.lang.Object obj = hashMap.get(key);
            kotlin.jvm.internal.o.d(obj);
            com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = (com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct) obj;
            videoCompositionPerformanceStruct.f61569k = videoCompositionPerformanceStruct.b("EditId", key, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionPerformance", "getReportStruct: create ".concat(key));
            java.lang.Object obj2 = hashMap.get(key);
            kotlin.jvm.internal.o.d(obj2);
        }
        java.lang.Object obj3 = hashMap.get(key);
        kotlin.jvm.internal.o.d(obj3);
        return (com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct) obj3;
    }

    public final void d(java.lang.String key, java.lang.String str) {
        qc0.d1 c17;
        java.lang.String bVar;
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct c18 = c(key);
        if (str == null || !com.tencent.mm.vfs.w6.j(str) || (c17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.c(str, false)) == null) {
            return;
        }
        com.tencent.mm.plugin.sight.base.b bVar2 = c17.f361374l;
        c18.f61568j = c18.b("OutputMediaInfo", (bVar2 == null || (bVar = bVar2.toString()) == null) ? null : r26.i0.t(bVar, ",", ";", false), true);
        c18.f61566h = c17.f361365c;
        c18.f61572n = c17.f361366d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c17.f361363a / 100);
        sb6.append('x');
        sb6.append(c17.f361364b / 100);
        c18.f61567i = c18.b("OutputVideoResolution", sb6.toString(), true);
    }

    public final void e(uo4.g gVar, java.lang.String str) {
        qc0.d1 c17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.c(str, true);
        if (c17 != null) {
            gVar.f429688e = c17.f361367e;
            gVar.f429687d = c17.f361365c;
            gVar.f429690g = c17.f361372j;
            gVar.f429691h = c17.f361370h;
            gVar.f429700q = c17.f361366d;
            java.util.ArrayList arrayList = gVar.f429685b;
            arrayList.add(java.lang.Integer.valueOf(c17.f361363a));
            arrayList.add(java.lang.Integer.valueOf(c17.f361364b));
            com.tencent.mm.plugin.sight.base.b bVar = c17.f361374l;
            java.lang.String str2 = bVar != null ? bVar.f162398q : null;
            if (str2 == null) {
                str2 = "";
            }
            gVar.f429695l = str2;
            java.lang.String str3 = bVar != null ? bVar.f162399r : null;
            if (str3 == null) {
                str3 = "";
            }
            gVar.f429694k = str3;
            java.lang.String str4 = bVar != null ? bVar.f162401t : null;
            if (str4 == null) {
                str4 = "";
            }
            gVar.f429696m = str4;
            java.lang.String str5 = bVar != null ? bVar.f162400s : null;
            if (str5 == null) {
                str5 = "";
            }
            gVar.f429697n = str5;
            gVar.f429704u = bVar != null && bVar.f162405x;
            gVar.f429703t = bVar != null && bVar.f162404w;
            java.lang.String str6 = bVar != null ? bVar.f162403v : null;
            if (str6 == null) {
                str6 = "";
            }
            gVar.f429698o = str6;
            java.lang.String str7 = bVar != null ? bVar.f162402u : null;
            if (str7 == null) {
                str7 = "";
            }
            gVar.f429699p = str7;
        } else {
            com.tencent.mm.plugin.sight.base.b Ai = ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).Ai(str);
            if (Ai == null) {
                return;
            }
            gVar.f429688e = Ai.f162383b;
            gVar.f429687d = Ai.f162386e;
            gVar.f429690g = Ai.f162389h;
            gVar.f429691h = Ai.f162388g;
            gVar.f429700q = Ai.f162382a;
            java.util.ArrayList arrayList2 = gVar.f429685b;
            arrayList2.add(java.lang.Integer.valueOf(Ai.f162384c));
            arrayList2.add(java.lang.Integer.valueOf(Ai.f162385d));
            java.lang.String str8 = Ai.f162398q;
            if (str8 == null) {
                str8 = "";
            }
            gVar.f429695l = str8;
            java.lang.String str9 = Ai.f162399r;
            if (str9 == null) {
                str9 = "";
            }
            gVar.f429694k = str9;
            java.lang.String str10 = Ai.f162401t;
            if (str10 == null) {
                str10 = "";
            }
            gVar.f429696m = str10;
            java.lang.String str11 = Ai.f162400s;
            if (str11 == null) {
                str11 = "";
            }
            gVar.f429697n = str11;
            gVar.f429704u = Ai.f162405x;
            gVar.f429703t = Ai.f162404w;
            java.lang.String str12 = Ai.f162403v;
            if (str12 == null) {
                str12 = "";
            }
            gVar.f429698o = str12;
            java.lang.String str13 = Ai.f162402u;
            if (str13 == null) {
                str13 = "";
            }
            gVar.f429699p = str13;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            hs0.a aVar = new hs0.a(str);
            java.lang.String b17 = aVar.b();
            if (b17 == null) {
                b17 = "";
            }
            gVar.getClass();
            gVar.f429692i = b17;
            android.media.MediaFormat mediaFormat = aVar.f284552f;
            java.lang.String string = mediaFormat != null ? mediaFormat.getString("mime") : null;
            gVar.f429693j = string != null ? string : "";
            aVar.d();
        }
    }
}
