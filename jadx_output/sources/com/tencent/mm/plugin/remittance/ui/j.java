package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public r45.uq0 f157772a = null;

    /* renamed from: b, reason: collision with root package name */
    public r45.wo f157773b;

    public void a(java.lang.String str) {
        this.f157772a = null;
        if (str == null) {
            this.f157772a = null;
            return;
        }
        r45.wo woVar = this.f157773b;
        if (woVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavorInfoPicked", "error setSelectFavorComposeId currentFavorResp is null");
            this.f157772a = null;
            return;
        }
        java.util.Iterator it = woVar.f389327e.iterator();
        while (it.hasNext()) {
            r45.uq0 uq0Var = (r45.uq0) it.next();
            if (str.equals(uq0Var.f387564d)) {
                this.f157772a = uq0Var;
                return;
            }
        }
    }
}
