package qq3;

/* loaded from: classes12.dex */
public final class e extends qq3.i implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0 {

    /* renamed from: h, reason: collision with root package name */
    public k70.b0 f365947h;

    /* renamed from: i, reason: collision with root package name */
    public long f365948i;

    /* renamed from: m, reason: collision with root package name */
    public long f365949m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f365950n;

    /* renamed from: o, reason: collision with root package name */
    public final qq3.d f365951o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sq3.a msgDbItem) {
        super(msgDbItem);
        kotlin.jvm.internal.o.g(msgDbItem, "msgDbItem");
        this.f365950n = jz5.h.b(new qq3.c(msgDbItem));
        this.f365951o = new qq3.d(this, msgDbItem);
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        this.f365962g = j17;
        f();
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "c2c large image pre download onProgress, msgId:" + this.f365960e.getMsgId() + ", msgSvrId:" + this.f365961f + ", offset:" + j17 + ", totalLen:" + j18);
    }

    @Override // qq3.a
    public void a(int i17) {
        if (this.f365947h != null) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            java.lang.Object obj = this.f365947h;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.d((com.tencent.mm.modelbase.m1) obj);
            qq3.i.e(this, i17, 0, 2, null);
            gm0.j1.d().q(109, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "c2c pre download large image task cancel: msgSvrId:" + this.f365961f + ", msgId:" + this.f365960e.getMsgId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qq3.a
    public void c() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        sq3.a aVar = this.f365960e;
        com.tencent.mm.storage.f9 o27 = cj6.o2(aVar.w0(), this.f365961f);
        if ((o27 == null) == true || o27.getMsgId() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "msg delete, msgId:" + aVar.getMsgId());
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 b27 = m11.b1.Di().b2(o27.Q0(), o27.I0());
        if (b27.f322633a <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "img delete, msgId:" + aVar.getMsgId());
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(b27.f322633a, tg3.l1.a(o27), 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "already in downloading, msgId:" + aVar.getMsgId());
            qq3.i.e(this, 7, 0, 2, null);
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(b27.f322649q));
        if (C1.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "already downloaded, msgId:" + aVar.getMsgId());
            qq3.i.e(this, 7, 0, 2, null);
            return;
        }
        this.f365948i = b27.f322633a;
        this.f365949m = C1.f322633a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadDownloadCache()) == 1) {
            j15.d dVar = new j15.d();
            java.lang.String j17 = o27.j();
            kotlin.jvm.internal.o.f(j17, "getContent(...)");
            dVar.fromXml(j17);
            j15.a o17 = dVar.o();
            dn.m mVar = new dn.m();
            mVar.field_mediaId = "adownimg_preload_" + aVar.A0();
            mVar.f241785d = "task_NetSceneGetMsgImg_1";
            mVar.field_supportFormats = new int[]{1, 2};
            mVar.field_fullpath = (java.lang.String) ((jz5.n) this.f365950n).getValue();
            mVar.field_fileType = 1;
            mVar.field_totalLen = com.tencent.mm.sdk.platformtools.t8.K0(o17.J()) ? o17.z() : o17.r();
            mVar.field_aesKey = o17.getAeskey();
            mVar.field_fileId = o17.j();
            mVar.field_priority = 2;
            mVar.field_chattype = com.tencent.mm.storage.z3.R4(o27.Q0()) ? 1 : 0;
            mVar.f241790i = aVar.v0() == 1 ? 1 : 2;
            mVar.field_autostart = true;
            mVar.field_filemd5 = o17.getMd5();
            o17.getMd5();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o17.J())) {
                mVar.field_fileType = 19;
                mVar.field_authKey = o17.y();
                mVar.f241811z = o17.A();
                mVar.field_fileId = "";
            }
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f365951o));
        } else {
            k70.y yVar = (k70.y) i95.n0.c(k70.y.class);
            long j18 = b27.f322633a;
            long msgId = o27.getMsgId();
            java.lang.String Q0 = o27.Q0();
            ((j70.e) yVar).getClass();
            m11.t0 t0Var = new m11.t0(j18, msgId, Q0, 1, this);
            this.f365947h = t0Var;
            if (aVar.v0() == 1) {
                t0Var.C = 1;
            } else {
                t0Var.C = 2;
            }
            gm0.j1.d().a(109, this);
            gm0.j1.d().g(t0Var);
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        sq3.b bVar = nVar.A;
        java.lang.String A0 = aVar.A0();
        kotlin.jvm.internal.o.f(A0, "getMsgItemId(...)");
        bVar.b7(A0, 2);
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j19 = this.f365961f;
        java.lang.String w07 = aVar.w0();
        kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
        ((kq3.e) sVar).Di(2L, j19, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 109 && kotlin.jvm.internal.o.b(m1Var, this.f365947h)) {
            gm0.j1.d().q(109, this);
            if (i17 != 0 || i18 != 0) {
                d(2, i18);
                return;
            }
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            sq3.a Y6 = nVar.A.Y6(this.f365961f + "_1");
            boolean z17 = Y6 != null && Y6.I0() == 1;
            sq3.a aVar = this.f365960e;
            if (z17) {
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.requireAccountInitialized();
                sq3.b bVar = nVar2.A;
                java.lang.String A0 = Y6.A0();
                kotlin.jvm.internal.o.f(A0, "getMsgItemId(...)");
                bVar.b7(A0, 3);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(this.f365948i));
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 C12 = m11.b1.Di().C1(java.lang.Long.valueOf(this.f365949m));
                if (C12.f322633a <= 0 || C1.f322633a <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.C2CImageMsgTask", "img delete, msgId:" + aVar.getMsgId());
                } else {
                    C1.m(C12.f322637e);
                    C1.E(C12.f322639g);
                    C1.v(C12.f322638f);
                    C1.s(C12.f322642j);
                    C1.F(C12.f322636d);
                    C1.z(C1.f322636d);
                    C1.A(C12.f322644l);
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.b1.Di().F4(java.lang.Long.valueOf(C1.f322633a), C1);
                }
            }
            qq3.i.e(this, 1, 0, 2, null);
            bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
            long j17 = this.f365961f;
            java.lang.String w07 = aVar.w0();
            kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
            ((kq3.e) sVar).Bi(2L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
        }
    }
}
