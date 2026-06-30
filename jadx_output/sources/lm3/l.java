package lm3;

/* loaded from: classes3.dex */
public final class l implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f319494a;

    public l(android.widget.ImageView imageView) {
        this.f319494a = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap X;
        kotlin.jvm.internal.o.g(url, "url");
        if ((bVar != null ? bVar.f359534d : null) == null || bVar.f359534d.isRecycled() || (X = com.tencent.mm.sdk.platformtools.x.X(bVar.f359534d, 10)) == null) {
            return;
        }
        pm0.v.X(new lm3.k(this.f319494a, X));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
