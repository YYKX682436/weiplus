package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f120291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f120293c;

    public x5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, boolean z17, boolean z18) {
        this.f120291a = d6Var;
        this.f120292b = z17;
        this.f120293c = z18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.y63 y63Var;
        r45.y63 y63Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f120291a;
        d6Var.f118072n = false;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.yq1 yq1Var = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            d6Var.f118068j = yq1Var;
            d6Var.f118070l = (yq1Var == null || (y63Var2 = (r45.y63) yq1Var.getCustom(0)) == null) ? null : y63Var2.getString(2);
            r45.yq1 yq1Var2 = d6Var.f118068j;
            d6Var.f118071m = (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.getCustom(0)) == null) ? false : y63Var.getBoolean(1);
            boolean z17 = this.f120293c;
            boolean z18 = this.f120292b;
            if (z18) {
                com.tencent.mm.plugin.finder.live.widget.d6.a(d6Var);
            } else if (z17) {
                d6Var.j();
            } else {
                com.tencent.mm.plugin.finder.live.widget.d6.b(d6Var);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetGameTeamInfo hasContinue: ");
            sb6.append(d6Var.f118071m);
            sb6.append(", hasLastBuffer: ");
            sb6.append(d6Var.f118070l != null);
            sb6.append(", isLoadMore: ");
            sb6.append(z18);
            sb6.append(", isResume: ");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i(d6Var.f118062d, sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
