package xh4;

/* loaded from: classes.dex */
public final class t implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f454631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f454632b;

    public t(kotlinx.coroutines.q qVar, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        this.f454631a = qVar;
        this.f454632b = mMFragmentActivity;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        kotlinx.coroutines.q qVar = this.f454631a;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] Success");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.l.f454611d));
            return;
        }
        if (intent != null && intent.getBooleanExtra("IntentResult_GoVerifyPwd", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] GoVerifyPwd");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.l.f454612e));
            return;
        }
        if (!(intent != null && intent.getBooleanExtra("IntentResult_GoTeenModeGuardianInfoUI", false))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] Cancel");
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.l.f454614g));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] GoTeenModeGuardianInfoUI");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f454632b;
        android.content.Intent intent2 = new android.content.Intent(mMFragmentActivity, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI.class);
        intent2.putExtras(intent);
        ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(intent2)).f197877a = new xh4.s(mMFragmentActivity, qVar);
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.l.f454613f));
    }
}
