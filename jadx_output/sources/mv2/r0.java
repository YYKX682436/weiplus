package mv2;

/* loaded from: classes8.dex */
public final class r0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331624f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f331625g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f331626h;

    /* renamed from: i, reason: collision with root package name */
    public final mv2.q0 f331627i;

    public r0(java.lang.String coverPath) {
        kotlin.jvm.internal.o.g(coverPath, "coverPath");
        this.f331624f = coverPath;
        this.f331625g = "Finder.FinderUploadMediaCoverTask";
        this.f331626h = "";
        this.f331627i = new mv2.q0(this);
    }

    @Override // fp0.d
    public void a() {
        this.f331626h = "";
        java.lang.String str = this.f331624f;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            b(fp0.u.f265291g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FinderUploadCoverImageTask";
        mVar.f241787f = this.f331627i;
        mVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.a(str);
        mVar.field_fullpath = str;
        mVar.field_thumbpath = str;
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        mVar.field_fileType = 20304;
        mVar.field_appType = 251;
        mVar.field_priority = 2;
        mVar.field_bzScene = 2;
        mVar.N = ((ey2.j) ((xy2.e) pf5.u.f353936a.e(zy2.b6.class).c(xy2.e.class))).P6(xy2.d.f458158e);
        mVar.A = 120;
        mVar.B = 300;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f331624f;
    }
}
