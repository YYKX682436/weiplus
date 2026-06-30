package ya2;

/* loaded from: classes10.dex */
public final class n0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.sa f460513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460514b;

    public n0(zy2.sa saVar, kotlin.jvm.internal.h0 h0Var) {
        this.f460513a = saVar;
        this.f460514b = h0Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        return this.f460513a.a(((com.tencent.mm.plugin.lite.s) this.f460514b.f310123d).f144166c, j17, str, obj, i17);
    }
}
