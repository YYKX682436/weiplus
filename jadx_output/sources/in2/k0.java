package in2;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f292853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(in2.n0 n0Var, android.view.View view) {
        super(3);
        this.f292853d = n0Var;
        this.f292854e = view;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List songInfoList = (java.util.List) obj2;
        java.util.LinkedList unComplianceList = (java.util.LinkedList) obj3;
        kotlin.jvm.internal.o.g(songInfoList, "songInfoList");
        kotlin.jvm.internal.o.g(unComplianceList, "unComplianceList");
        in2.n0 n0Var = this.f292853d;
        if (intValue == 0) {
            mm2.m6 m6Var = (mm2.m6) n0Var.H.a(mm2.m6.class);
            gk2.e eVar = n0Var.H;
            m6Var.f329241f.e(songInfoList, (java.lang.String) ((mm2.m6) eVar.a(mm2.m6.class)).f329243h.getValue(), new in2.j0(n0Var));
            boolean isEmpty = unComplianceList.isEmpty();
            android.content.Context context = n0Var.f118183e;
            if (!isEmpty) {
                java.util.LinkedList linkedList = ((mm2.m6) eVar.a(mm2.m6.class)).f329247o;
                linkedList.clear();
                linkedList.addAll(unComplianceList);
                db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.oyx));
            }
            n0Var.I.r7();
            in2.f0 f0Var = n0Var.P;
            f0Var.f292826h.clear();
            f0Var.notifyDataSetChanged();
            java.lang.Object systemService = context.getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(this.f292854e.getWindowToken(), 0);
        } else {
            db5.t7.g(n0Var.f118183e, "请稍后再试");
        }
        return jz5.f0.f302826a;
    }
}
