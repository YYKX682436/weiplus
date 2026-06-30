package e00;

/* loaded from: classes3.dex */
public final class h implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f245774a;

    public h(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f245774a = qVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f359534d : null;
        if (bitmap != null) {
            bitmap.getWidth();
        }
        if (bitmap != null) {
            bitmap.getHeight();
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f245774a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Float.valueOf(bitmap != null ? bitmap.getWidth() / bitmap.getHeight() : 0.0f)));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
