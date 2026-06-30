package qm1;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.CommentInputRequest f364686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f364687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qm1.f f364688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f364689g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f364690h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364691i;

    public d(com.tencent.pigeon.ting.CommentInputRequest commentInputRequest, kotlin.jvm.internal.c0 c0Var, qm1.f fVar, boolean z17, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, yz5.l lVar) {
        this.f364686d = commentInputRequest;
        this.f364687e = c0Var;
        this.f364688f = fVar;
        this.f364689g = z17;
        this.f364690h = finderCommentInfo;
        this.f364691i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView replyBtn;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.tencent.pigeon.ting.CommentInputRequest commentInputRequest = this.f364686d;
        java.lang.Boolean show = commentInputRequest.getShow();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = kotlin.jvm.internal.o.b(show, bool);
        kotlin.jvm.internal.c0 c0Var = this.f364687e;
        qm1.f fVar = this.f364688f;
        if (b17 && c0Var.f310112d && !fVar.f364701i) {
            qm1.f.a(fVar, commentInputRequest);
        } else if (this.f364689g) {
            qm1.f.a(fVar, commentInputRequest);
        }
        boolean z17 = fVar.f364701i;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f364690h;
        if (z17) {
            qm1.f.c(fVar, finderCommentInfo, c0Var.f310112d);
        }
        fVar.h(commentInputRequest);
        if (kotlin.jvm.internal.o.b(commentInputRequest.getShow(), bool)) {
            qm1.f.c(fVar, finderCommentInfo, c0Var.f310112d);
            boolean z18 = c0Var.f310112d;
            fVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "showCommentInputView needInitCommentFooter: " + z18 + " showInputBar: " + fVar.f364701i);
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = fVar.f364696d;
            if (bizCommentFooter != null && z18 && !fVar.f364702j && (inputMethodManager = (android.view.inputmethod.InputMethodManager) bizCommentFooter.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(bizCommentFooter.getEditText(), 0);
            }
        } else {
            qm1.f.b(fVar);
        }
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter2 = fVar.f364696d;
        if (bizCommentFooter2 == null || (replyBtn = bizCommentFooter2.getReplyBtn()) == null) {
            return;
        }
        replyBtn.setOnClickListener(new qm1.c(fVar, finderCommentInfo, this.f364691i));
    }
}
