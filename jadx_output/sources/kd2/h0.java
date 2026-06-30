package kd2;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView f306751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f306752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f306751d = finderLiveFeedMiniView;
        this.f306752e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView = this.f306751d;
        finderLiveFeedMiniView.f111323m.setImageBitmap(this.f306752e);
        android.widget.ImageView imageView = finderLiveFeedMiniView.f111323m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView$setFloatBitmapCover$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/floatball/FinderLiveFeedMiniView$setFloatBitmapCover$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
