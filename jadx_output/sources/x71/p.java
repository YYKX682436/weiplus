package x71;

@j95.b(dependencies = {c42.l.class})
/* loaded from: classes7.dex */
public class p extends i95.w implements x71.n {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAi", "Plugin ai onAccountInitialized [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAi", "Plugin ai onAccountRelease [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        gm0.j1.p().a();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAi", "Plugin ai execute IAiService [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    public java.lang.String toString() {
        return "plugin-ai";
    }
}
