package rx4;

/* loaded from: classes.dex */
public class p2 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public int T6() {
        return com.tencent.mm.R.layout.bja;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(T6(), (android.view.ViewGroup) null);
            frameLayout.addView(inflate);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gya);
            if (findViewById != null) {
                findViewById.setOnClickListener(new rx4.o2(this));
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzd);
            if (textView != null) {
                textView.setText(getString(com.tencent.mm.R.string.hku));
                com.tencent.mm.ui.bk.s0(textView.getPaint());
            }
        }
    }
}
