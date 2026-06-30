package o83;

/* loaded from: classes11.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.StartIPCallEvent startIPCallEvent = (com.tencent.mm.autogen.events.StartIPCallEvent) iEvent;
        if (startIPCallEvent instanceof com.tencent.mm.autogen.events.StartIPCallEvent) {
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.class);
            intent.setFlags(268435456);
            intent.putExtra("IPCallTalkUI_contactId", startIPCallEvent.f54859g.f7667a);
            am.px pxVar = startIPCallEvent.f54859g;
            intent.putExtra("IPCallTalkUI_countryCode", pxVar.f7668b);
            intent.putExtra("IPCallTalkUI_nickname", pxVar.f7670d);
            intent.putExtra("IPCallTalkUI_phoneNumber", pxVar.f7669c);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/model/listener/StartIPCallListener", "callback", "(Lcom/tencent/mm/autogen/events/StartIPCallEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ipcall/model/listener/StartIPCallListener", "callback", "(Lcom/tencent/mm/autogen/events/StartIPCallEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
