package ya2;

/* loaded from: classes10.dex */
public final class d1 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.sa f460468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460469b;

    public d1(zy2.sa saVar, kotlin.jvm.internal.h0 h0Var) {
        this.f460468a = saVar;
        this.f460469b = h0Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        return this.f460468a.a(((com.tencent.mm.plugin.lite.s) this.f460469b.f310123d).f144166c, j17, str, obj, i17);
    }
}
