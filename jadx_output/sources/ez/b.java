package ez;

/* loaded from: classes9.dex */
public final class b implements bt3.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f257695a;

    public b(kotlinx.coroutines.q qVar) {
        this.f257695a = qVar;
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogicFeatureService", "summerapp checkBigFileDownload signature:" + str4);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (str4 == null) {
            str4 = "";
        }
        this.f257695a.resumeWith(kotlin.Result.m521constructorimpl(str4));
    }
}
