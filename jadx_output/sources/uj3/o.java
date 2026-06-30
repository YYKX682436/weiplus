package uj3;

/* loaded from: classes14.dex */
public final class o implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uj3.p f428333a;

    public o(uj3.p pVar) {
        this.f428333a = pVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null && num.intValue() == 0) {
            return;
        }
        uj3.p pVar = this.f428333a;
        if (num != null && -17 == num.intValue()) {
            db5.t7.g(pVar.getContext(), pVar.getContext().getString(com.tencent.mm.R.string.cf7));
        } else {
            db5.t7.g(pVar.getContext(), pVar.getContext().getString(com.tencent.mm.R.string.ibr));
        }
        uj3.k1 mScreenReportData = pVar.getMScreenReportData();
        if (mScreenReportData != null) {
            kotlin.jvm.internal.o.d(num);
            mScreenReportData.f428314j = num.intValue();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().h();
    }
}
