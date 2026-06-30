package y02;

/* loaded from: classes9.dex */
public abstract class k {
    public static final byte[][] a(com.tencent.mm.protobuf.f[] fVarArr) {
        byte[] bArr;
        kotlin.jvm.internal.o.g(fVarArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(fVarArr.length);
        for (com.tencent.mm.protobuf.f fVar : fVarArr) {
            if (fVar == null || (bArr = fVar.toByteArray()) == null) {
                bArr = new byte[0];
            }
            arrayList.add(bArr);
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    public static final com.tencent.mm.protobuf.f b(byte[] bArr, com.tencent.mm.protobuf.f fVar) {
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

    public static final com.tencent.mm.protobuf.f c(byte[] bArr, com.tencent.mm.protobuf.f message) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.protobuf.f b17 = b(bArr, message);
        return b17 == null ? message : b17;
    }
}
