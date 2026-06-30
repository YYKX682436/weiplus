package gh4;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f271936d;

    public k0(java.util.List list) {
        this.f271936d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> list = this.f271936d;
        if (list != null) {
            for (com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo : list) {
                kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
                java.lang.String field_id = multiTaskInfo.field_id;
                kotlin.jvm.internal.o.f(field_id, "field_id");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = gh4.m0.f271939a;
                sb6.append(gh4.m0.f271939a);
                sb6.append(field_id);
                java.lang.String sb7 = sb6.toString();
                java.lang.String field_id2 = multiTaskInfo.field_id;
                kotlin.jvm.internal.o.f(field_id2, "field_id");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String str2 = gh4.m0.f271939a;
                sb8.append(gh4.m0.f271940b);
                sb8.append(field_id2);
                java.lang.String sb9 = sb8.toString();
                if (com.tencent.mm.vfs.w6.j(sb7)) {
                    if (!com.tencent.mm.vfs.w6.j(sb9)) {
                        com.tencent.mm.vfs.w6.c(sb7, sb9);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarLogic", "oldSrcImgPath:" + sb7 + ", newSrcImgPath:" + sb9);
                    com.tencent.mm.vfs.w6.h(sb7);
                }
            }
        }
        java.lang.String str3 = gh4.m0.f271939a;
        if (com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mm.vfs.w6.f(str3);
        }
        o11.g gVar = gh4.j0.f271933a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarConfig", "setTaskBarRecentFirstTransImgPathFlag flag:%b", java.lang.Boolean.FALSE);
        com.tencent.mm.sdk.platformtools.o4.M("taskbar_config").putBoolean("taskbar_recent_first_trans_image_path", false);
    }
}
