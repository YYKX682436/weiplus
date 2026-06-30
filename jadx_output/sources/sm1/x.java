package sm1;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        super(0);
        this.f409341d = bizCommentFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409341d;
        bizCommentFooter.animate().setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(220L).setListener(new sm1.w(bizCommentFooter)).translationY(0.0f).start();
        return jz5.f0.f302826a;
    }
}
