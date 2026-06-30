package sc2;

/* loaded from: classes2.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f406325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f406326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f406327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sc2.f2 f2Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        super(0);
        this.f406325d = f2Var;
        this.f406326e = viewGroup;
        this.f406327f = viewGroup2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc2.f2 f2Var = this.f406325d;
        android.view.ViewGroup viewGroup = this.f406326e;
        sc2.v1 v1Var = new sc2.v1(f2Var, viewGroup, this.f406327f);
        f2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(childAt, "alpha", 0.0f).setDuration(150L);
            kotlin.jvm.internal.o.f(duration, "setDuration(...)");
            arrayList.add(duration);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new sc2.l1(v1Var));
        animatorSet.start();
        return jz5.f0.f302826a;
    }
}
