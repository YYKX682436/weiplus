package dk2;

/* loaded from: classes3.dex */
public final class o5 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.o5 f233836d = new dk2.o5();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        dk2.q5 q5Var = dk2.q5.f233939a;
        if (i17 == 1) {
            java.lang.Object obj = it.obj;
            java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                dk2.q5 q5Var2 = dk2.q5.f233939a;
                com.tencent.mars.xlog.Log.i("Micro.FinderLiveCommentTemporaryStorage", "[delete] liveId=" + longValue);
                synchronized (q5Var2.b()) {
                }
            }
        }
        return true;
    }
}
