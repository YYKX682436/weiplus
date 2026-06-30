package x02;

/* loaded from: classes16.dex */
public class c extends com.tencent.unit_rc.BaseProxyObject implements x02.b {
    @Override // x02.b
    public void O3(bw5.je0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        byte[] byteArray = result.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_7522.UR_5A77.UR_AE1E(cppPointer, byteArray);
    }

    @Override // x02.b
    public void Void_Empty() {
        urgen.ur_7522.UR_5A77.UR_3AE4(getCppPointer());
    }

    @Override // x02.b
    public void b2(bw5.i9 i9Var) {
        urgen.ur_7522.UR_5A77.UR_A6D1(getCppPointer(), i9Var != null ? i9Var.toByteArray() : null);
    }

    @Override // x02.b
    public void u0(bw5.x7 x7Var) {
        urgen.ur_7522.UR_5A77.UR_88B6(getCppPointer(), x7Var != null ? x7Var.toByteArray() : null);
    }
}
