package o20;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.player.EcsVideoView f342402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView, java.lang.String str) {
        super(1);
        this.f342402d = ecsVideoView;
        this.f342403e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.p onThumbnailBitmapLoad;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null && (onThumbnailBitmapLoad = this.f342402d.getOnThumbnailBitmapLoad()) != null) {
            onThumbnailBitmapLoad.invoke(this.f342403e, bitmap);
        }
        return jz5.f0.f302826a;
    }
}
