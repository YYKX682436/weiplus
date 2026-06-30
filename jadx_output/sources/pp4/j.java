package pp4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout f357542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f357543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f357544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f357545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f357546h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f357547i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, boolean z17) {
        super(2);
        this.f357542d = timelineEditorPlatformVideoPluginLayout;
        this.f357543e = audioCacheInfo;
        this.f357544f = rect;
        this.f357545g = rect2;
        this.f357546h = rect3;
        this.f357547i = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout = this.f357542d;
        if (booleanValue) {
            if (!(str == null || str.length() == 0)) {
                com.tencent.mars.xlog.Log.i(timelineEditorPlatformVideoPluginLayout.C(), "download music success, " + str);
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = str;
                kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new pp4.i(this.f357543e, h0Var, this.f357542d, str, this.f357544f, this.f357545g, this.f357546h, this.f357547i, null), 2, null);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.e(timelineEditorPlatformVideoPluginLayout.C(), "download music failed");
        lp4.d1 d1Var = (lp4.d1) timelineEditorPlatformVideoPluginLayout.j(lp4.d1.class);
        if (d1Var != null) {
            d1Var.z();
        }
        return jz5.f0.f302826a;
    }
}
