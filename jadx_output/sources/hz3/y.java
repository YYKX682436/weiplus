package hz3;

/* loaded from: classes12.dex */
public final class y implements hz3.a0 {
    @Override // hz3.a0
    public void a(ry3.p request, hz3.z zVar) {
        r45.jj4 jj4Var;
        kotlin.jvm.internal.o.g(request, "request");
        byte[] byteArray = request.f401542p.getByteArray("key_sns_media_data");
        if (byteArray != null) {
            jj4Var = new r45.jj4();
            try {
                jj4Var.parseFrom(byteArray);
            } catch (java.lang.Exception unused) {
            }
        } else {
            jj4Var = null;
        }
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AiScanSnsImageCDNStrategy", "getCDNImageInfoList-sns parse mediaObj failed");
            if (zVar != null) {
                ((iz3.d) zVar).a(3, 999, "media object parse failed");
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jj4Var != null) {
            r45.si siVar = new r45.si();
            siVar.f385748i = 1;
            siVar.f385743d = 4;
            kotlin.jvm.internal.o.d(jj4Var);
            siVar.f385749m = jj4Var.f377858g;
            kotlin.jvm.internal.o.d(jj4Var);
            siVar.f385750n = jj4Var.G;
            siVar.f385751o = jj4Var.H;
            siVar.f385752p = pm0.v.Z(jj4Var.I);
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanSnsImageCDNStrategy", "getCDNImageInfoList-sns url: %s", siVar.f385749m);
            arrayList.add(siVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanSnsImageCDNStrategy", "getCDNImageInfoList-sns request.pHash: %s, needPHash: %s", request.f401537k, java.lang.Boolean.valueOf(request.f401538l));
        if (request.f401537k == null && request.f401538l && com.tencent.mm.vfs.w6.j(request.f401531e)) {
            com.tencent.mm.plugin.scanner.model.o1 o1Var = com.tencent.mm.plugin.scanner.model.o1.f158972a;
            java.lang.String imagePath = request.f401531e;
            kotlin.jvm.internal.o.f(imagePath, "imagePath");
            request.f401537k = o1Var.a(imagePath);
        }
        if (zVar != null) {
            ((iz3.d) zVar).b(arrayList);
        }
    }

    @Override // hz3.a0
    public java.lang.String name() {
        return "MicroMsg.AiScanSnsImageCDNStrategy";
    }
}
