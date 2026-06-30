package ix3;

/* loaded from: classes.dex */
public final class b3 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new ix3.z2(this, null), 1, null);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), ix3.a3.f295363d);
    }
}
