package f00;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f258324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f258325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f258324d = bitmap;
        this.f258325e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f258324d;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f258325e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f258325e.setImageBitmap(bitmap);
        } else {
            android.widget.ImageView imageView2 = this.f258325e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(imageView2, arrayList2.toArray(), "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(imageView2, "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
