package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class u2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.v2 f200047d;

    public u2(com.tencent.mm.ui.chatting.component.v2 v2Var) {
        this.f200047d = v2Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str != null) {
            com.tencent.mm.ui.chatting.component.v2 v2Var = this.f200047d;
            if (str.equals(v2Var.f198580d.x()) || str.equals("*")) {
                v2Var.q0();
            }
        }
    }
}
