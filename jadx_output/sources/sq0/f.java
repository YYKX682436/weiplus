package sq0;

@j95.b
/* loaded from: classes4.dex */
public final class f extends i95.w implements tq0.e {
    public tq0.f wi(java.lang.String instanceName, java.lang.String frameSetId) {
        uq0.e y07;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        java.lang.String c17 = vq0.b.c(instanceName);
        if (!(kotlin.jvm.internal.o.b(c17, "MagicWxGameDynamicCard") || kotlin.jvm.internal.o.b(c17, "MagicEcsKFDynamicCard"))) {
            return new tq0.f(null, 0, 3, null);
        }
        uq0.h hVar = (uq0.h) ((gq0.x) i95.n0.c(gq0.x.class));
        hVar.getClass();
        java.util.HashMap hashMap = hVar.f430201e;
        if (!hashMap.containsKey(c17.concat(frameSetId)) && (y07 = ((uq0.f) ((jz5.n) hVar.f430200d).getValue()).y0(c17, frameSetId)) != null) {
            hashMap.put(c17.concat(frameSetId), y07);
        }
        uq0.e eVar = (uq0.e) hashMap.get(c17.concat(frameSetId));
        int i17 = eVar != null ? eVar.field_frameSetHeight : 0;
        com.tencent.mars.xlog.Log.i("MagicSclPlaceHolderService.SCL", "placeHolder, bizName: " + c17 + ", frameSetId: " + frameSetId + ", cachedHeight: " + i17);
        tq0.f fVar = new tq0.f(null, 0, 3, null);
        fVar.f421211b = i17;
        java.lang.String wi6 = ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).wi(c17, frameSetId);
        if (com.tencent.mm.vfs.w6.j(wi6)) {
            fVar.f421210a = wi6;
        }
        return fVar;
    }
}
