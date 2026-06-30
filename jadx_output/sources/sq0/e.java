package sq0;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f411333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411335f;

    public e(int i17, java.lang.String str, java.lang.String str2) {
        this.f411333d = i17;
        this.f411334e = str;
        this.f411335f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f411333d;
        if (i17 <= 1) {
            com.tencent.mars.xlog.Log.e("MagicSclPlaceHolderService.SCL", "updateHeight, ignore too small");
            return;
        }
        gq0.x xVar = (gq0.x) i95.n0.c(gq0.x.class);
        java.lang.String str = this.f411334e;
        java.lang.String c17 = vq0.b.c(str);
        uq0.h hVar = (uq0.h) xVar;
        hVar.getClass();
        java.lang.String frameSetId = this.f411335f;
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        boolean z17 = false;
        if (i17 != 0) {
            jz5.g gVar = hVar.f430200d;
            uq0.e y07 = ((uq0.f) ((jz5.n) gVar).getValue()).y0(c17, frameSetId);
            if ((y07 == null ? 0 : y07.field_frameSetHeight) != i17) {
                uq0.e eVar = new uq0.e();
                eVar.field_bizName = c17;
                eVar.field_frameSetName = vq0.a.b(frameSetId);
                java.lang.String q07 = r26.n0.q0(frameSetId, "-", frameSetId);
                eVar.field_frameSetRootPath = r26.n0.s0(q07, "_", q07);
                eVar.field_frameSetHeight = i17;
                hVar.f430201e.put(c17.concat(frameSetId), eVar);
                uq0.f fVar = (uq0.f) ((jz5.n) gVar).getValue();
                fVar.getClass();
                z17 = fVar.y0(c17, frameSetId) != null ? fVar.update(eVar, "bizName", "frameSetName", "frameSetRootPath") : fVar.insert(eVar);
            }
        }
        if (z17) {
            java.lang.String wi6 = ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).wi(str, frameSetId);
            com.tencent.mars.xlog.Log.w("MagicSclPlaceHolderService.SCL", "updateHeight, height changed, delete local cover " + wi6 + ", ret: " + com.tencent.mm.vfs.w6.h(wi6) + ", dpHeight: " + i17);
        }
    }
}
