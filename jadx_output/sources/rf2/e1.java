package rf2;

/* loaded from: classes10.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(rf2.o1 o1Var) {
        super(1);
        this.f394705d = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        rf2.o1 o1Var = this.f394705d;
        if (booleanValue) {
            o1Var.f394837b.Z6();
        } else {
            android.view.View view = o1Var.f394836a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4$1$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
