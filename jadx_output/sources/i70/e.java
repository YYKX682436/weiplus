package i70;

/* loaded from: classes12.dex */
public final class e extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        rk0.c.c("MicroMsg.IILinkStreamFeatureService", "ILinkStream onAppForeground", new java.lang.Object[0]);
        com.tencent.wechat.aff.ilink_stream.p.f217294b.foregroundChanged(true);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        rk0.c.c("MicroMsg.IILinkStreamFeatureService", "ILinkStream onAppBackground", new java.lang.Object[0]);
        com.tencent.wechat.aff.ilink_stream.p.f217294b.foregroundChanged(false);
    }
}
