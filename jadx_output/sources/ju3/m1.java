package ju3;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout f301974d;

    public m1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout recordEditPhotoPluginLayout) {
        this.f301974d = recordEditPhotoPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View closeView;
        closeView = this.f301974d.getCloseView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(closeView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        closeView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(closeView, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
