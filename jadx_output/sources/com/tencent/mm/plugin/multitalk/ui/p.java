package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public class p extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f150293a;

    public p(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.f150293a = multiTalkMainUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Inviting) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().X();
            this.f150293a.f150233i = false;
        }
    }
}
