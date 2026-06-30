package lw2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(lw2.m mVar) {
        super(0);
        this.f321575d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = this.f321575d.e();
        if (e17 != null) {
            return (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) e17.findViewById(com.tencent.mm.R.id.ghd);
        }
        return null;
    }
}
