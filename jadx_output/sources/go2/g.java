package go2;

/* loaded from: classes2.dex */
public class g extends x92.e {
    public java.lang.String B;
    public android.view.View C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B = "";
    }

    @Override // x92.e
    public void W6(com.google.android.material.appbar.AppBarLayout view, float f17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.W6(view, f17);
        float abs = java.lang.Math.abs(f17) / view.getTotalScrollRange();
        if (abs < 0.95d) {
            android.view.View view2 = this.C;
            if (view2 != null) {
                view2.setBackgroundColor(getActivity().getResources().getColor(com.tencent.mm.R.color.a9e));
                return;
            }
            return;
        }
        int i17 = (int) (abs * 255);
        android.view.View view3 = this.C;
        if (view3 != null) {
            view3.setBackgroundColor(com.tencent.mm.ui.uk.a(this.f452687w, i17));
        }
    }

    @Override // x92.e
    public v92.g X6() {
        return new go2.e(this, getActivity(), this.B);
    }

    @Override // x92.e
    public java.lang.String Y6() {
        r45.tr0 tr0Var = (r45.tr0) this.f452719d;
        java.lang.String str = tr0Var != null ? tr0Var.f386724e : null;
        return str == null ? "" : str;
    }

    @Override // x92.e, x92.r, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.B = stringExtra;
        this.C = findViewById(com.tencent.mm.R.id.nvf);
        findViewById(com.tencent.mm.R.id.roi).setOnClickListener(new go2.f(this));
    }
}
