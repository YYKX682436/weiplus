package yl2;

/* loaded from: classes.dex */
public final class j0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f463033a;

    public j0(kotlinx.coroutines.q qVar) {
        this.f463033a = qVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "gotoFaceVerifyForUserFlag result: " + valueOf);
        kotlinx.coroutines.q qVar = this.f463033a;
        if (i17 != -1 || valueOf == null || valueOf.intValue() != 1) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("RESULT_USER_FLAG", 0) : 0;
        if (intent == null || (str = intent.getStringExtra("RESULT_REALNAME_AUTH_URL")) == null) {
            str = "";
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Integer.valueOf(intExtra), str)));
    }
}
