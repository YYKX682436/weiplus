package i53;

/* loaded from: classes.dex */
public class t1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.a2 f288736d;

    public t1(i53.a2 a2Var) {
        this.f288736d = a2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        i53.a2 a2Var = this.f288736d;
        a2Var.f288505p.dismiss();
        a2Var.c();
        android.view.View view = a2Var.f288498f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }
}
