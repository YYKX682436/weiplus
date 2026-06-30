package xh4;

/* loaded from: classes.dex */
public final class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f454628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlinx.coroutines.q qVar, android.os.Looper looper) {
        super(looper);
        this.f454628a = qVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        super.handleMessage(msg);
        android.os.Bundle data = msg.getData();
        int i17 = data.getInt("key_authentication_type");
        int i18 = data.getInt("key_authentication_result_code");
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] handleMessage " + i17 + ' ' + i18);
        xh4.k kVar = xh4.k.f454608d;
        kotlinx.coroutines.q qVar = this.f454628a;
        if (i18 == 100) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Succeeded");
            if (((kotlinx.coroutines.r) qVar).n()) {
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kVar));
                return;
            }
            return;
        }
        xh4.k kVar2 = xh4.k.f454609e;
        if (i18 == 101) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Failed");
            if (((kotlinx.coroutines.r) qVar).n()) {
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kVar2));
                return;
            }
            return;
        }
        xh4.k kVar3 = xh4.k.f454608d;
        if (i18 == 102) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Error ignore");
            return;
        }
        xh4.k kVar4 = xh4.k.f454608d;
        if (i18 == 103) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Help ignore");
        }
    }
}
