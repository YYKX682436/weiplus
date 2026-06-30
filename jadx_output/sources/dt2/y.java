package dt2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.a0 f243213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dt2.a0 a0Var) {
        super(2);
        this.f243213d = a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo seiInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) obj2;
        kotlin.jvm.internal.o.g(seiInfo, "seiInfo");
        dt2.a0 a0Var = this.f243213d;
        byte[] bArr = seiInfo.seiData;
        ((ku5.t0) ku5.t0.f312615d).h(new dt2.x(intValue, bArr, a0Var), "Sei_Message_Handler");
        return jz5.f0.f302826a;
    }
}
