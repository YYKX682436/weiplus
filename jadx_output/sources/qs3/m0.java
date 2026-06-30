package qs3;

/* loaded from: classes13.dex */
public final class m0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qs3.n0 f366361a;

    public m0(qs3.n0 n0Var) {
        this.f366361a = n0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.obj;
        if (obj instanceof android.view.View) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
            android.view.View view = (android.view.View) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.clearAnimation();
            qs3.n0 n0Var = this.f366361a;
            if (n0Var.f366364b) {
                return;
            }
            java.lang.Object tag = view.getTag(n0Var.f366366d.f155050v);
            android.view.animation.Animation animation = tag instanceof android.view.animation.Animation ? (android.view.animation.Animation) tag : null;
            if (animation == null) {
                animation = n0Var.a();
            }
            view.startAnimation(animation);
        }
    }
}
