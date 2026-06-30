package yk4;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        super(0);
        this.f462861d = tingCommentFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462861d;
        tingCommentFooter.animate().setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(220L).setListener(new yk4.x(tingCommentFooter)).translationY(0.0f).start();
        return jz5.f0.f302826a;
    }
}
