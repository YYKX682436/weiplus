package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o2 f207714d;

    public h2(com.tencent.mm.ui.conversation.o2 o2Var) {
        this.f207714d = o2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.conversation.o2 o2Var = this.f207714d;
        if (!o2Var.F) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.i2(o2Var));
        return false;
    }
}
