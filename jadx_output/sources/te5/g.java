package te5;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final te5.g f418641d = new te5.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        te5.h hVar = te5.h.f418649a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigFileBubbleSendExpiredTime());
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFileStatusHelper", "init expiredTime: " + c17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(c17 > 0 ? c17 * 3600000 : 10800000L));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = 10800000L;
        }
        return (java.lang.Long) m521constructorimpl;
    }
}
