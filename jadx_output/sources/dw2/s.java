package dw2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f244163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        super(1);
        this.f244163d = finderVideoLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da view = (cw2.da) obj;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f244163d;
        return java.lang.Boolean.valueOf(finderVideoLayout != null ? true ^ kotlin.jvm.internal.o.b(finderVideoLayout.getVideoView(), view.getVideoView()) : true);
    }
}
