package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class o0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117291a;

    public o0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        this.f117291a = a1Var;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.Integer M;
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117291a;
        java.lang.String str = a1Var.f116871d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkLivePermission() requestCode=");
        sb6.append(i17);
        sb6.append(" permissions=");
        sb6.append(strArr);
        sb6.append(" grantResults=");
        kotlin.jvm.internal.o.d(iArr);
        sb6.append(kz5.z.M(iArr));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if ((!(iArr.length == 0)) && (M = kz5.z.M(iArr)) != null && M.intValue() == 0) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.f(9, a1Var.f116884t);
            a1Var.a7();
        }
    }
}
