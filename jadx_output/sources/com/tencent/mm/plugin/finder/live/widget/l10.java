package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        super(1);
        this.f118884d = m10Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = false;
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118884d;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
            if (y1Var != null && !y1Var.f()) {
                z17 = true;
            }
            if (z17 || m10Var.H || m10Var.I) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "refresh game team fail");
            } else {
                r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
                if (fr1Var != null) {
                    com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
                    ((mm2.c1) lVar.P0(mm2.c1.class)).Y8(fr1Var);
                    ((mm2.c1) lVar.P0(mm2.c1.class)).o9(((r45.ps1) fVar.f70618d).getBoolean(3));
                    m10Var.q(fr1Var);
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh gameteam fail: ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(' ');
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
