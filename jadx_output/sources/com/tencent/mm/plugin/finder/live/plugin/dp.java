package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f112315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.n f112316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, int i17, com.tencent.mm.plugin.finder.live.util.n nVar) {
        super(0);
        this.f112315d = dqVar;
        this.f112316e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f112315d;
        dqVar.getClass();
        dk2.u7.f234181a.h(dqVar.f112325r, false);
        if (dqVar.f112325r != null) {
            java.lang.Object obj = dqVar.f112324q;
            if (obj instanceof android.os.Vibrator) {
                ((android.os.Vibrator) obj).vibrate(50L);
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn finderLiveGiftSendBtn = dqVar.M;
            pm0.v.C(finderLiveGiftSendBtn.singleClickPagTask);
            finderLiveGiftSendBtn.c(this.f112316e == com.tencent.mm.plugin.finder.live.util.n.f115634g);
        }
        return jz5.f0.f302826a;
    }
}
