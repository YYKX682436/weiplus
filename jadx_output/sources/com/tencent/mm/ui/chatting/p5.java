package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class p5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.q5 f202082d;

    public p5(com.tencent.mm.ui.chatting.q5 q5Var) {
        this.f202082d = q5Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        db5.d5 d5Var;
        com.tencent.mm.ui.chatting.q5 q5Var = this.f202082d;
        android.view.View view = q5Var.f202610r;
        if (view != null && (d5Var = q5Var.f202599d) != null) {
            q5Var.getClass();
            d5Var.showAsDropDown(view, 0, q5Var.f202605m);
        }
        return false;
    }
}
