package cw2;

/* loaded from: classes2.dex */
public final class n2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223880a;

    public n2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223880a = finderFullSeekBarLayout;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        float playerPercent;
        playerPercent = this.f223880a.getPlayerPercent();
        return kz5.b1.e(new jz5.l("playpercent", java.lang.Integer.valueOf(a06.d.b(playerPercent * 100))));
    }
}
