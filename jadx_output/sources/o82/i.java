package o82;

@j95.b
/* loaded from: classes12.dex */
public final class i extends i95.w implements o72.u4 {
    public void Ai(android.content.Intent intent, java.lang.String searchId, long j17, int i17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        r45.fq0 fq0Var = new r45.fq0();
        try {
            fq0Var.parseFrom(intent.getByteArrayExtra("key_fav_search_report_obj"));
            v82.b bVar = new v82.b();
            if (!bVar.d(fq0Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportSearchCTR", "this FavSearchReportObj is null");
                return;
            }
            bVar.f434073g = searchId;
            bVar.f434067a = i17;
            bVar.f434070d = ((int) (java.lang.System.currentTimeMillis() - j17)) / 1000;
            bVar.b();
        } catch (java.lang.Exception unused) {
        }
    }

    public void wi(android.content.Context context, java.lang.String searchId, long j17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        r45.fq0 fq0Var = (r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(context, 1, 17, r45.fq0.class);
        v82.b bVar = new v82.b();
        if (!bVar.d(fq0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportSearchCTR", "this page is not open from fav search");
            return;
        }
        bVar.f434073g = searchId;
        bVar.f434067a = i17;
        bVar.f434070d = ((int) (java.lang.System.currentTimeMillis() - j17)) / 1000;
        bVar.b();
    }
}
