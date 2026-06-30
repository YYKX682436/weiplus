package lh1;

/* loaded from: classes15.dex */
public class a implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lh1.c f318650a;

    public a(lh1.c cVar) {
        this.f318650a = cVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Record.AppBrandRecorder", "state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        lh1.b bVar = this.f318650a.f318656f;
        if (bVar != null) {
            com.tencent.mm.plugin.appbrand.media.record.r rVar = (com.tencent.mm.plugin.appbrand.media.record.r) bVar;
            rVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "onRecError state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            rVar.f85834a.h(1);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        com.tencent.mm.plugin.appbrand.media.record.a0 a0Var;
        kh1.e eVar;
        lh1.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecorder", "onRecPcmDataReady()");
        lh1.b bVar = this.f318650a.f318656f;
        if (bVar == null || (eVar = (a0Var = ((com.tencent.mm.plugin.appbrand.media.record.r) bVar).f85834a).f85784f) == null || (cVar = a0Var.f85779a) == null) {
            return;
        }
        tl.w wVar = cVar.f318651a;
        a0Var.f85787i += wVar != null ? wVar.f420155h : 20;
        try {
            if (eVar.d(a0Var.f85786h, bArr, i17)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordMgr", "encode pcm fail!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", e17, "onRecPcmDataReady", new java.lang.Object[0]);
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = a0Var.f85782d;
            if (recordParam != null && "mp3".equalsIgnoreCase(recordParam.f85839h)) {
                com.tencent.mm.plugin.appbrand.media.record.o0.a(19);
                return;
            }
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam2 = a0Var.f85782d;
            if (recordParam2 == null || !"aac".equalsIgnoreCase(recordParam2.f85839h)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.media.record.o0.a(23);
        }
    }
}
