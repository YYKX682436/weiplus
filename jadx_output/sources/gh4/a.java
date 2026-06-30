package gh4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgh4/a;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f271912d = "MicroMsg.TaskBar.AddTaskInfoTask";

    public a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.AddTaskInfoTask", "create add task info");
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (gm0.j1.a() && bundle != null) {
            java.lang.String string = bundle.getString(dm.i4.COL_ID);
            int i17 = bundle.getInt("type");
            byte[] byteArray = bundle.getByteArray("showData");
            int i18 = bundle.getInt("addType");
            boolean z17 = bundle.getBoolean("updateBitmapOnly");
            if (string == null || byteArray == null) {
                return;
            }
            r45.lr4 lr4Var = new r45.lr4();
            try {
                lr4Var.parseFrom(byteArray);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String string2 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (string2 == null) {
                string2 = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                gh4.l0 l0Var = gh4.l0.f271938a;
                java.lang.String c17 = l0Var.c(string);
                if (com.tencent.mm.vfs.w6.j(c17)) {
                    com.tencent.mm.vfs.w6.h(c17);
                }
                java.lang.String str = gh4.m0.f271939a + string;
                if (com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mm.vfs.w6.h(str);
                }
                com.tencent.mm.vfs.w6.w(string2, c17);
                com.tencent.mars.xlog.Log.i(this.f271912d, "move tempPath:" + string2 + " to path:" + c17);
                if (lh4.n.f318719e.b(i17)) {
                    o11.g SNAPSHOT_LOADER_OPTION = gh4.j0.f271934b;
                    kotlin.jvm.internal.o.f(SNAPSHOT_LOADER_OPTION, "SNAPSHOT_LOADER_OPTION");
                    n11.a.b().p(l0Var.b(c17, SNAPSHOT_LOADER_OPTION));
                }
            }
            if (i18 == 1) {
                ((gh4.e0) i95.n0.c(gh4.e0.class)).wi(string, i17, lr4Var, bundle.getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            } else {
                if (i18 != 2) {
                    return;
                }
                ((gh4.e0) i95.n0.c(gh4.e0.class)).Zi(string, i17, lr4Var, bundle.getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), z17);
            }
        }
    }
}
