package th4;

/* loaded from: classes.dex */
public final /* synthetic */ class e$$a implements e75.a {
    @Override // e75.a
    public final void onChanged(java.lang.Object obj) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("PluginTeenMode", "not login, skip notifyTeenModeDataChanged().");
        } else {
            com.tencent.mars.xlog.Log.i("PluginTeenMode", "ProfileUpdateEvent observer");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        }
    }
}
