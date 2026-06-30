package mx0;

/* loaded from: classes3.dex */
public final /* synthetic */ class n5 extends kotlin.jvm.internal.m implements yz5.a {
    public n5(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onFirstFramePresent", "onFirstFramePresent()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver).P;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout", "onFirstFramePresent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout", "onFirstFramePresent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
