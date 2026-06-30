package ee5;

/* loaded from: classes4.dex */
public final class o3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.q3 f251991d;

    public o3(ee5.q3 q3Var) {
        this.f251991d = q3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        fn5.o0 o0Var = (fn5.o0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "queryState: " + o0Var);
        if (o0Var == fn5.o0.f264745f) {
            ee5.q3 q3Var = this.f251991d;
            android.widget.ProgressBar progressBar = q3Var.f252012m;
            if (progressBar != null && progressBar.getVisibility() == 0) {
                android.widget.ProgressBar progressBar2 = q3Var.f252012m;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                androidx.appcompat.app.AppCompatActivity activity = q3Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                int R6 = ((ee5.z) pf5.z.f353948a.a(activity).a(ee5.z.class)).R6();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "observeQueryState >> " + R6 + ", " + q3Var.f252020u);
                int i17 = R6 - q3Var.f252020u;
                if (q3Var.f252015p == 1 || i17 <= 0) {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = q3Var.f252014o;
                    if (weImageView != null) {
                        weImageView.setVisibility(0);
                    }
                    android.widget.TextView textView = q3Var.f252013n;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    ee5.q3 q3Var2 = this.f251991d;
                    q3Var2.f252019t = pf5.e.launch$default(q3Var2, null, null, new ee5.l3(q3Var2, null), 3, null);
                    return;
                }
                android.widget.TextView textView2 = q3Var.f252013n;
                if (textView2 != null) {
                    textView2.setText("+" + i17);
                }
                android.widget.TextView textView3 = q3Var.f252013n;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = q3Var.f252014o;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
                ee5.q3 q3Var3 = this.f251991d;
                q3Var3.f252021v = pf5.e.launch$default(q3Var3, null, null, new ee5.n3(q3Var3, null), 3, null);
            }
        }
    }
}
