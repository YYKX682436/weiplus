package eh0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final eh0.k f252888a = new eh0.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f252889b = new java.util.concurrent.ConcurrentHashMap();

    public final com.tencent.mm.sdk.platformtools.o4 a(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f252889b;
        java.lang.String str2 = str + c();
        java.lang.Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("weclaw_thinking_" + f252888a.c() + str);
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(str2, M);
            obj = putIfAbsent == null ? M : putIfAbsent;
        }
        kotlin.jvm.internal.o.f(obj, "getOrPut(...)");
        return (com.tencent.mm.sdk.platformtools.o4) obj;
    }

    public final java.lang.String b(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        if ((talker.length() == 0) || j17 == 0) {
            return null;
        }
        return a(talker).getString(java.lang.String.valueOf(j17), null);
    }

    public final java.lang.String c() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(gm0.j1.b().j());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = "";
        }
        return (java.lang.String) m521constructorimpl;
    }

    public final void d(java.lang.String talker, long j17, java.lang.String text) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(text, "text");
        if ((talker.length() == 0) || j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ThinkingDataMMKVHelper", "saveThinkingText error: talker:%s, msgSvrId:%d", talker, java.lang.Long.valueOf(j17));
        } else {
            a(talker).putString(java.lang.String.valueOf(j17), text);
            com.tencent.mars.xlog.Log.i("MicroMsg.ThinkingDataMMKVHelper", "saveThinkingText talker:%s, msgSvrId:%d, textLen:%d", talker, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(text.length()));
        }
    }
}
