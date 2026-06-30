package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class e7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.f7 f206689d;

    public e7(com.tencent.mm.ui.contact.f7 f7Var) {
        this.f206689d = f7Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.contact.f7 f7Var = this.f206689d;
        java.lang.String obj = f7Var.f206707e.f206506h.getText().toString();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            f7Var.f206707e.f206505g.setVisible(com.tencent.mm.sdk.platformtools.t8.K0(obj));
        }
        com.tencent.mm.ui.contact.j7 j7Var = f7Var.f206707e.f206503e;
        if (!j7Var.f206965q.equalsIgnoreCase(obj)) {
            j7Var.f206965q = obj;
        }
        j7Var.s();
        return false;
    }
}
