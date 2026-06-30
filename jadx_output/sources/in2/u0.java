package in2;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.v0 f292909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(in2.v0 v0Var) {
        super(3);
        this.f292909d = v0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List songInfoList = (java.util.List) obj2;
        java.util.LinkedList unComplianceList = (java.util.LinkedList) obj3;
        kotlin.jvm.internal.o.g(songInfoList, "songInfoList");
        kotlin.jvm.internal.o.g(unComplianceList, "unComplianceList");
        in2.v0 v0Var = this.f292909d;
        if (intValue == 0) {
            mm2.m6 m6Var = (mm2.m6) v0Var.H.a(mm2.m6.class);
            gk2.e eVar = v0Var.H;
            m6Var.f329241f.e(songInfoList, (java.lang.String) ((mm2.m6) eVar.a(mm2.m6.class)).f329243h.getValue(), new in2.t0(v0Var));
            if (!unComplianceList.isEmpty()) {
                java.util.LinkedList linkedList = ((mm2.m6) eVar.a(mm2.m6.class)).f329247o;
                linkedList.clear();
                linkedList.addAll(unComplianceList);
                android.content.Context context = v0Var.f118183e;
                db5.t7.g(context, context.getResources().getString(com.tencent.mm.R.string.oyx));
            }
            v0Var.S.f292880f.clear();
            v0Var.I.r7();
        } else {
            db5.t7.m(v0Var.f118183e, "网络错误，请稍后再试");
        }
        return jz5.f0.f302826a;
    }
}
