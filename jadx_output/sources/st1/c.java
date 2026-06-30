package st1;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f412200d;

    public c(kotlinx.coroutines.q qVar) {
        this.f412200d = qVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f412200d.resumeWith(kotlin.Result.m521constructorimpl(new android.app.Instrumentation.ActivityResult(i18, intent)));
    }
}
