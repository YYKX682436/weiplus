package ty2;

/* loaded from: classes2.dex */
public final class l implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f423077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f423079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f423080d;

    public l(int i17, android.content.Context context, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        this.f423077a = i17;
        this.f423078b = context;
        this.f423079c = c0Var;
        this.f423080d = continuation;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlin.coroutines.Continuation continuation = this.f423080d;
        kotlin.jvm.internal.c0 c0Var = this.f423079c;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        int i17 = this.f423077a;
        android.content.res.Resources resources = this.f423078b.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, bitmap);
        bitmapDrawable.setBounds(0, 0, (int) (((i17 * 1.0f) * bitmap.getWidth()) / bitmap.getHeight()), i17);
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(wVar));
    }
}
