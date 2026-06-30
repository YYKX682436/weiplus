package wk4;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.CommentInputRequest f446964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f446965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wk4.f f446966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f446967g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f446968h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446969i;

    public d(com.tencent.pigeon.ting.CommentInputRequest commentInputRequest, kotlin.jvm.internal.c0 c0Var, wk4.f fVar, boolean z17, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, yz5.l lVar) {
        this.f446964d = commentInputRequest;
        this.f446965e = c0Var;
        this.f446966f = fVar;
        this.f446967g = z17;
        this.f446968h = finderCommentInfo;
        this.f446969i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView replyBtn;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.tencent.pigeon.ting.CommentInputRequest commentInputRequest = this.f446964d;
        java.lang.Boolean show = commentInputRequest.getShow();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = kotlin.jvm.internal.o.b(show, bool);
        kotlin.jvm.internal.c0 c0Var = this.f446965e;
        wk4.f fVar = this.f446966f;
        if (b17 && c0Var.f310112d && !fVar.f446979i) {
            wk4.f.a(fVar, commentInputRequest);
        } else if (this.f446967g) {
            wk4.f.a(fVar, commentInputRequest);
        }
        boolean z17 = fVar.f446979i;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f446968h;
        if (z17) {
            wk4.f.c(fVar, finderCommentInfo, c0Var.f310112d);
        }
        fVar.h(commentInputRequest);
        if (kotlin.jvm.internal.o.b(commentInputRequest.getShow(), bool)) {
            wk4.f.c(fVar, finderCommentInfo, c0Var.f310112d);
            boolean z18 = c0Var.f310112d;
            fVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "showCommentInputView needInitCommentFooter: " + z18 + " showInputBar: " + fVar.f446979i);
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = fVar.f446974d;
            if (tingCommentFooter != null && z18 && !fVar.f446980j && (inputMethodManager = (android.view.inputmethod.InputMethodManager) tingCommentFooter.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(tingCommentFooter.getEditText(), 0);
            }
        } else {
            wk4.f.b(fVar);
        }
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter2 = fVar.f446974d;
        if (tingCommentFooter2 == null || (replyBtn = tingCommentFooter2.getReplyBtn()) == null) {
            return;
        }
        replyBtn.setOnClickListener(new wk4.c(fVar, finderCommentInfo, this.f446969i));
    }
}
