package uv2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f431394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.internal.e0 e0Var) {
        super(1);
        this.f431394d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f431394d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostSpeedUpManager", "[starAdvancedProcess] progress:" + floatValue);
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
