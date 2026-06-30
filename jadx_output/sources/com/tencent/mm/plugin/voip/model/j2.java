package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class j2 implements kh3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176687a;

    public j2(com.tencent.mm.plugin.voip.model.h2 h2Var) {
        this.f176687a = h2Var;
    }

    @Override // kh3.e
    public void a(int i17, int i18) {
        int handleCommand;
        if (i18 == 3 && i17 == 1 && (handleCommand = this.f176687a.f176558a.f176411a.f176532x.handleCommand(2, null, 0)) < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipService", "v2protocal handlecommand failed ret:" + handleCommand);
        }
    }
}
