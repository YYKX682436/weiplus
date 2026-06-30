package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class t9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f129868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI f129869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(az2.f fVar, com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI) {
        super(1);
        this.f129868d = fVar;
        this.f129869e = finderLiveShareProductUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.an4 an4Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f129868d.b();
        boolean z17 = true;
        java.lang.String string = (fVar == null || (an4Var = (r45.an4) fVar.f70618d) == null) ? null : an4Var.getString(1);
        boolean z18 = fVar != null && fVar.f70615a == 0;
        com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI finderLiveShareProductUI = this.f129869e;
        if (z18 && fVar.f70616b == 0) {
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                int i17 = com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI.f128612t;
                com.tencent.mars.xlog.Log.e("FinderLiveShareProductUI", "MmecGetProductTagLinkReq get empty link");
                db5.t7.g(finderLiveShareProductUI.getContext(), finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.leh));
            } else {
                com.tencent.mm.sdk.platformtools.b0.e(string);
                db5.t7.i(finderLiveShareProductUI.getContext(), finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.lei), com.tencent.mm.R.raw.icons_filled_done);
            }
        } else {
            int i18 = com.tencent.mm.plugin.finder.ui.FinderLiveShareProductUI.f128612t;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MmecGetProductTagLinkReq failed, err code = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            sb6.append(", errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errMsg = ");
            sb6.append(fVar != null ? fVar.f70617c : null);
            com.tencent.mars.xlog.Log.e("FinderLiveShareProductUI", sb6.toString());
            java.lang.String str = fVar != null ? fVar.f70617c : null;
            if (str == null) {
                str = finderLiveShareProductUI.getContext().getResources().getString(com.tencent.mm.R.string.leh);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.g(finderLiveShareProductUI.getContext(), str);
        }
        return jz5.f0.f302826a;
    }
}
