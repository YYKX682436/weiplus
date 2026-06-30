package mm2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f329259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(mm2.w wVar) {
        super(2);
        this.f329259d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        mm2.h hVar = this.f329259d.f329504p;
        if (hVar != null) {
            hVar.setVideoTotalTime(longValue);
        }
        return jz5.f0.f302826a;
    }
}
