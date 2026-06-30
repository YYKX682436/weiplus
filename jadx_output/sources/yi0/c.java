package yi0;

/* loaded from: classes3.dex */
public final class c implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f462482a;

    public c(kotlin.coroutines.Continuation continuation) {
        this.f462482a = continuation;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        this.f462482a.resumeWith(kotlin.Result.m521constructorimpl(bitmap));
    }
}
