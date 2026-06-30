package lt1;

/* loaded from: classes.dex */
public final class c implements xg3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f321184a;

    public c(kotlinx.coroutines.q qVar) {
        this.f321184a = qVar;
    }

    @Override // xg3.t
    public void a(boolean z17, int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "handleContinue: onGetVerifyRecordHistory completed, hasMore=" + z17 + ", errType=" + i17 + ", errCode=" + i18);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321184a.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
