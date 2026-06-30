package p12;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f351041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p12.w wVar) {
        super(2);
        this.f351041d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoRenderViewController", "onVideoSizeChanged: " + longValue + " * " + longValue2);
        ((kotlinx.coroutines.flow.h3) this.f351041d.f351025d).k(new android.util.Size((int) longValue, (int) longValue2));
        return jz5.f0.f302826a;
    }
}
