package jo4;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f300902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f300903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f300904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.jvm.internal.h0 h0Var, yz5.l lVar, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f300902d = h0Var;
        this.f300903e = lVar;
        this.f300904f = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession = (com.tencent.tav.core.AssetParallelExportSession) this.f300902d.f310123d;
        if (assetParallelExportSession != null) {
            kotlin.jvm.internal.f0 f0Var = this.f300904f;
            int i17 = f0Var.f310116d;
            int parallelSize = assetParallelExportSession.parallelSize();
            if (i17 < parallelSize) {
                i17 = parallelSize;
            }
            f0Var.f310116d = i17;
        }
        this.f300903e.invoke(java.lang.Float.valueOf(floatValue));
        return jz5.f0.f302826a;
    }
}
