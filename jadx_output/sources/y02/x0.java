package y02;

/* loaded from: classes15.dex */
public class x0 extends com.tencent.unit_rc.BaseProxyObject implements y02.v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final y02.w0 f458634d = new y02.w0(null);

    @Override // y02.v0
    public void G(bw5.d5 key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        urgen.ur_E2DE.UR_1344.UR_CE19(getCppPointer(), key.f26326d, i17);
    }

    @Override // y02.v0
    public void bb(bw5.d5 key, int i17, java.lang.String extra, bw5.e5 sampleRate) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(extra, "extra");
        kotlin.jvm.internal.o.g(sampleRate, "sampleRate");
        urgen.ur_E2DE.UR_1344.UR_4828(getCppPointer(), key.f26326d, i17, extra, sampleRate.f26731d);
    }

    @Override // y02.v0
    public void p1(bw5.d5 key, int i17, java.lang.String extra) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(extra, "extra");
        urgen.ur_E2DE.UR_1344.UR_A921(getCppPointer(), key.f26326d, i17, extra);
    }
}
