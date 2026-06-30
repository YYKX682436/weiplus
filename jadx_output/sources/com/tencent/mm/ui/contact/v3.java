package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class v3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.a4 f207215d;

    public v3(com.tencent.mm.ui.contact.a4 a4Var) {
        this.f207215d = a4Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.ui.contact.a4 a4Var = this.f207215d;
        if (!a4Var.f206584h.e()) {
            a4Var.f206584h.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = a4Var.f206584h;
        long j17 = a4Var.f206586m ? 500L : 1000L;
        b4Var.c(j17, j17);
    }
}
