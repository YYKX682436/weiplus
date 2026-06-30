package dk5;

/* loaded from: classes9.dex */
public class e3 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk5.p7 f234604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234605d;

    public e3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str, android.view.View view, dk5.p7 p7Var) {
        this.f234605d = selectConversationUI;
        this.f234602a = str;
        this.f234603b = view;
        this.f234604c = p7Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234605d;
        if (z17) {
            java.lang.String str2 = this.f234602a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
                selectConversationUI.W7();
            } else {
                int i19 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
                selectConversationUI.X7(str2);
            }
        }
        selectConversationUI.hideVKB();
        java.lang.Object tag = this.f234603b.getTag(com.tencent.mm.R.id.a0m);
        this.f234604c.b(z17, str, i17, tag == null ? false : ((java.lang.Boolean) tag).booleanValue());
    }
}
