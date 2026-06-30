package gp3;

/* loaded from: classes9.dex */
public class n implements dp3.f {
    @Override // dp3.f
    public java.util.List a(android.content.Context context, com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = mallTransactionObject.f152783f == 2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.E) && !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.F)) {
            gp3.p pVar = new gp3.p(context);
            pVar.P = mallTransactionObject.F;
            pVar.N = mallTransactionObject.E;
            pVar.M = new gp3.l(this, mallTransactionObject, context);
            arrayList.add(pVar);
            arrayList.add(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(context, null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + mallTransactionObject.V + " and fetchTotalFee is " + mallTransactionObject.f152803x1);
        boolean isEmpty = android.text.TextUtils.isEmpty(mallTransactionObject.V);
        int i17 = com.tencent.mm.R.string.ksb;
        if (isEmpty) {
            gp3.w wVar = new gp3.w(context);
            wVar.N = com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152794q, mallTransactionObject.B);
            if (z18) {
                i17 = com.tencent.mm.R.string.krx;
            }
            wVar.L(context.getString(i17));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152795r)) {
                try {
                    wVar.M = com.tencent.mm.plugin.wallet_core.utils.z1.b(mallTransactionObject.f152795r, true);
                } catch (java.lang.Exception unused) {
                    wVar.M = -1;
                }
            }
            arrayList.add(wVar);
            double d17 = mallTransactionObject.f152794q;
            double d18 = mallTransactionObject.f152780J;
            if (d17 == d18 || d18 <= 0.0d) {
                z17 = false;
            } else {
                gp3.v vVar = new gp3.v(context);
                vVar.M = false;
                vVar.N = true;
                arrayList.add(vVar);
                gp3.s sVar = new gp3.s(context);
                sVar.M(com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152780J, mallTransactionObject.B));
                sVar.J(com.tencent.mm.R.string.ksl);
                arrayList.add(sVar);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.I)) {
                    gp3.u uVar = new gp3.u(context);
                    uVar.J(com.tencent.mm.R.string.ks7);
                    uVar.M = rVar;
                    java.lang.String[] split = mallTransactionObject.I.split("\n");
                    if (split.length == 1) {
                        uVar.N = split[0];
                    } else {
                        uVar.N = context.getString(com.tencent.mm.R.string.ks9, java.lang.Integer.valueOf(split.length), com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152780J - mallTransactionObject.f152794q, mallTransactionObject.B));
                        android.text.TextUtils.TruncateAt truncateAt = android.text.TextUtils.TruncateAt.MIDDLE;
                        uVar.P = split;
                        uVar.Q = truncateAt;
                        uVar.R = true;
                    }
                    arrayList.add(uVar);
                }
                z17 = true;
            }
            gp3.v vVar2 = new gp3.v(context);
            vVar2.M = z17;
            vVar2.N = true;
            arrayList.add(vVar2);
        } else {
            gp3.w wVar2 = new gp3.w(context);
            wVar2.N = com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152803x1, mallTransactionObject.B);
            wVar2.L(context.getString(com.tencent.mm.R.string.kry));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152806y1)) {
                try {
                    wVar2.M = com.tencent.mm.plugin.wallet_core.utils.z1.b(mallTransactionObject.f152806y1, true);
                } catch (java.lang.Exception unused2) {
                    wVar2.M = -1;
                }
            }
            arrayList.add(wVar2);
            gp3.v vVar3 = new gp3.v(context);
            vVar3.M = false;
            vVar3.N = true;
            arrayList.add(vVar3);
            gp3.s sVar2 = new gp3.s(context);
            sVar2.J(com.tencent.mm.R.string.ksb);
            sVar2.M(com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152794q, mallTransactionObject.B));
            arrayList.add(sVar2);
            gp3.s sVar3 = new gp3.s(context);
            sVar3.J(com.tencent.mm.R.string.krz);
            sVar3.M(mallTransactionObject.V);
            arrayList.add(sVar3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152789n)) {
            if (z18) {
                gp3.s sVar4 = new gp3.s(context);
                sVar4.J(com.tencent.mm.R.string.ksh);
                sVar4.M(mallTransactionObject.f152789n);
                arrayList.add(sVar4);
            } else {
                gp3.s sVar5 = new gp3.s(context);
                sVar5.J(com.tencent.mm.R.string.f493575ks5);
                if (com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152790o)) {
                    sVar5.M(mallTransactionObject.f152789n);
                } else {
                    java.lang.String string = context.getString(com.tencent.mm.R.string.f493570ks0);
                    java.lang.String str = mallTransactionObject.f152789n + " " + string;
                    int length = mallTransactionObject.f152789n.length() + 1;
                    int length2 = mallTransactionObject.f152789n.length() + 1 + string.length();
                    gp3.m mVar = new gp3.m(this, mallTransactionObject, sVar5, rVar);
                    sVar5.M = str;
                    sVar5.P = true;
                    sVar5.Q = length;
                    sVar5.R = length2;
                    sVar5.S = mVar;
                }
                arrayList.add(sVar5);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152788m)) {
            gp3.s sVar6 = new gp3.s(context);
            sVar6.J(com.tencent.mm.R.string.ksk);
            sVar6.M(mallTransactionObject.f152788m);
            arrayList.add(sVar6);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152797t)) {
            gp3.s sVar7 = new gp3.s(context);
            sVar7.J(com.tencent.mm.R.string.f493576kt0);
            sVar7.M(mallTransactionObject.f152797t);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152798u)) {
                try {
                    sVar7.N = com.tencent.mm.plugin.wallet_core.utils.z1.b(mallTransactionObject.f152798u, true);
                } catch (java.lang.Exception unused3) {
                    sVar7.N = Integer.MAX_VALUE;
                }
            }
            arrayList.add(sVar7);
        }
        gp3.s sVar8 = new gp3.s(context);
        sVar8.J(com.tencent.mm.R.string.kse);
        sVar8.M(com.tencent.mm.wallet_core.ui.r1.p(mallTransactionObject.f152799v));
        arrayList.add(sVar8);
        if (mallTransactionObject.R > 0) {
            gp3.s sVar9 = new gp3.s(context);
            sVar9.J(com.tencent.mm.R.string.ksc);
            sVar9.M(com.tencent.mm.wallet_core.ui.r1.p(mallTransactionObject.R));
            arrayList.add(sVar9);
        } else if (mallTransactionObject.Q > 0) {
            gp3.s sVar10 = new gp3.s(context);
            sVar10.J(com.tencent.mm.R.string.ksf);
            sVar10.M(com.tencent.mm.wallet_core.ui.r1.p(mallTransactionObject.Q));
            arrayList.add(sVar10);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152807z)) {
            gp3.s sVar11 = new gp3.s(context);
            sVar11.J(com.tencent.mm.R.string.ksd);
            java.lang.String str2 = mallTransactionObject.f152807z;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.A)) {
                str2 = str2 + "(" + mallTransactionObject.A + ")";
            }
            sVar11.M(str2);
            arrayList.add(sVar11);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152804y)) {
            gp3.s sVar12 = new gp3.s(context);
            sVar12.J(com.tencent.mm.R.string.ksg);
            sVar12.M(mallTransactionObject.f152804y);
            arrayList.add(sVar12);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.N) && com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.C) && com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.D)) {
            gp3.v vVar4 = new gp3.v(context);
            vVar4.M = true;
            vVar4.P = false;
            arrayList.add(vVar4);
        } else {
            gp3.v vVar5 = new gp3.v(context);
            vVar5.M = true;
            arrayList.add(vVar5);
            arrayList.add(dp3.g.a(context, mallTransactionObject));
        }
        return arrayList;
    }
}
