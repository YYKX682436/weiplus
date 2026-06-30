package ik1;

/* loaded from: classes5.dex */
public abstract class d0 {
    public static boolean a(com.tencent.mm.protobuf.f fVar, com.tencent.mm.protobuf.f fVar2) {
        if (fVar == null && fVar2 == null) {
            throw new java.lang.IllegalArgumentException("both null!!!");
        }
        if (fVar == null || fVar2 == null) {
            return false;
        }
        try {
            byte[] byteArray = fVar.toByteArray();
            byte[] byteArray2 = fVar2.toByteArray();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return java.util.Arrays.equals(byteArray, byteArray2);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
