package m23;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f323083d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fg3 f323084e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gg3 f323085f;

    /* renamed from: g, reason: collision with root package name */
    public n23.m f323086g;

    /* renamed from: i, reason: collision with root package name */
    public final l23.a f323088i;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f323087h = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323089m = null;

    public a(l23.a aVar, n23.m mVar) {
        this.f323086g = null;
        if (aVar == null) {
            return;
        }
        this.f323086g = mVar;
        this.f323088i = aVar;
        qk.h6 h6Var = (qk.h6) aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFuncMsg", "new NetSceneGetFuncMsg, cgi: %s, cmdId: %s, functionMsgId: %s", h6Var.field_cgi, java.lang.Integer.valueOf(h6Var.field_cmdid), h6Var.field_functionmsgid);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fg3();
        lVar.f70665b = new r45.gg3();
        lVar.f70667d = 825;
        lVar.f70666c = h6Var.field_cgi;
        lVar.f70668e = h6Var.field_cmdid;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f323083d = a17;
        r45.fg3 fg3Var = (r45.fg3) a17.f70710a.f70684a;
        this.f323084e = fg3Var;
        java.lang.String str = h6Var.field_functionmsgid;
        fg3Var.f374308d = str;
        java.lang.String str2 = h6Var.field_custombuff;
        if (str2 != null) {
            fg3Var.f374309e = str2;
        }
        r45.tp tpVar = h6Var.field_businessInfo;
        fg3Var.f374311g = tpVar;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Long.valueOf(tpVar.f386636d);
        com.tencent.mm.protobuf.g gVar = this.f323084e.f374311g.f386637e;
        objArr[2] = java.lang.Integer.valueOf(gVar != null ? gVar.f192156a.length : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFuncMsg", "NetSceneGetFuncMsg request FunctionMsgID[%s] BusinessId[%d, %d]", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        l23.a aVar = this.f323088i;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFuncMsg", "doScene, functionMsgId: %s", ((qk.h6) aVar).field_functionmsgid);
            ((qk.h6) aVar).field_status = 1;
        }
        this.f323087h = u0Var;
        return dispatch(sVar, this.f323083d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 825;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.gg3 gg3Var = (r45.gg3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f323085f = gg3Var;
        this.f323089m = gg3Var.f375217g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f323085f.f375214d);
        java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.f323089m));
        java.lang.Long valueOf5 = java.lang.Long.valueOf(this.f323085f.f375215e);
        l23.a aVar = this.f323088i;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s, opCode: %s, responseCustomBuff==null: %s, response.version: %s, functionMsgId: %s", valueOf, valueOf2, str, valueOf3, valueOf4, valueOf5, ((qk.h6) aVar).field_functionmsgid);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f323089m)) {
            r45.fg3 fg3Var = (r45.fg3) this.f323083d.f70710a.f70684a;
            this.f323084e = fg3Var;
            fg3Var.f374309e = this.f323089m;
        }
        if (i18 == 0 || i19 == 0) {
            if (((qk.h6) aVar).field_reportid != 0) {
                jx3.f.INSTANCE.idkeyStat(((qk.h6) aVar).field_reportid, ((qk.h6) aVar).field_successkey, 1L, false);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetFuncMsg", "fetchItem.getReportId() is 0!");
            }
            this.f323087h.onSceneEnd(i18, i19, str, this);
            n23.m mVar = this.f323086g;
            if (mVar != null) {
                ((xr.c) mVar).d(i18, i19, str, this);
            }
        } else if (i18 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFuncMsg", "server error");
            this.f323087h.onSceneEnd(i18, i19, str, this);
            n23.m mVar2 = this.f323086g;
            if (mVar2 != null) {
                ((xr.c) mVar2).d(i18, i19, str, this);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, local error");
            this.f323087h.onSceneEnd(i18, i19, str, this);
            n23.m mVar3 = this.f323086g;
            if (mVar3 != null) {
                ((xr.c) mVar3).d(i18, i19, str, this);
            }
        }
        this.f323086g = null;
    }
}
