package yz3;

/* loaded from: classes12.dex */
public final class u implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ry3.r f468546a;

    public u(ry3.r rVar) {
        this.f468546a = rVar;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanServiceImpl", "uploadImageForOcr onCallback success: %b, imagePath: %s, reqKey: %s, jumpType: %d", java.lang.Boolean.valueOf(result.f401544b), result.f401548f, result.f401549g, java.lang.Integer.valueOf(result.f401550h));
        ry3.r rVar = this.f468546a;
        if (rVar != null) {
            rVar.a(j17, result);
        }
    }
}
