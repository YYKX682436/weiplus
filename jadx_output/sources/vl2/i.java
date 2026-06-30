package vl2;

/* loaded from: classes5.dex */
public final class i extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f437841d = "LiveUdrResourceFeatureService";

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        vl2.s sVar = vl2.s.f437868a;
        java.util.Iterator it = vl2.s.f437869b.iterator();
        while (it.hasNext()) {
            ((vl2.f) it.next()).getClass();
        }
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_b980a9e4";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        vl2.s sVar = vl2.s.f437868a;
        java.util.Iterator it = vl2.s.f437869b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((vl2.f) obj).f437814a, resource.getName())) {
                    break;
                }
            }
        }
        vl2.f fVar = (vl2.f) obj;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(this.f437841d, "postProcess " + fVar + " resourcePostPaht: " + resource.c());
            if (fVar.f437815b) {
                java.lang.String c17 = resource.c();
                if (c17 == null || c17.length() == 0) {
                    return;
                }
                java.lang.String path = resource.getPath();
                kotlin.jvm.internal.o.f(path, "getPath(...)");
                java.lang.String c18 = resource.c();
                if (c18 == null) {
                    c18 = "";
                }
                wl2.e.a(path, c18);
            }
        }
    }
}
