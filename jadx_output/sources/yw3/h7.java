package yw3;

/* loaded from: classes11.dex */
public final class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI f466764d;

    public h7(com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI repairerTextStatusShowConfigUI) {
        this.f466764d = repairerTextStatusShowConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.LinkedList<bw5.sm0> linkedList;
        java.util.LinkedList linkedList2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((we0.c1) ((xe0.f0) i95.n0.c(xe0.f0.class))).getClass();
        if ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && ai4.b0.f5125c) {
            java.util.Set set = si4.c.f408316c;
            bw5.um0 selectStatusInfoWithUsername = com.tencent.wechat.aff.status.StatusStorageManager.getInstance().selectStatusInfoWithUsername("", 0, -1, -1L);
            int size = (selectStatusInfoWithUsername == null || (linkedList2 = selectStatusInfoWithUsername.f33987g) == null) ? 0 : linkedList2.size();
            if (selectStatusInfoWithUsername == null || (linkedList = selectStatusInfoWithUsername.f33987g) == null) {
                i17 = 0;
            } else {
                i17 = 0;
                for (bw5.sm0 sm0Var : linkedList) {
                    if (com.tencent.wechat.aff.status.StatusStorageManager.getInstance().deleteStatusInfoWithId(sm0Var.getStatusId(), sm0Var.f33059o).f33984d) {
                        i17++;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "debugClearAffDB: origin size=" + size + ", deleteCount=" + i17);
            com.tencent.wechat.aff.status.StatusLogicCommentManager.getInstance().clearAllMessage();
        }
        android.widget.Toast.makeText(this.f466764d.getContext(), "done", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
