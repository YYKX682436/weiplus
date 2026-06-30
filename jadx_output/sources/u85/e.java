package u85;

/* loaded from: classes10.dex */
public final class e extends u85.o implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f425698h;

    /* renamed from: i, reason: collision with root package name */
    public final dn.m f425699i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f425700m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f425701n;

    /* renamed from: o, reason: collision with root package name */
    public int f425702o;

    /* renamed from: p, reason: collision with root package name */
    public w85.a f425703p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f425704q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f425705r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.sticker.loader.StickerLoadInfo info) {
        super(info);
        kotlin.jvm.internal.o.g(info, "info");
        this.f425698h = "MicroMsg.StickerTask";
        this.f425700m = info.f193691f;
        this.f425701n = info.f193692g;
        this.f425702o = info.f193693h;
        this.f425704q = u85.i.f425707a.b(info.f193690e);
        this.f425705r = u85.i.f425710d + info.f193690e;
        dn.m mVar = new dn.m();
        this.f425699i = mVar;
        mVar.f241785d = "task_StickerFileIdTask";
        mVar.f241787f = new u85.d(this);
    }

    @Override // fp0.d
    public void a() {
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = this.f425719f;
        boolean z17 = stickerLoadInfo.f193690e.length() == 0;
        java.lang.String str = this.f425698h;
        if (z17) {
            com.tencent.mars.xlog.Log.w(str, "call: lensId is " + stickerLoadInfo.f193690e);
            e(false);
            return;
        }
        t85.g gVar = t85.j.f416473l;
        java.lang.String str2 = this.f425704q;
        if (gVar.a(str2)) {
            com.tencent.mars.xlog.Log.i(str, "call: file exists " + str2);
            e(true);
            return;
        }
        if (!(this.f425700m.length() == 0)) {
            if (!(this.f425701n.length() == 0)) {
                f();
                return;
            }
        }
        this.f425703p = new w85.a();
        gm0.j1.n().f273288b.a(3903, this);
        gm0.j1.n().f273288b.g(this.f425703p);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f425719f.f193690e;
    }

    @Override // u85.o
    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f425698h, "onResult: " + z17);
        super.e(z17);
    }

    public final void f() {
        if (!(this.f425700m.length() == 0)) {
            if (!(this.f425701n.length() == 0)) {
                dn.m mVar = this.f425699i;
                mVar.field_fileType = 5;
                mVar.field_needStorage = true;
                mVar.field_mediaId = "lensInfo_" + this.f425719f.f193690e;
                mVar.field_fileId = this.f425700m;
                mVar.field_aesKey = this.f425701n;
                mVar.field_totalLen = this.f425702o;
                mVar.field_fullpath = this.f425705r;
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
                return;
            }
        }
        e(false);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.vh3 vh3Var;
        r45.r64 r64Var;
        r45.r64 r64Var2;
        r45.r64 r64Var3;
        if (kotlin.jvm.internal.o.b(m1Var, this.f425703p)) {
            gm0.j1.n().f273288b.q(3903, this);
            w85.a aVar = this.f425703p;
            java.lang.String str2 = null;
            if (aVar != null) {
                com.tencent.mm.protobuf.f fVar = aVar.f444032e.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetLensInfoResponse");
                vh3Var = (r45.vh3) fVar;
            } else {
                vh3Var = null;
            }
            int i19 = 0;
            if (i17 != 0 || i18 != 0 || vh3Var == null) {
                e(false);
                return;
            }
            r45.p64 p64Var = vh3Var.f388233d;
            java.lang.String str3 = (p64Var == null || (r64Var3 = p64Var.f382796h) == null) ? null : r64Var3.f384570d;
            if (str3 == null) {
                str3 = "";
            }
            this.f425700m = str3;
            if (p64Var != null && (r64Var2 = p64Var.f382796h) != null) {
                str2 = r64Var2.f384571e;
            }
            this.f425701n = str2 != null ? str2 : "";
            if (p64Var != null && (r64Var = p64Var.f382796h) != null) {
                i19 = r64Var.f384572f;
            }
            this.f425702o = i19;
            f();
        }
    }
}
