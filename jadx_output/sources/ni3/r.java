package ni3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final ni3.r f337704e;

    /* renamed from: f, reason: collision with root package name */
    public static final ni3.r f337705f;

    /* renamed from: g, reason: collision with root package name */
    public static final ni3.r f337706g;

    /* renamed from: h, reason: collision with root package name */
    public static final ni3.r f337707h;

    /* renamed from: i, reason: collision with root package name */
    public static final ni3.r f337708i;

    /* renamed from: m, reason: collision with root package name */
    public static final ni3.r f337709m;

    /* renamed from: n, reason: collision with root package name */
    public static final ni3.r f337710n;

    /* renamed from: o, reason: collision with root package name */
    public static final ni3.r f337711o;

    /* renamed from: p, reason: collision with root package name */
    public static final ni3.r f337712p;

    /* renamed from: q, reason: collision with root package name */
    public static final ni3.r f337713q;

    /* renamed from: r, reason: collision with root package name */
    public static final ni3.r f337714r;

    /* renamed from: s, reason: collision with root package name */
    public static final ni3.r f337715s;

    /* renamed from: t, reason: collision with root package name */
    public static final ni3.r f337716t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ ni3.r[] f337717u;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f337718d;

    static {
        ni3.r rVar = new ni3.r("DOWNLOADER_IDLE", 0, "未启动");
        f337704e = rVar;
        ni3.r rVar2 = new ni3.r("DOWNLOADER_START", 1, "启动下载");
        f337705f = rVar2;
        ni3.r rVar3 = new ni3.r("DOWNLOADER_RUNNING", 2, "下载中");
        f337706g = rVar3;
        ni3.r rVar4 = new ni3.r("DOWNLOADER_COMPLETE", 3, "下载完成");
        f337707h = rVar4;
        ni3.r rVar5 = new ni3.r("DOWNLOADER_STOP", 4, "停止下载");
        f337708i = rVar5;
        ni3.r rVar6 = new ni3.r("DOWNLOADER_LOCAL_CACHE", 5, "本地缓存");
        f337709m = rVar6;
        ni3.r rVar7 = new ni3.r("PLAYER_IDLE", 6, "未启动");
        f337710n = rVar7;
        ni3.r rVar8 = new ni3.r("PLAYER_PRE_RENDER", 7, "预渲染");
        f337711o = rVar8;
        ni3.r rVar9 = new ni3.r("PLAYER_PRE_RENDER_COMPLETE", 8, "预渲染完成");
        f337712p = rVar9;
        ni3.r rVar10 = new ni3.r("PLAYER_START", 9, "启动播放");
        f337713q = rVar10;
        ni3.r rVar11 = new ni3.r("PLAYER_RUNNING", 10, "播放中");
        f337714r = rVar11;
        ni3.r rVar12 = new ni3.r("PLAYER_PAUSE", 11, "暂停播放");
        f337715s = rVar12;
        ni3.r rVar13 = new ni3.r("PLAYER_STOP", 12, "停止播放");
        f337716t = rVar13;
        ni3.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, new ni3.r("PLAYER_DESTROY", 13, "播放器被销毁")};
        f337717u = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17, java.lang.String str2) {
        this.f337718d = str2;
    }

    public static ni3.r valueOf(java.lang.String str) {
        return (ni3.r) java.lang.Enum.valueOf(ni3.r.class, str);
    }

    public static ni3.r[] values() {
        return (ni3.r[]) f337717u.clone();
    }
}
