package rx4;

/* loaded from: classes.dex */
public class r2 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            frameLayout.addView(android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.egz, (android.view.ViewGroup) null));
        }
    }
}
