package yw4;

/* loaded from: classes7.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw4.u f466993d;

    public t(yw4.u uVar) {
        this.f466993d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[9];
        yw4.u uVar = this.f466993d;
        zq1.j0 j0Var = uVar.f466996c;
        objArr[0] = j0Var != null ? j0Var.f475004j : null;
        objArr[1] = java.lang.Integer.valueOf(j0Var != null ? j0Var.f474998d : 0);
        zq1.j0 j0Var2 = uVar.f466996c;
        objArr[2] = java.lang.Integer.valueOf(j0Var2 != null ? j0Var2.f475002h : 0);
        java.lang.String str = uVar.f466995b;
        objArr[3] = str;
        objArr[4] = com.tencent.mm.plugin.webview.webcompt.a.a(str);
        objArr[5] = java.lang.Long.valueOf(uVar.f466997d);
        objArr[6] = java.lang.Long.valueOf(uVar.f466998e);
        objArr[7] = java.lang.Integer.valueOf(uVar.f466999f);
        objArr[8] = 1;
        g0Var.d(25512, objArr);
    }
}
