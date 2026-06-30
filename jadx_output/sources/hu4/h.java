package hu4;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f285229d;

    public h(hu4.g gVar, android.content.Intent intent) {
        this.f285229d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f285229d;
        if (intent.getIntExtra("retCode", -1) != 1) {
            com.tencent.mm.plugin.walletlock.model.n.INSTANCE.h();
            com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent = new com.tencent.mm.autogen.events.WalletLockProtectEvent();
            walletLockProtectEvent.f54960g.f7392a = 5;
            walletLockProtectEvent.e();
            return;
        }
        android.content.Intent intent2 = (android.content.Intent) intent.getParcelableExtra("page_intent");
        if (intent2 == null) {
            com.tencent.mm.plugin.walletlock.model.n.INSTANCE.h();
            com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent2 = new com.tencent.mm.autogen.events.WalletLockProtectEvent();
            walletLockProtectEvent2.f54960g.f7392a = 5;
            walletLockProtectEvent2.e();
            return;
        }
        com.tencent.mm.plugin.walletlock.model.n nVar = com.tencent.mm.plugin.walletlock.model.n.INSTANCE;
        nVar.j(true);
        nVar.k(true);
        android.content.Context n17 = com.tencent.mm.app.w.INSTANCE.n();
        if (n17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(n17, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            n17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(n17, "com/tencent/mm/plugin/walletlock/gesture/model/GestureImpl$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
