package ds2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f242862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17) {
        super(1);
        this.f242862d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.i3 mediaCache = (so2.i3) obj;
        kotlin.jvm.internal.o.g(mediaCache, "mediaCache");
        return java.lang.Boolean.valueOf(mediaCache.F0() || (this.f242862d && mediaCache.w0() > 0));
    }
}
