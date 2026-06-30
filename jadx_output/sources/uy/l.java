package uy;

/* loaded from: classes8.dex */
public class l implements hh4.j {
    @Override // hh4.j
    public void k0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        boolean z17 = md5.b.A;
        if (multiTaskInfo.field_data == null) {
            return;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        r45.qs0 qs0Var = new r45.qs0();
        try {
            qs0Var.parseFrom(multiTaskInfo.field_data);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "FileMultiTaskData parse error");
        }
        java.lang.String string = qs0Var.getString(1);
        if (!com.tencent.mm.vfs.w6.j(string)) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context2);
            u1Var.u("");
            u1Var.g(context2.getString(com.tencent.mm.R.string.cfe));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(multiTaskInfo.field_id, true, 0);
            return;
        }
        r45.w60 w60Var = new r45.w60();
        w60Var.set(2, java.lang.Boolean.TRUE);
        if (!qs0Var.getBoolean(0)) {
            java.lang.String string2 = qs0Var.getString(2);
            java.lang.String string3 = qs0Var.getString(3);
            boolean z18 = qs0Var.getBoolean(6);
            java.lang.String string4 = qs0Var.getString(4);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).v7(context2, string, string2, string3, z18, string4);
                return;
            }
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            java.lang.String string5 = multiTaskInfo.v0().getString(1);
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.j(0L, "", string, string2, string5, 12, w60Var);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context2, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        al3.d.a(intent, qs0Var);
        try {
            intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", e17, "onTaskBarItemClicked", new java.lang.Object[0]);
        }
        intent.getExtras().putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 12);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/ui/chatting/multitask/FilesPageMultiTaskHelper", "onTaskBarItemClicked", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // hh4.j
    public void p0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
    }
}
