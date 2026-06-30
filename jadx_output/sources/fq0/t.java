package fq0;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f265467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fq0.x xVar) {
        super(0);
        this.f265467d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qq0.u uVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclFrameSet.SCL", "CoverLogic, removeCoverFromScl");
        fq0.x xVar = this.f265467d;
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = xVar.f265488l;
        if (magicSclViewContainer != null && (uVar = magicSclViewContainer.f68685r) != null) {
            uVar.f365920i = true;
            uVar.f365916e.postDelayed(new qq0.r(uVar), 600L);
        }
        hq0.e0 e0Var = xVar.f265479c;
        if (e0Var != null) {
            java.lang.String frameSetId = xVar.f265478b;
            kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
            hq0.f fVar = e0Var.f282988i.f283002q;
            if (fVar != null) {
                dq0.a0 a0Var = (dq0.a0) fVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "removeCover, frameSetId: ".concat(frameSetId));
                com.tencent.mm.flutter.plugin.proto.g0 j17 = com.tencent.mm.flutter.plugin.proto.h0.j();
                j17.f67966d |= 1;
                j17.f67967e = frameSetId;
                j17.onChanged();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                j17.f67966d |= 2;
                j17.f67968f = currentTimeMillis;
                j17.onChanged();
                dq0.x xVar2 = new dq0.x(a0Var, j17.build().toByteArray());
                fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(frameSetId);
                if (Ai != null && Ai.f265489m) {
                    xVar2.run();
                } else {
                    java.util.HashMap hashMap = a0Var.f242294m;
                    java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(frameSetId);
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                    }
                    linkedList.add(xVar2);
                    hashMap.put(frameSetId, linkedList);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
