package mv2;

/* loaded from: classes8.dex */
public final class p0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331614f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f331615g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f331616h;

    /* renamed from: i, reason: collision with root package name */
    public final mv2.o0 f331617i;

    public p0(java.lang.String path, java.lang.String userName) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f331614f = path;
        this.f331615g = "Finder.FinderUploadLiveCoverImageTask";
        this.f331616h = "";
        this.f331617i = new mv2.o0(this);
    }

    @Override // fp0.d
    public void a() {
        java.lang.String str = this.f331614f;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            b(fp0.u.f265291g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f241787f = this.f331617i;
        mVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.a(str);
        mVar.field_fullpath = str;
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mVar.field_thumbpath = w40.e.Qe((w40.e) c17, str, null, 2, null);
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        mVar.field_fileType = 20304;
        mVar.field_appType = 251;
        mVar.field_bzScene = 2;
        mVar.A = 60;
        mVar.B = 300;
        mVar.field_priority = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f331614f;
    }
}
