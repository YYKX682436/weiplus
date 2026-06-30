package kd2;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView f306734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f306735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f306733d = imageView;
        this.f306734e = finderLiveFeedMiniView;
        this.f306735f = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f306733d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.f306734e.getContext().getResources(), this.f306735f));
        com.tencent.mars.xlog.Log.i("FinderLiveFeedMiniView", "loadBackgroundImage success!");
        return jz5.f0.f302826a;
    }
}
