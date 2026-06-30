package jm4;

/* loaded from: classes16.dex */
public class c extends com.tencent.unit_rc.BaseProxyObject implements jm4.b {
    @Override // jm4.b
    public void P(bw5.a result) {
        kotlin.jvm.internal.o.g(result, "result");
        byte[] byteArray = result.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_1B26.UR_626B(cppPointer, byteArray);
    }

    @Override // jm4.b
    public void Pb() {
        urgen.ur_0025.UR_1B26.UR_C3D4(getCppPointer());
    }
}
