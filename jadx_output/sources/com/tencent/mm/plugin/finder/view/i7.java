package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        super(0);
        this.f132292d = finderCommentFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f132292d.animate().setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(220L).setListener(null).translationY(0.0f).start();
        return jz5.f0.f302826a;
    }
}
