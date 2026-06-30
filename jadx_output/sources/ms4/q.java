package ms4;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.t f331098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f331099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ms4.t tVar, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        super(1);
        this.f331098d = tVar;
        this.f331099e = weCoinIncomeDetailView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.mw1 mw1Var;
        r45.v11 v11Var;
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIncomePageInfoRequest errorType: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", errorCode: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(", errorMsg: ");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", sb6.toString());
        java.lang.Object[] objArr = fVar != null && fVar.f70615a == 0;
        ms4.t tVar = this.f331098d;
        if (objArr == true && fVar.f70616b == 0) {
            r45.j71 j71Var = (r45.j71) fVar.f70618d;
            if (j71Var == null || (list = j71Var.getList(1)) == null) {
                mw1Var = null;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if ((((r45.mw1) obj2).getInteger(0) == 4) != false) {
                        arrayList.add(obj2);
                    }
                }
                mw1Var = (r45.mw1) kz5.n0.Z(arrayList);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cgiBack item:");
            sb7.append(mw1Var);
            sb7.append(", pending_income_balance:");
            sb7.append((mw1Var == null || (v11Var = (r45.v11) mw1Var.getCustom(9)) == null) ? null : java.lang.Long.valueOf(v11Var.getLong(2)));
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", sb7.toString());
            r45.v11 v11Var2 = mw1Var != null ? (r45.v11) mw1Var.getCustom(9) : null;
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 == null || v11Var2 == null) {
                tVar.f331115m.postValue(new ms4.a(3, -1, "", null, 8, null));
                this.f331098d.Q6("", 9, 3, 3, "callback resp is null");
            } else {
                r45.j71 j71Var2 = (r45.j71) fVar2;
                os4.h.k("MicroMsg.WeCoinIncomeDetailViewModel", j71Var2);
                tVar.P6(j71Var2.getBoolean(5), v11Var2);
                r45.e8 e8Var = (r45.e8) j71Var2.getCustom(4);
                com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f331099e;
                weCoinIncomeDetailView.D = e8Var;
                weCoinIncomeDetailView.X6();
                tVar.Q6("", 9, 3, 0, "");
            }
        } else {
            androidx.lifecycle.j0 j0Var = tVar.f331115m;
            int i17 = fVar != null ? fVar.f70615a : 0;
            int i18 = fVar != null ? fVar.f70616b : 0;
            java.lang.String str = fVar != null ? fVar.f70617c : null;
            j0Var.postValue(new ms4.a(i17, i18, str == null ? "" : str, null, 8, null));
            ms4.t tVar2 = this.f331098d;
            int i19 = fVar != null ? fVar.f70616b : 0;
            java.lang.String str2 = fVar != null ? fVar.f70617c : null;
            tVar2.Q6("", 9, 3, i19, str2 == null ? "" : str2);
        }
        return jz5.f0.f302826a;
    }
}
