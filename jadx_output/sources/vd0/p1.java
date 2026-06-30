package vd0;

/* loaded from: classes8.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.f2 f435482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(wd0.f2 f2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435482e = f2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.p1(this.f435482e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f435481d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.zf3 zf3Var = new r45.zf3();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 7496;
            lVar.f70666c = "/cgi-bin/micromsg-bin/getfingerprintticketfornonlogin";
            lVar.f70664a = zf3Var;
            lVar.f70665b = new r45.ag3();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            com.tencent.mm.modelbase.o oVar = iVar.f70646f;
            com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
            r45.zf3 zf3Var2 = fVar instanceof r45.zf3 ? (r45.zf3) fVar : null;
            if (zf3Var2 != null) {
                zf3Var2.BaseRequest = o45.bh.a(oVar.getReqObj());
            }
            com.tencent.mm.modelbase.o oVar2 = iVar.f70646f;
            oVar2.f70714e = 1;
            oVar2.setRsaInfo(o45.pi.d());
            this.f435481d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] getTicket errType: " + fVar2.f70615a + ", errCode: " + fVar2.f70616b + ", errMsg: " + fVar2.f70617c + ",ticket: " + ((r45.ag3) fVar2.f70618d).f369992d);
        int i18 = fVar2.f70616b;
        java.lang.String str = fVar2.f70617c;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = ((r45.ag3) fVar2.f70618d).f369992d;
        if (str2 == null) {
            str2 = "";
        }
        vd0.q1 q1Var = (vd0.q1) this.f435482e;
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] initSoter getTicket onResult errCode: " + i18 + ", errMsg: " + str);
        boolean z17 = str2.length() > 0;
        wd0.h2 h2Var = q1Var.f435492a;
        if (z17) {
            wd0.d1[] d1VarArr = wd0.d1.f444702d;
            ((com.tencent.mm.plugin.account.ui.t6) h2Var).a(0, str2);
        } else {
            wd0.d1[] d1VarArr2 = wd0.d1.f444702d;
            ((com.tencent.mm.plugin.account.ui.t6) h2Var).a(4, "");
        }
        return jz5.f0.f302826a;
    }
}
