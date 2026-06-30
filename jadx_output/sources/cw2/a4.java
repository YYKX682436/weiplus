package cw2;

/* loaded from: classes8.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f223563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f223564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f223563d = bitmap;
        this.f223564e = finderLivePlayView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView;
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f223563d;
        if (bitmap != null && (imageView = (finderLivePlayView = this.f223564e).f130608o) != null) {
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(finderLivePlayView.getContext().getResources(), bitmap));
        }
        return jz5.f0.f302826a;
    }
}
