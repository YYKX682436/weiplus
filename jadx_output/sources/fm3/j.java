package fm3;

/* loaded from: classes10.dex */
public final class j implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f60.a f264077a;

    public j(f60.a aVar) {
        this.f264077a = aVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        f60.a aVar = this.f264077a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        kotlin.jvm.internal.o.d(bVar);
        android.graphics.Bitmap bitmap = bVar.f359534d;
        kotlin.jvm.internal.o.f(bitmap, "bitmap");
        return bitmap;
    }
}
