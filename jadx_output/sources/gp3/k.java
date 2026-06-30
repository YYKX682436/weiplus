package gp3;

/* loaded from: classes9.dex */
public class k implements dp3.f {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.w f274380a;

    public static void b(gp3.k kVar, android.content.Context context, java.lang.String str, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        java.lang.String str2;
        kVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str3 = mallTransactionObject.f152801x;
        java.lang.String k17 = wo.w0.k();
        int i17 = o45.wf.f343023a;
        java.lang.String str4 = wo.q.f447780a;
        java.lang.String m17 = wo.w0.m();
        java.lang.String l17 = wo.w0.l();
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            str2 = com.tencent.mm.sdk.platformtools.v0.f193027a.f(false);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_BSSID;
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("trans_id", str3).appendQueryParameter("deviceid", k17).appendQueryParameter(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_BSSID, str2).appendQueryParameter("deviceType", str4).appendQueryParameter("deviceName", m17).appendQueryParameter("ostype", l17).build().toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultOrderPrefFactory", "new url %s", uri);
        intent.putExtra("rawUrl", uri);
        intent.putExtra("geta8key_username", c01.z1.r());
        com.tencent.mm.wallet_core.ui.r1.T(context, intent);
    }

    @Override // dp3.f
    public java.util.List a(android.content.Context context, com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        boolean z17;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = mallTransactionObject.f152783f == 2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.E) && !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.F)) {
            gp3.p pVar = new gp3.p(context);
            pVar.P = mallTransactionObject.F;
            pVar.N = mallTransactionObject.E;
            pVar.M = new gp3.a(this, mallTransactionObject, context);
            arrayList.add(pVar);
            arrayList.add(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(context, null));
        }
        gp3.w wVar = new gp3.w(context);
        wVar.N = com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152794q, mallTransactionObject.B);
        wVar.L(z18 ? context.getString(com.tencent.mm.R.string.krx) : mallTransactionObject.f152782e == 11 ? context.getString(com.tencent.mm.R.string.ksw) : context.getString(com.tencent.mm.R.string.krw));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152795r)) {
            try {
                wVar.M = com.tencent.mm.plugin.wallet_core.utils.z1.b(mallTransactionObject.f152795r, true);
            } catch (java.lang.Exception unused) {
                wVar.M = -1;
            }
        }
        arrayList.add(wVar);
        if (mallTransactionObject.f152794q != mallTransactionObject.f152780J) {
            gp3.v vVar = new gp3.v(context);
            vVar.M = false;
            vVar.N = true;
            arrayList.add(vVar);
            gp3.s sVar = new gp3.s(context);
            sVar.M(com.tencent.mm.wallet_core.ui.r1.n(mallTransactionObject.f152780J, mallTransactionObject.B));
            sVar.J(com.tencent.mm.R.string.ksl);
            arrayList.add(sVar);
            z17 = true;
        } else {
            z17 = false;
        }
        if (mallTransactionObject.f152794q != mallTransactionObject.f152780J && !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.I)) {
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
        gp3.v vVar2 = new gp3.v(context);
        vVar2.M = z17;
        vVar2.N = true;
        arrayList.add(vVar2);
        if (!z18 && !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.T)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(mallTransactionObject.T, true);
            if (n17 != null && ((int) n17.E2) > 0) {
                java.lang.String g27 = n17.g2();
                gp3.s sVar2 = new gp3.s(context);
                sVar2.J(com.tencent.mm.R.string.ksz);
                sVar2.M(g27);
                arrayList.add(sVar2);
            }
        }
        if (mallTransactionObject.f152782e == 31 && z18 && !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152792p0)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(mallTransactionObject.f152792p0, true);
            if (n18 != null && ((int) n18.E2) > 0) {
                java.lang.String g28 = n18.g2();
                gp3.s sVar3 = new gp3.s(context);
                sVar3.J(com.tencent.mm.R.string.ksh);
                sVar3.M(g28);
                arrayList.add(sVar3);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152789n)) {
            if (z18) {
                gp3.s sVar4 = new gp3.s(context);
                int i18 = mallTransactionObject.f152782e;
                if (i18 == 32 || i18 == 33 || i18 == 31) {
                    sVar4.J(com.tencent.mm.R.string.f493571ks1);
                } else {
                    sVar4.J(com.tencent.mm.R.string.ksh);
                }
                sVar4.M(mallTransactionObject.f152789n);
                arrayList.add(sVar4);
            } else {
                gp3.s sVar5 = new gp3.s(context);
                if (mallTransactionObject.f152782e == 31) {
                    sVar5.J(com.tencent.mm.R.string.kss);
                } else {
                    sVar5.J(com.tencent.mm.R.string.f493575ks5);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152790o)) {
                    sVar5.M(mallTransactionObject.f152789n);
                } else {
                    java.lang.String string = context.getString(com.tencent.mm.R.string.f493570ks0);
                    java.lang.String str = mallTransactionObject.f152789n + " " + string;
                    int length = mallTransactionObject.f152789n.length() + 1;
                    int length2 = mallTransactionObject.f152789n.length() + 1 + string.length();
                    gp3.b bVar = new gp3.b(this, mallTransactionObject, sVar5, rVar);
                    sVar5.M = str;
                    sVar5.P = true;
                    sVar5.Q = length;
                    sVar5.R = length2;
                    sVar5.S = bVar;
                }
                arrayList.add(sVar5);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152793p1)) {
            gp3.s sVar6 = new gp3.s(context);
            sVar6.J(com.tencent.mm.R.string.kta);
            sVar6.M(mallTransactionObject.f152793p1);
            arrayList.add(sVar6);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152787l1)) {
            gp3.s sVar7 = new gp3.s(context);
            sVar7.J(com.tencent.mm.R.string.ktb);
            sVar7.M(mallTransactionObject.f152787l1);
            arrayList.add(sVar7);
        }
        if (!android.text.TextUtils.isEmpty(mallTransactionObject.V)) {
            gp3.s sVar8 = new gp3.s(context);
            sVar8.J(com.tencent.mm.R.string.krz);
            sVar8.M(mallTransactionObject.V);
            arrayList.add(sVar8);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152788m)) {
            gp3.s sVar9 = new gp3.s(context);
            sVar9.J(com.tencent.mm.R.string.ksk);
            sVar9.M(mallTransactionObject.f152788m);
            arrayList.add(sVar9);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152797t)) {
            gp3.s sVar10 = new gp3.s(context);
            sVar10.J(com.tencent.mm.R.string.f493576kt0);
            if (mallTransactionObject.f152782e != 31 || c01.z1.r().equals(mallTransactionObject.T) || mallTransactionObject.U <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.T) || com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152801x)) {
                sVar10.M(mallTransactionObject.f152797t);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152798u)) {
                    try {
                        sVar10.N = com.tencent.mm.plugin.wallet_core.utils.z1.b(mallTransactionObject.f152798u, true);
                    } catch (java.lang.Exception unused2) {
                        sVar10.N = Integer.MAX_VALUE;
                    }
                }
            } else {
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.f492828i12);
                java.lang.String str2 = mallTransactionObject.f152797t + " " + string2;
                int length3 = mallTransactionObject.f152797t.length() + 1;
                int length4 = mallTransactionObject.f152797t.length() + string2.length() + 1;
                gp3.e eVar = new gp3.e(this, context, mallTransactionObject);
                sVar10.M = str2;
                sVar10.P = true;
                sVar10.Q = length3;
                sVar10.R = length4;
                sVar10.S = eVar;
            }
            arrayList.add(sVar10);
        }
        gp3.s sVar11 = new gp3.s(context);
        sVar11.J(com.tencent.mm.R.string.f493574ks4);
        sVar11.M(com.tencent.mm.wallet_core.ui.r1.p(mallTransactionObject.f152799v));
        arrayList.add(sVar11);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152807z)) {
            gp3.s sVar12 = new gp3.s(context);
            sVar12.J(com.tencent.mm.R.string.ksn);
            java.lang.String str3 = mallTransactionObject.f152807z;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.A)) {
                str3 = str3 + "(" + mallTransactionObject.A + ")";
            }
            sVar12.M(str3);
            arrayList.add(sVar12);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152801x)) {
            gp3.s sVar13 = new gp3.s(context);
            sVar13.J(com.tencent.mm.R.string.kt7);
            sVar13.M(mallTransactionObject.f152801x);
            arrayList.add(sVar13);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.f152804y)) {
            gp3.s sVar14 = new gp3.s(context);
            sVar14.J(com.tencent.mm.R.string.ksx);
            if (mallTransactionObject.f152782e == 8) {
                sVar14.M(context.getString(com.tencent.mm.R.string.ksy));
                gp3.o oVar = new gp3.o(context);
                android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(context, mallTransactionObject.f152804y, 5, 0);
                java.lang.String str4 = mallTransactionObject.f152804y;
                java.lang.String str5 = "";
                if (!android.text.TextUtils.isEmpty(str4)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    int length5 = str4.length() / 4;
                    int i19 = 0;
                    while (i19 < length5 + 1) {
                        int i27 = i19 + 1;
                        int min = java.lang.Math.min(i27 * 4, str4.length());
                        int i28 = i19 * 4;
                        sb6.append(com.tencent.mm.wallet_core.ui.r1.a(str4.substring(i28, min), ""));
                        if (min - i28 == 4) {
                            for (int i29 = 0; i29 < 4; i29++) {
                                sb6.append(" ");
                            }
                        }
                        i19 = i27;
                    }
                    str5 = sb6.toString();
                }
                oVar.Q = str5;
                oVar.R = Bi;
                oVar.P = new gp3.f(this, Bi, mallTransactionObject);
                arrayList.add(sVar14);
                arrayList.add(oVar);
            } else {
                sVar14.M(mallTransactionObject.f152804y);
                arrayList.add(sVar14);
            }
        }
        boolean z19 = ((java.util.LinkedList) mallTransactionObject.f152808z1).size() != 0;
        if (z19 || (com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.N) && com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.C) && com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.D))) {
            i17 = 1;
            gp3.v vVar3 = new gp3.v(context);
            vVar3.M = true;
            vVar3.P = false;
            arrayList.add(vVar3);
        } else {
            gp3.v vVar4 = new gp3.v(context);
            i17 = 1;
            vVar4.M = true;
            arrayList.add(vVar4);
            arrayList.add(dp3.g.a(context, mallTransactionObject));
        }
        if (z19) {
            gp3.x xVar = new gp3.x(context);
            if (mallTransactionObject.A1 == i17) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.N) || !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.C) || !com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.D)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.P)) {
                        xVar.N = context.getString(com.tencent.mm.R.string.f493581kt5);
                    } else {
                        xVar.N = mallTransactionObject.P;
                    }
                    xVar.P = new gp3.h(this, mallTransactionObject, context);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.P)) {
                xVar.N = mallTransactionObject.P;
                xVar.P = new gp3.i(this, context, mallTransactionObject);
            }
            xVar.Q = mallTransactionObject.f152808z1;
            xVar.M = new gp3.j(this, context, mallTransactionObject);
            gp3.v vVar5 = new gp3.v(context);
            vVar5.M = true;
            arrayList.add(vVar5);
            arrayList.add(xVar);
        }
        return arrayList;
    }
}
