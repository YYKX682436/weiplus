package ds0;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f242817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ds0.d0 d0Var) {
        super(2);
        this.f242817d = d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte[] audioData = (byte[]) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(audioData, "audioData");
        ds0.d0.e(this.f242817d, audioData, longValue);
        return jz5.f0.f302826a;
    }
}
