package w71;

/* loaded from: classes11.dex */
public class a0 extends com.tencent.unit_rc.BaseProxyObject implements w71.z {
    @Override // w71.z
    public void J8(bw5.c0 c0Var) {
        urgen.ur_C563.UR_5A77.UR_5EBF(getCppPointer(), c0Var != null ? c0Var.toByteArray() : null);
    }

    @Override // w71.z
    public void K1(bw5.y0[] result) {
        byte[] bArr;
        kotlin.jvm.internal.o.g(result, "result");
        java.util.ArrayList arrayList = new java.util.ArrayList(result.length);
        for (bw5.y0 y0Var : result) {
            if (y0Var == null || (bArr = y0Var.toByteArray()) == null) {
                bArr = new byte[0];
            }
            arrayList.add(bArr);
        }
        urgen.ur_C563.UR_5A77.UR_9743(getCppPointer(), (byte[][]) arrayList.toArray(new byte[0]));
    }

    @Override // w71.z
    public void Void_Empty() {
        urgen.ur_C563.UR_5A77.UR_3AE4(getCppPointer());
    }

    @Override // w71.z
    public void b(boolean z17) {
        urgen.ur_C563.UR_5A77.UR_CF4D(getCppPointer(), z17);
    }

    @Override // w71.z
    public void k1(bw5.y0 y0Var) {
        urgen.ur_C563.UR_5A77.UR_DF71(getCppPointer(), y0Var != null ? y0Var.toByteArray() : null);
    }

    @Override // w71.z
    public void l(byte[] result) {
        kotlin.jvm.internal.o.g(result, "result");
        urgen.ur_C563.UR_5A77.UR_4FFC(getCppPointer(), result);
    }

    @Override // w71.z
    public void li(bw5.s0 s0Var) {
        urgen.ur_C563.UR_5A77.UR_D761(getCppPointer(), s0Var != null ? s0Var.toByteArray() : null);
    }

    @Override // w71.z
    public void p5(bw5.a0 a0Var) {
        urgen.ur_C563.UR_5A77.UR_4AC5(getCppPointer(), a0Var != null ? a0Var.toByteArray() : null);
    }

    @Override // w71.z
    public void t(java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        urgen.ur_C563.UR_5A77.UR_2006(getCppPointer(), result);
    }

    @Override // w71.z
    public void w3(bw5.d0 d0Var) {
        urgen.ur_C563.UR_5A77.UR_2307(getCppPointer(), d0Var != null ? d0Var.toByteArray() : null);
    }

    @Override // w71.z
    public void z1(bw5.w wVar) {
        urgen.ur_C563.UR_5A77.UR_A970(getCppPointer(), wVar != null ? wVar.toByteArray() : null);
    }

    @Override // w71.z
    public void za(bw5.k20 result) {
        kotlin.jvm.internal.o.g(result, "result");
        byte[] byteArray = result.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_C563.UR_5A77.UR_7710(cppPointer, byteArray);
    }
}
