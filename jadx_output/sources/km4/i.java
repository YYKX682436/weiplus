package km4;

/* loaded from: classes11.dex */
public final class i implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f309289c;

    public i(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f309287a = lVar;
        this.f309288b = c0Var;
        this.f309289c = h0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        kotlin.jvm.internal.h0 h0Var = this.f309289c;
        kotlin.jvm.internal.c0 c0Var = this.f309288b;
        yz5.l lVar = this.f309287a;
        try {
            boolean optBoolean = new org.json.JSONObject(str).optBoolean("isEnded");
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAdHelper", "openAD result = " + str + ", isEnded = " + optBoolean);
            if (optBoolean) {
                km4.l.f309296a.a(3, null);
                km4.l.c(lVar, c0Var, h0Var, com.tencent.pigeon.ting.TingADErrorCode.FULL_WATCHED);
            } else {
                km4.l.f309296a.a(4, null);
                km4.l.c(lVar, c0Var, h0Var, com.tencent.pigeon.ting.TingADErrorCode.ABORT);
            }
        } catch (java.lang.Exception e17) {
            km4.l.f309296a.a(11, null);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingAdHelper", e17, "parse back value failed", new java.lang.Object[0]);
            km4.l.c(lVar, c0Var, h0Var, com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL);
        }
    }
}
