package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        super(6);
        this.f117371d = a1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        r45.m01 m01Var;
        byte[] byteArray;
        r45.nw1 nw1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String str = (java.lang.String) obj4;
        android.os.Bundle bundle = (android.os.Bundle) obj5;
        r45.l01 l01Var = (r45.l01) obj6;
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117371d;
        com.tencent.mars.xlog.Log.i(a1Var.f116871d, "postExternalLive success:" + booleanValue + " errCode:" + intValue + " errType:" + intValue2 + " errMsg:" + str + " extInfo:" + bundle);
        android.app.Activity context = a1Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qp1 qp1Var = null;
        qp1Var = null;
        qp1Var = null;
        kotlinx.coroutines.z0.e(((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().getSecurityDataScope(), null, 1, null);
        if (booleanValue) {
            a1Var.G = false;
            a1Var.F = true;
            androidx.appcompat.app.AppCompatActivity activity = a1Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
            android.app.Activity context2 = a1Var.getContext();
            java.lang.String str2 = a1Var.f116884t;
            int i17 = a1Var.f116889y;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a1Var.f116890z);
            gk2.e eVar = gk2.e.f272471n;
            ((h63.g1) s1Var).Di(context2, str2, i17, bool, valueOf, java.lang.Long.valueOf((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0)));
            if (a1Var.f116890z) {
                a1Var.getActivity().finish();
                a1Var.getActivity().overridePendingTransition(0, 0);
            }
        } else {
            a1Var.U6().setEnabled(true);
            java.lang.String str3 = "handleStartMiniGameLiveFail: errCode:" + intValue + ", errType:" + intValue2 + ", errMsg:" + str;
            java.lang.String str4 = a1Var.f116871d;
            com.tencent.mars.xlog.Log.i(str4, str3);
            if (intValue == -200008) {
                java.lang.String string = bundle != null ? bundle.getString("EXT_INFO_KEY_REAL_NAME_URL", "") : null;
                java.lang.String str5 = string != null ? string : "";
                com.tencent.mars.xlog.Log.i(str4, "handleStartMiniGameLiveFail: realnameUrl".concat(str5));
                if ((str5.length() > 0) == true) {
                    com.tencent.mars.xlog.Log.i(str4, "gotoFaceVerify ".concat(str5));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("LIVE_HELP_TYPE", 1);
                    intent.putExtra("FACE_VERIFY_URL", str5);
                    intent.setClass(a1Var.getActivity(), com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI.class);
                    a1Var.getActivity().startActivityForResult(intent, 10000);
                } else {
                    db5.t7.makeText(a1Var.getActivity(), a1Var.getActivity().getResources().getString(com.tencent.mm.R.string.dzz), 0).show();
                }
            } else {
                if (bundle != null && (byteArray = bundle.getByteArray("EXT_INFO_KEY_ERROR_PAGE")) != null) {
                    r45.qp1 qp1Var2 = new r45.qp1();
                    try {
                        qp1Var2.parseFrom(byteArray);
                        qp1Var = qp1Var2;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                if (!hz2.d.f286313a.j(intValue2, intValue, qp1Var)) {
                    if (intValue != -200196) {
                        if (intValue != -100038) {
                            switch (intValue) {
                                default:
                                    switch (intValue) {
                                        case -200013:
                                            break;
                                        case -200012:
                                        case -200011:
                                            db5.t7.makeText(a1Var.getContext(), a1Var.getContext().getResources().getString(com.tencent.mm.R.string.dcd), 0).show();
                                            break;
                                        case -200010:
                                            db5.t7.makeText(a1Var.getContext(), a1Var.getContext().getResources().getString(com.tencent.mm.R.string.d4k), 0).show();
                                            break;
                                        case -200009:
                                            db5.t7.makeText(a1Var.getContext(), a1Var.getContext().getResources().getString(com.tencent.mm.R.string.clb), 0).show();
                                            break;
                                        default:
                                            db5.t7.makeText(a1Var.getContext(), a1Var.getContext().getResources().getString(com.tencent.mm.R.string.cla), 0).show();
                                            com.tencent.mars.xlog.Log.i(str4, "unknown errCode:" + intValue);
                                            break;
                                    }
                                case -200018:
                                case -200017:
                                    db5.t7.makeText(a1Var.getContext(), a1Var.getContext().getResources().getString(com.tencent.mm.R.string.cla), 0).show();
                                    break;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i(str4, "handleStartMiniGameLiveFail: errCode = LiveSvrErrCode.MM_LIVE_ERR_LIVE_CLOSED");
                        }
                    } else if (l01Var != null && (m01Var = (r45.m01) l01Var.getCustom(6)) != null) {
                        a1Var.V6(m01Var);
                    }
                }
            }
            a1Var.G = true;
        }
        com.tencent.mm.plugin.finder.assist.d9 d9Var = a1Var.D;
        if (d9Var != null) {
            d9Var.b();
        }
        return jz5.f0.f302826a;
    }
}
