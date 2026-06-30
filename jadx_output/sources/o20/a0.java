package o20;

/* loaded from: classes14.dex */
public final class a0 implements o20.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.player.EcsVideoView f342367a;

    public a0(com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView) {
        this.f342367a = ecsVideoView;
    }

    @Override // o20.u
    public void a(o20.t oldState, o20.t newState) {
        android.widget.ImageView thumbnailImg;
        kotlin.jvm.internal.o.g(oldState, "oldState");
        kotlin.jvm.internal.o.g(newState, "newState");
        if (kotlin.jvm.internal.o.b(newState, o20.p.f342396a)) {
            thumbnailImg = this.f342367a.getThumbnailImg();
            thumbnailImg.setVisibility(8);
        }
    }
}
