package eq1;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f255787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, android.widget.ImageView imageView, java.lang.String str2) {
        super(1);
        this.f255786d = str;
        this.f255787e = imageView;
        this.f255788f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f255787e;
        if (kotlin.jvm.internal.o.b(this.f255786d, imageView.getTag(com.tencent.mm.R.id.bph))) {
            eq1.h hVar = eq1.h.f255812a;
            com.tencent.mars.xlog.Log.i("BizChatUtil", "setForegroundPic requestEffect effectBitmap:" + bitmap);
            n11.a.b().o(this.f255788f, bitmap);
            imageView.setImageBitmap(bitmap);
        } else {
            eq1.h hVar2 = eq1.h.f255812a;
            com.tencent.mars.xlog.Log.i("BizChatUtil", "recycled");
        }
        return jz5.f0.f302826a;
    }
}
