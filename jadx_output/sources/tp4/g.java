package tp4;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout f421154d;

    public g(com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
        this.f421154d = improveEditorVideoCompositionPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View closeView;
        closeView = this.f421154d.getCloseView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(closeView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        closeView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(closeView, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
