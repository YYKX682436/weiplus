package sm2;

/* loaded from: classes3.dex */
public final class n4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409589d;

    public n4(sm2.o4 o4Var) {
        this.f409589d = o4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.t8 t8Var;
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var;
        sm2.o4 o4Var = this.f409589d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = o4Var.f409622l;
        boolean z17 = false;
        if (khVar != null && khVar.w0() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.kh khVar2 = o4Var.f409622l;
            if (khVar2 != null) {
                khVar2.v1(((mm2.e1) o4Var.c(mm2.e1.class)).f328988r.getInteger(4));
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar3 = o4Var.f409622l;
            if (khVar3 != null) {
                khVar3.w1();
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z18 = ((mm2.e1) o4Var.c(mm2.e1.class)).b7() && ((mm2.c1) o4Var.c(mm2.c1.class)).T1 >= 0 && ((om2.l) o4Var.c(om2.l.class)).f346343h;
            if (zl2.r4.f473950a.f2(o4Var.f19609a)) {
                linkedList.add(new jz5.l(6, null));
                linkedList.add(new jz5.l(3, null));
            } else if (((mm2.e1) o4Var.c(mm2.e1.class)).t7()) {
                linkedList.add(new jz5.l(3, null));
            } else {
                jz5.l lVar = new jz5.l(2, null);
                jz5.l lVar2 = new jz5.l(1, null);
                jz5.l lVar3 = new jz5.l(3, null);
                jz5.l lVar4 = new jz5.l(4, null);
                if (mm2.g0.Q6((mm2.g0) o4Var.c(mm2.g0.class), null, 1, null)) {
                    linkedList.add(lVar2);
                } else {
                    linkedList.add(lVar);
                }
                linkedList.add(lVar3);
                if (((mm2.c1) o4Var.c(mm2.c1.class)).f328862p3 && ((mm2.c1) o4Var.c(mm2.c1.class)).m7()) {
                    linkedList.add(lVar4);
                }
                if (z18) {
                    linkedList.add(new jz5.l(7, null));
                    if (linkedList.size() >= 4) {
                        linkedList.remove(lVar);
                    }
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar4 = o4Var.f409622l;
            if (khVar4 != null) {
                khVar4.A1(linkedList, true, false);
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = o4Var.f409639y;
        if ((v6Var2 != null && v6Var2.w0() == 0) && (v6Var = o4Var.f409639y) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.u6(v6Var, ((mm2.c1) o4Var.c(mm2.c1.class)).J1));
        }
        com.tencent.mm.plugin.finder.live.plugin.t8 t8Var2 = o4Var.U;
        if (t8Var2 != null && t8Var2.w0() == 0) {
            z17 = true;
        }
        if (z17 && (t8Var = o4Var.U) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.p8(t8Var));
        }
        return true;
    }
}
