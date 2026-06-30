package zx0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f477012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCDNDownloadRequest f477013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.j f477014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f477015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.maas.camstudio.MJCDNDownloadRequest mJCDNDownloadRequest, zx0.j jVar, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f477013e = mJCDNDownloadRequest;
        this.f477014f = jVar;
        this.f477015g = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zx0.h(this.f477013e, this.f477014f, this.f477015g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f477012d;
        com.tencent.maas.camstudio.MJCDNDownloadRequest mJCDNDownloadRequest = this.f477013e;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.f1 a17 = ky0.h.f313479a.a(kz5.b0.c(mJCDNDownloadRequest.f47867c), ly0.p.f322228d, null, kz5.b1.e(new jz5.l(mJCDNDownloadRequest.f47867c, mJCDNDownloadRequest.f47868d)));
            this.f477012d = 1;
            obj = ((kotlinx.coroutines.g1) a17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).length() == 0) {
                    break;
                }
            }
        }
        z17 = false;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yx0.b8 b8Var = this.f477015g;
        if (!z17) {
            b8Var.I().c(mJCDNDownloadRequest.f47865a);
            return f0Var;
        }
        this.f477014f.getClass();
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.m58);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        b8Var.I().a(mJCDNDownloadRequest.f47865a, new com.tencent.maas.instamovie.base.MJError(com.tencent.maas.instamovie.base.MJError.MaasEC.NetworkFailed.getErrorCode(), string));
        return f0Var;
    }
}
