package ju3;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout f301970d;

    public l1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout recordEditPhotoPluginLayout) {
        this.f301970d = recordEditPhotoPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View funcBottomParent;
        funcBottomParent = this.f301970d.getFuncBottomParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(funcBottomParent, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        funcBottomParent.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(funcBottomParent, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
