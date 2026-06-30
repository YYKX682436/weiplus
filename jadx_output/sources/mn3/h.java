package mn3;

@j95.b
/* loaded from: classes8.dex */
public final class h extends jm0.o implements ra0.u {
    public void Zi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeAffService", "registerAffFinderSyncCppToNativeManager");
        com.tencent.wechat.aff.newlife.SyncCppToNativeOnLoader.getInstance().registerAffFinderCppToNativeManager(mn3.a.class);
    }

    public void aj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeAffService", "registerAffSyncCppToNativeManager");
        com.tencent.wechat.aff.newlife.SyncCppToNativeOnLoader.getInstance().registerAffSyncCppToNativeManager(mn3.c.class);
    }
}
