package lc;

/* loaded from: classes14.dex */
public final class a implements nc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.g f317791a;

    public a(lc.g gVar) {
        this.f317791a = gVar;
    }

    public final void a() {
        nc.c cVar = nc.b.f336091a;
        if (cVar.f336092a != null) {
            cVar.f336092a = null;
        }
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        dVar.getClass();
        lc.g gVar = this.f317791a;
        gVar.f317818s = true;
        mc.p.f325531a.b("AuthingFragment", "start prepare auth");
        mc.c cVar2 = mc.d.f325515a;
        lc.f fVar = new lc.f(gVar);
        cVar2.getClass();
        android.content.Context a17 = dVar.a();
        if (a17 != null) {
            android.content.res.Resources resources = a17.getResources();
            cVar2.f325507k = resources.getColor(com.tencent.mm.R.color.and);
            cVar2.f325508l = resources.getColor(com.tencent.mm.R.color.ana);
            cVar2.f325509m = resources.getColor(com.tencent.mm.R.color.an_);
            cVar2.f325510n = resources.getColor(com.tencent.mm.R.color.an9);
            com.tencent.cloud.huiyan.entity.AuthUiConfig e17 = dVar.e();
            if (e17 != null) {
                if (e17.getFeedBackErrorColor() != 0) {
                    cVar2.f325507k = e17.getFeedBackErrorColor();
                }
                if (e17.getFeedBackTxtColor() != 0) {
                    cVar2.f325508l = e17.getFeedBackTxtColor();
                }
                if (e17.getAuthCircleErrorColor() != 0) {
                    cVar2.f325509m = e17.getAuthCircleErrorColor();
                }
                if (e17.getAuthCircleCorrectColor() != 0) {
                    cVar2.f325510n = e17.getAuthCircleCorrectColor();
                }
            }
        }
        cVar2.f325497a = fVar;
        cVar2.a(com.tencent.cloud.huiyan.enums.AuthState.PREPARE, null);
        cVar2.a(com.tencent.cloud.huiyan.enums.AuthState.AUTH_ACTION, null);
    }
}
