package gh4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgh4/b;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.ipcinvoker.j {
    public b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.DeleteTaskInfoTask", "create delete task info");
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String string;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (!gm0.j1.a() || bundle == null || (string = bundle.getString(dm.i4.COL_ID)) == null) {
            return;
        }
        ((gh4.e0) i95.n0.c(gh4.e0.class)).Ui(string, true, bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
    }
}
