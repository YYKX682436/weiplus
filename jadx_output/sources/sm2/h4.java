package sm2;

/* loaded from: classes2.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f409487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(sm2.o4 o4Var, yz5.a aVar) {
        super(1);
        this.f409486d = o4Var;
        this.f409487e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        re2.h failure = (re2.h) obj;
        kotlin.jvm.internal.o.g(failure, "failure");
        com.tencent.mars.xlog.Log.e(this.f409486d.f409610f, "runCoLiveAvatarMerger: FAILED (non-blocking), stage=" + failure.f394417a + ", errCode=" + failure.f394418b + ", errMsg=" + failure.f394419c);
        this.f409487e.invoke();
        return jz5.f0.f302826a;
    }
}
