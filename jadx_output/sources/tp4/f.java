package tp4;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout f421153d;

    public f(com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
        this.f421153d = improveEditorVideoCompositionPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View funcBottomParent;
        funcBottomParent = this.f421153d.getFuncBottomParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$loadCurrentPage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        funcBottomParent.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$loadCurrentPage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
