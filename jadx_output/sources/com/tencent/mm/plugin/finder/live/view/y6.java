package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f116829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f116828d = finderLiveMiniView;
        this.f116829e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = this.f116828d;
        finderLiveMiniView.f116037i.setImageBitmap(this.f116829e);
        android.widget.ImageView imageView = finderLiveMiniView.f116037i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView$setFloatBitmapCover$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView$setFloatBitmapCover$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
