package yx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class v5 extends kotlin.jvm.internal.m implements yz5.p {
    public v5(java.lang.Object obj) {
        super(2, obj, yx0.b8.class, "onReceiveAudioFrame", "onReceiveAudioFrame([BI)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte[] p07 = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(p07, "p0");
        yx0.b8 b8Var = (yx0.b8) this.receiver;
        int ordinal = b8Var.f467192s.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            switch (ordinal) {
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    hu3.s0 s0Var = b8Var.f467202y1;
                    if (s0Var != null) {
                        b8Var.f467204z1.a(intValue);
                        yx0.c8 c8Var = b8Var.f467204z1;
                        java.util.ArrayList arrayList = c8Var.f467232a;
                        int i17 = c8Var.f467233b;
                        c8Var.f467233b = i17 + 1;
                        java.lang.Object obj3 = arrayList.get(i17 % arrayList.size());
                        kotlin.jvm.internal.o.f(obj3, "get(...)");
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj3;
                        byteBuffer.clear();
                        byteBuffer.put(p07, 0, intValue);
                        byteBuffer.position(0);
                        hu3.a aVar = s0Var.f285194a;
                        int i18 = aVar.f285083b;
                        int i19 = (intValue / i18) / 2;
                        int i27 = aVar.f285082a;
                        int i28 = ((aVar.f285084c * i27) * i18) / 1000;
                        long j17 = 1411200000 / i27;
                        com.tencent.maas.model.time.MJTime mJTime = b8Var.A1;
                        b8Var.A1 = mJTime == null ? com.tencent.maas.model.time.MJTime.fromNanoseconds(android.os.SystemClock.elapsedRealtimeNanos()) : mJTime.add(new com.tencent.maas.model.time.MJTime(i19 * j17));
                        com.tencent.maas.model.time.MJTimeRange mJTimeRange = new com.tencent.maas.model.time.MJTimeRange(b8Var.A1, com.tencent.maas.model.time.MJTime.fromNanoseconds(s0Var.f285194a.f285084c * 1000000));
                        jg.b bVar = jg.b.I16;
                        hu3.a aVar2 = s0Var.f285194a;
                        com.tencent.maas.camerafun.MJAudioFrame mJAudioFrame = new com.tencent.maas.camerafun.MJAudioFrame(bVar, aVar2.f285082a, aVar2.f285083b == 1 ? jg.a.Mono : jg.a.Stereo, i19, mJTimeRange, byteBuffer);
                        pp0.p0 p0Var = b8Var.K;
                        if (p0Var != null) {
                            p0Var.B0(mJAudioFrame);
                            break;
                        }
                    }
                    break;
            }
            return jz5.f0.f302826a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "onReceiveAudioFrame >> isRelease");
        return jz5.f0.f302826a;
    }
}
