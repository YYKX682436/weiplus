package com.tencent.mm.plugin.finder.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPostRouterUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lut3/d;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/jc", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderPostRouterUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements ut3.d {
    public static final com.tencent.mm.plugin.finder.ui.jc Q = new com.tencent.mm.plugin.finder.ui.jc(null);
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public byte[] D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f128651J;
    public boolean L;
    public long N;

    /* renamed from: u, reason: collision with root package name */
    public boolean f128653u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f128654v;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f128658z;

    /* renamed from: t, reason: collision with root package name */
    public int f128652t = -1;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f128655w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f128656x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f128657y = "";
    public java.lang.String K = "";
    public int M = -1;
    public final jz5.g P = jz5.h.b(com.tencent.mm.plugin.finder.ui.pc.f129632d);

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle extData, ut3.c finishController) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extData, "extData");
        kotlin.jvm.internal.o.g(finishController, "finishController");
        return false;
    }

    public final android.content.Intent c7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_finder_context_id", this.f128656x);
        intent.putExtra("key_finder_session_id", this.f128657y);
        intent.putExtra("key_finder_post_id", this.f128655w);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", this.B);
        intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", this.C);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", this.f128658z);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", this.A);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", this.D);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", this.H);
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", this.I);
        intent.putExtra("KEY_FINDER_MEMBER_VIDEO", this.f128651J);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL", this.F);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", this.E);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_AUTHOR", this.G);
        intent.putExtra("key_maas_entrance", getIntent().getIntExtra("key_maas_entrance", 0));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nl(intent, getIntent());
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, this, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        return intent;
    }

    public final void d7() {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "[enterFinderTimelineUI] routeFrom:" + this.M + " localId:" + this.N);
        if (this.N == 0) {
            finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_finder_post_local_id", this.N);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).xj(intent);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("key_context_id"))) {
            intent.putExtra("key_context_id", getIntent().getStringExtra("key_context_id"));
        }
        boolean qj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj();
        if (qj6) {
            zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
            kotlin.jvm.internal.o.f(getContext(), "getContext(...)");
            intent.putExtra("KEY_POST_FROM_NORMAL_TASK", !((com.tencent.mm.plugin.finder.service.l3) c9Var).Di(r7));
        }
        if (!com.tencent.mm.plugin.finder.report.p2.f125237a.s()) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, this, intent, 0, false, 12, null);
            finish();
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        int i17 = finderFeedReportObject != null && finderFeedReportObject.getEnterScene() == 110 ? 53 : 52;
        java.lang.String Gj = qj6 ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, i17, 20) : ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, i17, 17);
        intent.putExtra("key_context_id", Gj);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.ub.L7((c61.ub) c18, this, intent, 0, false, 12, null);
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.mc(this, Gj));
    }

    public final long e7() {
        return (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).wi() == 1 ? ((java.lang.Number) ((jz5.n) this.P).getValue()).intValue() : ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).mj()) * 1000;
    }

    public final void f7(java.util.ArrayList arrayList, int i17) {
        int i18;
        int i19;
        if (arrayList.isEmpty()) {
            return;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider a17 = uu2.b.f431269a.a();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("media_list", arrayList);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this);
        c50.b1 b1Var = (c50.b1) i95.n0.c(c50.b1.class);
        android.content.Context baseContext = getBaseContext();
        kotlin.jvm.internal.o.f(baseContext, "getBaseContext(...)");
        jz5.o Ai = ((c61.s9) b1Var).Ai(baseContext, h17.x, h17.y);
        android.graphics.Point point = new android.graphics.Point(((java.lang.Number) Ai.f302842e).intValue(), ((java.lang.Number) Ai.f302843f).intValue());
        bundle.putInt("KEY_PREVIEW_WIDTH", point.x);
        bundle.putInt("KEY_PREVIEW_HEIGHT", point.y);
        bundle.putLong("video_max_duration", e7());
        bundle.putLong("video_track_max_duration", e7());
        bundle.putString("output_dir", com.tencent.mm.plugin.finder.assist.e9.f102146o);
        a17.M = bundle;
        if (21 == this.f128652t) {
            i18 = 0;
            i19 = 0;
        } else {
            i18 = com.tencent.mm.R.anim.f477886ea;
            i19 = com.tencent.mm.R.anim.f477889ed;
        }
        ut3.m.f431182a.f(getContext(), 292, i18, i19, a17, i17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7() {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderPostRouterUI.g7():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel model, android.os.Bundle extData) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(extData, "extData");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onMediaGenerated soundTrackType=" + extData.getInt("SOUND_TRACK_TYPE", 0));
        this.f128654v = false;
        android.content.Intent intent = getIntent();
        java.util.ArrayList arrayList = (java.util.ArrayList) model.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
        byte[] byteArray = extData.getByteArray("MEDIA_EXTRA_MUSIC");
        if (byteArray != null) {
            intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray);
        }
        byte[] byteArray2 = extData.getByteArray("ORIGIN_MUSIC_INFO");
        if (byteArray2 != null) {
            intent.putExtra("ORIGIN_MUSIC_INFO", byteArray2);
        }
        pm0.v.l(intent, extData, "ORIGIN_MUSIC_ID");
        pm0.v.l(intent, extData, "ORIGIN_MUSIC_PATH");
        pm0.v.l(intent, extData, "ORIGIN_BGM_URL");
        pm0.v.e(intent, extData, "MEDIA_IS_MUTE", false, 4, null);
        pm0.v.e(intent, extData, "MUSIC_IS_MUTE", false, 4, null);
        pm0.v.h(intent, extData, "SOUND_TRACK_TYPE", 0, 4, null);
        pm0.v.l(intent, extData, "MUSIC_FEED_ID");
        if (!intent.hasExtra("key_topic_id")) {
            pm0.v.i(intent, extData, "key_topic_id", 0L, 4, null);
            pm0.v.h(intent, extData, "key_activity_type", 0, 4, null);
            pm0.v.l(intent, extData, "key_user_name");
            pm0.v.l(intent, extData, "key_nick_name");
            pm0.v.l(intent, extData, "key_avatar_url");
            pm0.v.l(intent, extData, "key_cover_url");
            pm0.v.i(intent, extData, "key_activity_display_mask", 0L, 4, null);
            pm0.v.l(intent, extData, "key_activity_name");
            pm0.v.l(intent, extData, "key_activity_desc");
            pm0.v.i(intent, extData, "key_activity_end_time", 0L, 4, null);
        }
        java.util.ArrayList parcelableArrayList = extData.getParcelableArrayList("KEY_POST_HALF_RECT_LIST");
        if (parcelableArrayList != null) {
            intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
        }
        byte[] byteArray3 = extData.getByteArray("KEY_POST_VIDEO_TEMPLATE");
        if (byteArray3 != null) {
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", byteArray3);
        }
        byte[] byteArray4 = extData.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE");
        if (byteArray4 != null) {
            intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", byteArray4);
        }
        byte[] byteArray5 = extData.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON");
        if (byteArray5 != null) {
            intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", byteArray5);
        }
        byte[] byteArray6 = extData.getByteArray("KEY_POST_ASSET_INFO");
        if (byteArray6 != null) {
            intent.putExtra("KEY_POST_ASSET_INFO", byteArray6);
        }
        intent.putExtra("KEY_POST_VIDEO_COVER_START_TIME", extData.getDouble("KEY_POST_VIDEO_COVER_START_TIME", 0.0d));
        boolean z18 = extData.getBoolean("KEY_IS_COMPOSING_CREATION_REEDIT", false);
        byte[] byteArray7 = extData.getByteArray("KEY_CREATE_TEMPLATE_INFO");
        if (byteArray7 != null) {
            intent.putExtra("KEY_CREATE_TEMPLATE_INFO", byteArray7);
        }
        intent.putExtra("key_ref_feed_id", extData.getLong("key_ref_feed_id", 0L));
        intent.putExtra("key_ref_feed_dup_flag", extData.getString("key_ref_feed_dup_flag"));
        intent.putExtra("key_ref_enter_scene", extData.getInt("key_ref_enter_scene", 0));
        intent.putExtra("KEY_POST_VIDEO_TITLE", extData.getString("KEY_POST_VIDEO_TITLE", ""));
        java.util.List<java.lang.String> list = model.f155666m;
        if (list == null || list.isEmpty()) {
            java.lang.Boolean bool = model.f155664h;
            kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
            if (bool.booleanValue()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(model.f155662f);
                intent.putExtra("postType", 2);
                intent.putExtra("postMediaList", arrayList2);
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
            } else {
                if (extData.getByteArray("video_composition") != null) {
                    intent.putExtra("video_composition", extData.getByteArray("video_composition"));
                    intent.putExtra("postThumbList", kz5.c0.d(model.f155662f));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(model.f155661e);
                    intent.putExtra("postMediaList", arrayList3);
                }
                intent.putExtra("postType", 4);
            }
        } else {
            intent.putExtra("postType", 2);
            intent.putExtra("postMediaList", new java.util.ArrayList(list));
            kotlin.jvm.internal.o.f(list, "getMultiImagePath(...)");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.String str : list) {
                arrayList4.add(2);
            }
            intent.putExtra("postTypeList", arrayList4);
            if (arrayList != null && arrayList.size() == list.size()) {
                intent.putExtra("key_post_media_quality_list", arrayList);
            }
            pm0.v.j(intent, extData, "KEY_POST_HALF_IMAGE_LIST");
        }
        intent.putExtra("KEY_POST_FROM_CAMERA", true);
        intent.putExtra("post_id", this.f128655w);
        intent.putExtra("edit_id", (java.lang.String) model.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
        getIntent().putExtra("KEY_MUSIC_ID", (java.lang.String) model.a().b("KEY_MUSIC_ID_STRING", ""));
        getIntent().putExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID", (java.lang.String) model.a().b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
        android.content.Intent intent2 = getIntent();
        java.lang.Object b17 = model.a().b("KEY_MUSIC_TYPE_INT", 0);
        kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
        intent2.putExtra("KEY_MUSIC_TYPE", ((java.lang.Number) b17).intValue());
        getIntent().putExtra("KEY_MUSIC_SESSION_BUFFER", (java.lang.String) model.a().b("KEY_MUSIC_SESSION_BUFFER", ""));
        r45.df2 wi6 = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).wi();
        intent.putExtra("KEY_POST_MJ_PUBLISHER_INFO", wi6.toByteArray());
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.Y(wi6);
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.a1(m7Var, null), 3, null);
        m7Var.cj("Completed");
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.c2(m7Var, null), 3, null);
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.z1(m7Var, null), 3, null);
        m7Var.fj("Completed");
        m7Var.bj("Completed");
        m7Var.mj();
        boolean z19 = extData.getBoolean("KEY_DELAY_ENTER_POST_UI", false);
        if (!z19) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(context, intent);
        }
        if (getIntent().getBooleanExtra("KEY_FINDER_POST_MUSIC_NEED_FINISH", false)) {
            setResult(-1);
            finish();
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo a17 = model.a();
        kotlin.jvm.internal.o.f(a17, "getReportInfo(...)");
        p2Var.g(a17);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            if (z18) {
                ez0.i iVar = (ez0.i) ((uy0.h) i95.n0.c(uy0.h.class));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyReeditPostOk, listenerSize=");
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = iVar.f257809g;
                sb6.append(copyOnWriteArrayList.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", sb6.toString());
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                loop1: while (true) {
                    z17 = false;
                    while (it.hasNext()) {
                        try {
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.PluginMJTemplate", "notifyReeditPostOk listener failed: " + th6.getMessage());
                        }
                        if (((mx0.m4) ((uy0.a) it.next())).a() || z17) {
                            z17 = true;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "notifyReeditPostOk handled=" + z17);
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("key_extra_data", extData);
            intent3.putExtra("KSEGMENTMEDIAINFO", model);
            if (z19) {
                intent3.putExtra("KEY_POST_INTENT", intent);
            }
            activity.setResult(-1, intent3);
            activity.finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo;
        byte[] byteArray;
        byte[] byteArray2;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onActivityResult requestCode:" + i17 + " resultCode:" + i18);
        if (i17 == 233) {
            if (i18 == 0) {
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                if (!m7Var.Zi()) {
                    com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                    p2Var.Y(m7Var.wi());
                    ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Di();
                    p2Var.C(1, null);
                    i95.m c17 = i95.n0.c(w40.e.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    w40.e.fh((w40.e) c17, "andr_MJ_Camera_Cancel", null, 2, null);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "record cancel");
                if (intent != null && (recordMediaReportInfo = (com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo) intent.getParcelableExtra("report")) != null) {
                    com.tencent.mm.plugin.finder.report.p2.f125237a.g(recordMediaReportInfo);
                }
                yy0.g0 g0Var = (yy0.g0) ((pp0.g0) i95.n0.c(pp0.g0.class));
                synchronized (g0Var) {
                    yz5.l lVar = g0Var.f468100d;
                    if (lVar != null) {
                        lVar.invoke(null);
                    }
                    g0Var.f468100d = null;
                }
                finish();
                overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        if (i17 != 292) {
            if (i17 == 666 && i18 == -2) {
                yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                if (!m7Var2.Zi()) {
                    com.tencent.mm.plugin.finder.report.p2 p2Var2 = com.tencent.mm.plugin.finder.report.p2.f125237a;
                    p2Var2.Y(m7Var2.wi());
                    ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Di();
                    p2Var2.C(3, null);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "movie composing cancel");
                return;
            }
            return;
        }
        if (i18 != -1) {
            finish();
            if (21 == this.f128652t) {
                overridePendingTransition(0, 0);
                return;
            } else {
                overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
                return;
            }
        }
        kotlin.jvm.internal.o.d(intent);
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("KSEGMENTMEDIAINFO");
        kotlin.jvm.internal.o.d(parcelableExtra);
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) parcelableExtra;
        android.content.Intent intent2 = new android.content.Intent();
        android.os.Bundle bundle = ut3.f.f431176c.f431178b;
        if (bundle != null && (byteArray2 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) != null) {
            intent2.putExtra("MEDIA_EXTRA_MUSIC", byteArray2);
        }
        if (bundle != null && (byteArray = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
            intent2.putExtra("ORIGIN_MUSIC_INFO", byteArray);
        }
        pm0.v.l(intent2, bundle, "ORIGIN_MUSIC_ID");
        pm0.v.l(intent2, bundle, "ORIGIN_MUSIC_PATH");
        pm0.v.l(intent2, bundle, "ORIGIN_BGM_URL");
        pm0.v.e(intent2, bundle, "MEDIA_IS_MUTE", false, 4, null);
        pm0.v.e(intent2, bundle, "MUSIC_IS_MUTE", false, 4, null);
        pm0.v.h(intent2, bundle, "SOUND_TRACK_TYPE", 0, 4, null);
        pm0.v.l(intent2, bundle, "MUSIC_FEED_ID");
        java.util.List list = captureDataManager$CaptureVideoNormalModel.f155666m;
        if (list == null || list.size() <= 0) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
            kotlin.jvm.internal.o.d(bundleExtra);
            byte[] byteArray3 = bundleExtra.getByteArray("video_composition");
            if (byteArray3 != null) {
                intent2.putExtra("video_composition", byteArray3);
            }
            intent2.putExtra("postType", 4);
            intent2.putExtra("postMediaList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155661e));
            intent2.putExtra("postTypeList", kz5.c0.d(4));
            intent2.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
            intent2.putExtra("KEY_POST_HALF_RECT_LIST", intent.getParcelableArrayListExtra("KEY_POST_HALF_RECT_LIST"));
            if (this.f128652t != 21) {
                com.tencent.mm.plugin.finder.report.p2 p2Var3 = com.tencent.mm.plugin.finder.report.p2.f125237a;
                p2Var3.W(p2Var3.i(getContext(), 5, false));
            }
        } else {
            java.util.ArrayList arrayList = (java.util.ArrayList) captureDataManager$CaptureVideoNormalModel.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
            intent2.putExtra("postType", 2);
            java.util.List<java.lang.String> list2 = captureDataManager$CaptureVideoNormalModel.f155666m;
            kotlin.jvm.internal.o.f(list2, "getMultiImagePath(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) it.next());
            }
            intent2.putExtra("postMediaList", arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.String str : list2) {
                arrayList3.add(2);
            }
            intent2.putExtra("postTypeList", arrayList3);
            intent2.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
            if (arrayList != null && arrayList.size() == list2.size()) {
                intent2.putExtra("key_post_media_quality_list", arrayList);
            }
            pm0.v.j(intent2, ut3.f.f431176c.f431178b, "KEY_POST_HALF_IMAGE_LIST");
        }
        intent2.putExtra("post_id", this.f128655w);
        intent2.putExtra("edit_id", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
        intent2.putExtra("KEY_MUSIC_ID", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_ID_STRING", ""));
        intent2.putExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
        java.lang.Object b17 = captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_TYPE_INT", 0);
        kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
        intent2.putExtra("KEY_MUSIC_TYPE", ((java.lang.Number) b17).intValue());
        intent2.putExtra("KEY_MUSIC_SESSION_BUFFER", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_SESSION_BUFFER", ""));
        pm0.v.l(intent2, ut3.f.f431176c.f431178b, "KEY_POST_ORIGIN_FILE_PATH");
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nl(intent2, getIntent());
        intent2.putExtra("key_context_id", getIntent().getStringExtra("key_context_id"));
        intent2.putExtra("saveDesc", getIntent().getStringExtra("saveDesc"));
        intent2.putExtra("KEY_SNS_SERVER_FEED_ID", getIntent().getLongExtra("KEY_SNS_SERVER_FEED_ID", 0L));
        intent2.putExtra("KEY_SNS_LOCAL_FEED_ID", getIntent().getLongExtra("KEY_SNS_LOCAL_FEED_ID", 0L));
        intent2.putExtra("saveLocation", getIntent().getBooleanExtra("saveLocation", false));
        intent2.putExtra("get_poi_name", getIntent().getStringExtra("get_poi_name"));
        intent2.putExtra("get_city", getIntent().getStringExtra("get_city"));
        intent2.putExtra("get_lat", getIntent().getFloatExtra("get_lat", 0.0f));
        intent2.putExtra("get_lng", getIntent().getFloatExtra("get_lng", 0.0f));
        intent2.putExtra("get_poi_address", getIntent().getStringExtra("get_poi_address"));
        intent2.putExtra("get_poi_classify_id", getIntent().getStringExtra("get_poi_classify_id"));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(this, intent2);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onConfigurationChanged: newConfig " + newConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x074f  */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderPostRouterUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ut3.f.f431176c.f431177a = null;
        bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
        java.lang.String key = java.lang.String.valueOf(hashCode());
        ((b92.u2) vVar).getClass();
        kotlin.jvm.internal.o.g(key, "key");
        yr0.c.f464627b.c(key);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String str;
        super.onNewIntent(intent);
        if (intent == null || (str = intent.getStringExtra("KEY_FINDER_USERNAME_SELF")) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "[onNewIntent] intentUsername=" + str + " username=" + this.K);
        if ((str.length() > 0) && !kotlin.jvm.internal.o.b(str, this.K)) {
            this.K = str;
            g92.b bVar = g92.b.f269769e;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            bVar.z0(context, str);
        }
        this.f128652t = intent != null ? intent.getIntExtra("key_finder_post_router", -1) : -1;
        this.M = intent != null ? intent.getIntExtra("key_finder_post_from", -1) : -1;
        this.N = intent != null ? intent.getLongExtra("key_finder_post_local_id", 0L) : 0L;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                g7();
                return;
            } else {
                db5.e1.C(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.hh8), i65.a.r(getContext(), com.tencent.mm.R.string.hht), i65.a.r(getContext(), com.tencent.mm.R.string.g6z), i65.a.r(getContext(), com.tencent.mm.R.string.hh9), false, new com.tencent.mm.plugin.finder.ui.qc(this), new com.tencent.mm.plugin.finder.ui.rc(this));
                return;
            }
        }
        if (i17 != 80) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            g7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onResume router:" + this.f128652t + " routeFrom:" + this.M + " hasStopped:" + this.f128653u);
        getIntent().getBooleanExtra("KEY_FINDER_POST_FROM_ADD_MEDIA", false);
        if (this.f128653u) {
            int i17 = this.f128652t;
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", this.K);
                intent.addFlags(67108864);
                intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, this, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                if (!com.tencent.mm.plugin.finder.report.p2.f125237a.s()) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(this, intent);
                    finish();
                    return;
                } else {
                    com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                    java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, finderFeedReportObject != null && finderFeedReportObject.getEnterScene() == 110 ? 53 : 52, 33);
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(this, intent);
                    pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.kc(this, Gj));
                    return;
                }
            }
            if (i17 == 5) {
                d7();
                return;
            }
            if (i17 != 13) {
                finish();
                if (this.f128654v) {
                    overridePendingTransition(0, com.tencent.mm.R.anim.f477877e1);
                }
                if (this.f128652t == 6) {
                    overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
                }
                if (this.f128652t == 16) {
                    overridePendingTransition(0, com.tencent.mm.R.anim.f477889ed);
                    return;
                }
                return;
            }
            if (this.M == 1) {
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.D = 4;
                finish();
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_username", this.K);
            intent2.addFlags(67108864);
            intent2.putExtra("KEY_FINDER_SELF_FLAG", true);
            intent2.putExtra("key_enter_profile_tab", 4);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, this, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
            if (!com.tencent.mm.plugin.finder.report.p2.f125237a.s()) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(this, intent2);
                finish();
            } else {
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                java.lang.String Gj2 = finderFeedReportObject2 != null && finderFeedReportObject2.getEnterScene() == 110 ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 53, 33) : ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 52, 33);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(this, intent2);
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.lc(this, Gj2));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "onStop");
        this.f128653u = true;
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo reportInfo, android.os.Bundle extData) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        kotlin.jvm.internal.o.g(extData, "extData");
        com.tencent.mm.plugin.finder.report.p2.f125237a.f(reportInfo);
    }
}
