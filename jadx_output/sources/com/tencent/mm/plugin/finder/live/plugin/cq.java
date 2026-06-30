package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112191f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f112192g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112193h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112194i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.finder.live.plugin.dq dqVar, java.lang.String str3, java.lang.String str4) {
        super(0);
        this.f112189d = str;
        this.f112190e = str2;
        this.f112191f = i17;
        this.f112192g = dqVar;
        this.f112193h = str3;
        this.f112194i = str4;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        r45.kv1 kv1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateValidRewardMap: giftId:");
        java.lang.String str3 = this.f112189d;
        sb6.append(str3);
        sb6.append(", comboId:");
        java.lang.String str4 = this.f112190e;
        sb6.append(str4);
        sb6.append(", cnt:");
        int i17 = this.f112191f;
        sb6.append(i17);
        sb6.append(", previousCnt:");
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f112192g;
        sb6.append(((java.util.HashMap) dqVar.f112319J).get(str4 == null ? "" : str4));
        sb6.append(", comboIdStatus:");
        java.util.Map map = dqVar.K;
        sb6.append(((java.util.HashMap) map).get(str4 == null ? "" : str4));
        sb6.append(", songName: ");
        java.lang.String str5 = this.f112193h;
        sb6.append(str5);
        sb6.append(", uniqueAddId: ");
        java.lang.String str6 = this.f112194i;
        sb6.append(str6);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
        java.util.Map map2 = dqVar.f112319J;
        java.lang.String str7 = str4 == null ? "" : str4;
        java.util.HashMap hashMap = (java.util.HashMap) map2;
        java.lang.Object obj = hashMap.get(str4 == null ? "" : str4);
        if (obj == null) {
            obj = 0;
        }
        hashMap.put(str7, java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + i17));
        if (kotlin.jvm.internal.o.b(((java.util.HashMap) map).get(str4 == null ? "" : str4), java.lang.Boolean.TRUE)) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map2).get(str4 == null ? "" : str4);
            if ((num != null ? num.intValue() : 0) > 0) {
                java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) map2).get(str4 == null ? "" : str4);
                int intValue = num2 != null ? num2.intValue() : 0;
                if (dqVar.W) {
                    if (intValue > 0) {
                        if (!(str4 == null || str4.length() == 0)) {
                            r45.ch1 ch1Var = new r45.ch1();
                            r45.xn1 xn1Var = new r45.xn1();
                            zl2.r4 r4Var = zl2.r4.f473950a;
                            str = "";
                            xn1Var.set(0, r4Var.m0(dqVar.S0()));
                            xn1Var.set(11, ((mm2.c1) dqVar.P0(mm2.c1.class)).f328812h);
                            xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
                            ch1Var.set(13, xn1Var);
                            ch1Var.set(1, 20013);
                            dk2.j5 j5Var = new dk2.j5(ch1Var);
                            j5Var.f233641d = true;
                            r45.yh1 yh1Var = new r45.yh1();
                            yh1Var.set(0, str3);
                            yh1Var.set(4, str4);
                            yh1Var.set(3, java.lang.Integer.valueOf(intValue));
                            ce2.i e17 = dk2.u7.f234181a.e(str3);
                            yh1Var.set(1, e17 != null ? e17.c1() : null);
                            if (str5 == null || str5.length() == 0) {
                                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment songName is empty,username:" + j5Var.a());
                            } else {
                                if (((mm2.m6) dqVar.P0(mm2.m6.class)).f329248p) {
                                    yh1Var.set(5, 2);
                                    r45.a32 a32Var = new r45.a32();
                                    a32Var.set(0, str5);
                                    if (str6 != null) {
                                        a32Var.set(2, str6);
                                    }
                                    yh1Var.set(6, hc2.b.a(a32Var));
                                } else {
                                    yh1Var.set(5, 1);
                                    r45.p92 p92Var = new r45.p92();
                                    p92Var.set(0, str5);
                                    if (str6 != null) {
                                        p92Var.set(2, str6);
                                    }
                                    yh1Var.set(6, hc2.b.a(p92Var));
                                }
                                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment songName: " + str5 + ", uniqueAddId: " + str6 + ", username:" + j5Var.a());
                            }
                            j5Var.f233640c = yh1Var;
                            ((mm2.x4) dqVar.P0(mm2.x4.class)).f329528f.add(j5Var);
                            ((mm2.j2) dqVar.P0(mm2.j2.class)).N6(j5Var);
                            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment comboCount:" + intValue + ",comboId:" + str4 + ",username:" + j5Var.a());
                            no0.h.f338720a.a();
                            android.view.ViewGroup viewGroup = dqVar.f365323d;
                            android.content.Context context = viewGroup.getContext();
                            java.lang.Object[] objArr = new java.lang.Object[3];
                            objArr[0] = j5Var.k();
                            r45.yh1 yh1Var2 = j5Var.f233640c;
                            if (yh1Var2 == null || (kv1Var = (r45.kv1) yh1Var2.getCustom(1)) == null || (str2 = kv1Var.getString(8)) == null) {
                                str2 = str;
                            }
                            objArr[1] = str2;
                            objArr[2] = java.lang.String.valueOf(intValue);
                            java.lang.String string = context.getString(com.tencent.mm.R.string.d_w, objArr);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            viewGroup.announceForAccessibility(string);
                        }
                    }
                    str = "";
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment comboCount:" + intValue + ",comboId:" + str4);
                } else {
                    str = "";
                }
                if (str4 == null) {
                    str4 = str;
                }
                ((java.util.HashMap) map2).put(str4, 0);
            }
        }
        return jz5.f0.f302826a;
    }
}
