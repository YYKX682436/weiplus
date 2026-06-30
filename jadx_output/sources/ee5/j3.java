package ee5;

/* loaded from: classes9.dex */
public final class j3 implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.q3 f251939d;

    public j3(ee5.q3 q3Var) {
        this.f251939d = q3Var;
    }

    @Override // oa.c
    public void h0(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    @Override // oa.c
    public void l4(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        if (tab.f343782e == 1) {
            ee5.q3 q3Var = this.f251939d;
            androidx.appcompat.app.AppCompatActivity activity = q3Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (((ee5.z) pf5.z.f353948a.a(activity).a(ee5.z.class)).S6()) {
                android.widget.TextView textView = q3Var.f252011i;
                if (textView != null) {
                    textView.setTextColor(q3Var.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
                }
                androidx.appcompat.app.AppCompatActivity activity2 = q3Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                q3Var.f252020u = ((ee5.z) pf5.z.f353948a.a(activity2).a(ee5.z.class)).R6();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "lastShowImageNum >> " + q3Var.f252020u);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0085  */
    @Override // oa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u1(oa.i r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.j3.u1(oa.i):void");
    }
}
