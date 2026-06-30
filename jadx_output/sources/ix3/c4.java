package ix3;

/* loaded from: classes.dex */
public final class c4 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f295379d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f295380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295380e = new java.util.LinkedList();
    }

    public final void T6(r45.dp5 repairerItem) {
        kotlin.jvm.internal.o.g(repairerItem, "repairerItem");
        java.util.LinkedList<r45.dp5> list = repairerItem.getList(5);
        kotlin.jvm.internal.o.f(list, "getSubItemList(...)");
        for (r45.dp5 dp5Var : list) {
            int integer = dp5Var.getInteger(2);
            java.util.LinkedList linkedList = this.f295380e;
            if (integer == 1) {
                linkedList.add(dp5Var);
                T6(dp5Var);
            } else {
                linkedList.add(dp5Var);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new ix3.y3(this, null), 1, null);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.z3(getActivity(), ix3.z3.f295622d);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new ix3.b4(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new hx3.a(new r45.dp5()));
    }
}
