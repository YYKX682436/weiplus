package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class k7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f132482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, boolean z17) {
        super(0);
        this.f132481d = finderCommentFooter;
        this.f132482e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132481d;
        android.widget.ImageView switchSceneAvatar = finderCommentFooter.getSwitchSceneAvatar();
        boolean z17 = this.f132482e;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.w(z17, finderCommentFooter, switchSceneAvatar);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.x(z17, finderCommentFooter, finderCommentFooter.getSwitchSceneAvatar());
        return jz5.f0.f302826a;
    }
}
