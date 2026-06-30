package eq1;

/* loaded from: classes8.dex */
public final class g implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f255807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f255809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255810d;

    public g(android.widget.ImageView imageView, java.lang.String str, int i17, int i18) {
        this.f255807a = imageView;
        this.f255808b = str;
        this.f255809c = i17;
        this.f255810d = i18;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b imageData) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageData, "imageData");
        eq1.h hVar = eq1.h.f255812a;
        com.tencent.mars.xlog.Log.i("BizChatUtil", "onImageLoadFinish");
        if (imageData.f359534d == null) {
            com.tencent.mars.xlog.Log.i("BizChatUtil", "imageData.bitmap == null");
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = 5;
        byte[] a17 = com.tencent.mm.sdk.platformtools.x.a(imageData.f359534d);
        int length = a17.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(a17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/biz/util/BizChatLiveUtil$setCover$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/biz/util/BizChatLiveUtil$setCover$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        this.f255807a.setTag(com.tencent.mm.R.id.bph, this.f255808b);
        ((ku5.t0) ku5.t0.f312615d).B(new eq1.f(this.f255807a, decodeByteArray, this.f255808b, this.f255809c, this.f255810d));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String url, android.view.View view, q11.b imageData) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(imageData, "imageData");
        android.graphics.Bitmap bitmap = imageData.f359534d;
        kotlin.jvm.internal.o.f(bitmap, "bitmap");
        return bitmap;
    }
}
