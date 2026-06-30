package pr;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpr/c1;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class c1 implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f357696d = "MicroMsg.EmojiSyncLoaderIPC_data";

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String str = this.f357696d;
        com.tencent.mars.xlog.Log.i(str, "invoke: get data");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle == null) {
            if (rVar != null) {
                rVar.a(bundle2);
                return;
            }
            return;
        }
        int i17 = bundle.getInt("custom_type");
        bundle2.putParcelable(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, pr.k0.f357723q.c(i17));
        com.tencent.mars.xlog.Log.i(str, "invoke get data: " + i17);
        if (rVar != null) {
            rVar.a(bundle2);
        }
    }
}
