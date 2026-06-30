package vl2;

/* loaded from: classes3.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vl2.h f437865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vl2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437865e = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vl2.q(this.f437865e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vl2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f437864d;
        boolean z17 = true;
        vl2.h hVar = this.f437865e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (hVar == vl2.h.f437819e) {
                vl2.s sVar = vl2.s.f437868a;
                com.tencent.mars.xlog.Log.i("LiveUdrResourceLoader", hVar.f437840d + " loadPagFile failed, resourceName is Unknown");
                return null;
            }
            vl2.s sVar2 = vl2.s.f437868a;
            this.f437864d = 1;
            obj = sVar2.a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            vl2.s sVar3 = vl2.s.f437868a;
            com.tencent.mars.xlog.Log.i("LiveUdrResourceLoader", hVar.f437840d + " loadPagFile failed, path.isNullOrEmpty");
            return null;
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            vl2.s sVar4 = vl2.s.f437868a;
            com.tencent.mars.xlog.Log.i("LiveUdrResourceLoader", hVar.f437840d + " loadPagFile failed, file not exists, path:" + str);
            return null;
        }
        org.libpag.PAGFile Load = org.libpag.PAGFile.Load(str);
        if (Load == null) {
            vl2.s sVar5 = vl2.s.f437868a;
            com.tencent.mars.xlog.Log.i("LiveUdrResourceLoader", hVar.f437840d + " loadPagFile failed, file not pag, path:" + str);
        }
        return Load;
    }
}
