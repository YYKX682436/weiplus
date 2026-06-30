package hr3;

/* loaded from: classes5.dex */
public final class de extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f283487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f283489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283488e = str;
        this.f283489f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.de(this.f283488e, this.f283489f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.de) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.dz3 dz3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283487d;
        hr3.ag agVar = hr3.ag.f283404a;
        java.lang.String str = this.f283488e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.profile.RepairerConfigSayHiPictureUploadUseC2C()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "startUpload localPathExist:" + com.tencent.mm.vfs.w6.j(str) + " isUseC2C:" + z17);
            this.f283487d = 1;
            obj = agVar.f(str, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.v60 v60Var = (r45.v60) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startUpload result imgInfo:");
        sb6.append(v60Var != null ? v60Var.toJSON() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", sb6.toString());
        if (v60Var != null) {
            java.lang.String d17 = agVar.d(v60Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "checkUploadPicture() copy file success oldPath:" + str + " newPath:" + d17 + " ret:" + com.tencent.mm.vfs.w6.d(str, d17, false));
            dz3Var = new r45.dz3();
            java.util.LinkedList linkedList = dz3Var.f372869e;
            linkedList.add(v60Var);
            dz3Var.f372868d = linkedList.size();
        } else {
            dz3Var = null;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        hr3.ce ceVar = new hr3.ce(this.f283489f, dz3Var, null);
        this.f283487d = 2;
        if (kotlinx.coroutines.l.g(g3Var, ceVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
