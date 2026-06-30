package oh4;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh4.j f345466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(oh4.j jVar) {
        super(0);
        this.f345466d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View tingRedDotArea;
        tingRedDotArea = this.f345466d.getTingRedDotArea();
        if (tingRedDotArea != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(tingRedDotArea, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$hideRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tingRedDotArea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(tingRedDotArea, "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$hideRedDotArea$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
