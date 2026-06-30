package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes11.dex */
public class j extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f150289a;

    public j(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.f150289a = multiTalkMainUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(43);
        } else {
            int i18 = com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.D;
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f150289a;
            multiTalkMainUI.getClass();
            multiTalkMainUI.getClass();
        }
    }
}
