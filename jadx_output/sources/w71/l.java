package w71;

/* loaded from: classes9.dex */
public abstract class l {
    public static final com.tencent.mm.protobuf.f a(byte[] bArr, com.tencent.mm.protobuf.f fVar) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        if (fVar != null) {
            try {
                fVar.parseFrom(bArr);
            } catch (e36.b e17) {
                com.tencent.unit_rc.UnitRCLog.error("toMessage error: " + e17.getMessage() + ", " + jz5.a.b(e17));
                return null;
            }
        }
        return fVar;
    }

    public static final com.tencent.mm.protobuf.f b(byte[] bArr, com.tencent.mm.protobuf.f message) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.protobuf.f a17 = a(bArr, message);
        return a17 == null ? message : a17;
    }
}
