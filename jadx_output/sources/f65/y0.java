package f65;

/* loaded from: classes12.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.y0 f260019a = new f65.y0();

    /* renamed from: b, reason: collision with root package name */
    public static final xs.j1 f260020b = (xs.j1) i95.n0.c(xs.j1.class);

    public static final com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct a(f65.y0 y0Var, r45.qz6 qz6Var) {
        y0Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct videoSendReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct();
        videoSendReporterStruct.f61619g = videoSendReporterStruct.b("ToUsername", qz6Var.f384385h, true);
        videoSendReporterStruct.f61620h = qz6Var.f384386i;
        videoSendReporterStruct.f61616d = videoSendReporterStruct.b("SessionId", qz6Var.f384382e, true);
        videoSendReporterStruct.f61622j = qz6Var.f384388n;
        videoSendReporterStruct.f61621i = qz6Var.f384387m;
        videoSendReporterStruct.f61618f = qz6Var.f384384g;
        videoSendReporterStruct.f61617e = qz6Var.f384383f;
        videoSendReporterStruct.f61625m = videoSendReporterStruct.b("ExtraInfo", qz6Var.f384391q, true);
        return videoSendReporterStruct;
    }

    public static final void b(f65.y0 y0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        r45.pz6 d17 = y0Var.d(str);
        if (d17 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f65.z0.f260022a;
            java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
            long longValue = (l17 == null || l17.longValue() <= 0) ? d17.f383505e : l17.longValue();
            if (l17 != null) {
                concurrentHashMap.remove(str);
            }
            jSONObject.put("compressType", d17.f383511n);
            jSONObject.put("encodeType", d17.f383512o);
            jSONObject.put("uploadMs", d17.f383508h);
            jSONObject.put("uploadRawMs", d17.f383510m);
            jSONObject.put("compressMs", d17.f383506f);
            jSONObject.put("sendSuccMs", java.lang.System.currentTimeMillis() - longValue);
            jSONObject.put("rawVideoHitCacheType", d17.f383515r);
            jSONObject.put("videoHitCacheType", d17.f383514q);
            jSONObject.put("unCompressReason", d17.f383513p);
            jSONObject.put("uploadVideoWay", d17.f383516s);
            jSONObject.put("isNewSend", d17.f383517t);
            if (d17.f383505e == 0) {
                jSONObject.put("lostStartTime", "1");
            }
            jSONObject.put("resend_scene", d17.f383518u);
            jSONObject.put("inner_version", 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [r45.pz6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [yz5.l] */
    public static final r45.qz6 c(f65.y0 y0Var, java.lang.String str, yz5.l lVar) {
        r45.pz6 pz6Var;
        y0Var.getClass();
        f65.z zVar = new f65.z(str);
        r45.pz6 d17 = y0Var.d(str);
        if ((d17 != 0 ? d17.f383504d : null) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoSendReporter", "getOrCreateAndUpdateCache get[" + str + "] no cache,will create new value");
            d17 = zVar.invoke();
            y0Var.m((r45.pz6) d17, str);
        }
        if (lVar != 0) {
            pz6Var = (r45.pz6) lVar.invoke(d17);
            f260019a.m(pz6Var, str);
        } else {
            pz6Var = d17;
        }
        r45.qz6 reporter_struct2 = pz6Var.f383504d;
        kotlin.jvm.internal.o.f(reporter_struct2, "reporter_struct2");
        return reporter_struct2;
    }

    public final r45.pz6 d(java.lang.String filename) {
        kotlin.jvm.internal.o.g(filename, "filename");
        return (r45.pz6) ((q04.r) f260020b).Di(19, filename, r45.pz6.class);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.b0(str), "MicroMsg.VideoSendReporter");
    }

    public final void f(java.lang.String str, int i17, int i18) {
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.d0(str, i17, i18), "MicroMsg.VideoSendReporter");
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            return;
        }
        f65.z0.f260022a.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void h(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSendReporter", "markUnCompress: ".concat(str));
        boolean containsKey = f65.z0.f260022a.containsKey(str);
        ((ku5.t0) ku5.t0.f312615d).b(new f65.j0(str, i17, containsKey), "MicroMsg.VideoSendReporter");
    }

    public final void i(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.l0(str, i17), "MicroMsg.VideoSendReporter");
    }

    public final void j(java.lang.String str, f65.y uploadType) {
        kotlin.jvm.internal.o.g(uploadType, "uploadType");
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.n0(str, uploadType), "MicroMsg.VideoSendReporter");
    }

    public final void k(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, long j27, boolean z17, boolean z18) {
        if (str2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.v0(str2, z18, str, j17, j19, j18, z17, j27), "MicroMsg.VideoSendReporter");
    }

    public final void l(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, long j19, long j27, boolean z17, int i18) {
        if (str2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new f65.x0(str2, i18, i17, j17, j18, j19, z17, j27, str), "MicroMsg.VideoSendReporter");
    }

    public final void m(r45.pz6 pz6Var, java.lang.String str) {
        androidx.lifecycle.c1 a17;
        ((q04.r) f260020b).requireAccountInitialized();
        if (str != null) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
            }
            r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
            java.lang.String concat = "19_".concat(str);
            r04.b X6 = dVar.X6(concat);
            if (X6 != null) {
                X6.field_originId = str;
                X6.field_type = 19;
                X6.field_data = pz6Var != null ? pz6Var.toByteArray() : null;
                long c17 = c01.id.c();
                X6.field_updateTime = c17;
                X6.field_expireTime = c17 + 259200000;
                com.tencent.mm.sdk.storage.mvvm.MvvmStorage.V6(dVar, X6, false, false, 6, null);
                return;
            }
            r04.b bVar = new r04.b();
            bVar.field_id = concat;
            bVar.field_originId = str;
            long c18 = c01.id.c();
            bVar.field_createTime = c18;
            bVar.field_updateTime = c18;
            bVar.field_expireTime = c18 + 259200000;
            bVar.field_type = 19;
            bVar.field_data = pz6Var != null ? pz6Var.toByteArray() : null;
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.U6(dVar, bVar, false, false, false, 14, null);
        }
    }
}
