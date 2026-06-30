package yu0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f465796d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f465797e;

    /* renamed from: f, reason: collision with root package name */
    public int f465798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yu0.m f465799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yu0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465799g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yu0.i(this.f465799g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yu0.m mVar;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465798f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MJAudioTaskManager", " cancel job ");
            yu0.m mVar2 = this.f465799g;
            kotlinx.coroutines.p2.a(mVar2.f465817h, null, 1, null);
            com.tencent.mars.xlog.Log.i("MJAudioTaskManager", " clear res ");
            kotlinx.coroutines.sync.d dVar = mVar2.f465812c;
            this.f465796d = dVar;
            this.f465797e = mVar2;
            this.f465798f = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (yu0.m) this.f465797e;
            java.lang.Object obj3 = (kotlinx.coroutines.sync.d) this.f465796d;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj3;
        }
        try {
            mVar.f465811b.set(0);
            mVar.f465813d.clear();
            mVar.f465814e.clear();
            mVar.f465815f.clear();
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            com.tencent.mars.xlog.Log.i("MJAudioTaskManager", " cancel scope ");
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            throw th6;
        }
    }
}
