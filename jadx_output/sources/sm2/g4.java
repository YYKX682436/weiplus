package sm2;

/* loaded from: classes2.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f409470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(sm2.o4 o4Var, yz5.a aVar) {
        super(1);
        this.f409469d = o4Var;
        this.f409470e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i(this.f409469d.f409610f, "runCoLiveAvatarMerger: DONE");
        this.f409470e.invoke();
        return jz5.f0.f302826a;
    }
}
