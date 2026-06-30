package zm3;

/* loaded from: classes.dex */
public class b extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final zm3.a T6() {
        if (!(getActivity() instanceof com.tencent.mm.plugin.mvvmlist.BaseMvvmListActivity)) {
            return null;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmlist.BaseMvvmListActivity<T of com.tencent.mm.plugin.mvvmlist.uic.BaseMvvmListUIC>");
        for (com.tencent.mm.ui.component.UIComponent uIComponent : ((com.tencent.mm.plugin.mvvmlist.BaseMvvmListActivity) activity).getUiComponents()) {
            boolean z17 = uIComponent instanceof zm3.a;
            if (z17) {
                if (z17) {
                    return (zm3.a) uIComponent;
                }
                return null;
            }
        }
        return null;
    }
}
