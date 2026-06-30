package lm3;

/* loaded from: classes3.dex */
public final class j implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f319490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f319491b;

    public j(lm3.b0 b0Var, android.widget.ImageView imageView) {
        this.f319490a = b0Var;
        this.f319491b = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        kotlin.jvm.internal.o.g(url, "url");
        if ((bVar != null ? bVar.f359534d : null) == null || bVar.f359534d.isRecycled()) {
            return;
        }
        um5.d dVar = new um5.d();
        android.graphics.Bitmap bitmap = bVar.f359534d;
        kotlin.jvm.internal.o.f(bitmap, "bitmap");
        dVar.b(bitmap);
        lm3.b0 b0Var = this.f319490a;
        int B = i65.a.B(b0Var.f319470e);
        int k17 = i65.a.k(b0Var.f319470e);
        dVar.f429141b = B;
        dVar.f429142c = k17;
        dVar.f429144e.f429193b.d();
        dVar.a(new lm3.i(this.f319491b));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
