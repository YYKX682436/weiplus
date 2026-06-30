package ef4;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f252488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f252489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f252490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, long j18, java.util.ArrayList arrayList) {
        super(0);
        this.f252488d = j17;
        this.f252489e = j18;
        this.f252490f = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pm0.c cVar = new pm0.c("reportWaitPlayList");
        com.tencent.mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct storySnsPlayInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct();
        long j17 = this.f252488d;
        storySnsPlayInfoReportStruct.f60973d = j17;
        long j18 = this.f252489e;
        storySnsPlayInfoReportStruct.f60974e = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f252490f.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            kotlin.jvm.internal.o.d(str);
            java.util.Iterator it6 = it;
            long j19 = j18;
            long j27 = ef4.w.f252468t.g().y0(str).field_syncId;
            int length = java.lang.String.valueOf(j27).length();
            pm0.c cVar2 = cVar;
            if (sb6.length() + length < 1000) {
                sb6.append(j27);
                sb6.append("|");
            } else if (sb7.length() + length < 1000) {
                sb7.append(j27);
                sb7.append("|");
            } else if (sb8.length() + length < 1000) {
                sb8.append(j27);
                sb8.append("|");
            } else {
                storySnsPlayInfoReportStruct.f60975f = storySnsPlayInfoReportStruct.b("WaitPlayVideoList", sb6.substring(0, sb6.length()).toString(), true);
                storySnsPlayInfoReportStruct.f60978i = storySnsPlayInfoReportStruct.b("WaitPlayVideoList1", sb7.substring(0, sb7.length()).toString(), true);
                storySnsPlayInfoReportStruct.f60979j = storySnsPlayInfoReportStruct.b("WaitPlayVideoList2", sb8.substring(0, sb8.length()).toString(), true);
                storySnsPlayInfoReportStruct.f60977h = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryExtInfoStorageLogic", "split reportWaitPlayList " + j17 + ' ' + i17 + ' ' + storySnsPlayInfoReportStruct.f60975f.length() + ' ' + storySnsPlayInfoReportStruct.f60975f + storySnsPlayInfoReportStruct.f60978i.length() + ' ' + storySnsPlayInfoReportStruct.f60978i + storySnsPlayInfoReportStruct.f60979j.length() + ' ' + storySnsPlayInfoReportStruct.f60979j);
                storySnsPlayInfoReportStruct.k();
                com.tencent.mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct storySnsPlayInfoReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct();
                storySnsPlayInfoReportStruct2.f60973d = j17;
                j18 = j19;
                storySnsPlayInfoReportStruct2.f60974e = j18;
                i17++;
                r26.e0.d(sb6);
                r26.e0.d(sb7);
                r26.e0.d(sb8);
                storySnsPlayInfoReportStruct = storySnsPlayInfoReportStruct2;
                cVar = cVar2;
                it = it6;
            }
            j18 = j19;
            cVar = cVar2;
            it = it6;
        }
        storySnsPlayInfoReportStruct.f60975f = storySnsPlayInfoReportStruct.b("WaitPlayVideoList", sb6.substring(0, sb6.length()).toString(), true);
        storySnsPlayInfoReportStruct.f60978i = storySnsPlayInfoReportStruct.b("WaitPlayVideoList1", sb7.substring(0, sb7.length()).toString(), true);
        storySnsPlayInfoReportStruct.f60979j = storySnsPlayInfoReportStruct.b("WaitPlayVideoList2", sb8.substring(0, sb8.length()).toString(), true);
        storySnsPlayInfoReportStruct.f60977h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryExtInfoStorageLogic", "final reportWaitPlayList " + j17 + ' ' + i17 + ' ' + storySnsPlayInfoReportStruct.f60975f.length() + ' ' + storySnsPlayInfoReportStruct.f60975f + storySnsPlayInfoReportStruct.f60978i.length() + ' ' + storySnsPlayInfoReportStruct.f60978i + storySnsPlayInfoReportStruct.f60979j.length() + ' ' + storySnsPlayInfoReportStruct.f60979j);
        storySnsPlayInfoReportStruct.k();
        new com.tencent.mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct();
        cVar.a();
        return jz5.f0.f302826a;
    }
}
