package kd2;

/* loaded from: classes3.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f306742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView f306744f;

    public f0(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView) {
        this.f306742d = bitmap;
        this.f306743e = imageView;
        this.f306744f = finderLiveFeedMiniView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f306742d;
        pm0.v.X(new kd2.e0(this.f306743e, this.f306744f, com.tencent.mm.sdk.platformtools.x.S(bitmap, bitmap.getHeight(), (int) (bitmap.getHeight() / (com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).y / com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).x)), true, false)));
    }
}
