package pk2;

/* loaded from: classes3.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f356006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(pk2.o9 o9Var, android.view.View view, boolean z17) {
        super(0);
        this.f356004d = o9Var;
        this.f356005e = view;
        this.f356006f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = ((mm2.c1) this.f356004d.c(mm2.c1.class)).C;
        android.view.View findViewById = this.f356005e.findViewById(com.tencent.mm.R.id.u98);
        if (findViewById != null) {
            int i17 = (this.f356006f && z17) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption$addItem$1$2$1$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption$addItem$1$2$1$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
