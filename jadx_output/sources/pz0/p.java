package pz0;

/* loaded from: classes10.dex */
public final class p implements io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pz0.r f359157d;

    public p(pz0.r rVar) {
        this.f359157d = rVar;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener = this.f359157d.f359163g;
        if (activityResultListener != null) {
            return activityResultListener.onActivityResult(i17, i18, intent);
        }
        return false;
    }
}
