package qn4;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f365264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn4.a f365265e;

    public p(qn4.t tVar, qn4.a aVar) {
        this.f365264d = tVar;
        this.f365265e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn4.t tVar = this.f365264d;
        if (tVar.f365279a) {
            com.tencent.mars.xlog.Log.w("TranslationSpeechController", "Speech timeout");
            tVar.f365286h = 4;
            tVar.d();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.pjj));
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            ((qn4.w) this.f365265e).a(1001, "Speech timeout");
        }
    }
}
