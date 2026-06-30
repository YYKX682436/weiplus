package tm2;

/* loaded from: classes3.dex */
public final class r2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420576d;

    public r2(tm2.s2 s2Var) {
        this.f420576d = s2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var;
        tm2.s2 s2Var = this.f420576d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = s2Var.f420597l;
        boolean z17 = false;
        if (khVar != null && khVar.w0() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.kh khVar2 = s2Var.f420597l;
            if (khVar2 != null) {
                khVar2.v1(((mm2.e1) s2Var.c(mm2.e1.class)).f328988r.getInteger(4));
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar3 = s2Var.f420597l;
            if (khVar3 != null) {
                khVar3.w1();
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z18 = ((mm2.e1) s2Var.c(mm2.e1.class)).b7() && ((mm2.c1) s2Var.c(mm2.c1.class)).T1 > 0 && ((om2.l) s2Var.c(om2.l.class)).f346343h;
            if (zl2.r4.f473950a.f2(s2Var.f19609a)) {
                linkedList.add(new jz5.l(6, null));
                linkedList.add(new jz5.l(3, null));
            } else if (((mm2.e1) s2Var.c(mm2.e1.class)).t7()) {
                linkedList.add(new jz5.l(3, null));
            } else {
                if (mm2.g0.Q6((mm2.g0) s2Var.c(mm2.g0.class), null, 1, null)) {
                    linkedList.add(new jz5.l(1, null));
                } else if (!z18) {
                    linkedList.add(new jz5.l(2, null));
                }
                if (((mm2.c1) s2Var.c(mm2.c1.class)).f328862p3 && ((mm2.c1) s2Var.c(mm2.c1.class)).m7()) {
                    linkedList.add(new jz5.l(4, null));
                }
                linkedList.add(new jz5.l(3, null));
                if (z18) {
                    linkedList.add(new jz5.l(7, null));
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar4 = s2Var.f420597l;
            if (khVar4 != null) {
                khVar4.A1(linkedList, true, false);
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = s2Var.f420614y;
        if (v6Var2 != null && v6Var2.w0() == 0) {
            z17 = true;
        }
        if (z17 && (v6Var = s2Var.f420614y) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.u6(v6Var, ((mm2.c1) s2Var.c(mm2.c1.class)).J1));
        }
        return true;
    }
}
