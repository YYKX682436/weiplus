package rv4;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f400554a;

    public t() {
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("s1s-guess:pagecache", "");
        com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getPageCache: " + u17);
        kotlin.jvm.internal.o.d(u17);
        org.json.JSONObject f17 = pv4.a.f(u17);
        this.f400554a = f17 == null ? new org.json.JSONObject() : f17;
    }

    public final void a() {
        org.json.JSONObject jsonObject = this.f400554a;
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "savePageCache: " + jsonObject);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("s1s-guess:pagecache", jsonObject.toString());
    }
}
