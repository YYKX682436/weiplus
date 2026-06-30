package g02;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f267420a;

    /* renamed from: b, reason: collision with root package name */
    public int f267421b;

    /* renamed from: c, reason: collision with root package name */
    public long f267422c;

    /* renamed from: d, reason: collision with root package name */
    public long f267423d;

    /* renamed from: e, reason: collision with root package name */
    public long f267424e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f267425f;

    /* renamed from: g, reason: collision with root package name */
    public int f267426g;

    /* renamed from: h, reason: collision with root package name */
    public int f267427h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f267428i;

    /* renamed from: j, reason: collision with root package name */
    public long f267429j;

    /* renamed from: k, reason: collision with root package name */
    public int f267430k;

    /* renamed from: l, reason: collision with root package name */
    public long f267431l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f267432m;

    /* renamed from: n, reason: collision with root package name */
    public int f267433n;

    /* renamed from: o, reason: collision with root package name */
    public int f267434o;

    /* renamed from: p, reason: collision with root package name */
    public int f267435p;

    /* renamed from: q, reason: collision with root package name */
    public int f267436q;

    /* renamed from: r, reason: collision with root package name */
    public int f267437r;

    /* renamed from: s, reason: collision with root package name */
    public int f267438s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f267439t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f267440u;

    public c() {
        this.f267438s = 1;
        this.f267439t = "";
        this.f267440u = "";
    }

    public void a(dm.t3 t3Var) {
        this.f267420a = t3Var.field_appId;
        this.f267421b = t3Var.field_scene;
        long j17 = t3Var.field_startSize;
        this.f267422c = j17;
        long j18 = t3Var.field_downloadedSize - j17;
        this.f267423d = j18;
        if (j18 < 0) {
            j18 = 0;
        }
        this.f267423d = j18;
        this.f267424e = t3Var.field_totalSize;
        this.f267425f = t3Var.field_downloadUrl;
        this.f267426g = t3Var.field_errCode;
        this.f267427h = t3Var.field_downloaderType;
        this.f267428i = t3Var.field_channelId;
        long j19 = t3Var.field_finishTime;
        if (j19 <= 0) {
            j19 = java.lang.System.currentTimeMillis();
        }
        long j27 = t3Var.field_startTime;
        if (j27 == 0) {
            this.f267429j = 0L;
        } else {
            this.f267429j = (j19 - j27) / 1000;
        }
        if (this.f267429j < 0) {
            this.f267429j = 0L;
        }
        this.f267430k = t3Var.field_startState;
        this.f267431l = t3Var.field_downloadId;
        this.f267432m = t3Var.field_extInfo;
        this.f267433n = t3Var.field_reserveInWifi ? 1 : 0;
        this.f267434o = t3Var.field_startScene;
        this.f267435p = t3Var.field_uiarea;
        this.f267436q = t3Var.field_noticeId;
        this.f267437r = t3Var.field_ssid;
        this.f267438s = t3Var.field_downloadType;
        this.f267439t = t3Var.field_userSessionId;
    }

    public c(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f267438s = 1;
        this.f267439t = "";
        this.f267440u = "";
        this.f267420a = str;
        this.f267421b = i17;
        this.f267431l = j17;
        this.f267428i = str2;
        this.f267432m = str3;
        this.f267433n = i18;
    }

    public c(java.lang.String str, long j17, java.lang.String str2, long j18, int i17) {
        this.f267438s = 1;
        this.f267439t = "";
        this.f267440u = "";
        this.f267420a = str;
        this.f267431l = j17;
        this.f267428i = str2;
        this.f267429j = j18;
        this.f267433n = i17;
    }

    public c(java.lang.String str, int i17, java.lang.String str2, int i18, int i19, int i27, int i28) {
        this.f267439t = "";
        this.f267440u = "";
        this.f267420a = str;
        this.f267421b = i17;
        this.f267434o = i17;
        this.f267432m = str2;
        this.f267433n = this.f267433n;
        this.f267435p = i18;
        this.f267436q = i27;
        this.f267437r = i19;
        this.f267438s = i28;
    }
}
