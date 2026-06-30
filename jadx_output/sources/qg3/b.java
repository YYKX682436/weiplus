package qg3;

/* loaded from: classes2.dex */
public class b extends com.tencent.unit_rc.BaseProxyObject implements qg3.a {
    @Override // qg3.a
    public void d6(bw5.ev evVar, bw5.c40 c40Var, yz5.l onSuccess, yz5.p onFail) {
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onFail, "onFail");
        byte[] byteArray = evVar != null ? evVar.toByteArray() : null;
        byte[] byteArray2 = c40Var != null ? c40Var.toByteArray() : null;
        qg3.q qVar = new qg3.q();
        qVar.f362848g = onSuccess;
        qg3.q qVar2 = new qg3.q();
        qVar2.f362847f = onFail;
        urgen.ur_54A4.UR_9932.UR_B3AC(getCppPointer(), byteArray, byteArray2, qVar, qVar2);
    }

    @Override // qg3.a
    public java.lang.String jg() {
        return urgen.ur_54A4.UR_9932.UR_0A4A(getCppPointer());
    }
}
