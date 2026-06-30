package dk5;

/* loaded from: classes9.dex */
public class x2 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk5.p7 f234988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234989c;

    public x2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str, dk5.p7 p7Var) {
        this.f234989c = selectConversationUI;
        this.f234987a = str;
        this.f234988b = p7Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234989c;
        if (z17) {
            java.lang.String str2 = this.f234987a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
                selectConversationUI.W7();
            } else {
                int i19 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
                selectConversationUI.X7(str2);
            }
        }
        selectConversationUI.hideVKB();
        this.f234988b.b(z17, str, i17, false);
    }
}
