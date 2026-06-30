package gu0;

/* loaded from: classes5.dex */
public final class j1 implements com.tencent.maas.camstudio.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f275711a;

    public j1(kotlinx.coroutines.q qVar) {
        this.f275711a = qVar;
    }

    @Override // com.tencent.maas.camstudio.r
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlinx.coroutines.q qVar = this.f275711a;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            return;
        }
        com.tencent.mars.xlog.Log.e("MJCC.Session", "prepareResourceAndRegisterForReedit: loadLocalTemplateComponents failed: " + mJError.message);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("loadLocalTemplateComponents failed: " + mJError.message))));
    }
}
