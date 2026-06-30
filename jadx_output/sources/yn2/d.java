package yn2;

/* loaded from: classes2.dex */
public final class d implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f463968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f463970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f463971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f463972h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f463973i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f463974m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f463975n;

    public d(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, yn2.m mVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.mb4 mb4Var, in5.s0 s0Var, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, kotlin.jvm.internal.c0 c0Var) {
        this.f463968d = finderVideoLayout;
        this.f463969e = mVar;
        this.f463970f = baseFinderFeed;
        this.f463971g = mb4Var;
        this.f463972h = s0Var;
        this.f463973i = g0Var;
        this.f463974m = g0Var2;
        this.f463975n = c0Var;
    }

    @Override // cw2.ea
    public void onVideoPause() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        java.lang.Object obj;
        long j17;
        long j18;
        long j19;
        kotlin.jvm.internal.c0 c0Var;
        kotlin.jvm.internal.g0 g0Var;
        java.lang.String str;
        java.lang.Object obj2;
        kotlin.jvm.internal.g0 g0Var2 = this.f463973i;
        if (g0Var2.f310121d > 0) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f463968d;
            long videoDurationMs = finderVideoLayout.getVideoDurationMs();
            long currentPosMs = finderVideoLayout.getCurrentPosMs();
            long currentTimeMillis = java.lang.System.currentTimeMillis() - g0Var2.f310121d;
            java.lang.Long valueOf = java.lang.Long.valueOf(videoDurationMs);
            if (!(valueOf.longValue() > 0)) {
                valueOf = null;
            }
            kotlin.jvm.internal.g0 g0Var3 = this.f463974m;
            java.lang.Object valueOf2 = valueOf != null ? java.lang.Float.valueOf((((float) g0Var3.f310121d) / ((float) valueOf.longValue())) * 100) : 0;
            java.lang.Long valueOf3 = java.lang.Long.valueOf(videoDurationMs);
            java.lang.Long l17 = (valueOf3.longValue() > 0L ? 1 : (valueOf3.longValue() == 0L ? 0 : -1)) > 0 ? valueOf3 : null;
            java.lang.Number valueOf4 = l17 != null ? java.lang.Float.valueOf((((float) currentPosMs) / ((float) l17.longValue())) * 100) : 0;
            kotlin.jvm.internal.c0 c0Var2 = this.f463975n;
            boolean z17 = c0Var2.f310112d;
            yn2.m mVar = this.f463969e;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f463970f;
            if (z17) {
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = mVar.f463994e;
                if (eVar == null || (str = ((xn2.p0) eVar).f455544b) == null) {
                    str = "";
                }
                java.lang.String u17 = pm0.v.u(baseFinderFeed2.getItemId());
                c0Var = c0Var2;
                java.lang.String sessionBuffer = baseFinderFeed2.getFeedObject().getFeedObject().getSessionBuffer();
                g0Var = g0Var3;
                j18 = currentPosMs;
                if (baseFinderFeed2 instanceof zn2.a) {
                    java.lang.String sessionId = ((zn2.a) baseFinderFeed2).f474488i;
                    if (sessionId.length() == 0) {
                        int i17 = qg3.g1.f362820d;
                        sessionId = urgen.ur_54A4.UR_6075.UR_BC6E();
                    }
                    int i18 = qg3.t1.f362867d;
                    com.tencent.unit_rc.BaseObjectDef UR_1332 = urgen.ur_54A4.UR_5769.UR_1332();
                    kotlin.jvm.internal.o.e(UR_1332, "null cannot be cast to non-null type com.tencent.mm.plugin.mega_video.ur.ReportService");
                    kotlin.jvm.internal.o.g(sessionId, "sessionId");
                    j17 = videoDurationMs;
                    qg3.f1 f1Var = (qg3.f1) urgen.ur_54A4.UR_5769.UR_0C6B(((qg3.t1) ((qg3.r1) UR_1332)).getCppPointer(), sessionId);
                    bw5.jd0 jd0Var = new bw5.jd0();
                    jd0Var.f28932e = str;
                    boolean[] zArr = jd0Var.A;
                    zArr[2] = true;
                    jd0Var.f28933f = 281;
                    zArr[3] = true;
                    jd0Var.f28934g = u17;
                    zArr[4] = true;
                    jd0Var.f28937m = (int) currentTimeMillis;
                    zArr[7] = true;
                    baseFinderFeed = baseFinderFeed2;
                    obj2 = valueOf2;
                    jd0Var.f28938n = (int) (java.lang.System.currentTimeMillis() - g0Var2.f310121d);
                    zArr[8] = true;
                    jd0Var.f28936i = valueOf4.intValue();
                    zArr[6] = true;
                    jd0Var.f28939o = finderVideoLayout.getMaxPlayPercent();
                    zArr[9] = true;
                    jd0Var.f28935h = sessionBuffer;
                    zArr[5] = true;
                    jd0Var.f28941q = 1;
                    zArr[11] = true;
                    if (f1Var != null) {
                        byte[] byteArray = jd0Var.toByteArray();
                        long cppPointer = ((qg3.g1) f1Var).getCppPointer();
                        kotlin.jvm.internal.o.d(byteArray);
                        urgen.ur_54A4.UR_6075.UR_70DC(cppPointer, byteArray);
                    }
                } else {
                    baseFinderFeed = baseFinderFeed2;
                    obj2 = valueOf2;
                    j17 = videoDurationMs;
                }
                j19 = currentTimeMillis;
                obj = obj2;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("exit_autoplay", null, kz5.c1.k(new jz5.l("view_id", "long_video_card"), new jz5.l("finder_context_id", str), new jz5.l("comment_scene", 281), new jz5.l("feed_id", u17), new jz5.l("session_buffer", sessionBuffer), new jz5.l("autoplay_duration", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("curr_progress", valueOf4), new jz5.l("start_progress", obj2), new jz5.l("autoplay_start_ts", java.lang.Long.valueOf(g0Var2.f310121d)), new jz5.l("autoplay_end_ts", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), 1, false);
            } else {
                baseFinderFeed = baseFinderFeed2;
                obj = valueOf2;
                j17 = videoDurationMs;
                j18 = currentPosMs;
                j19 = currentTimeMillis;
                c0Var = c0Var2;
                g0Var = g0Var3;
            }
            g0Var2.f310121d = 0L;
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", "onVideoPause " + pm0.v.u(baseFinderFeed.getItemId()) + " totalMs=" + j17 + ",curPosMs=" + j18 + "(%" + valueOf4 + "),startProgress=" + g0Var.f310121d + "(%" + obj + "),duration=" + j19 + ",durationExceed1S=" + c0Var.f310112d + '!');
        }
    }

    @Override // cw2.ea
    public void onVideoPlay() {
        vn2.u0 u0Var = vn2.u0.f438387a;
        boolean h17 = u0Var.h();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f463968d;
        finderVideoLayout.setMute(h17);
        cw2.da videoView = finderVideoLayout.getVideoView();
        if (videoView != null) {
            videoView.setMute(u0Var.h());
        }
        yn2.m mVar = this.f463969e;
        int o17 = mVar.o();
        jz5.g gVar = mVar.f463998i;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f463970f;
        if (baseFinderFeed instanceof zn2.a) {
            zn2.a aVar = (zn2.a) baseFinderFeed;
            int i17 = qg3.g1.f362820d;
            java.lang.String UR_BC6E = urgen.ur_54A4.UR_6075.UR_BC6E();
            aVar.getClass();
            kotlin.jvm.internal.o.g(UR_BC6E, "<set-?>");
            aVar.f474488i = UR_BC6E;
        }
        cw2.t4 scalingInfoWrapper = finderVideoLayout.getScalingInfoWrapper();
        r45.gn2 gn2Var = scalingInfoWrapper != null ? scalingInfoWrapper.f224020a : null;
        boolean z17 = true;
        r45.mb4 mb4Var = this.f463971g;
        if (mb4Var != null && gn2Var != null) {
            float f17 = mb4Var.getFloat(4);
            float f18 = mb4Var.getFloat(5);
            if (gn2Var.getBoolean(1) && gn2Var.getFloat(4) > gn2Var.getFloat(3)) {
                float f19 = f18 * (gn2Var.getFloat(4) - gn2Var.getFloat(3));
                float f27 = f19 / f17;
                if (f27 >= 0.5625f) {
                    o17 = (int) (intValue * (f17 / f19));
                } else {
                    intValue = (int) (o17 * f27);
                }
            }
        }
        java.lang.Object videoView2 = finderVideoLayout.getVideoView();
        android.view.View view = videoView2 instanceof android.view.View ? (android.view.View) videoView2 : null;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (layoutParams2.width == o17 && layoutParams2.height == intValue) {
                z17 = false;
            }
            layoutParams2.width = o17;
            layoutParams2.height = intValue;
            layoutParams2.gravity = 17;
            if (z17) {
                view.requestLayout();
            }
        }
        android.view.View p17 = this.f463972h.p(com.tencent.mm.R.id.hqu);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$5", "onVideoPlay", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$5", "onVideoPlay", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.g0 g0Var = this.f463973i;
        g0Var.f310121d = currentTimeMillis;
        long currentPosMs = finderVideoLayout.getCurrentPosMs();
        kotlin.jvm.internal.g0 g0Var2 = this.f463974m;
        g0Var2.f310121d = currentPosMs;
        this.f463975n.f310112d = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoPlay ");
        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
        sb6.append(" startPlay=");
        sb6.append(g0Var.f310121d);
        sb6.append(",startProgress=");
        sb6.append(g0Var2.f310121d);
        sb6.append(",displayW=");
        sb6.append(mVar.o());
        sb6.append(" displayH=");
        sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        sb6.append(", videoW=");
        sb6.append(mb4Var != null ? java.lang.Float.valueOf(mb4Var.getFloat(4)) : null);
        sb6.append(" H=");
        sb6.append(mb4Var != null ? java.lang.Float.valueOf(mb4Var.getFloat(5)) : null);
        sb6.append(",containerW=");
        android.view.ViewGroup.LayoutParams layoutParams3 = finderVideoLayout.getLayoutParams();
        sb6.append(layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.width) : null);
        sb6.append(" H=");
        android.view.ViewGroup.LayoutParams layoutParams4 = finderVideoLayout.getLayoutParams();
        sb6.append(layoutParams4 != null ? java.lang.Integer.valueOf(layoutParams4.height) : null);
        sb6.append("! \n scalingInfo=");
        java.lang.Object obj = mb4Var != null ? (r45.gn2) mb4Var.getCustom(45) : null;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", sb6.toString());
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        java.lang.String sb6;
        if (j18 > 0) {
            if (j17 - this.f463974m.f310121d >= 1000) {
                this.f463975n.f310112d = true;
            }
            in5.s0 s0Var = this.f463972h;
            android.widget.SeekBar seekBar = (android.widget.SeekBar) s0Var.p(com.tencent.mm.R.id.f487542oy0);
            if (seekBar != null) {
                seekBar.setVisibility(0);
            }
            android.widget.SeekBar seekBar2 = (android.widget.SeekBar) s0Var.p(com.tencent.mm.R.id.f487542oy0);
            if (seekBar2 != null) {
                seekBar2.setProgress(a06.d.b((((float) j17) * 1000.0f) / ((float) j18)));
            }
            long j19 = (int) ((j18 - j17) / 1000);
            long j27 = j19 / 60;
            long j28 = j19 % 60;
            if (j28 < 10) {
                sb6 = j27 + ":0" + j28;
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(j27);
                sb7.append(':');
                sb7.append(j28);
                sb6 = sb7.toString();
            }
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484139d55)).setText(sb6);
        }
    }
}
