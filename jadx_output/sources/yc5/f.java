package yc5;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final yc5.f f460905a = new yc5.f();

    public final v05.b a(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        try {
            v05.b bVar = new v05.b();
            java.lang.String U1 = msgInfo.U1();
            if (U1 == null) {
                return null;
            }
            bVar.fromXml(U1);
            return bVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHistoryGalleryFileHelper", e17, "parseCommonAppMsg failed", new java.lang.Object[0]);
            return null;
        }
    }
}
