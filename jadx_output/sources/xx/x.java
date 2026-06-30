package xx;

/* loaded from: classes14.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xx.y f457826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xx.g f457827b;

    public x(xx.y yVar, xx.g gVar) {
        this.f457826a = yVar;
        this.f457827b = gVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (!u46.l.c(str, "page_out")) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "BrandDataReportPage addDynamicParams");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        long a17 = c01.id.a();
        xx.y yVar = this.f457826a;
        linkedHashMap.put("stay_time", java.lang.Long.valueOf(a17 - yVar.f457828a));
        long j17 = yVar.f457832e;
        if (j17 != 0) {
            linkedHashMap.put("room_id", java.lang.String.valueOf(j17));
        }
        if (this.f457827b == xx.g.f457791f) {
            xx.z zVar = yVar.f457840m;
            linkedHashMap.put("user_comment_cnt", java.lang.String.valueOf(zVar.f457843a));
            linkedHashMap.put("new_question_cnt", java.lang.String.valueOf(zVar.f457844b));
            linkedHashMap.put("avatar_answer_cnt", java.lang.String.valueOf(zVar.f457849g));
            linkedHashMap.put("online_user_cnt", java.lang.String.valueOf(zVar.f457845c));
            linkedHashMap.put("daily_chat_pv", java.lang.String.valueOf(zVar.f457846d));
            linkedHashMap.put("if_answer_question", java.lang.String.valueOf(zVar.f457847e));
            linkedHashMap.put("avatar_self_answer_cnt", java.lang.String.valueOf(zVar.f457848f));
        }
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "page out :" + linkedHashMap);
        return linkedHashMap;
    }
}
