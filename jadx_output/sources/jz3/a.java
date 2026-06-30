package jz3;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = (com.tencent.mm.autogen.events.CancelScanTranslationEvent) iEvent;
        java.util.HashMap hashMap = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).f159125o;
        java.util.HashMap hashMap2 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).f159126p;
        java.util.HashMap hashMap3 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).f159127q;
        com.tencent.mm.plugin.scanner.model.p2 p2Var = (com.tencent.mm.plugin.scanner.model.p2) hashMap.get(java.lang.Integer.valueOf(cancelScanTranslationEvent.f54027g.f7758b));
        if (p2Var != null && (str = p2Var.f158980f) != null && !str.isEmpty()) {
            e04.t2 t2Var = e04.t2.f246106a;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
        }
        am.r1 r1Var = cancelScanTranslationEvent.f54027g;
        if (r1Var.f7757a != 1 || !hashMap.containsKey(java.lang.Integer.valueOf(r1Var.f7758b))) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("CancelTranslationListener", "cancel translate sessionId %d", java.lang.Integer.valueOf(r1Var.f7758b));
        hashMap.remove(java.lang.Integer.valueOf(r1Var.f7758b));
        if (!hashMap2.containsKey(java.lang.Integer.valueOf(r1Var.f7758b)) || !hashMap3.containsKey(java.lang.Integer.valueOf(r1Var.f7758b))) {
            return true;
        }
        ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) hashMap2.get(java.lang.Integer.valueOf(r1Var.f7758b))).f59747f = 2L;
        ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) hashMap2.get(java.lang.Integer.valueOf(r1Var.f7758b))).f59750i = java.lang.System.currentTimeMillis() - ((java.lang.Long) hashMap3.get(java.lang.Integer.valueOf(r1Var.f7758b))).longValue();
        ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) hashMap2.get(java.lang.Integer.valueOf(r1Var.f7758b))).k();
        hashMap2.remove(java.lang.Integer.valueOf(r1Var.f7758b));
        hashMap3.remove(java.lang.Integer.valueOf(r1Var.f7758b));
        com.tencent.mars.xlog.Log.i("CancelTranslationListener", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap3.size()));
        return true;
    }
}
