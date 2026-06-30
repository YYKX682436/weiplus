package n74;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n74.h0 f335363a = new n74.h0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f335364b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f335365c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f335366d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f335367e = new java.util.LinkedHashSet();

    public static final kotlinx.coroutines.flow.j2 b(java.lang.String cacheName) {
        kotlinx.coroutines.flow.j2 j2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        kotlin.jvm.internal.o.g(cacheName, "cacheName");
        java.util.Map map = f335364b;
        synchronized (map) {
            try {
                if (!map.containsKey(cacheName) || ((java.util.LinkedHashMap) map).get(cacheName) == null) {
                    map.put(cacheName, kotlinx.coroutines.flow.i3.a(null));
                    java.lang.Object obj = ((java.util.LinkedHashMap) map).get(cacheName);
                    kotlin.jvm.internal.o.d(obj);
                    j2Var = (kotlinx.coroutines.flow.j2) obj;
                } else {
                    java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(cacheName);
                    kotlin.jvm.internal.o.d(obj2);
                    j2Var = (kotlinx.coroutines.flow.j2) obj2;
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            }
        }
        return j2Var;
    }

    public static final kotlinx.coroutines.flow.j2 c(java.lang.String mediaId) {
        kotlinx.coroutines.flow.j2 j2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.Map map = f335365c;
        synchronized (map) {
            try {
                if (!map.containsKey(mediaId) || ((java.util.LinkedHashMap) map).get(mediaId) == null) {
                    map.put(mediaId, kotlinx.coroutines.flow.i3.a(null));
                    java.lang.Object obj = ((java.util.LinkedHashMap) map).get(mediaId);
                    kotlin.jvm.internal.o.d(obj);
                    j2Var = (kotlinx.coroutines.flow.j2) obj;
                } else {
                    java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(mediaId);
                    kotlin.jvm.internal.o.d(obj2);
                    j2Var = (kotlinx.coroutines.flow.j2) obj2;
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            }
        }
        return j2Var;
    }

    public static final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        java.util.Map map = f335364b;
        synchronized (map) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
    }

    public static final void e(java.lang.String str, n74.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        if (zVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        java.util.Set set = f335366d;
        synchronized (set) {
            try {
                if (set.contains(str)) {
                    ((kotlinx.coroutines.flow.h3) b(str)).k(zVar);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
    }

    public final kotlinx.coroutines.flow.j a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (i1Var == null) {
            kotlinx.coroutines.flow.p pVar = new kotlinx.coroutines.flow.p(new n74.a0[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return pVar;
        }
        if (jj4Var == null) {
            kotlinx.coroutines.flow.p pVar2 = new kotlinx.coroutines.flow.p(new n74.a0[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return pVar2;
        }
        jj4Var.N = true;
        l44.c0.b(snsInfo, jj4Var);
        java.util.Set set = f335367e;
        synchronized (set) {
            try {
                java.lang.String str = jj4Var.f377855d;
                if (str == null) {
                    str = "";
                }
                set.add(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(jj4Var);
        kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
        java.lang.String concat = com.tencent.mm.vfs.w6.j(d17.concat(R)) ? d17.concat(R) : null;
        if (!(concat == null || r26.n0.N(concat))) {
            java.lang.String Id = jj4Var.f377855d;
            kotlin.jvm.internal.o.f(Id, "Id");
            kotlinx.coroutines.flow.q qVar = new kotlinx.coroutines.flow.q(new n74.a0(Id, concat, n74.y.f335447f));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return qVar;
        }
        java.lang.String Id2 = jj4Var.f377855d;
        kotlin.jvm.internal.o.f(Id2, "Id");
        ((kotlinx.coroutines.flow.h3) c(Id2)).k(null);
        com.tencent.mars.xlog.Log.i("AdMediaDownloadHelper", "down load sight is " + jj4Var.f377855d + " url: " + jj4Var.f377858g);
        com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(new n74.b0(jj4Var, s7Var), 0L);
        java.lang.String Id3 = jj4Var.f377855d;
        kotlin.jvm.internal.o.f(Id3, "Id");
        kotlinx.coroutines.flow.g0 g0Var = new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.q(new n74.a0(Id3, null, n74.y.f335445d)), new n74.e0(jj4Var, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        return g0Var;
    }

    public final void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        boolean z17 = true;
        jj4Var.N = true;
        java.util.Set set = f335367e;
        synchronized (set) {
            try {
                java.lang.String str = jj4Var.f377855d;
                if (str == null) {
                    str = "";
                }
                set.add(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        l44.c0.b(snsInfo, jj4Var);
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(jj4Var);
        kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
        java.lang.String concat = com.tencent.mm.vfs.w6.j(d17.concat(R)) ? d17.concat(R) : null;
        if (concat != null && !r26.n0.N(concat)) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(new n74.g0(jj4Var, s7Var), 0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
    }
}
