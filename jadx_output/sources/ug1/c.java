package ug1;

/* loaded from: classes7.dex */
public final class c extends af.c {
    public final void b(com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession) {
        kotlin.jvm.internal.o.g(qualitySession, "qualitySession");
        java.util.Iterator it = this.f4442a.entrySet().iterator();
        while (it.hasNext()) {
            af.b bVar = (af.b) ((java.util.Map.Entry) it.next()).getValue();
            if (bVar.f4437a != null) {
                try {
                    ((ug1.a) bVar).d(qualitySession);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandParallelTaskCollection", "reportAll:report #" + bVar.b() + " task fail %s", e17.getMessage());
                }
            }
        }
    }
}
