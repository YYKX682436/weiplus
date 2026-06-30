package nu3;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.i f340218a = new nu3.i();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo f340219b = new com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo();

    /* renamed from: c, reason: collision with root package name */
    public static nu3.a f340220c = new nu3.a();

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct f340221d = new com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct();

    /* renamed from: e, reason: collision with root package name */
    public static nu3.a f340222e = new nu3.a();

    /* renamed from: f, reason: collision with root package name */
    public static int f340223f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct f340224g = new com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct();

    /* renamed from: h, reason: collision with root package name */
    public static nu3.a f340225h = new nu3.a();

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f340226i = "";

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f340227j = "";

    public static void c(nu3.i iVar, java.lang.String key, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        iVar.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        f340219b.c(key, java.lang.Integer.valueOf(((java.lang.Integer) f340219b.b(key, 0)).intValue() + i17));
    }

    public final void a(java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        f340219b.c(key, java.lang.Long.valueOf(((java.lang.Long) f340219b.b(key, 0L)).longValue() + j17));
    }

    public final void b(int i17) {
        f340220c.a(i17);
    }

    public final void d(int i17) {
        int i18;
        if (i17 == 15 && ((i18 = f340223f) == 4 || i18 == 10)) {
            f340223f = i17;
            return;
        }
        f340223f = i17;
        f340222e.a(i17);
        f340225h.a(i17);
    }

    public final void e(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        java.lang.String str = (java.lang.String) f340219b.b(key, "");
        if (!android.text.TextUtils.isEmpty(str)) {
            value = str + '#' + value;
        }
        f340219b.c(key, value);
    }

    public final void f(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        f340219b.f155689d.remove(key);
    }

    public final void g(int i17) {
        if (i17 == 3) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo l17 = l();
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct = f340221d;
            storyDoPublishStruct.f60879n = storyDoPublishStruct.b("MusicId", (java.lang.String) l17.b("KEY_MUSIC_ID_STRING", ""), true);
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct2 = f340221d;
            java.lang.Object b17 = l17.b("KEY_MUSIC_INDEX_INT", 0L);
            kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
            storyDoPublishStruct2.f60880o = ((java.lang.Number) b17).longValue();
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct3 = f340221d;
            java.lang.Object b18 = l17.b("KEY_MUSIC_REQ_ID_INT", 0L);
            kotlin.jvm.internal.o.f(b18, "getReportValue(...)");
            storyDoPublishStruct3.f60882q = ((java.lang.Number) b18).longValue();
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct4 = f340221d;
            java.lang.Object b19 = l17.b("KEY_SEARCH_MUSIC_INT", 0L);
            kotlin.jvm.internal.o.f(b19, "getReportValue(...)");
            storyDoPublishStruct4.f60888w = ((java.lang.Number) b19).longValue();
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct5 = f340221d;
            storyDoPublishStruct5.f60885t = storyDoPublishStruct5.b("ActionTrace", f340222e.b(), true);
            f340221d.k();
            f340223f = -1;
        }
        f340221d = new com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct();
        f340222e = new nu3.a();
    }

    public final void h() {
        com.tencent.mm.autogen.mmdata.rpt.EditImageReportStruct editImageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.EditImageReportStruct();
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo l17 = l();
        java.lang.Object b17 = l17.b("KEY_NET_TYPE_INT", -1L);
        kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
        editImageReportStruct.f55916d = ((java.lang.Number) b17).longValue();
        java.lang.Object b18 = l17.b("KEY_FROM_SCENE_INT", -1L);
        kotlin.jvm.internal.o.f(b18, "getReportValue(...)");
        editImageReportStruct.f55918e = ((java.lang.Number) b18).longValue();
        java.lang.Object b19 = l17.b("KEY_ENTER_TIME_MS_LONG", -1L);
        kotlin.jvm.internal.o.f(b19, "getReportValue(...)");
        editImageReportStruct.f55920f = ((java.lang.Number) b19).longValue();
        java.lang.Object b27 = l17.b("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        kotlin.jvm.internal.o.f(b27, "getReportValue(...)");
        editImageReportStruct.f55922g = ((java.lang.Number) b27).longValue();
        java.lang.Object b28 = l17.b("KEY_MEDIA_SOURCE_INT", -1L);
        kotlin.jvm.internal.o.f(b28, "getReportValue(...)");
        editImageReportStruct.f55924h = ((java.lang.Number) b28).longValue();
        java.lang.Object b29 = l17.b("KEY_MEDIA_TYPE_INT", -1L);
        kotlin.jvm.internal.o.f(b29, "getReportValue(...)");
        editImageReportStruct.f55926i = ((java.lang.Number) b29).longValue();
        java.lang.Object b37 = l17.b("KEY_START_RECORD_MS_LONG", -1L);
        kotlin.jvm.internal.o.f(b37, "getReportValue(...)");
        editImageReportStruct.f55928j = ((java.lang.Number) b37).longValue();
        java.lang.Object b38 = l17.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", -1L);
        kotlin.jvm.internal.o.f(b38, "getReportValue(...)");
        editImageReportStruct.f55930k = ((java.lang.Number) b38).longValue();
        java.lang.Object b39 = l17.b("KEY_ORIGIN_MEDIA_WIDTH_INT", -1L);
        kotlin.jvm.internal.o.f(b39, "getReportValue(...)");
        editImageReportStruct.f55932l = ((java.lang.Number) b39).longValue();
        java.lang.Object b47 = l17.b("KEY_ORIGIN_MEDIA_HEIGHT_INT", -1L);
        kotlin.jvm.internal.o.f(b47, "getReportValue(...)");
        editImageReportStruct.f55934m = ((java.lang.Number) b47).longValue();
        java.lang.Object b48 = l17.b("KEY_ENTER_CROP_PAGE_TIME_MS_LONG", -1L);
        kotlin.jvm.internal.o.f(b48, "getReportValue(...)");
        editImageReportStruct.f55936n = ((java.lang.Number) b48).longValue();
        java.lang.Object b49 = l17.b("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", -1L);
        kotlin.jvm.internal.o.f(b49, "getReportValue(...)");
        editImageReportStruct.f55938o = ((java.lang.Number) b49).longValue();
        java.lang.Object b57 = l17.b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", -1L);
        kotlin.jvm.internal.o.f(b57, "getReportValue(...)");
        editImageReportStruct.f55940p = ((java.lang.Number) b57).longValue();
        java.lang.Object b58 = l17.b("KEY_CLICK_EMOJI_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b58, "getReportValue(...)");
        editImageReportStruct.f55942q = ((java.lang.Number) b58).longValue();
        java.lang.Object b59 = l17.b("KEY_ADD_EMOJI_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b59, "getReportValue(...)");
        editImageReportStruct.f55944r = ((java.lang.Number) b59).longValue();
        java.lang.Object b67 = l17.b("KEY_CLICK_TEXT_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b67, "getReportValue(...)");
        editImageReportStruct.f55946s = ((java.lang.Number) b67).longValue();
        java.lang.Object b68 = l17.b("KEY_ADD_TEXT_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b68, "getReportValue(...)");
        editImageReportStruct.f55948t = ((java.lang.Number) b68).longValue();
        java.lang.Object b69 = l17.b("KEY_CLICK_DOODLE_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b69, "getReportValue(...)");
        editImageReportStruct.f55949u = ((java.lang.Number) b69).longValue();
        java.lang.Object b76 = l17.b("KEY_ADD_DOODLE_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b76, "getReportValue(...)");
        editImageReportStruct.f55950v = ((java.lang.Number) b76).longValue();
        java.lang.Object b77 = l17.b("KEY_ADD_DOODLE_COLOR_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b77, "getReportValue(...)");
        editImageReportStruct.f55951w = ((java.lang.Number) b77).longValue();
        java.lang.Object b78 = l17.b("KEY_CLICK_MOSAIC_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b78, "getReportValue(...)");
        editImageReportStruct.f55952x = ((java.lang.Number) b78).longValue();
        java.lang.Object b79 = l17.b("KEY_CLICK_BRUSH_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b79, "getReportValue(...)");
        editImageReportStruct.f55953y = ((java.lang.Number) b79).longValue();
        java.lang.Object b86 = l17.b("KEY_ADD_MOSAIC_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b86, "getReportValue(...)");
        editImageReportStruct.f55954z = ((java.lang.Number) b86).longValue();
        java.lang.Object b87 = l17.b("KEY_CLICK_CROP_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b87, "getReportValue(...)");
        editImageReportStruct.A = ((java.lang.Number) b87).longValue();
        java.lang.Object b88 = l17.b("KEY_CROP_MEDIA_HEIGHT_INT", -1L);
        kotlin.jvm.internal.o.f(b88, "getReportValue(...)");
        editImageReportStruct.C = ((java.lang.Number) b88).longValue();
        java.lang.Object b89 = l17.b("KEY_CROP_MEDIA_WIDTH_INT", -1L);
        kotlin.jvm.internal.o.f(b89, "getReportValue(...)");
        editImageReportStruct.B = ((java.lang.Number) b89).longValue();
        java.lang.Object b96 = l17.b("KEY_ROTATE_INT", -1L);
        kotlin.jvm.internal.o.f(b96, "getReportValue(...)");
        editImageReportStruct.D = ((java.lang.Number) b96).longValue();
        java.lang.Object b97 = l17.b("KEY_CLICK_MUSIC_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b97, "getReportValue(...)");
        editImageReportStruct.E = ((java.lang.Number) b97).longValue();
        java.lang.Object b98 = l17.b("KEY_MUSIC_ID_STRING", "");
        kotlin.jvm.internal.o.f(b98, "getReportValue(...)");
        java.lang.Long j17 = r26.h0.j((java.lang.String) b98);
        editImageReportStruct.F = j17 != null ? j17.longValue() : 0L;
        java.lang.Object b99 = l17.b("KEY_MUSIC_INDEX_INT", -1L);
        kotlin.jvm.internal.o.f(b99, "getReportValue(...)");
        editImageReportStruct.G = ((java.lang.Number) b99).longValue();
        java.lang.Object b100 = l17.b("KEY_SELECT_MUSIC_INT", -1L);
        kotlin.jvm.internal.o.f(b100, "getReportValue(...)");
        editImageReportStruct.H = ((java.lang.Number) b100).longValue();
        java.lang.Object b101 = l17.b("KEY_SELECT_ORIGIN_INT", -1L);
        kotlin.jvm.internal.o.f(b101, "getReportValue(...)");
        editImageReportStruct.I = ((java.lang.Number) b101).longValue();
        java.lang.Object b102 = l17.b("KEY_MUSIC_REQ_ID_INT", -1L);
        kotlin.jvm.internal.o.f(b102, "getReportValue(...)");
        editImageReportStruct.f55912J = ((java.lang.Number) b102).longValue();
        java.lang.Object b103 = l17.b("KEY_SEARCH_MUSIC_INT", -1L);
        kotlin.jvm.internal.o.f(b103, "getReportValue(...)");
        editImageReportStruct.K = ((java.lang.Number) b103).longValue();
        java.lang.Object b104 = l17.b("KEY_CLICK_VIDEO_CROP_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b104, "getReportValue(...)");
        editImageReportStruct.L = ((java.lang.Number) b104).longValue();
        java.lang.Object b105 = l17.b("KEY_VIDEO_CROP_DURATION_MS_INT", -1L);
        kotlin.jvm.internal.o.f(b105, "getReportValue(...)");
        editImageReportStruct.M = ((java.lang.Number) b105).longValue();
        java.lang.Object b106 = l17.b("KEY_AFTER_EDIT_INT", -1L);
        kotlin.jvm.internal.o.f(b106, "getReportValue(...)");
        editImageReportStruct.N = ((java.lang.Number) b106).longValue();
        java.lang.Object b107 = l17.b("KEY_EDIT_PUBLISHID_INT", -1L);
        kotlin.jvm.internal.o.f(b107, "getReportValue(...)");
        editImageReportStruct.O = ((java.lang.Number) b107).longValue();
        java.lang.Object b108 = l17.b("KEY_IS_SHOW_WESEE_BTN", 0L);
        kotlin.jvm.internal.o.f(b108, "getReportValue(...)");
        editImageReportStruct.Q = ((java.lang.Number) b108).longValue();
        java.lang.Object b109 = l17.b("KEY_IS_CLICK_WESEE_BTN", 0L);
        kotlin.jvm.internal.o.f(b109, "getReportValue(...)");
        editImageReportStruct.R = ((java.lang.Number) b109).longValue();
        java.lang.Object b110 = l17.b("KEY_IS_INSTALL_WESEE", 0L);
        kotlin.jvm.internal.o.f(b110, "getReportValue(...)");
        editImageReportStruct.S = ((java.lang.Number) b110).longValue();
        java.lang.Object b111 = l17.b("KEY_WESEE_DIALOG_OPERATION", 0L);
        kotlin.jvm.internal.o.f(b111, "getReportValue(...)");
        editImageReportStruct.T = ((java.lang.Number) b111).longValue();
        editImageReportStruct.P = editImageReportStruct.b("ActionTrace", f340220c.b(), true);
        java.lang.Object b112 = l17.b("KEY_SEARCH_MUSIC_COUNT_INT", 0L);
        kotlin.jvm.internal.o.f(b112, "getReportValue(...)");
        editImageReportStruct.U = ((java.lang.Number) b112).longValue();
        editImageReportStruct.V = editImageReportStruct.b("SearchMusicList", (java.lang.String) l17.b("KEY_SEARCH_MUSIC_LIST_STRING", ""), true);
        editImageReportStruct.W = editImageReportStruct.b("TextWidgetContentList", (java.lang.String) l17.b("KEY_TEXT_WIDGET_CONTENT_STRING", ""), true);
        editImageReportStruct.Y = editImageReportStruct.b("moment_sessionid", (java.lang.String) l17.b("moment_sessionid_", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi()), true);
        editImageReportStruct.f55913a0 = editImageReportStruct.b("CameraSessionID", (java.lang.String) l17.b("KEY_CAMERA_SESSION_ID", ""), true);
        java.lang.Object b113 = l17.b("KEY_ZOOM_IN_OUT_COUNT", 0L);
        kotlin.jvm.internal.o.f(b113, "getReportValue(...)");
        editImageReportStruct.Z = ((java.lang.Number) b113).longValue();
        java.lang.Object b114 = l17.b("KEY_CLICK_PEN_ERASER", 0L);
        kotlin.jvm.internal.o.f(b114, "getReportValue(...)");
        editImageReportStruct.f55921f0 = ((java.lang.Number) b114).longValue();
        java.lang.Object b115 = l17.b("KEY_PEN_ERASER_WIDGET_COUNT", 0L);
        kotlin.jvm.internal.o.f(b115, "getReportValue(...)");
        editImageReportStruct.f55923g0 = ((java.lang.Number) b115).longValue();
        java.lang.Object b116 = l17.b("KEY_PEN_ERASER_TRACE_COUNT", 0L);
        kotlin.jvm.internal.o.f(b116, "getReportValue(...)");
        editImageReportStruct.f55925h0 = ((java.lang.Number) b116).longValue();
        java.lang.Object b117 = l17.b("KEY_CLICK_MOSAIC_COUNT", 0L);
        kotlin.jvm.internal.o.f(b117, "getReportValue(...)");
        editImageReportStruct.f55927i0 = ((java.lang.Number) b117).longValue();
        java.lang.Object b118 = l17.b("KEY_MOSAIC_ERASER_WIDGET_COUNT", 0L);
        kotlin.jvm.internal.o.f(b118, "getReportValue(...)");
        editImageReportStruct.f55929j0 = ((java.lang.Number) b118).longValue();
        java.lang.Object b119 = l17.b("KEY_MOSAIC_ERASER_TRACE_COUNT", 0L);
        kotlin.jvm.internal.o.f(b119, "getReportValue(...)");
        editImageReportStruct.f55931k0 = ((java.lang.Number) b119).longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object b120 = l17.b("KEY_CLICK_UNDO_PEN", 0);
        kotlin.jvm.internal.o.f(b120, "getReportValue(...)");
        sb6.append(((java.lang.Number) b120).intValue());
        sb6.append("#");
        java.lang.Object b121 = l17.b("KEY_CLICK_UNDO_PEN_ERASER", 0);
        kotlin.jvm.internal.o.f(b121, "getReportValue(...)");
        sb6.append(((java.lang.Number) b121).intValue());
        sb6.append("#");
        java.lang.Object b122 = l17.b("KEY_CLICK_UNDO_EMOJI", 0);
        kotlin.jvm.internal.o.f(b122, "getReportValue(...)");
        sb6.append(((java.lang.Number) b122).intValue());
        sb6.append("#");
        java.lang.Object b123 = l17.b("KEY_CLICK_UNDO_TEXT", 0);
        kotlin.jvm.internal.o.f(b123, "getReportValue(...)");
        sb6.append(((java.lang.Number) b123).intValue());
        sb6.append("#");
        java.lang.Object b124 = l17.b("KEY_CLICK_UNDO_CROP", 0);
        kotlin.jvm.internal.o.f(b124, "getReportValue(...)");
        sb6.append(((java.lang.Number) b124).intValue());
        sb6.append("#");
        java.lang.Object b125 = l17.b("KEY_CLICK_UNDO_MOSAIC", 0);
        kotlin.jvm.internal.o.f(b125, "getReportValue(...)");
        sb6.append(((java.lang.Number) b125).intValue());
        sb6.append("#");
        java.lang.Object b126 = l17.b("KEY_CLICK_UNDO_MOSAIC_ERASER", 0);
        kotlin.jvm.internal.o.f(b126, "getReportValue(...)");
        sb6.append(((java.lang.Number) b126).intValue());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        editImageReportStruct.f55933l0 = editImageReportStruct.b("ClickWithdrawCnt", sb7, true);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.Object b127 = l17.b("KEY_CLICK_REDO_PEN", 0);
        kotlin.jvm.internal.o.f(b127, "getReportValue(...)");
        sb8.append(((java.lang.Number) b127).intValue());
        sb8.append("#");
        java.lang.Object b128 = l17.b("KEY_CLICK_REDO_PEN_ERASER", 0);
        kotlin.jvm.internal.o.f(b128, "getReportValue(...)");
        sb8.append(((java.lang.Number) b128).intValue());
        sb8.append("#");
        java.lang.Object b129 = l17.b("KEY_CLICK_REDO_EMOJI", 0);
        kotlin.jvm.internal.o.f(b129, "getReportValue(...)");
        sb8.append(((java.lang.Number) b129).intValue());
        sb8.append("#");
        java.lang.Object b130 = l17.b("KEY_CLICK_REDO_TEXT", 0);
        kotlin.jvm.internal.o.f(b130, "getReportValue(...)");
        sb8.append(((java.lang.Number) b130).intValue());
        sb8.append("#");
        java.lang.Object b131 = l17.b("KEY_CLICK_REDO_CROP", 0);
        kotlin.jvm.internal.o.f(b131, "getReportValue(...)");
        sb8.append(((java.lang.Number) b131).intValue());
        sb8.append("#");
        java.lang.Object b132 = l17.b("KEY_CLICK_REDO_MOSAIC", 0);
        kotlin.jvm.internal.o.f(b132, "getReportValue(...)");
        sb8.append(((java.lang.Number) b132).intValue());
        sb8.append("#");
        java.lang.Object b133 = l17.b("KEY_CLICK_REDO_MOSAIC_ERASER", 0);
        kotlin.jvm.internal.o.f(b133, "getReportValue(...)");
        sb8.append(((java.lang.Number) b133).intValue());
        java.lang.String sb9 = sb8.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        editImageReportStruct.f55935m0 = editImageReportStruct.b("ClickRedoCnt", sb9, true);
        java.lang.Object b134 = l17.b("KEY_CLICK_NEW_LINE_COUNT", 0L);
        kotlin.jvm.internal.o.f(b134, "getReportValue(...)");
        editImageReportStruct.f55937n0 = ((java.lang.Number) b134).longValue();
        editImageReportStruct.f55941p0 = editImageReportStruct.b("ChatUserName", (java.lang.String) l17.b("KEY_CHAT_USERNAME", ""), true);
        java.lang.Object b135 = l17.b("KEY_ROOM_SIZE", 0);
        kotlin.jvm.internal.o.f(b135, "getReportValue(...)");
        editImageReportStruct.f55943q0 = ((java.lang.Number) b135).intValue();
        editImageReportStruct.f55939o0 = editImageReportStruct.b("CameraEnterSessionID", (java.lang.String) l17.b("KEY_CAMERA_ENTER_SESSION_ID", ""), true);
        editImageReportStruct.f55945r0 = java.lang.System.currentTimeMillis();
        editImageReportStruct.f55947s0 = editImageReportStruct.b("EditSessionID", java.lang.String.valueOf(l17.b("KEY_EDIT_SESSION_ID", 0L)), true);
        editImageReportStruct.k();
        int i17 = (int) editImageReportStruct.f55918e;
        java.lang.Object b136 = l17.b("KEY_EDIT_SESSION_ID", 0L);
        kotlin.jvm.internal.o.f(b136, "getReportValue(...)");
        f340219b = new com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo();
        f340220c = new nu3.a();
        nu3.i iVar = f340218a;
        iVar.n("KEY_FROM_SCENE_INT", java.lang.Integer.valueOf(i17));
        iVar.n("KEY_EDIT_SESSION_ID", b136);
    }

    public final void i(int i17) {
        if (i17 == 3) {
            f340224g.f60948h = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct storyQuitPublishStruct = f340224g;
            storyQuitPublishStruct.f60955o = storyQuitPublishStruct.b("NewActionTrace", f340225h.b(), true);
            f340224g.k();
        }
        f340224g = new com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct();
        f340225h = new nu3.a();
    }

    public final void j(long j17) {
        com.tencent.mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct snsChoosePostBussinessReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct();
        snsChoosePostBussinessReportStruct.f60471e = 2L;
        snsChoosePostBussinessReportStruct.f60472f = j17;
        snsChoosePostBussinessReportStruct.f60470d = snsChoosePostBussinessReportStruct.b("sessionid", f340227j, true);
        snsChoosePostBussinessReportStruct.k();
    }

    public final void k(long j17) {
        com.tencent.mm.autogen.mmdata.rpt.SnsClipPageEntranceExposeReportStruct snsClipPageEntranceExposeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsClipPageEntranceExposeReportStruct();
        snsClipPageEntranceExposeReportStruct.f60492e = j17;
        snsClipPageEntranceExposeReportStruct.f60491d = snsClipPageEntranceExposeReportStruct.b("sessionid", f340226i, true);
        snsClipPageEntranceExposeReportStruct.k();
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo l() {
        f340219b.c("KEY_ACTION_TRACE_STRING", f340220c.b());
        return f340219b;
    }

    public final void m(com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo) {
        f340219b = new com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo();
        f340220c = new nu3.a();
        f340218a.n("KEY_FROM_SCENE_INT", java.lang.Integer.valueOf(videoCaptureReportInfo != null ? videoCaptureReportInfo.f155690d : -1));
    }

    public final void n(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        f340219b.c(key, value);
    }
}
