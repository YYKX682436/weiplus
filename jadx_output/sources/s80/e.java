package s80;

@j95.b
/* loaded from: classes4.dex */
public class e extends i95.w implements t80.h {
    public void Ai(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList, t80.f fVar) {
        try {
            gm0.j1.d().g(new u80.c(str, str2, linkedList, fVar));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.f("MicroMsg.WxPay.LiteAppFeatureService", "construct NetSceneGetPayLiteAppResource fail, exception: %s", e17.toString());
            throw new java.lang.RuntimeException(e17);
        }
    }

    public void wi(java.util.List list, t80.e eVar) {
        try {
            gm0.j1.d().g(new u80.b(list, eVar));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.f("MicroMsg.WxPay.LiteAppFeatureService", "construct NetSceneBatchGetPayLiteAppResource fail, exception: %s", e17.toString());
            throw new java.lang.RuntimeException(e17);
        }
    }
}
