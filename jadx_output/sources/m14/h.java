package m14;

/* loaded from: classes11.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f322875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m14.j f322876e;

    public h(m14.j jVar, java.util.ArrayList arrayList) {
        this.f322876e = jVar;
        this.f322875d = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 5, 4, "");
        m14.j jVar = this.f322876e;
        m14.f fVar = jVar.f322878d;
        fVar.f322871c = true;
        fVar.f322872d.cancel();
        java.util.ArrayList<java.lang.String> arrayList = this.f322875d;
        if (arrayList.size() > 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putStringArrayListExtra("key_conversation_list", arrayList);
            j45.l.u(jVar.f322878d.f322869a, ".ui.conversation.SettingCheckUnProcessWalletConvUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", arrayList.get(0));
            intent2.addFlags(67108864);
            j45.l.u(jVar.f322878d.f322869a, ".ui.chatting.ChattingUI", intent2, null);
        }
    }
}
