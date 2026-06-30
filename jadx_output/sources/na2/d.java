package na2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.f f335954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(na2.f fVar) {
        super(2);
        this.f335954d = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g((android.content.Context) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioExtractor finished, pendingPostParams=");
        na2.f fVar = this.f335954d;
        sb6.append(fVar.f335959f != null);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", sb6.toString());
        qs2.e eVar = fVar.f335959f;
        if (eVar != null) {
            fVar.f335959f = null;
            fVar.O6(eVar);
        }
        return jz5.f0.f302826a;
    }
}
