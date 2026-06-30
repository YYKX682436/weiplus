package mv2;

/* loaded from: classes8.dex */
public final class n0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331607f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f331608g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f331609h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f331610i;

    /* renamed from: m, reason: collision with root package name */
    public dn.h f331611m;

    /* renamed from: n, reason: collision with root package name */
    public final mv2.m0 f331612n;

    public n0(java.lang.String path, java.lang.String userName) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f331607f = path;
        this.f331608g = "Finder.FinderUploadCryptoLiveCoverImageTask";
        this.f331609h = "";
        this.f331610i = "";
        this.f331612n = new mv2.m0(this);
    }

    @Override // fp0.d
    public void a() {
        java.lang.String str = this.f331607f;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            b(fp0.u.f265291g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f241787f = this.f331612n;
        mVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.a(str);
        mVar.field_fullpath = str;
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mVar.field_thumbpath = w40.e.Qe((w40.e) c17, str, null, 2, null);
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        mVar.field_fileType = 20304;
        mVar.field_appType = 292;
        mVar.field_bzScene = 2;
        mVar.A = 60;
        mVar.B = 300;
        mVar.field_priority = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f331607f;
    }
}
