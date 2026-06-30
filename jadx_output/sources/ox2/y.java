package ox2;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.View view) {
        super(0);
        this.f349718d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f349718d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggDarkPreview$getThumbOrHeartAppearAnimation$1$onComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggDarkPreview$getThumbOrHeartAppearAnimation$1$onComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return jz5.f0.f302826a;
    }
}
