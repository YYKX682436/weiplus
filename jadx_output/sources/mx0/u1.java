package mx0;

/* loaded from: classes.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.w1 f332364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(mx0.w1 w1Var, int i17) {
        super(0);
        this.f332364d = w1Var;
        this.f332365e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f332364d.f332410e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f332365e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin$setVisibility$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin$setVisibility$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
