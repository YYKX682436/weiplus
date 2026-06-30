package q50;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f360149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, in5.s0 s0Var) {
        super(0);
        this.f360148d = str;
        this.f360149e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f360148d;
        boolean R4 = com.tencent.mm.storage.z3.R4(str);
        in5.s0 s0Var = this.f360149e;
        if (R4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("RoomInfo_Id", str);
            intent.putExtra("Is_Chatroom", true);
            intent.putExtra("fromChatting", true);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.f20922a.f20924a = s0Var.f293121e;
            cVar.e(true);
            cVar.c(false);
            cVar.a(com.tencent.mm.feature.forward.ui.PreviewProfileUI.class.getName());
            cVar.g();
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            j45.l.j(s0Var.f293121e, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
        }
        return jz5.f0.f302826a;
    }
}
