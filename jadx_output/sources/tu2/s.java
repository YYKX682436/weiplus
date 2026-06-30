package tu2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final tu2.s f422152a = new tu2.s();

    /* renamed from: b, reason: collision with root package name */
    public static final lb2.k f422153b = new lb2.k("发表相机红点重置", tu2.p.f422149d);

    /* renamed from: c, reason: collision with root package name */
    public static final lb2.k f422154c;

    /* renamed from: d, reason: collision with root package name */
    public static final lb2.k f422155d;

    /* renamed from: e, reason: collision with root package name */
    public static final lb2.k f422156e;

    /* renamed from: f, reason: collision with root package name */
    public static final lb2.k f422157f;

    /* renamed from: g, reason: collision with root package name */
    public static final lb2.k f422158g;

    /* renamed from: h, reason: collision with root package name */
    public static final lb2.k f422159h;

    /* renamed from: i, reason: collision with root package name */
    public static final lb2.k f422160i;

    /* renamed from: j, reason: collision with root package name */
    public static final lb2.k f422161j;

    /* renamed from: k, reason: collision with root package name */
    public static final lb2.k f422162k;

    /* renamed from: l, reason: collision with root package name */
    public static final lb2.k f422163l;

    static {
        new lb2.k("清除全屏tab红点标记", tu2.g.f422140d).f317745p = "T5";
        f422154c = new lb2.k("清理首页文件缓存", tu2.k.f422144d);
        f422155d = new lb2.k("附近直播清理首页文件缓存", tu2.n.f422147d);
        f422156e = new lb2.k("清理发表队列", tu2.l.f422145d);
        f422157f = new lb2.k("查看Finder缓存大小", tu2.e.f422138d);
        f422158g = new lb2.k("插入10W条假session", tu2.m.f422146d);
        f422159h = new lb2.k("显示视频编码配置", tu2.r.f422151d);
        f422160i = new lb2.k("双击与展开教育/收藏红点重置", tu2.h.f422141d);
        new lb2.k("清除直播广场的滑动引导", tu2.o.f422148d).f317745p = "T5";
        new lb2.k("跳通用选择器页面", tu2.j.f422143d).f317745p = "T6";
        f422161j = new lb2.k("OPENSDK DEEPLINK分享测试", tu2.q.f422150d);
        f422162k = new lb2.k("把所有feed改为仅自己可见", tu2.i.f422142d);
        f422163l = new lb2.k("清空通知lastBuffer", tu2.f.f422139d);
    }

    public final lb2.k a() {
        return f422157f;
    }

    public final lb2.k b() {
        return f422163l;
    }

    public final lb2.k c() {
        return f422160i;
    }

    public final lb2.k d() {
        return f422162k;
    }

    public final lb2.k e() {
        return f422154c;
    }

    public final lb2.k f() {
        return f422156e;
    }

    public final lb2.k g() {
        return f422158g;
    }

    public final lb2.k h() {
        return f422155d;
    }

    public final com.tencent.mm.modelcontrol.VideoTransPara i() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        int i17;
        int bj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj();
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        d11.s fj6 = d11.s.fj();
        fj6.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (fj6.f225685t == null) {
            fj6.f225685t = fj6.tj("PublishMegaVideoConfig");
        }
        if (fj6.f225685t != null) {
            int i18 = 0;
            while (true) {
                d11.v[] vVarArr = fj6.f225685t;
                if (i18 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i18];
                if (vVar != null && vVar.c()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get story Record config.");
                    videoTransPara = vVar.a(0);
                    break;
                }
                i18++;
            }
        }
        videoTransPara = null;
        if (videoTransPara == null) {
            videoTransPara = fj6.Vi();
        }
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1 && (i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("finder_config_sp_key", 0).getInt("SWITCH_POST_VIDEO_RATE", -1)) > 0) {
            videoTransPara.f71194g = i17;
        }
        videoTransPara.f71199o = 44100;
        videoTransPara.f71204t = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        fj6.aj(videoTransPara, 4);
        videoTransPara.f71195h = bj6;
        videoTransPara.f71196i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_album_video_max_duration_android, 60);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "get finder record para cost %d. %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), videoTransPara);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_long_video_max_bitrate, 0);
        if (Ni > 0) {
            videoTransPara.f71194g = Ni;
        }
        return videoTransPara;
    }

    public final lb2.k j() {
        return f422153b;
    }

    public final lb2.k k() {
        return f422161j;
    }

    public final lb2.k l() {
        return f422159h;
    }
}
