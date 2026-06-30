package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class m7 extends i95.w implements pp0.l0 {
    public volatile int A;
    public volatile boolean C;
    public volatile boolean D;
    public volatile java.lang.String E;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.maas.instamovie.MJPublisherSessionMetrics f468228g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f468229h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f468230i;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f468231m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f468232n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.String f468233o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.lang.String f468234p;

    /* renamed from: q, reason: collision with root package name */
    public volatile java.lang.String f468235q;

    /* renamed from: r, reason: collision with root package name */
    public volatile java.lang.String f468236r;

    /* renamed from: s, reason: collision with root package name */
    public volatile java.lang.String f468237s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f468238t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f468239u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f468240v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f468241w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f468242x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f468243y;

    /* renamed from: z, reason: collision with root package name */
    public volatile int f468244z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f468225d = "MicroMsg.MJPublisherSessionMetricsFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f468226e = jz5.h.b(yy0.l7.f468203d);

    /* renamed from: f, reason: collision with root package name */
    public yy0.q0 f468227f = yy0.q0.f468287d;
    public volatile boolean B = true;

    public java.util.Map Ai() {
        java.util.Map c17;
        com.tencent.mars.xlog.Log.i(this.f468225d, "generateReportingParams");
        synchronized (yy0.m7.class) {
            java.lang.String str = "";
            try {
                if (this.f468239u != null) {
                    com.tencent.mm.protobuf.g gVar = this.f468239u;
                    str = android.util.Base64.encodeToString(gVar != null ? gVar.f192156a : null, 2);
                    kotlin.jvm.internal.o.f(str, "encodeToString(...)");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f468225d, "encodeToString mjPublisherSelectedTemplateSessionBuffer exception: " + e17);
                str = "";
            }
            c17 = kotlin.jvm.internal.m0.c(kz5.c1.k(new jz5.l("enter_scene", java.lang.Integer.valueOf(this.f468231m)), new jz5.l("mj_publisher_session_id", this.f468229h), new jz5.l("source_feed_id", this.f468233o), new jz5.l("source_song_id", this.f468234p), new jz5.l("follow_feed_template_id", this.f468235q), new jz5.l("template_id", this.f468236r), new jz5.l("template_tab_id", this.f468237s), new jz5.l("template_position", java.lang.Integer.valueOf(this.f468238t)), new jz5.l("template_session_buffer", str), new jz5.l("template_type", java.lang.Integer.valueOf(this.f468240v)), new jz5.l("template_is_favorite", java.lang.Boolean.valueOf(this.f468241w)), new jz5.l("template_is_aigc", java.lang.Boolean.valueOf(this.f468242x)), new jz5.l("export_scene", java.lang.Integer.valueOf(this.f468232n)), new jz5.l("is_sc_asset_generate", java.lang.Boolean.valueOf(this.f468243y)), new jz5.l("video_source", java.lang.Integer.valueOf(this.f468244z)), new jz5.l("creation_page_id", java.lang.Integer.valueOf(this.A)), new jz5.l("post_id", this.E)));
        }
        return c17;
    }

    public void Aj(int i17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplateType: " + i17);
        synchronized (yy0.m7.class) {
            this.f468240v = i17;
        }
    }

    public int Bi() {
        int i17;
        synchronized (yy0.m7.class) {
            com.tencent.mars.xlog.Log.i(this.f468225d, "getEnterScene: " + this.f468231m);
            i17 = this.f468231m;
        }
        return i17;
    }

    public void Bj(int i17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setVideoSource: " + i17);
        synchronized (yy0.m7.class) {
            this.f468244z = i17;
        }
    }

    public final kotlinx.coroutines.y0 Di() {
        return (kotlinx.coroutines.y0) ((jz5.n) this.f468226e).getValue();
    }

    public java.lang.String Ni() {
        java.lang.String str;
        synchronized (yy0.m7.class) {
            com.tencent.mars.xlog.Log.i(this.f468225d, "getSelectedTemplateID: " + this.f468236r);
            str = this.f468236r;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public java.lang.String Ri() {
        java.lang.String str;
        synchronized (yy0.m7.class) {
            com.tencent.mars.xlog.Log.i(this.f468225d, "getSessionID: " + this.f468229h);
            str = this.f468229h;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public void Ui(java.lang.String entryType, int i17, int i18, java.lang.String postId, boolean z17) {
        kotlin.jvm.internal.o.g(entryType, "entryType");
        kotlin.jvm.internal.o.g(postId, "postId");
        Vi(entryType, i17, i18, postId, z17, "", "", "");
    }

    public void Vi(java.lang.String entryType, int i17, int i18, java.lang.String postId, boolean z17, java.lang.String sourceFeedID, java.lang.String sourceSongID, java.lang.String followFeedTemplateID) {
        kotlin.jvm.internal.o.g(entryType, "entryType");
        kotlin.jvm.internal.o.g(postId, "postId");
        kotlin.jvm.internal.o.g(sourceFeedID, "sourceFeedID");
        kotlin.jvm.internal.o.g(sourceSongID, "sourceSongID");
        kotlin.jvm.internal.o.g(followFeedTemplateID, "followFeedTemplateID");
        i95.m c17 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (pp0.h0.Q2((pp0.h0) c17, false, 1, null)) {
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).aj() || z17) {
                kotlinx.coroutines.l.d(Di(), null, null, new yy0.v0(this, entryType, i17, i18, z17, sourceFeedID, sourceSongID, followFeedTemplateID, postId, null), 3, null);
            }
        }
    }

    public boolean Zi() {
        boolean z17;
        com.tencent.mars.xlog.Log.i(this.f468225d, "isInFinderPostPage=" + this.C);
        synchronized (yy0.m7.class) {
            z17 = this.C;
        }
        return z17;
    }

    public boolean aj() {
        boolean z17;
        synchronized (yy0.m7.class) {
            com.tencent.mars.xlog.Log.i(this.f468225d, "isShootComposingFirstInit: " + this.D);
            z17 = this.D;
        }
        return z17;
    }

    public void bj(java.lang.String endReason) {
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlinx.coroutines.l.d(Di(), null, null, new yy0.w0(this, endReason, null), 3, null);
    }

    public void cj(java.lang.String endReason) {
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlinx.coroutines.l.d(Di(), null, null, new yy0.x0(this, endReason, null), 3, null);
    }

    public void fj(java.lang.String endReason) {
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlinx.coroutines.l.d(Di(), null, null, new yy0.y0(this, endReason, null), 3, null);
    }

    public void hj(java.lang.String endReason, java.lang.String resultMediaFilePath) {
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlin.jvm.internal.o.g(resultMediaFilePath, "resultMediaFilePath");
        kotlinx.coroutines.l.d(Di(), null, null, new yy0.a2(this, endReason, resultMediaFilePath, null), 3, null);
    }

    public void ij() {
        kotlinx.coroutines.l.d(Di(), null, null, new yy0.p2(this, null), 3, null);
    }

    public void mj() {
        i95.m c17 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (pp0.h0.Q2((pp0.h0) c17, false, 1, null)) {
            kotlinx.coroutines.l.d(Di(), null, null, new yy0.k7(this, null), 3, null);
        }
    }

    public void nj(java.lang.String endReason, boolean z17, boolean z18, long j17, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(filePath);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("endReason", endReason);
        jSONObject.put("isLongVideo", z17);
        jSONObject.put("isSkipped", z18);
        jSONObject.put("timeCost", j17);
        if (wi6 != null) {
            jSONObject.put("width", wi6.f361363a);
            jSONObject.put("height", wi6.f361364b);
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.Float.valueOf(wi6.f361365c));
            jSONObject.put("duration", wi6.f361366d);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, wi6.f361367e);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, wi6.f361368f);
            jSONObject.put("isH265", wi6.f361369g);
            jSONObject.put("audioBitrate", wi6.f361370h);
            jSONObject.put("audioChannelCount", wi6.f361371i);
            jSONObject.put("audioSampleRate", wi6.f361372j);
            jSONObject.put("pixelFormat", wi6.f361373k);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        oj("PSMC_ExportEndEvent", r26.i0.t(jSONObject2, ",", ";", false));
    }

    public void oj(java.lang.String reportingEventName, java.lang.String reportingEventDetails) {
        kotlin.jvm.internal.o.g(reportingEventName, "reportingEventName");
        kotlin.jvm.internal.o.g(reportingEventDetails, "reportingEventDetails");
        java.lang.String valueOf = java.lang.String.valueOf(this.f468229h);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.f468230i);
        com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct mJPublisherEventStruct = new com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct();
        mJPublisherEventStruct.f58715d = mJPublisherEventStruct.b("PublisherSessionID", valueOf, true);
        mJPublisherEventStruct.f58716e = mJPublisherEventStruct.b("EntryType", valueOf2, true);
        mJPublisherEventStruct.f58717f = mJPublisherEventStruct.b("MaasSDKVersion", "", true);
        mJPublisherEventStruct.f58718g = mJPublisherEventStruct.b("EventName", reportingEventName, true);
        mJPublisherEventStruct.f58719h = mJPublisherEventStruct.b("Details", reportingEventDetails, true);
        mJPublisherEventStruct.f58721j = mJPublisherEventStruct.b("PostId", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
        com.tencent.mars.xlog.Log.i("PublisherSessionMetricsReport", "29694 MJPublisherEventStruct values:\npublisherSessionID = " + mJPublisherEventStruct.f58715d + "\nentryType = " + mJPublisherEventStruct.f58716e + "\nmaasSDKVersion = " + mJPublisherEventStruct.f58717f + "\neventName = " + mJPublisherEventStruct.f58718g + "\ndetails = " + mJPublisherEventStruct.f58719h + "\npostId = " + mJPublisherEventStruct.f58721j);
        mJPublisherEventStruct.k();
    }

    public void pj(java.lang.String mjPublisherSessionID, java.lang.String mjPublisherEntryType, java.util.Map reportingParams) {
        kotlin.jvm.internal.o.g(mjPublisherSessionID, "mjPublisherSessionID");
        kotlin.jvm.internal.o.g(mjPublisherEntryType, "mjPublisherEntryType");
        kotlin.jvm.internal.o.g(reportingParams, "reportingParams");
        com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct mJPublisherEventStruct = new com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct();
        mJPublisherEventStruct.f58715d = mJPublisherEventStruct.b("PublisherSessionID", mjPublisherSessionID, true);
        mJPublisherEventStruct.f58716e = mJPublisherEventStruct.b("EntryType", mjPublisherEntryType, true);
        mJPublisherEventStruct.f58717f = mJPublisherEventStruct.b("MaasSDKVersion", "", true);
        mJPublisherEventStruct.f58718g = mJPublisherEventStruct.b("EventName", "PS_PostCompleted", true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : reportingParams.entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        mJPublisherEventStruct.f58719h = mJPublisherEventStruct.b("Details", r26.i0.t(jSONObject2, ",", ";", false), true);
        mJPublisherEventStruct.f58721j = mJPublisherEventStruct.b("PostId", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
        com.tencent.mars.xlog.Log.i("PublisherSessionMetricsReport", "29694 MJPublisherEventStruct values:\npublisherSessionID = " + mJPublisherEventStruct.f58715d + "\nentryType = " + mJPublisherEventStruct.f58716e + "\nmaasSDKVersion = " + mJPublisherEventStruct.f58717f + "\neventName = " + mJPublisherEventStruct.f58718g + "\ndetails = " + mJPublisherEventStruct.f58719h + "\npostId = " + mJPublisherEventStruct.f58721j);
        mJPublisherEventStruct.k();
    }

    public void qj(int i17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setCreationPageID: " + i17);
        synchronized (yy0.m7.class) {
            this.A = i17;
        }
    }

    public void rj(int i17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setExportScene: " + i17);
        synchronized (yy0.m7.class) {
            this.f468232n = i17;
        }
    }

    public void sj(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setIsAssetGenerate: " + z17);
        synchronized (yy0.m7.class) {
            this.f468243y = z17;
        }
    }

    public void tj(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setIsShootComposingFirstInit: " + z17);
        synchronized (yy0.m7.class) {
            this.D = z17;
        }
    }

    public void uj(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplateID: " + str);
        synchronized (yy0.m7.class) {
            this.f468236r = str;
        }
    }

    public void vj(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplateIsAIGC: " + z17);
        synchronized (yy0.m7.class) {
            this.f468242x = z17;
        }
    }

    public r45.df2 wi() {
        r45.df2 df2Var;
        com.tencent.mars.xlog.Log.i(this.f468225d, "generatePublisherInfo");
        synchronized (yy0.m7.class) {
            df2Var = new r45.df2();
            df2Var.set(0, this.f468229h);
            df2Var.set(1, this.f468239u);
            df2Var.set(2, this.f468230i);
            df2Var.set(3, java.lang.Boolean.FALSE);
            df2Var.set(4, java.lang.Integer.valueOf(this.f468232n));
            df2Var.set(5, this.f468237s);
            df2Var.set(6, this.f468233o);
            df2Var.set(7, this.f468234p);
            df2Var.set(8, this.f468235q);
            df2Var.set(9, this.f468236r);
            df2Var.set(10, java.lang.Integer.valueOf(this.f468238t));
            df2Var.set(11, java.lang.Boolean.valueOf(this.f468243y));
            df2Var.set(12, java.lang.Integer.valueOf(this.A));
            df2Var.set(15, java.lang.Integer.valueOf(this.f468240v));
            df2Var.set(16, java.lang.Boolean.valueOf(this.f468242x));
        }
        return df2Var;
    }

    public void wj(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplateIsFavorite: " + z17);
        synchronized (yy0.m7.class) {
            this.f468241w = z17;
        }
    }

    public void xj(int i17) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplatePosition: " + i17);
        synchronized (yy0.m7.class) {
            this.f468238t = i17;
        }
    }

    public void yj(com.tencent.mm.protobuf.g gVar) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplateSessionBuffer: " + gVar);
        synchronized (yy0.m7.class) {
            this.f468239u = gVar;
        }
    }

    public void zj(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f468225d, "setSelectedTemplateTabID: " + str);
        synchronized (yy0.m7.class) {
            this.f468237s = str;
        }
    }
}
