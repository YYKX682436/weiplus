package uj3;

/* loaded from: classes14.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f428346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yj3.g f428347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(uj3.v0 v0Var, yj3.g gVar) {
        super(3);
        this.f428346d = v0Var;
        this.f428347e = gVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.sdk.platformtools.n3 sendData = this.f428346d.getSendData();
        if (sendData != null) {
            sendData.post(new uj3.r0(this.f428347e, data, intValue, intValue2));
        }
        return jz5.f0.f302826a;
    }
}
