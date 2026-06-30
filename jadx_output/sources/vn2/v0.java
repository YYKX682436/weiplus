package vn2;

/* loaded from: classes2.dex */
public final class v0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f438399a;

    public v0(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f438399a = finderVideoLayout;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f438399a;
        return kz5.b1.e(new jz5.l("click_playpercent", java.lang.Integer.valueOf(finderVideoLayout != null ? finderVideoLayout.getPlayPercent() : 0)));
    }
}
