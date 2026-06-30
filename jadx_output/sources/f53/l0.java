package f53;

/* loaded from: classes5.dex */
public final class l0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259673e;

    public l0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI, java.lang.String str) {
        this.f259672d = postCommentDialogUI;
        this.f259673e = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.d(1001, b3.l.getColor(this.f259672d, com.tencent.mm.R.color.a2y), this.f259673e);
    }
}
