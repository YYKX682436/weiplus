package vw3;

/* loaded from: classes10.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.m implements yz5.l {
    public t0(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ix3.a2 p07 = (ix3.a2) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = (com.tencent.mm.plugin.repairer.ui.RepairerFileListUI) this.receiver;
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.f;
        repairerFileListUI.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof ix3.k1)) {
            repairerFileListUI.setMMTitle(p07.f295360e);
            em.z2 V6 = repairerFileListUI.V6();
            if (V6.f254985b == null) {
                V6.f254985b = (android.widget.TextView) V6.f254984a.findViewById(com.tencent.mm.R.id.f485084rq4);
            }
            V6.f254985b.setText("文件夹路径：" + p07.f295361f);
        }
        j75.d dVar2 = p07.f298066d;
        if (dVar2 != null && (dVar2 instanceof ix3.m1)) {
            ix3.m1 m1Var = (ix3.m1) dVar2;
            com.tencent.mm.vfs.x1 x1Var = m1Var.f295494b.f295479d;
            if (x1Var.f213236f) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(p07.f295361f, x1Var.f213232b);
                android.content.Intent intent = new android.content.Intent((android.content.Context) repairerFileListUI, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, m1Var.f295494b.f295479d.f213232b);
                intent.putExtra("dirPath", r6Var.o());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(repairerFileListUI, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerFileListUI", "observeState", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                repairerFileListUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(repairerFileListUI, "com/tencent/mm/plugin/repairer/ui/RepairerFileListUI", "observeState", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerFileState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        j75.d dVar3 = p07.f298066d;
        if (dVar3 != null && (dVar3 instanceof ix3.o1)) {
            ix3.o1 o1Var = (ix3.o1) dVar3;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) repairerFileListUI.getContext(), 0, false);
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(p07.f295361f, o1Var.f295514b.f295479d.f213232b);
            k0Var.f211872n = new vw3.k0(repairerFileListUI, r6Var2);
            k0Var.f211881s = new vw3.q0(r6Var2, repairerFileListUI, o1Var, p07);
            k0Var.v();
        }
        return jz5.f0.f302826a;
    }
}
