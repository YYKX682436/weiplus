package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class x3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b4 f208229d;

    public x3(com.tencent.mm.ui.conversation.b4 b4Var) {
        this.f208229d = b4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.conversation.b4 b4Var = this.f208229d;
        if (!b4Var.B) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.y3(b4Var));
        return false;
    }
}
