package qn4;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f365262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn4.a f365263e;

    public o(qn4.t tVar, qn4.a aVar) {
        this.f365262d = tVar;
        this.f365263e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn4.t tVar = this.f365262d;
        if (!tVar.f365279a || tVar.f365283e) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - tVar.f365285g;
        if (currentTimeMillis >= 100) {
            com.tencent.mars.xlog.Log.i("TranslationSpeechController", "Show loading, elapsed: " + currentTimeMillis + " ms");
            tVar.f365283e = true;
            ((qn4.w) this.f365263e).getClass();
            com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onShowLoading");
            qn4.i iVar = qn4.y.f365305d;
            iVar.getClass();
            qn4.v.f365297a.a(new qn4.e(iVar), new qn4.f(iVar));
        }
    }
}
