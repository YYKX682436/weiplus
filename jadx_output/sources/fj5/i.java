package fj5;

/* loaded from: classes.dex */
public class i extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        wi5.n0 n0Var;
        super.onBeforeFinish(intent);
        j75.f Q6 = Q6();
        if (Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null || !n0Var.e()) {
            return;
        }
        java.util.LinkedList linkedList = n0Var.f446319o;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ","));
        getActivity().setResult(-1, intent2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new fj5.h(this));
        }
    }
}
