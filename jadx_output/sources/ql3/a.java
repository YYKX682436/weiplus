package ql3;

/* loaded from: classes11.dex */
public class a extends dm.i8 {

    /* renamed from: o2, reason: collision with root package name */
    public static final l75.e0 f364571o2 = dm.i8.initAutoDBInfo(ql3.a.class);

    /* renamed from: g2, reason: collision with root package name */
    public java.lang.String f364572g2;

    /* renamed from: h2, reason: collision with root package name */
    public java.lang.String f364573h2;

    /* renamed from: i2, reason: collision with root package name */
    public java.lang.String f364574i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f364575j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f364576k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f364577l2 = true;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f364578m2 = false;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f364579n2 = true;

    @Override // dm.i8, l75.f0
    public l75.e0 getDBInfo() {
        return f364571o2;
    }

    public boolean t0() {
        return (this.field_songBgColor == 0 || this.field_songLyricColor == 0) ? false : true;
    }

    public b21.r u0() {
        b21.r rVar = new b21.r();
        rVar.f17346e = this.field_originMusicId;
        rVar.f17345d = this.field_musicType;
        rVar.f17358t = this.field_appId;
        rVar.f17350i = this.field_songAlbum;
        rVar.f17359u = this.field_songAlbumType;
        rVar.f17351m = this.field_songAlbumUrl;
        rVar.f17362x = this.field_songHAlbumUrl;
        rVar.f17355q = this.field_songLyric;
        rVar.f17352n = this.field_songWifiUrl;
        rVar.f17348g = this.field_songName;
        rVar.f17349h = this.field_songSinger;
        rVar.f17353o = this.field_songWapLinkUrl;
        rVar.f17354p = this.field_songWebUrl;
        rVar.f17356r = this.field_songAlbumLocalPath;
        rVar.f17361w = this.field_songMediaId;
        rVar.f17363y = this.field_songSnsAlbumUser;
        rVar.f17364z = this.field_songSnsShareUser;
        rVar.B = this.field_hideBanner;
        rVar.C = this.field_jsWebUrlDomain;
        rVar.D = this.field_startTime;
        rVar.E = this.f364572g2;
        rVar.F = this.field_protocol;
        rVar.G = this.field_barBackToWebView;
        rVar.H = this.field_musicbar_url;
        rVar.Q = this.f364573h2;
        rVar.I = this.field_srcUsername;
        rVar.K = this.field_playbackRate;
        rVar.R = this.f364574i2;
        rVar.T = this.f364575j2;
        rVar.U = this.f364576k2;
        rVar.V = this.f364577l2;
        rVar.M = this.f364578m2;
        rVar.N = this.f364579n2;
        rVar.P = this.field_mid;
        return rVar;
    }
}
