package qy0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager f367591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367591e = mMMusicManager;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy0.h(this.f367591e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367590d;
        com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager = this.f367591e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gz0.h hVar = mMMusicManager.f69748m;
            if (hVar != null) {
                this.f367590d = 1;
                if (hVar.d(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mMMusicManager.f69748m = null;
        return jz5.f0.f302826a;
    }
}
