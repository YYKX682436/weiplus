package df2;

/* loaded from: classes3.dex */
public final class x3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f231755d;

    public x3(df2.d4 d4Var) {
        this.f231755d = d4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        cm2.m0 m0Var = (cm2.m0) obj;
        df2.d4 d4Var = this.f231755d;
        android.view.View h17 = d4Var.h();
        android.widget.TextView textView = h17 != null ? (android.widget.TextView) h17.findViewById(com.tencent.mm.R.id.rfo) : null;
        if (textView == null) {
            return;
        }
        textView.setText(m0Var == null ? d4Var.O6().getString(com.tencent.mm.R.string.moz) : d4Var.O6().getString(com.tencent.mm.R.string.f491841mp0, java.lang.Integer.valueOf(m0Var.f43368v.getInteger(12)), m0Var.f43370x));
    }
}
