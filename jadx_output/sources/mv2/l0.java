package mv2;

/* loaded from: classes8.dex */
public final class l0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331601f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f331602g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f331603h;

    /* renamed from: i, reason: collision with root package name */
    public final mv2.k0 f331604i;

    public l0(java.lang.String path, java.lang.String userName) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f331601f = path;
        this.f331602g = userName;
        this.f331603h = "Finder.FinderUploadCoverImageTask";
        this.f331604i = new mv2.k0(this);
    }

    public static final void e(mv2.l0 l0Var, java.lang.String str, boolean z17) {
        l0Var.getClass();
        com.tencent.mars.xlog.Log.i(l0Var.f331603h, "updateContact " + str + ", " + z17);
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(l0Var.f331602g);
        if (b17 != null) {
            if (z17) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            }
            gVar.o(b17);
        }
    }

    @Override // fp0.d
    public void a() {
        java.lang.String str = this.f331601f;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            b(fp0.u.f265291g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FinderUploadCoverImageTask";
        mVar.f241787f = this.f331604i;
        mVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.a(str);
        mVar.field_fullpath = str;
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mVar.field_thumbpath = w40.e.Qe((w40.e) c17, str, null, 2, null);
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        mVar.field_fileType = 20201;
        mVar.field_appType = 100;
        mVar.field_bzScene = 1;
        mVar.A = 60;
        mVar.B = 300;
        mVar.field_priority = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f331601f;
    }
}
