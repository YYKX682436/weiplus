package lu1;

/* loaded from: classes15.dex */
public class d0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f321324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f321325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f321327d;

    public d0(android.widget.ImageView imageView, int i17, android.content.Context context, int i18) {
        this.f321324a = imageView;
        this.f321325b = i17;
        this.f321326c = context;
        this.f321327d = i18;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f359534d;
        if (bitmap != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new lu1.c0(this, bitmap));
            return;
        }
        lu1.g0.d(this.f321326c, this.f321324a, this.f321327d, this.f321325b);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
