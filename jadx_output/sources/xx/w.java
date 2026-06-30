package xx;

/* loaded from: classes5.dex */
public final class w implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xx.y f457825a;

    public w(xx.y yVar) {
        this.f457825a = yVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (!u46.l.c(str, "view_clk")) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "setBrandDataReportBackBtn addDynamicParams");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        long a17 = c01.id.a();
        xx.y yVar = this.f457825a;
        linkedHashMap.put("stay_time", java.lang.Long.valueOf(a17 - yVar.f457828a));
        long j17 = yVar.f457832e;
        if (j17 != 0) {
            linkedHashMap.put("room_id", java.lang.String.valueOf(j17));
        }
        return linkedHashMap;
    }
}
