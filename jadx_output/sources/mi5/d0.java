package mi5;

/* loaded from: classes9.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.e0 f326813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l15.c f326816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mi5.e0 e0Var, android.content.Context context, com.tencent.mm.storage.f9 f9Var, l15.c cVar) {
        super(1);
        this.f326813d = e0Var;
        this.f326814e = context;
        this.f326815f = f9Var;
        this.f326816g = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        android.content.Context context = this.f326814e;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.storage.f9 f9Var = this.f326815f;
        mi5.e0 e0Var = this.f326813d;
        android.graphics.Bitmap i17 = e0Var.i(context, f9Var);
        if (i17 == null || i17.isRecycled()) {
            l15.c cVar = this.f326816g;
            v05.b k17 = cVar.k();
            java.lang.String string = k17 != null ? k17.getString(k17.f432315e + 14) : null;
            if (string == null || string.length() == 0) {
                imageView.setVisibility(8);
            } else if (r26.i0.A(string, "http", false, 2, null)) {
                e0Var.g(string, cVar, imageView);
            } else {
                imageView.setImageBitmap(com.tencent.mm.graphics.e.c(string));
            }
        } else {
            imageView.setImageBitmap(i17);
        }
        return jz5.f0.f302826a;
    }
}
