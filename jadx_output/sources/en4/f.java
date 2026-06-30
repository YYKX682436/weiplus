package en4;

/* loaded from: classes4.dex */
public final class f extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        R6(new en4.b(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.ogg);
        android.os.Bundle bundleExtra = getActivity().getIntent().getBundleExtra("key_extra_data");
        if (bundleExtra == null || !bundleExtra.getBoolean("_openbusinessview_personal_center", false)) {
            return;
        }
        findViewById.post(new en4.c(findViewById));
    }
}
