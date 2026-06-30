package qg3;

/* loaded from: classes2.dex */
public class l extends com.tencent.unit_rc.BaseProxyObject implements qg3.k {
    @Override // qg3.k
    public void P0(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        urgen.ur_54A4.UR_5A77.UR_61C6(getCppPointer(), i17, errMsg);
    }

    @Override // qg3.k
    public void Vh(bw5.c40 result) {
        kotlin.jvm.internal.o.g(result, "result");
        byte[] byteArray = result.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_54A4.UR_5A77.UR_DA03(cppPointer, byteArray);
    }

    @Override // qg3.k
    public void b(boolean z17) {
        urgen.ur_54A4.UR_5A77.UR_CF4D(getCppPointer(), z17);
    }

    @Override // qg3.k
    public void l(byte[] result) {
        kotlin.jvm.internal.o.g(result, "result");
        urgen.ur_54A4.UR_5A77.UR_4FFC(getCppPointer(), result);
    }

    @Override // qg3.k
    public void p6(bw5.zc0[] result) {
        kotlin.jvm.internal.o.g(result, "result");
        urgen.ur_54A4.UR_5A77.UR_1684(getCppPointer(), qg3.f0.a(result));
    }

    @Override // qg3.k
    public void q(int i17) {
        urgen.ur_54A4.UR_5A77.UR_4A42(getCppPointer(), i17);
    }
}
