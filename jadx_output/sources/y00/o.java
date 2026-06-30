package y00;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f458540d;

    public o(java.util.HashMap hashMap, y00.p pVar) {
        this.f458540d = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        for (java.util.Map.Entry entry : this.f458540d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(a10.e.f490a.a().J0(str, list)));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardOnMsgChanged", m524exceptionOrNullimpl, "removeBatch fail talker=%s ids=%d", str, java.lang.Integer.valueOf(list.size()));
            }
        }
    }
}
