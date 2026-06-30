package st1;

/* loaded from: classes7.dex */
public final class d implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f412201a;

    public d(kotlinx.coroutines.q qVar) {
        this.f412201a = qVar;
    }

    @Override // nf.j
    public final void onResult(int i17, android.content.Intent intent) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f412201a.resumeWith(kotlin.Result.m521constructorimpl(new android.app.Instrumentation.ActivityResult(i17, intent)));
    }
}
