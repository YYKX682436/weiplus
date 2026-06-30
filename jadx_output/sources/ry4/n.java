package ry4;

/* loaded from: classes.dex */
public final class n implements xg3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f401664a;

    public n(kotlinx.coroutines.q qVar) {
        this.f401664a = qVar;
    }

    @Override // xg3.n0
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        kotlinx.coroutines.q qVar = this.f401664a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(i17 == 0)));
        }
    }
}
