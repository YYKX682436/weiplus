package hu3;

/* loaded from: classes5.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.m implements yz5.p {
    public f0(java.lang.Object obj) {
        super(2, obj, hu3.n0.class, "onReceiveAudioFrame", "onReceiveAudioFrame([BI)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte[] p07 = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(p07, "p0");
        hu3.n0 n0Var = (hu3.n0) this.receiver;
        hu3.s0 s0Var = n0Var.f285176w;
        if (s0Var != null) {
            hu3.b bVar = n0Var.f285177x;
            bVar.a(intValue);
            java.util.ArrayList arrayList = bVar.f285088a;
            int i17 = bVar.f285089b;
            bVar.f285089b = i17 + 1;
            java.lang.Object obj3 = arrayList.get(i17 % arrayList.size());
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj3;
            byteBuffer.clear();
            byteBuffer.put(p07, 0, intValue);
            byteBuffer.position(0);
            hu3.a aVar = s0Var.f285194a;
            int i18 = aVar.f285083b;
            int i19 = (intValue / i18) / 2;
            int i27 = aVar.f285084c;
            int i28 = aVar.f285082a;
            int i29 = ((i27 * i28) * i18) / 1000;
            long j17 = 1411200000 / i28;
            com.tencent.maas.model.time.MJTime mJTime = n0Var.f285178y;
            n0Var.f285178y = mJTime == null ? com.tencent.maas.model.time.MJTime.fromNanoseconds(android.os.SystemClock.elapsedRealtimeNanos()) : mJTime.add(new com.tencent.maas.model.time.MJTime(i19 * j17));
            com.tencent.maas.camerafun.MJAudioFrame mJAudioFrame = new com.tencent.maas.camerafun.MJAudioFrame(jg.b.I16, aVar.f285082a, aVar.f285083b == 1 ? jg.a.Mono : jg.a.Stereo, i19, new com.tencent.maas.model.time.MJTimeRange(n0Var.f285178y, com.tencent.maas.model.time.MJTime.fromNanoseconds(aVar.f285084c * 1000000)), byteBuffer);
            pp0.p0 p0Var = n0Var.f285162f;
            if (p0Var != null) {
                p0Var.B0(mJAudioFrame);
            }
        }
        return jz5.f0.f302826a;
    }
}
