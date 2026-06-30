package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class xb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.ac f174430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(com.tencent.mm.plugin.textstatus.ui.ac acVar, com.tencent.mm.plugin.textstatus.ui.w1 w1Var) {
        super(1);
        this.f174430d = acVar;
        this.f174431e = w1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.textstatus.ui.ac acVar = this.f174430d;
        java.lang.String str = acVar.f173726d;
        boolean z18 = true;
        if (intValue <= 0) {
            com.tencent.mm.plugin.textstatus.ui.w1 w1Var = this.f174431e;
            java.lang.Object tag = w1Var != null ? w1Var.getTag(com.tencent.mm.R.id.nwq) : null;
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            int intValue2 = num != null ? num.intValue() : 0;
            int size = acVar.f173730h.size();
            if (intValue2 >= 0 && intValue2 < acVar.f173730h.size()) {
                acVar.f173730h.remove(intValue2);
                com.tencent.mars.xlog.Log.i(str, "checkRefreshMultiCardViewAfterDelete: willDeleteMultiCardView, oldConvertDataSize=" + size + ", remove pos=" + intValue2);
                z17 = true;
                if (com.tencent.mm.sdk.platformtools.t8.L0(acVar.f173730h) && (acVar.f173730h.size() != 1 || !(acVar.f173730h.get(0) instanceof ij4.a))) {
                    if (z17) {
                        androidx.recyclerview.widget.f2 f2Var = acVar.f173728f;
                        if (f2Var != null) {
                            f2Var.notifyDataSetChanged();
                        }
                    }
                    return java.lang.Boolean.valueOf(z18);
                }
                com.tencent.mars.xlog.Log.i(str, "checkRefreshMultiCardViewAfterDelete: finish");
                acVar.getActivity().finish();
                z18 = false;
                return java.lang.Boolean.valueOf(z18);
            }
        }
        z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.L0(acVar.f173730h)) {
        }
        com.tencent.mars.xlog.Log.i(str, "checkRefreshMultiCardViewAfterDelete: finish");
        acVar.getActivity().finish();
        z18 = false;
        return java.lang.Boolean.valueOf(z18);
    }
}
