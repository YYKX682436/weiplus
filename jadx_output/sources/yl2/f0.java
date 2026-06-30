package yl2;

/* loaded from: classes.dex */
public final class f0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f462997a;

    public f0(kotlinx.coroutines.q qVar) {
        this.f462997a = qVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "face verify result:" + valueOf);
        kotlinx.coroutines.q qVar = this.f462997a;
        if (i17 == -1 && valueOf != null && valueOf.intValue() == 1) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
    }
}
