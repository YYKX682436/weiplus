package rk4;

/* loaded from: classes.dex */
public final class v2 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.ContactInfoWrap f397017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f397018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397019d;

    public v2(java.lang.String str, com.tencent.pigeon.ting.ContactInfoWrap contactInfoWrap, rk4.l3 l3Var, yz5.l lVar) {
        this.f397016a = str;
        this.f397017b = contactInfoWrap;
        this.f397018c = l3Var;
        this.f397019d = lVar;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(bundle, "<anonymous parameter 2>");
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f397016a);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", this.f397017b.getContactId());
            j45.l.v(this.f397018c.f396817e, ".ui.transmit.MsgRetransmitUI", intent, 1006);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f397019d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17))));
    }
}
