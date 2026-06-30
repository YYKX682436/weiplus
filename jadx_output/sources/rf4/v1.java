package rf4;

/* loaded from: classes4.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f395117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView, android.content.Context context) {
        super(1);
        this.f395116d = storyMsgView;
        this.f395117e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gf4.a it = (gf4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395116d;
        if (storyMsgView.getCommentInputView().getInputType() != -1) {
            storyMsgView.getCommentInputView().b();
        } else {
            java.lang.String e17 = ef4.w.f252468t.e();
            java.lang.String str = it.f271330a;
            if (com.tencent.mm.sdk.platformtools.t8.D0(e17, str)) {
                int i17 = it.f271341l;
                android.content.Context context = this.f395117e;
                java.lang.String string = i17 == 0 ? context.getResources().getString(com.tencent.mm.R.string.jln) : context.getResources().getString(com.tencent.mm.R.string.jlo);
                kotlin.jvm.internal.o.d(string);
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
                u1Var.g(string);
                u1Var.n(context.getString(com.tencent.mm.R.string.f490367t0));
                u1Var.k(-65536);
                u1Var.a(true);
                u1Var.b(new rf4.u1(storyMsgView, it));
                u1Var.q(false);
            } else {
                storyMsgView.f172022t = str;
                storyMsgView.f172024v = it.f271334e;
                storyMsgView.commentInputView.d(storyMsgView.f172027y, str, true);
                storyMsgView.commentInputView.e(0, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
