package w43;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.plugin.webview.model.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask f442890a;

    public a(com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask addShortcutTask) {
        this.f442890a = addShortcutTask;
    }

    @Override // com.tencent.mm.plugin.webview.model.h0
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask addShortcutTask = this.f442890a;
        addShortcutTask.f139568h = z17;
        addShortcutTask.c();
    }
}
