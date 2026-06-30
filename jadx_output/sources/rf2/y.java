package rf2;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f394963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rf2.v0 v0Var, java.lang.String str, kotlinx.coroutines.q qVar) {
        super(1);
        this.f394961d = v0Var;
        this.f394962e = str;
        this.f394963f = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f394961d.f394916c, "follow biz " + this.f394962e + " result = " + booleanValue);
        ((kotlinx.coroutines.r) this.f394963f).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
        return jz5.f0.f302826a;
    }
}
