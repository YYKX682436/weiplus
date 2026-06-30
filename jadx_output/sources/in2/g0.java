package in2;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f292840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f292841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(in2.n0 n0Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        super(1);
        this.f292840d = n0Var;
        this.f292841e = wxRecyclerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f292841e;
        in2.n0 n0Var = this.f292840d;
        if (intValue <= 0) {
            android.widget.TextView textView = n0Var.M;
            if (textView != null) {
                textView.setText(wxRecyclerView.getResources().getString(com.tencent.mm.R.string.oji));
            }
        } else {
            android.widget.TextView textView2 = n0Var.M;
            if (textView2 != null) {
                textView2.setText(wxRecyclerView.getResources().getString(com.tencent.mm.R.string.ojv, java.lang.Integer.valueOf(intValue)));
            }
        }
        return jz5.f0.f302826a;
    }
}
