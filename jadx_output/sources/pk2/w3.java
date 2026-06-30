package pk2;

/* loaded from: classes.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ pk2.o9 C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f356324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(pk2.o9 o9Var, boolean z17, android.view.View view) {
        super(0);
        this.C = o9Var;
        this.f356324e = z17;
        this.f356323d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = (!zl2.r4.F1(this.C.f356074b) && this.f356324e) ? 0 : 8;
        android.view.View findViewById = this.f356323d.findViewById(com.tencent.mm.R.id.f485507hx3);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
