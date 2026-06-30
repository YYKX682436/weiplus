package pk2;

/* loaded from: classes3.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.b4 f356353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f356356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(pk2.b4 b4Var, pk2.o9 o9Var, android.view.View view, boolean z17) {
        super(0);
        this.f356353d = b4Var;
        this.f356354e = o9Var;
        this.f356355f = view;
        this.f356356g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        ya2.b2 b17;
        boolean n17 = this.f356353d.n();
        pk2.o9 o9Var = this.f356354e;
        if (n17) {
            z17 = ((mm2.c1) o9Var.c(mm2.c1.class)).C;
        } else {
            zl2.r4 r4Var = zl2.r4.f473950a;
            pk2.j9 j9Var = o9Var.f356084g;
            z17 = pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.field_liveSwitchFlag), 8388608);
        }
        android.view.View findViewById = this.f356355f.findViewById(com.tencent.mm.R.id.u98);
        if (findViewById != null) {
            int i17 = (this.f356356g && z17) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
