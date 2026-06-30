package mx0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJRecordingFinishInfo f331864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f331865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331864d = mJRecordingFinishInfo;
        this.f331865e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.c1(this.f331864d, this.f331865e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.c1 c1Var = (mx0.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo = this.f331864d;
        if (mJRecordingFinishInfo != null) {
            mx0.e1 e1Var = this.f331865e;
            mx0.c0 c0Var = e1Var.f331939f;
            if (c0Var != null) {
                boolean z17 = e1Var.f331940g;
                yx0.w5 w5Var = (yx0.w5) c0Var;
                yx0.b8 b8Var = w5Var.f467742a;
                yx0.w wVar = yx0.w.f467725d;
                java.lang.String c17 = yx0.b8.c(b8Var, mJRecordingFinishInfo, wVar);
                r45.q23 e07 = w5Var.f467742a.e0(mJRecordingFinishInfo, wVar);
                com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc = w5Var.f467742a.T;
                w5Var.f467743b.invoke(new rx0.k(0, z17, mJRecordingFinishInfo, e07, mJCamMusicDesc != null ? mJCamMusicDesc.getMusicID() : null, w5Var.f467742a.U, mJRecordingFinishInfo.f47822f, c17), java.lang.Boolean.FALSE);
            }
        } else {
            mx0.c0 c0Var2 = this.f331865e.f331939f;
            if (c0Var2 != null) {
                ((yx0.w5) c0Var2).f467743b.invoke(null, java.lang.Boolean.FALSE);
            }
        }
        this.f331865e.f331939f = null;
        return jz5.f0.f302826a;
    }
}
