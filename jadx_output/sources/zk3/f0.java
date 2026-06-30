package zk3;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f473447d;

    public f0(java.util.List list) {
        this.f473447d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> list = this.f473447d;
        if (list != null) {
            for (com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo : list) {
                com.tencent.mm.plugin.multitask.u0 u0Var = com.tencent.mm.plugin.multitask.u0.f150506a;
                java.lang.String str = multiTaskInfo != null ? multiTaskInfo.field_id : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.plugin.multitask.v0.f150612a + str;
                java.lang.String str3 = multiTaskInfo != null ? multiTaskInfo.field_id : null;
                java.lang.String b17 = u0Var.b(str3 != null ? str3 : "");
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    if (!com.tencent.mm.vfs.w6.j(b17)) {
                        com.tencent.mm.vfs.w6.c(str2, b17);
                    }
                    com.tencent.mm.vfs.w6.h(str2);
                }
            }
        }
        com.tencent.mm.plugin.multitask.u0 u0Var2 = com.tencent.mm.plugin.multitask.u0.f150506a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.multitask.v0.f150612a);
        if (r6Var.m()) {
            com.tencent.mm.vfs.w6.f(r6Var.o());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskTransImgFileFlag, time: false");
        com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").putBoolean("multitask_first_trans_img_path", false);
    }
}
