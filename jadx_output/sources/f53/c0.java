package f53;

/* loaded from: classes5.dex */
public final class c0 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259637a;

    public c0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259637a = postCommentDialogUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        this.f259637a.Z6(java.lang.String.valueOf(str));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259637a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        if (mMEditText.getInputConnection() != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = postCommentDialogUI.f140012e;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText2.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = postCommentDialogUI.f140012e;
            if (mMEditText3 != null) {
                mMEditText3.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
            } else {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
