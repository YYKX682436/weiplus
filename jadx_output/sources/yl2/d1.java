package yl2;

/* loaded from: classes.dex */
public final class d1 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f462985a;

    public d1(kotlinx.coroutines.q qVar) {
        this.f462985a = qVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("PRECHECK_RESULT", 0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "precheck result:" + valueOf);
        kotlinx.coroutines.q qVar = this.f462985a;
        if (i17 == -1 && valueOf != null && valueOf.intValue() == 1) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
    }
}
