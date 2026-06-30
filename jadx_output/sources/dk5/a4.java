package dk5;

/* loaded from: classes.dex */
public class a4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234495d;

    public a4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234495d = selectConversationUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234495d;
        g4Var.f(1, selectConversationUI.getString(com.tencent.mm.R.string.iez));
        g4Var.f(2, selectConversationUI.getString(com.tencent.mm.R.string.f492953if0));
    }
}
