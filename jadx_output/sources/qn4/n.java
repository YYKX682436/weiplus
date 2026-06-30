package qn4;

/* loaded from: classes12.dex */
public final class n implements y21.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn4.t f365260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qn4.a f365261b;

    public n(qn4.t tVar, qn4.a aVar) {
        this.f365260a = tVar;
        this.f365261b = aVar;
    }

    @Override // y21.a
    public void a() {
        java.lang.Object m521constructorimpl;
        qn4.t tVar = this.f365260a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            tVar.getClass();
            com.tencent.mars.xlog.Log.i("TranslationSpeechController", "onPlayInterrupt: audio focus lost or playback interrupted");
            tVar.f365286h = 4;
            tVar.b();
            boolean z17 = tVar.f365283e;
            qn4.a aVar = this.f365261b;
            if (z17) {
                ((qn4.w) aVar).getClass();
                com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onHideLoading");
                qn4.i iVar = qn4.y.f365305d;
                iVar.getClass();
                qn4.v.f365297a.a(new qn4.d(iVar), null);
                tVar.f365283e = false;
            }
            ((qn4.w) aVar).a(1002, "Playback interrupted (audio focus lost)");
            tVar.f365279a = false;
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeechController", "handlePlayInterrupt error", m524exceptionOrNullimpl);
        }
    }

    @Override // y21.a
    public void onComplete() {
        com.tencent.mars.xlog.Log.i("TranslationSpeechController", "onComplete");
        qn4.t tVar = this.f365260a;
        tVar.getClass();
        ((qn4.w) this.f365261b).getClass();
        com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onSpeechComplete");
        qn4.y.f365302a.f();
        tVar.f365279a = false;
    }

    @Override // y21.a
    public void onProgress(float f17) {
        java.lang.Object m521constructorimpl;
        qn4.t tVar = this.f365260a;
        qn4.a aVar = this.f365261b;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qn4.t.a(tVar, f17, aVar);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeechController", "handleProgress error", m524exceptionOrNullimpl);
        }
    }
}
