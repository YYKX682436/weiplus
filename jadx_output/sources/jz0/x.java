package jz0;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302629e = maasFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jz0.x(this.f302629e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jz0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f302628d;
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = this.f302629e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity context = maasFakeVideoPlayUIC.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((jz0.f0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(jz0.f0.class)).f302576f) {
                pp0.o0 o0Var = (pp0.o0) i95.n0.c(pp0.o0.class);
                java.lang.String str = maasFakeVideoPlayUIC.f69822h;
                this.f302628d = 1;
                if (((yy0.g8) o0Var).wi(str, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        az0.i5.x(az0.i5.f15557a, false, false, 3, null);
        kotlinx.coroutines.z0.e(maasFakeVideoPlayUIC.f69820f, null, 1, null);
        return jz5.f0.f302826a;
    }
}
