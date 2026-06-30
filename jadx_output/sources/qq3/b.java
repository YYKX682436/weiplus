package qq3;

/* loaded from: classes12.dex */
public final class b extends qq3.i implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0 {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.d f365942h;

    /* renamed from: i, reason: collision with root package name */
    public bt3.l0 f365943i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sq3.a msgDbItem) {
        super(msgDbItem);
        kotlin.jvm.internal.o.g(msgDbItem, "msgDbItem");
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        sq3.a aVar = this.f365960e;
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "c2c file pre download onSceneProgressEnd msgSvrId:%s, msgId:%s, totalLen:%s, offset:%s", aVar.A0(), java.lang.Long.valueOf(aVar.getMsgId()), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        this.f365962g = j17;
        f();
    }

    @Override // qq3.a
    public void a(int i17) {
        bt3.l0 l0Var = this.f365943i;
        if (l0Var != null) {
            l0Var.M(null);
            gm0.j1.d().d(this.f365943i);
            qq3.i.e(this, i17, 0, 2, null);
            gm0.j1.d().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "c2c pre download file task cancel: msgSvrId:" + this.f365961f + ", msgId:" + this.f365960e.getMsgId());
        }
    }

    @Override // qq3.a
    public void c() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        sq3.a aVar = this.f365960e;
        java.lang.String w07 = aVar.w0();
        long j17 = this.f365961f;
        com.tencent.mm.storage.f9 o27 = cj6.o2(w07, j17);
        if ((o27 == null) || o27.getMsgId() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "msg delete, msgId:" + aVar.getMsgId() + ", msgSvrId:" + j17);
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        ot0.q v17 = ot0.q.v((com.tencent.mm.storage.z3.R4(o27.Q0()) && o27.A0() == 0) ? c01.w9.u(o27.j()) : o27.j());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "appMsgContent is null");
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        if (!((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "appMsg type not support pre download");
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(o27.getMsgId(), o27.Q0());
        this.f365942h = J0;
        if (J0 == null) {
            com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
            this.f365942h = dVar;
            pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
            java.lang.String n17 = v17.n();
            kotlin.jvm.internal.o.f(n17, "getTitleCompat(...)");
            java.lang.String fileext = v17.f348690o;
            kotlin.jvm.internal.o.f(fileext, "fileext");
            dVar.field_fileFullPath = ((ez.e) j0Var).mj(n17, fileext);
            com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f365942h;
            if (dVar2 != null) {
                dVar2.field_appId = v17.f348646d;
            }
            if (dVar2 != null) {
                dVar2.field_sdkVer = v17.f348650e;
            }
            if (dVar2 != null) {
                dVar2.field_mediaSvrId = v17.f348694p;
            }
            if (dVar2 != null) {
                dVar2.field_totalLen = v17.f348682m;
            }
            if (dVar2 != null) {
                ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
                dVar2.field_status = 101;
            }
            com.tencent.mm.pluginsdk.model.app.d dVar3 = this.f365942h;
            if (dVar3 != null) {
                dVar3.field_isUpload = false;
            }
            if (dVar3 != null) {
                dVar3.field_createTime = c01.id.a();
            }
            com.tencent.mm.pluginsdk.model.app.d dVar4 = this.f365942h;
            if (dVar4 != null) {
                dVar4.field_lastModifyTime = c01.id.e();
            }
            com.tencent.mm.pluginsdk.model.app.d dVar5 = this.f365942h;
            if (dVar5 != null) {
                dVar5.field_msgInfoId = o27.getMsgId();
            }
            com.tencent.mm.pluginsdk.model.app.d dVar6 = this.f365942h;
            if (dVar6 != null) {
                dVar6.field_msgInfoTalker = o27.Q0();
            }
            com.tencent.mm.pluginsdk.model.app.d dVar7 = this.f365942h;
            if (dVar7 != null) {
                dVar7.field_netTimes = 0L;
            }
            if (dVar7 != null) {
                dVar7.field_type = v17.f348714u;
            }
            ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).insert(this.f365942h);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filetype : ");
            com.tencent.mm.pluginsdk.model.app.d dVar8 = this.f365942h;
            sb6.append(dVar8 != null ? java.lang.Long.valueOf(dVar8.field_status) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", sb6.toString());
        }
        com.tencent.mm.pluginsdk.model.app.d dVar9 = this.f365942h;
        if (dVar9 != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(dVar9.field_fileFullPath);
            if (r6Var.m() && r6Var.C() == dVar9.field_totalLen) {
                qq3.i.e(this, 5, 0, 2, null);
                return;
            }
        }
        bt3.l0 l0Var = new bt3.l0(o27.getMsgId(), o27.Q0(), v17.f348694p, this);
        this.f365943i = l0Var;
        if (aVar.v0() == 1) {
            l0Var.f24330y = 1;
        } else {
            l0Var.f24330y = 2;
        }
        gm0.j1.d().a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
        gm0.j1.d().g(l0Var);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        sq3.b bVar = nVar.A;
        java.lang.String A0 = aVar.A0();
        kotlin.jvm.internal.o.f(A0, "getMsgItemId(...)");
        bVar.b7(A0, 2);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("c2c file pre download start, msgId:");
        sb7.append(o27.getMsgId());
        sb7.append(", msgSvrId:");
        sb7.append(j17);
        sb7.append(", downloadNow:");
        sb7.append(aVar.v0() == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", sb7.toString());
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j18 = this.f365961f;
        java.lang.String w08 = aVar.w0();
        kotlin.jvm.internal.o.f(w08, "getFromUser(...)");
        ((kq3.e) sVar).Di(4L, j18, w08, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (kotlin.jvm.internal.o.b(m1Var, this.f365943i)) {
            gm0.j1.d().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
            sq3.a aVar = this.f365960e;
            if (i17 != 0 || i18 != 0) {
                d(2, i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "c2c file pre download failed, msgId:" + aVar.getMsgId() + ", msgSvrId_msgType:" + aVar.A0() + ", errType:" + i17 + ", errCode:" + i18);
                return;
            }
            qq3.i.e(this, 1, 0, 2, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CFileMsgTask", "c2c file pre download end, msgId:" + aVar.getMsgId() + ", msgSvrId_msgType:" + aVar.A0());
            bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
            long j17 = this.f365961f;
            java.lang.String w07 = aVar.w0();
            kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
            ((kq3.e) sVar).Bi(4L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
        }
    }
}
