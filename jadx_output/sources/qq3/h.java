package qq3;

/* loaded from: classes12.dex */
public final class h extends qq3.i implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0 {

    /* renamed from: h, reason: collision with root package name */
    public k70.b0 f365955h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f365956i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f365957m;

    /* renamed from: n, reason: collision with root package name */
    public long f365958n;

    /* renamed from: o, reason: collision with root package name */
    public final qq3.g f365959o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sq3.a msgDbItem) {
        super(msgDbItem);
        kotlin.jvm.internal.o.g(msgDbItem, "msgDbItem");
        this.f365956i = jz5.h.b(new qq3.f(msgDbItem));
        this.f365957m = "";
        this.f365959o = new qq3.g(this, msgDbItem);
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "c2c mid image pre download onProgress, msgId:" + this.f365960e.getMsgId() + ", msgSvrId:" + this.f365961f + ", offset:" + j17 + ", totalLen:" + j18);
        this.f365962g = j17;
        f();
    }

    @Override // qq3.a
    public void a(int i17) {
        if (this.f365955h != null) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            java.lang.Object obj = this.f365955h;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.d((com.tencent.mm.modelbase.m1) obj);
            qq3.i.e(this, i17, 0, 2, null);
            gm0.j1.d().q(109, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "c2c pre download mid image task cancel: msgSvrId:" + this.f365961f + ", msgId:" + this.f365960e.getMsgId());
        }
    }

    @Override // qq3.a
    public void c() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        sq3.a aVar = this.f365960e;
        java.lang.String w07 = aVar.w0();
        long j17 = this.f365961f;
        com.tencent.mm.storage.f9 o27 = cj6.o2(w07, j17);
        if (o27.getMsgId() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "msg delete, msgId:" + j17);
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 b27 = m11.b1.Di().b2(o27.Q0(), o27.I0());
        if (b27.f322633a <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "img delete, msgId:" + j17);
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(b27.f322633a, tg3.l1.a(o27), b27.f322640h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "already in downloading, msgId:" + j17);
            qq3.i.e(this, 7, 0, 2, null);
            return;
        }
        if (b27.f322651s == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId:" + o27.getMsgId());
            qq3.i.e(this, 5, 0, 2, null);
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadDownloadCache()) == 1) {
            j15.d dVar = new j15.d();
            java.lang.String j18 = o27.j();
            kotlin.jvm.internal.o.f(j18, "getContent(...)");
            dVar.fromXml(j18);
            j15.a o17 = dVar.o();
            dn.m mVar = new dn.m();
            mVar.field_mediaId = "adownimg_preload_" + aVar.A0();
            mVar.f241785d = "task_NetSceneGetMsgImg_1";
            mVar.field_supportFormats = new int[]{1, 2};
            mVar.field_fullpath = (java.lang.String) ((jz5.n) this.f365956i).getValue();
            mVar.field_fileType = 2;
            mVar.field_totalLen = !com.tencent.mm.sdk.platformtools.t8.K0(o17.J()) ? o17.C() : o17.getLength();
            mVar.field_wxamTotalLen = (int) o17.s();
            mVar.field_aesKey = o17.getAeskey();
            mVar.field_fileId = o17.k();
            mVar.field_priority = 2;
            mVar.field_chattype = com.tencent.mm.storage.z3.R4(o27.Q0()) ? 1 : 0;
            mVar.f241790i = aVar.v0() == 1 ? 1 : 2;
            mVar.field_autostart = true;
            mVar.field_filemd5 = o17.getMd5();
            java.lang.String md52 = o17.getMd5();
            if (md52 == null) {
                md52 = "";
            }
            this.f365957m = md52;
            int i17 = mVar.field_wxamTotalLen;
            this.f365958n = i17 > 0 ? i17 : mVar.field_totalLen;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o17.J())) {
                mVar.field_fileType = 19;
                mVar.field_authKey = o17.y();
                mVar.f241811z = o17.J();
                mVar.field_fileId = "";
            }
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f365959o));
        } else {
            k70.y yVar = (k70.y) i95.n0.c(k70.y.class);
            long j19 = b27.f322633a;
            long msgId = o27.getMsgId();
            java.lang.String Q0 = o27.Q0();
            ((j70.e) yVar).getClass();
            m11.t0 t0Var = new m11.t0(j19, msgId, Q0, 0, this);
            this.f365955h = t0Var;
            if (aVar.v0() == 1) {
                t0Var.C = 1;
            } else {
                t0Var.C = 2;
            }
            gm0.j1.d().a(109, this);
            gm0.j1.d().g(t0Var);
        }
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j27 = this.f365961f;
        java.lang.String w08 = aVar.w0();
        kotlin.jvm.internal.o.f(w08, "getFromUser(...)");
        ((kq3.e) sVar).Di(1L, j27, w08, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 109 && kotlin.jvm.internal.o.b(m1Var, this.f365955h)) {
            gm0.j1.d().q(109, this);
            if (i17 != 0 || i18 != 0) {
                d(2, i18);
                return;
            }
            qq3.i.e(this, 1, 0, 2, null);
            bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
            long j17 = this.f365961f;
            sq3.a aVar = this.f365960e;
            java.lang.String w07 = aVar.w0();
            kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
            ((kq3.e) sVar).Bi(1L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
        }
    }
}
