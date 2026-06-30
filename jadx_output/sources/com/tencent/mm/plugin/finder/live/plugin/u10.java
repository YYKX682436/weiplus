package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u10 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f114510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f114511b;

    public u10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, r45.h32 h32Var) {
        this.f114510a = z10Var;
        this.f114511b = h32Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = this.f114510a.f115256e;
            r45.h32 h32Var = this.f114511b;
            java.lang.String string = h32Var.getString(4);
            if (string == null) {
                string = "";
            }
            r45.ov2 a17 = zl2.t.a(h32Var);
            bf2.c.c(cVar, eVar, 1, 1, string, 0, a17 != null ? a17.getString(1) : null, 0, 0, null, 0, sb1.a.CTRL_INDEX, null);
        }
    }
}
