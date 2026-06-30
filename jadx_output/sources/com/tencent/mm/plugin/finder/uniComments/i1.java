package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        super(0);
        this.f130266d = textStatusCommentFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f130266d.animate().setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(220L).setListener(null).translationY(0.0f).start();
        return jz5.f0.f302826a;
    }
}
