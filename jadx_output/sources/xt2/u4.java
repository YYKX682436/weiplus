package xt2;

/* loaded from: classes3.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f457050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f457051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(xt2.b5 b5Var, android.view.View view) {
        super(3);
        this.f457050d = b5Var;
        this.f457051e = view;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        if (booleanValue) {
            xt2.b5 b5Var = this.f457050d;
            android.view.View view = b5Var.f456643r;
            if (view == null) {
                kotlin.jvm.internal.o.o("autoChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = b5Var.f456644s;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("manualChooseIcon");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f457051e;
            db5.t7.g(view3.getContext(), view3.getContext().getString(com.tencent.mm.R.string.f491780e75));
        }
        return jz5.f0.f302826a;
    }
}
