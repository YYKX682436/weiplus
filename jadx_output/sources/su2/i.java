package su2;

/* loaded from: classes5.dex */
public final class i extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412750d = "FinderUdrResourceFeatureService";

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        su2.p pVar = su2.p.f412767a;
        java.util.Iterator it = ((java.util.LinkedHashMap) su2.p.f412768b).values().iterator();
        while (it.hasNext()) {
            ((su2.f) it.next()).getClass();
        }
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_6c359432";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        su2.p pVar = su2.p.f412767a;
        su2.f fVar = (su2.f) ((java.util.LinkedHashMap) su2.p.f412768b).get(resource.getName());
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(this.f412750d, "postProcess " + fVar + " resourcePostPath: " + resource.c());
        }
    }
}
