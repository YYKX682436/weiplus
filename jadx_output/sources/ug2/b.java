package ug2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug2.c f427515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ug2.c cVar) {
        super(0);
        this.f427515d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.f pi1Var;
        ug2.c cVar = this.f427515d;
        int integer = cVar.f427516a.getInteger(1);
        r45.ch1 ch1Var = cVar.f427516a;
        switch (integer) {
            case 20090:
                pi1Var = new r45.pi1();
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 == null) {
                    return null;
                }
                try {
                    pi1Var.parseFrom(g17);
                    break;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    return null;
                }
            case 20091:
                pi1Var = new r45.wi1();
                com.tencent.mm.protobuf.g byteString2 = ch1Var.getByteString(4);
                byte[] g18 = byteString2 != null ? byteString2.g() : null;
                if (g18 == null) {
                    return null;
                }
                try {
                    pi1Var.parseFrom(g18);
                    break;
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    return null;
                }
            case 20092:
                pi1Var = new r45.oi1();
                com.tencent.mm.protobuf.g byteString3 = ch1Var.getByteString(4);
                byte[] g19 = byteString3 != null ? byteString3.g() : null;
                if (g19 == null) {
                    return null;
                }
                try {
                    pi1Var.parseFrom(g19);
                    break;
                } catch (java.lang.Exception e19) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
                    return null;
                }
            default:
                return null;
        }
        return pi1Var;
    }
}
