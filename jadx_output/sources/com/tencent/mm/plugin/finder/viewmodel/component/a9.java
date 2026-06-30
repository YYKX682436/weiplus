package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f133745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e9 f133746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var) {
        super(0);
        this.f133745d = finderEmojiView;
        this.f133746e = e9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f133745d.setAlpha(1.0f);
        com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var = this.f133746e;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = e9Var.f134223m;
        com.tencent.mars.xlog.Log.i("Finder.DescCommentContentUIC", "runNext showingCommentInfo=".concat(pm0.v.u(finderCommentInfo != null ? finderCommentInfo.getCommentId() : -1L)));
        pm0.v.C(e9Var.f7());
        e9Var.f7().run();
        return jz5.f0.f302826a;
    }
}
