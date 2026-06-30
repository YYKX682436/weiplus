package mm2;

/* loaded from: classes8.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f329290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f329292f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(r45.yx1 yx1Var, java.lang.String str, yz5.p pVar) {
        super(2);
        this.f329290d = yx1Var;
        this.f329291e = str;
        this.f329292f = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i("LiveRequestSongSlice", "downloadKtvBGMResource progress: songId: " + this.f329290d.f391458d + " resource " + this.f329291e + " totalLen " + longValue + ", finishedLen " + longValue2);
        this.f329292f.invoke(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        return jz5.f0.f302826a;
    }
}
