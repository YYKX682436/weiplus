package r95;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.protobuf.n8 f393452a;

    public final com.google.protobuf.n8 a() {
        com.google.protobuf.n8 n8Var = this.f393452a;
        if (n8Var != null) {
            return n8Var;
        }
        kotlin.jvm.internal.o.o("innerBuilder");
        throw null;
    }

    public byte[] b() {
        com.google.protobuf.n8 n8Var = this.f393452a;
        if (n8Var == null) {
            kotlin.jvm.internal.o.o("innerBuilder");
            throw null;
        }
        byte[] byteArray = n8Var.build().toByteArray();
        kotlin.jvm.internal.o.c(byteArray, "innerBuilder.build().toByteArray()");
        return byteArray;
    }
}
