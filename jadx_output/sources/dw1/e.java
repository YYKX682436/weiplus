package dw1;

@j95.b
/* loaded from: classes7.dex */
public class e extends i95.w {
    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.PluginCloudVoice", "hy: account release. uninit openvoice so");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "unInit ret:" + com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c.UnInit());
    }
}
