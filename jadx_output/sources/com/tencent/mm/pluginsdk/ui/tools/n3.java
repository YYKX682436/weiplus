package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class n3 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191789d;

    public n3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191789d = fileSelectorUI;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onTabReselected() called with: tab = " + iVar);
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.pluginsdk.ui.tools.j7)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onTabReselected " + obj);
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onTabUnselected() called with: tab = " + iVar);
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.pluginsdk.ui.tools.j7)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onTabUnselected " + obj);
        ((com.tencent.mm.pluginsdk.ui.tools.j7) obj).a(false);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "onTabSelected() called with: tab = " + iVar);
        com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191789d;
        fileSelectorUI.getClass();
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.pluginsdk.ui.tools.j7)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTabSelected item ");
        com.tencent.mm.pluginsdk.ui.tools.j7 j7Var = (com.tencent.mm.pluginsdk.ui.tools.j7) obj;
        int i17 = j7Var.f191738c;
        sb6.append(i17);
        sb6.append(" selected");
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", sb6.toString());
        j7Var.a(false);
        if (i17 == 4) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(145, new com.tencent.mm.pluginsdk.ui.tools.s2(obj, iVar, fileSelectorUI, i17), "android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        j7Var.a(true);
        iVar.b();
        fileSelectorUI.j7(i17);
    }
}
