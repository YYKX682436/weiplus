package cw2;

/* loaded from: classes8.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f223909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f223910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(boolean z17, com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f223909d = z17;
        this.f223910e = finderLivePlayView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f223909d;
        float f17 = !z17 ? 1.0f : 0.0f;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f223910e;
        android.widget.ImageView imageView = finderLivePlayView.f130608o;
        if (!kotlin.jvm.internal.o.a(imageView != null ? java.lang.Float.valueOf(imageView.getAlpha()) : null, f17)) {
            finderLivePlayView.Y("set coverImage alpha:" + f17);
            android.widget.ImageView imageView2 = finderLivePlayView.f130608o;
            if (imageView2 != null) {
                imageView2.setAlpha(f17);
            }
        }
        finderLivePlayView.e0(z17);
        return jz5.f0.f302826a;
    }
}
