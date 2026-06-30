package sd;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f406620d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f406621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sd.k f406622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sd.w f406623g;

    public m(sd.w wVar, boolean z17, sd.k kVar) {
        this.f406623g = wVar;
        this.f406621e = z17;
        this.f406622f = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.w wVar = this.f406623g;
        com.tencent.mm.plugin.game.luggage.page.e eVar = ((com.tencent.mm.plugin.game.luggage.page.f) wVar).f139886l;
        if (eVar != null) {
            eVar.b();
        }
        if (this.f406620d) {
            return;
        }
        this.f406620d = true;
        java.lang.Object peek = wVar.f406663d.peek();
        boolean z17 = this.f406621e;
        if (peek != null && z17) {
            sd.v vVar = wVar.f406663d;
            sd.k kVar = (sd.k) vVar.peek();
            kVar.getClass();
            android.view.View view = ((sd.u0) kVar).f406654h;
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, -(view.getWidth() * 0.25f));
            ofFloat.setDuration(250L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f);
            ofFloat2.setDuration(0L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2);
            animatorSet.addListener(new sd.i(kVar, null));
            animatorSet.start();
            ((sd.k) vVar.peek()).e();
        }
        sd.k kVar2 = this.f406622f;
        sd.u0 u0Var = (sd.u0) kVar2;
        u0Var.f406654h.bringToFront();
        android.view.View view2 = u0Var.f406654h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/luggage/container/LuggagePageContainer$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/luggage/container/LuggagePageContainer$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kVar2.h();
        sd.l lVar = new sd.l(this);
        if (!z17) {
            lVar.run();
            return;
        }
        android.view.View view3 = ((sd.u0) kVar2).f406654h;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view3, "translationX", view3.getWidth(), 0.0f);
        ofFloat3.setDuration(250L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(166L);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.addListener(new sd.i(kVar2, lVar));
        animatorSet2.start();
    }
}
