package vt3;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f440000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f440001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f440001e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new vt3.j(this.f440001e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((vt3.j) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440000d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vt3.l lVar = vt3.l.f440005a;
            this.f440000d = 1;
            obj = vt3.l.a(lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        u26.w wVar = this.f440001e;
        if (booleanValue) {
            com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics = vt3.l.f440006b;
            java.nio.ByteBuffer f17 = mJAssetInfoStatistics != null ? mJAssetInfoStatistics.f() : null;
            this.f440000d = 3;
            if (wVar.t(f17, this) == aVar) {
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("AssetInfoStatistics", "toBinaryBuffer but init is error");
            this.f440000d = 2;
            if (wVar.t(null, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
