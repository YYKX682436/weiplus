package tu1;

/* loaded from: classes13.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f422093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tu1.o f422094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, tu1.o oVar) {
        super(1);
        this.f422093d = context;
        this.f422094e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] pcmData = (byte[]) obj;
        kotlin.jvm.internal.o.g(pcmData, "pcmData");
        if (iq.b.E() || iq.b.F(this.f422093d, false) || iq.b.H() || com.tencent.mm.sdk.platformtools.l5.Bi()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastManager", "current is in voip do not allow to send voice ");
        } else {
            byte[] copyOf = java.util.Arrays.copyOf(pcmData, pcmData.length);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
            java.lang.System.arraycopy(pcmData, 0, copyOf, 0, pcmData.length);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByte("data_type", (byte) 2);
            bundle.putByteArray("data_data", copyOf);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f422094e.f422119j;
            if (n3Var != null) {
                android.os.Message message = new android.os.Message();
                message.setData(bundle);
                n3Var.sendMessage(message);
            }
        }
        return jz5.f0.f302826a;
    }
}
