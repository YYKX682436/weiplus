package fp;

/* loaded from: classes2.dex */
public abstract class i0 {
    public static final byte[] a(com.tencent.mm.protobuf.f fVar) {
        byte[] initialProtobufBytes;
        if (fVar != null && (initialProtobufBytes = fVar.initialProtobufBytes()) != null) {
            return initialProtobufBytes;
        }
        if (fVar != null) {
            return fVar.toByteArray();
        }
        return null;
    }
}
