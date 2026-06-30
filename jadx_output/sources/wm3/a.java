package wm3;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope O6() {
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (O6 = ((um3.b) pf5.z.f353948a.a(P6).a(um3.b.class)).O6()) == null) {
            return null;
        }
        return O6;
    }

    public final com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) {
            return (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity;
        }
        return null;
    }

    public final j75.f Q6() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            return P6.getStateCenter();
        }
        return null;
    }

    public final void R6(yz5.l observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), observer);
        }
    }

    public final void S6(yz5.l processor) {
        kotlin.jvm.internal.o.g(processor, "processor");
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), processor);
        }
    }

    public final void hideVKB() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.hideVKB();
        }
    }
}
