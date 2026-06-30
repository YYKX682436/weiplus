package ms2;

/* loaded from: classes2.dex */
public abstract class a {
    public static final bw5.o50 a(r45.dg4 dg4Var) {
        kotlin.jvm.internal.o.g(dg4Var, "<this>");
        bw5.o50 o50Var = new bw5.o50();
        byte[] initialProtobufBytes = dg4Var.initialProtobufBytes();
        if (initialProtobufBytes == null) {
            initialProtobufBytes = dg4Var.toByteArray();
        }
        bw5.o50 parseFrom = o50Var.parseFrom(initialProtobufBytes);
        kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
        return parseFrom;
    }
}
