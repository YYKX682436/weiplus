package dk2;

/* loaded from: classes.dex */
public final class ib extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.ib f233621d = new dk2.ib();

    public ib() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ij6 it = (r45.ij6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(it.getInteger(0));
        sb6.append(':');
        com.tencent.mm.protobuf.g byteString = it.getByteString(4);
        sb6.append(byteString != null ? byteString.hashCode() : 0);
        sb6.append(", ");
        return sb6.toString();
    }
}
