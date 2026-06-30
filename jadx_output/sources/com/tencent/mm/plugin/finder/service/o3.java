package com.tencent.mm.plugin.finder.service;

/* loaded from: classes.dex */
public final class o3 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f126164d;

    public o3(yz5.l lVar) {
        this.f126164d = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        yz5.l lVar = this.f126164d;
        if (i17 != 1100 || i18 != -1) {
            lVar.invoke(null);
            return;
        }
        android.os.Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("key_pick_addr") : null;
        com.tencent.mm.modelgeo.Addr addr = parcelableExtra instanceof com.tencent.mm.modelgeo.Addr ? (com.tencent.mm.modelgeo.Addr) parcelableExtra : null;
        if (addr != null) {
            r45.ze2 ze2Var = new r45.ze2();
            java.lang.String c17 = addr.c();
            if (c17 == null) {
                c17 = "";
            }
            ze2Var.set(3, c17);
            java.lang.String str = addr.f71214g;
            if (str == null) {
                str = "";
            }
            ze2Var.set(2, str);
            ze2Var.set(1, java.lang.Float.valueOf(addr.f71224t));
            ze2Var.set(0, java.lang.Float.valueOf(addr.f71225u));
            java.lang.String str2 = addr.f71211d;
            ze2Var.set(4, str2 != null ? str2 : "");
            lVar.invoke(ze2Var);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.invoke(null);
        }
    }
}
