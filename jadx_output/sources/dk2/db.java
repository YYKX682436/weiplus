package dk2;

/* loaded from: classes.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.db f233326d = new dk2.db();

    public db() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.hj6 hj6Var = (r45.hj6) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hj6Var.getInteger(0));
        sb6.append(':');
        com.tencent.mm.protobuf.g byteString = hj6Var.getByteString(2);
        sb6.append(byteString != null ? byteString.hashCode() : 0);
        sb6.append(", ");
        return sb6.toString();
    }
}
