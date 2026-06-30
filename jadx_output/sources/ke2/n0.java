package ke2;

/* loaded from: classes3.dex */
public final class n0 {
    public n0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.protobuf.f a(com.tencent.mm.modelbase.f fVar, com.tencent.mm.protobuf.f resp) {
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.nd2 nd2Var = (r45.nd2) fVar.f70618d;
        if (nd2Var == null || (byteString = nd2Var.getByteString(1)) == null) {
            return null;
        }
        try {
            resp.parseFrom(byteString.g());
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            resp = null;
        }
        if (resp == null) {
            return null;
        }
        return resp;
    }
}
