package cw2;

/* loaded from: classes10.dex */
public final class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f223643d;

    public d5(com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout) {
        this.f223643d = finderRecordPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f223643d.B;
        com.tencent.mm.vfs.w6.h(recordConfigProvider != null ? recordConfigProvider.D : null);
    }
}
