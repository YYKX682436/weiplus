package ju1;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, android.widget.ImageView imageView) {
        super(2);
        this.f301699d = str;
        this.f301700e = imageView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cp0.n imageView = (cp0.n) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (bitmap != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int d17 = i65.a.d(context, com.tencent.mm.R.color.f478518a0);
            ju1.b bVar = new ju1.b(bitmap, this.f301699d, context, this.f301700e);
            if (bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardViewUtils", "getPrimaryColor, bitmap is null");
                bVar.a(d17);
            } else {
                new i4.f(bitmap).a(new ju1.d(bVar, d17));
            }
        }
        return jz5.f0.f302826a;
    }
}
