package ms2;

/* loaded from: classes2.dex */
public abstract class d {
    public static final bw5.lp0 a(r45.ig4 ig4Var) {
        kotlin.jvm.internal.o.g(ig4Var, "<this>");
        bw5.lp0 lp0Var = new bw5.lp0();
        bw5.v70 v70Var = new bw5.v70();
        byte[] initialProtobufBytes = ig4Var.initialProtobufBytes();
        if (initialProtobufBytes == null) {
            initialProtobufBytes = ig4Var.toByteArray();
        }
        lp0Var.j(v70Var.parseFrom(initialProtobufBytes));
        java.lang.String str = ig4Var.f377017d;
        if (str == null) {
            str = "";
        }
        lp0Var.g(str);
        bw5.fq0 fq0Var = new bw5.fq0();
        fq0Var.c(1.0f);
        fq0Var.d(0);
        lp0Var.i(fq0Var);
        return lp0Var;
    }
}
