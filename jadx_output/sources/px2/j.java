package px2;

/* loaded from: classes2.dex */
public final class j implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f358892a;

    public j(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f358892a = finderVideoLayout;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.b1.e(new jz5.l("playpercent", java.lang.Integer.valueOf(this.f358892a.getPlayPercent() * 100)));
    }
}
