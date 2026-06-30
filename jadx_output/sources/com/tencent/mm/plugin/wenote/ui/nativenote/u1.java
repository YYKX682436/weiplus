package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.o1 f188279d;

    public u1(com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var) {
        this.f188279d = o1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.wenote.ui.nativenote.o1 o1Var = this.f188279d;
        o1Var.f188247d.f188244d.f188147m.a();
        iz4.a aVar = new iz4.a();
        aVar.f296104b = false;
        aVar.f296110h = false;
        o1Var.f188247d.f188244d.J1.b(aVar, false);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = o1Var.f188247d.f188244d;
        mz4.j0 j0Var = noteEditorUI.f188147m;
        int i17 = j0Var.f333309q;
        j0Var.f333309q = 3;
        java.lang.String p17 = noteEditorUI.J1.p(false);
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = o1Var.f188247d.f188244d;
        hz4.t tVar = noteEditorUI2.K1;
        r45.bq0 n17 = noteEditorUI2.J1.n(p17);
        tVar.f286454a = p17;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (n17 == null || n17.f370964f.size() <= 1) {
            linkedList = null;
        } else {
            java.util.Iterator it = n17.f370964f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                java.lang.String c17 = hz4.l.c(gp0Var);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c17) && gp0Var.I == 2 && com.tencent.mm.vfs.w6.j(c17)) {
                    r45.xp0 xp0Var = new r45.xp0();
                    xp0Var.f390305d = gp0Var.M;
                    xp0Var.f390306e = gp0Var.f375438u;
                    xp0Var.f390307f = gp0Var.f375434s;
                    linkedList2.add(xp0Var);
                }
            }
            linkedList = linkedList2;
        }
        c01.d9.e().g(new hz4.e(i17, 1, tVar.f286454a, linkedList, null));
    }
}
