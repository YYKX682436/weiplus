package du0;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f243403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f243403d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f243403d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mJError == null)));
        return jz5.f0.f302826a;
    }
}
