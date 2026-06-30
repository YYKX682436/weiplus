package ue2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2.o f426798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ue2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426798e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ue2.c(this.f426798e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ue2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426797d;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ko0.l lVar = ko0.l.f309870a;
                ko0.d dVar = ko0.d.f309836f;
                this.f426797d = 1;
                obj = lVar.a(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.String str = ue2.o.f426827y;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initializeUIComponents: 资源下载完成，success=");
            if (!booleanValue) {
                z17 = false;
            }
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (booleanValue) {
                ko0.l lVar2 = ko0.l.f309870a;
                if (!lVar2.c()) {
                    com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: 资源下载成功但实例无效，重新创建实例");
                    com.tencent.mars.xlog.Log.i("LiveBeautyUtil", "#releaseDataBucketInstance");
                    ko0.l.f309874e = null;
                    lVar2.d();
                    dk2.d.f233301a.e(lVar2.b());
                    this.f426798e.D();
                    com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: 实例更新完成，isValid=" + lVar2.c());
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(ue2.o.f426827y, "initializeUIComponents: 资源下载异常", e17);
        }
        return jz5.f0.f302826a;
    }
}
