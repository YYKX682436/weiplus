package vd0;

/* loaded from: classes8.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.c1 f435519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd0.m2 f435520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(wd0.c1 c1Var, wd0.m2 m2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435519e = c1Var;
        this.f435520f = m2Var;
        this.f435521g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.u1(this.f435519e, this.f435520f, this.f435521g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f435518d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.jx6 jx6Var = new r45.jx6();
            wd0.m2 m2Var = this.f435520f;
            zt5.s sVar = m2Var.f444754c;
            jx6Var.f378200d = sVar != null ? sVar.f475629j : null;
            jx6Var.f378201e = sVar != null ? sVar.f475630k : null;
            jx6Var.f378202f = this.f435521g;
            jx6Var.f378203g = wo.w0.k();
            zt5.s sVar2 = m2Var.f444754c;
            jx6Var.f378204h = sVar2 != null ? sVar2.f475628i : 0;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 12925;
            lVar.f70666c = "/cgi-bin/micromsg-bin/verifyfingerprintfornonlogin";
            lVar.f70664a = jx6Var;
            lVar.f70665b = new r45.kx6();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            com.tencent.mm.modelbase.o oVar = iVar.f70646f;
            com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
            r45.jx6 jx6Var2 = fVar2 instanceof r45.jx6 ? (r45.jx6) fVar2 : null;
            if (jx6Var2 != null) {
                jx6Var2.BaseRequest = o45.bh.a(oVar.getReqObj());
            }
            com.tencent.mm.modelbase.o oVar2 = iVar.f70646f;
            oVar2.f70714e = 1;
            oVar2.setRsaInfo(o45.pi.d());
            this.f435518d = 1;
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
        com.tencent.mm.modelbase.f fVar3 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] verifyFingerprintLoginCGI errType: " + fVar3.f70615a + ", errCode: " + fVar3.f70616b + ", errMsg: " + fVar3.f70618d);
        wd0.e1 e1Var = new wd0.e1(0, null, null, null, null, null, 0, null, 255, null);
        e1Var.f444703a = fVar3.f70616b;
        java.lang.String str = fVar3.f70617c;
        if (str == null) {
            str = "";
        }
        e1Var.f444704b = str;
        if (fVar3.f70616b != 0 || (fVar = fVar3.f70618d) == null) {
            wd0.d1[] d1VarArr = wd0.d1.f444702d;
            e1Var.f444703a = 8;
        } else {
            java.lang.String RandomPwd = ((r45.kx6) fVar).f379033f;
            kotlin.jvm.internal.o.f(RandomPwd, "RandomPwd");
            e1Var.f444706d = RandomPwd;
        }
        com.tencent.mm.protobuf.f fVar4 = fVar3.f70618d;
        if (fVar4 != null && ((r45.kx6) fVar4).f379032e != 0 && ((r45.kx6) fVar4).f379031d != null) {
            e1Var.f444709g = ((r45.kx6) fVar4).f379032e;
            r45.vt4 network_sect_resp = ((r45.kx6) fVar4).f379031d;
            kotlin.jvm.internal.o.f(network_sect_resp, "network_sect_resp");
            e1Var.f444708f = network_sect_resp;
            wd0.d1[] d1VarArr2 = wd0.d1.f444702d;
            e1Var.f444703a = 12;
        }
        this.f435519e.a(e1Var);
        return jz5.f0.f302826a;
    }
}
