package ya2;

/* loaded from: classes10.dex */
public final class p0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.sa f460519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f460520b;

    public p0(zy2.sa saVar, com.tencent.mm.plugin.lite.s sVar) {
        this.f460519a = saVar;
        this.f460520b = sVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        return this.f460519a.a(this.f460520b.f144166c, j17, str, obj, i17);
    }
}
