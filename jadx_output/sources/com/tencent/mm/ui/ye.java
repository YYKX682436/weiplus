package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ye implements d70.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f212587a;

    public ye(com.tencent.mm.ui.he heVar) {
        this.f212587a = heVar;
    }

    @Override // d70.j
    public void a(com.tencent.mm.storage.u3 u3Var, int i17, java.lang.String str) {
        if (u3Var == com.tencent.mm.storage.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC) {
            this.f212587a.b();
        }
    }

    @Override // d70.j
    public void b(int i17, int i18, java.lang.String str) {
        com.tencent.mm.ui.he heVar = this.f212587a;
        if (i17 == 262145 || i17 == 262156 || i17 == 262152 || i17 == 266260 || i17 == 266267) {
            heVar.b();
        }
        if (i17 == 262147 || i17 == 262149 || i17 == 352279 || i17 == 352280) {
            heVar.b();
        }
    }
}
