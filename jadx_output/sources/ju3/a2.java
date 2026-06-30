package ju3;

/* loaded from: classes10.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f301863d;

    public a2(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        this.f301863d = recordPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout = this.f301863d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = recordPluginLayout.getConfigProvider();
        if (configProvider != null ? kotlin.jvm.internal.o.b(configProvider.f155683u, java.lang.Boolean.TRUE) : false) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider2 = recordPluginLayout.getConfigProvider();
            com.tencent.mm.vfs.w6.h(configProvider2 != null ? configProvider2.A : null);
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider3 = recordPluginLayout.getConfigProvider();
        com.tencent.mm.vfs.w6.h(configProvider3 != null ? configProvider3.D : null);
    }
}
