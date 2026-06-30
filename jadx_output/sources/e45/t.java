package e45;

/* loaded from: classes.dex */
public final class t extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f249427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View findViewById = findViewById(com.tencent.mm.R.layout.ac9);
            if (findViewById == null) {
                findViewById = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.ac9, (android.view.ViewGroup) null);
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.gzf);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            this.f249427d = textView;
            frameLayout.addView(findViewById);
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.bzi);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new e45.s(this));
            }
        }
    }
}
