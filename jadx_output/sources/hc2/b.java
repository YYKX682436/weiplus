package hc2;

/* loaded from: classes.dex */
public abstract class b {
    public static final com.tencent.mm.protobuf.g a(com.tencent.mm.protobuf.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        byte[] byteArray = fVar.toByteArray();
        if (byteArray != null) {
            return new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
        }
        return null;
    }
}
