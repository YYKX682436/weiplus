package qp5;

/* loaded from: classes9.dex */
public class u implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f365851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qp5.v f365852b;

    public u(qp5.v vVar, com.tencent.mm.ui.widget.picker.o oVar) {
        this.f365852b = vVar;
        this.f365851a = oVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.picker.o oVar = this.f365851a;
        oVar.b();
        if (z17) {
            java.lang.String a17 = oVar.a();
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                return;
            }
            java.lang.String[] split = a17.split("-");
            if (split.length < 2) {
                return;
            }
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0);
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0) - 1;
            qp5.v vVar = this.f365852b;
            vVar.f365853d = D12;
            int i27 = vVar.f365853d;
            if (D1 >= 0 || vVar.f365853d >= 0) {
                java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00");
                if (c01.z1.I()) {
                    vVar.f365855f.setTag(decimalFormat.format(vVar.f365853d + 1) + D1);
                } else {
                    vVar.f365855f.setTag(decimalFormat.format(D1).substring(2) + decimalFormat.format(vVar.f365853d + 1));
                }
                vVar.f365855f.setText(decimalFormat.format(vVar.f365853d + 1) + decimalFormat.format(D1).substring(2));
            } else {
                com.tencent.mm.ui.MMActivity mMActivity = vVar.f365854e;
                db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.kli), null);
            }
            if (vVar.f365855f.getInputValidChangeListener() != null) {
                vVar.f365855f.getInputValidChangeListener().onInputValidChange(vVar.f365855f.n());
            }
        }
    }
}
