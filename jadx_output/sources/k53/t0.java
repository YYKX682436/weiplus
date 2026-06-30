package k53;

/* loaded from: classes8.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f304388a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f304389b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f304390c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f304391d;

    public t0(k53.u0 u0Var, p33.l lVar) {
        iz5.a.g("need net video", lVar.f351602d);
        this.f304388a = lVar.f351615t;
        this.f304389b = lVar.f351608m;
        this.f304390c = lVar.f351606h;
        this.f304391d = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/appcenter/index.html?v_d=eY1maoA1&no_cache=1";
    }

    public t0(k53.u0 u0Var, p33.l lVar, java.lang.String str, java.lang.String str2) {
        iz5.a.g("need local video", !lVar.f351602d);
        this.f304388a = lVar.f351615t;
        this.f304389b = lVar.f351608m;
        this.f304390c = str2;
        this.f304391d = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/appcenter/index.html?v_d=eY1maoA1&no_cache=1";
    }
}
