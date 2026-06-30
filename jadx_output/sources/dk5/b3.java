package dk5;

/* loaded from: classes9.dex */
public class b3 implements dk5.o7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234527e;

    public b3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.content.Intent intent, java.lang.String str, java.lang.String str2, android.view.View view) {
        this.f234527e = selectConversationUI;
        this.f234523a = intent;
        this.f234524b = str;
        this.f234525c = str2;
        this.f234526d = view;
    }

    @Override // dk5.o7
    public void a(boolean z17, java.lang.String str, int i17, boolean z18) {
        android.content.Intent intent = this.f234523a;
        intent.putExtra("KSendGroupToDo", z18);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234527e;
        if (z17) {
            selectConversationUI.f211012y2 = str;
            java.lang.String str2 = this.f234524b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                selectConversationUI.W7();
            } else {
                selectConversationUI.X7(str2);
            }
            intent.putExtra("custom_send_text", str);
            selectConversationUI.a8(-1, intent);
            selectConversationUI.finish();
        } else {
            int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
            selectConversationUI.a8(0, intent);
            if (selectConversationUI.f210991k2) {
                selectConversationUI.finish();
            }
        }
        k01.u0 u0Var = (k01.u0) i95.n0.c(k01.u0.class);
        ((ij1.j) u0Var).Ui(this.f234525c, this.f234526d);
    }
}
