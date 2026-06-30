package hr3;

/* loaded from: classes.dex */
public final class zf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f284244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f284245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(r45.v60 v60Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284245e = v60Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.zf(this.f284245e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.zf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284244d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hr3.ag agVar = hr3.ag.f283404a;
            java.lang.String a17 = en1.a.a();
            this.f284244d = 1;
            obj = agVar.c(a17, this.f284245e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUploader", "trySaveCommonSayHiPicture() called getImgFile finish USERINFO_COMMON_SAY_HI_STRING_SYNC set imgFilePath:" + ((java.lang.String) obj));
        return jz5.f0.f302826a;
    }
}
