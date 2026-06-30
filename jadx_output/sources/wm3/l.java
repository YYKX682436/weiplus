package wm3;

/* loaded from: classes3.dex */
public class l extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f447281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        ul5.k bounceView;
        com.tencent.mm.ui.ga controller;
        super.onCreateAfter(bundle);
        if (this.f447281d) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null && (controller = mMActivity.getController()) != null) {
                controller.J();
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity2 = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
            if (mMActivity2 == null || (bounceView = mMActivity2.getBounceView()) == null) {
                return;
            }
            bounceView.setBounceEnabled(false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        this.f447281d = getIntent().getBooleanExtra("Contact_IsHalfScreen", false);
    }
}
