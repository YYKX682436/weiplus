package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes12.dex */
public class i0 implements va3.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.p0 f144829a;

    public i0(com.tencent.mm.plugin.location.ui.impl.p0 p0Var) {
        this.f144829a = p0Var;
    }

    public void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "7", "", 0, 0);
        za3.b1 b1Var = this.f144829a.Z;
        b1Var.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = i17 == 0 ? context.getString(com.tencent.mm.R.string.ggl) : i17 == 1 ? context.getString(com.tencent.mm.R.string.ggq) : i17 == 2 ? context.getString(com.tencent.mm.R.string.ggr) : null;
        }
        db5.e1.E(b1Var.f470892a, str, "", b1Var.f470894c.getString(com.tencent.mm.R.string.f490507x1), false, new za3.z0(b1Var, i17));
    }
}
