package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164109d;

    public c(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy) {
        this.f164109d = adLandingPagesProxy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, funcId=");
        sb6.append(m1Var == 0 ? 0 : m1Var.getType());
        sb6.append(", errType=");
        sb6.append(i17);
        sb6.append(", errCode=");
        sb6.append(i18);
        sb6.append(", errMsg=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", sb6.toString());
        boolean z17 = m1Var instanceof ib4.l;
        java.lang.String str2 = "";
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = this.f164109d;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                str2 = ((ib4.l) m1Var).H();
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "the dynamic string is " + str2 + ", sceneType is " + m1Var.getType());
            } else {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "the netscene is error ,error type is " + i17 + " error msg is " + str + " sceneType is " + m1Var.getType());
            }
            if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                adLandingPagesProxy.CLIENT_CALL("onDynamicUpdateEnd", java.lang.Long.valueOf(((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue()), str2);
                gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
            }
        } else {
            byte[] bArr = null;
            if (m1Var instanceof ib4.b) {
                if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                    try {
                        long longValue = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneAdChannelPkgInfo onSceneEnd, id %d", java.lang.Long.valueOf(longValue));
                        r45.oy oyVar = (r45.oy) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && oyVar != null) {
                            bArr = oyVar.toByteArray();
                        }
                        adLandingPagesProxy.CLIENT_CALL("onAdChannelEnd", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                        gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                    } catch (java.lang.Exception e17) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
            } else if (m1Var instanceof ib4.k) {
                if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                    adLandingPagesProxy.CLIENT_CALL("onFavOfficialItemEnd", java.lang.Long.valueOf(((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue()), ((ib4.k) m1Var).H(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                }
            } else if (m1Var instanceof i64.n0) {
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "real time report done.");
                gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
            } else if (m1Var instanceof ib4.e) {
                if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                    try {
                        long longValue2 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneAdGetSmartPhoneNumber onSceneEnd, id %d", java.lang.Long.valueOf(longValue2));
                        r45.nh3 nh3Var = (r45.nh3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && nh3Var != null) {
                            bArr = nh3Var.toByteArray();
                        }
                        adLandingPagesProxy.CLIENT_CALL("onGetSmartPhoneScene", java.lang.Long.valueOf(longValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                        gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneAdGetSmartPhoneNumber onSceneEnd exp=" + e18.toString());
                    }
                }
            } else if (m1Var instanceof ib4.n) {
                if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                    try {
                        long longValue3 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneUpdateUxInfo onSceneEnd, id %d", java.lang.Long.valueOf(longValue3));
                        r45.dt6 dt6Var = (r45.dt6) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && dt6Var != null) {
                            str2 = dt6Var.f372746d;
                        }
                        adLandingPagesProxy.CLIENT_CALL("onUpdateUxInfo", java.lang.Long.valueOf(longValue3), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
                        gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneUpdateUxInfo onSceneEnd exp=" + e19.toString());
                    }
                }
            } else if (m1Var instanceof ib4.d) {
                if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                    long longValue4 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                    com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneAdGetHbCoverState onSceneEnd, id %d", java.lang.Long.valueOf(longValue4));
                    try {
                        r45.nh5 nh5Var = (r45.nh5) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        adLandingPagesProxy.CLIENT_CALL("onGetHbCoverStateScene", java.lang.Long.valueOf(longValue4), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf((i17 == 0 && i18 == 0 && nh5Var != null) ? nh5Var.f381401d : -1));
                        gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneAdGetHbCoverState onSceneEnd exp=" + e27.toString());
                    }
                }
            } else if (m1Var instanceof ib4.m) {
                try {
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                        long longValue5 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneUpdateQrUrl onSceneEnd, id %d", java.lang.Long.valueOf(longValue5));
                        r45.fm3 fm3Var = (r45.fm3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && fm3Var != null) {
                            bArr = fm3Var.toByteArray();
                        }
                        adLandingPagesProxy.CLIENT_CALL("onAdUpdateQrUrlEnd", java.lang.Long.valueOf(longValue5), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                        gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneUpdateQrUrl onSceneEnd exp=" + th6.toString());
                }
            } else if ((m1Var instanceof ab0.s) || (m1Var instanceof ns.l)) {
                try {
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                        long longValue6 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        if (m1Var.getType() != 30 && m1Var.getType() != 667) {
                            com.tencent.mars.xlog.Log.w("AdLandingPagesProxy", "not expected scene,  type = " + m1Var.getType());
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
                            return;
                        }
                        if ((m1Var instanceof ns.l) && ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).f189380g != 1) {
                            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "not opcode addcontact!");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
                            return;
                        }
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        if (i17 == 0 && i18 == 0) {
                            if (m1Var.getType() == 30) {
                                str2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
                            } else if (m1Var.getType() == 667) {
                                str2 = ((l41.o) ((ab0.s) m1Var)).f315884f;
                            }
                        }
                        jSONObject.put("errMsg", str);
                        jSONObject.put("respUsername", str2);
                        adLandingPagesProxy.CLIENT_CALL("onAddBrandSceneEnd", java.lang.Long.valueOf(longValue6), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), jSONObject.toString());
                        com.tencent.mm.plugin.sns.model.y.b(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneAddOpenIMContact or NetSceneVerifyUser onSceneEnd exp=" + th7.toString());
                }
            } else if (m1Var instanceof l90.l) {
                try {
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                        long longValue7 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        r45.iw5 iw5Var = (r45.iw5) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && iw5Var != null) {
                            bArr = iw5Var.toByteArray();
                        }
                        adLandingPagesProxy.CLIENT_CALL("onSearchContact", java.lang.Long.valueOf(longValue7), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneSearchContact, onSceneEnd exp=" + th8.toString());
                }
                gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
            } else if (m1Var instanceof ib4.a) {
                try {
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                        long longValue8 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        r45.l2 l2Var = (r45.l2) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && l2Var != null) {
                            bArr = l2Var.toByteArray();
                        }
                        adLandingPagesProxy.CLIENT_CALL("onAdNativeAntiAbuse", java.lang.Long.valueOf(longValue8), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneAdAntiAbuse, onSceneEnd exp = " + th9.toString());
                }
                gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
            } else if (m1Var instanceof k64.o) {
                try {
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                        long longValue9 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        int i19 = ((r45.j0) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70710a.f70684a).f377434f;
                        java.lang.String str3 = "-1";
                        if (i17 == 0 && i18 == 0) {
                            str3 = java.lang.String.valueOf(((r45.k0) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a).f378247d);
                        }
                        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneAdAppointment, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", opType=" + i19 + ", status=" + str3);
                        adLandingPagesProxy.CLIENT_CALL("onSendAppointmentReq", java.lang.Long.valueOf(longValue9), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str3);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "NetSceneAdAppointment, onSceneEnd exp = " + th10.toString());
                }
                gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
            } else if (m1Var != 0) {
                try {
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).containsKey(m1Var)) {
                        long longValue10 = ((java.lang.Long) ((java.util.HashMap) com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e(adLandingPagesProxy)).remove(m1Var)).longValue();
                        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                        if (i17 == 0 && i18 == 0 && fVar != null) {
                            bArr = fVar.toByteArray();
                        }
                        adLandingPagesProxy.CLIENT_CALL("onRspCallbackCommon", java.lang.Long.valueOf(longValue10), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), bArr);
                    }
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "default, onSceneEnd exp=" + th11.toString());
                }
                gm0.j1.d().q(m1Var.getType(), com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.g(adLandingPagesProxy));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$1");
    }
}
