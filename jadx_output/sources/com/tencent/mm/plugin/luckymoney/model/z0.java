package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class z0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public long f145727d;

    public z0() {
        super(0);
    }

    public static void b(com.tencent.mm.plugin.luckymoney.model.z0 z0Var, java.lang.String str) {
        z0Var.getClass();
        long k17 = com.tencent.mm.vfs.w6.k(str);
        if (k17 >= z0Var.f145727d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download finish, file is exists");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download finish, and realLength:%s < voiceFileLength:%s, need to delete", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(z0Var.f145727d));
            com.tencent.mm.vfs.w6.h(str);
        }
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent c2CNYPredownloadVoiceEvent = (com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() acc not ready!");
            return false;
        }
        if (!(c2CNYPredownloadVoiceEvent instanceof com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() receive C2CNYPredownloadVoiceEvent event!");
        am.n1 n1Var = c2CNYPredownloadVoiceEvent.f54023g;
        this.f145727d = n1Var.f7391c;
        com.tencent.mm.plugin.luckymoney.model.e5.c(n1Var.f7389a, n1Var.f7390b, new com.tencent.mm.plugin.luckymoney.model.y0(this));
        return false;
    }
}
