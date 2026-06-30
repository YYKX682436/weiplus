package com.tencent.mm.repairer.group;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/group/RepairerGroupPay;", "Lq55/g;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerGroupPay extends q55.g {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerGroup_Pay";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "支付";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMain.class;
    }

    public final java.util.List h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.dp5 dp5Var = new r45.dp5();
        dp5Var.set(0, "RepairerGroup_OldPay");
        dp5Var.set(1, "微信支付调试");
        dp5Var.set(2, 1);
        java.util.LinkedList list = dp5Var.getList(5);
        r45.dp5 dp5Var2 = new r45.dp5();
        dp5Var2.set(0, "RepairerConfig_Pay_KindaConfigEnable_Int");
        dp5Var2.set(1, "跨平台本地开关（0：默认、1：开启、2：关闭）");
        dp5Var2.set(2, 3);
        java.util.LinkedList list2 = dp5Var2.getList(3);
        kotlin.jvm.internal.o.f(list2, "getValues(...)");
        kz5.h0.w(list2, new java.lang.String[]{"0", "1", "2"});
        list.add(dp5Var2);
        java.util.LinkedList list3 = dp5Var.getList(5);
        r45.dp5 dp5Var3 = new r45.dp5();
        dp5Var3.set(0, "RepairerConfig_Pay_993TEST_Int");
        dp5Var3.set(1, "993支付-国密（0：默认、1：开启、2：关闭）");
        dp5Var3.set(2, 3);
        java.util.LinkedList list4 = dp5Var3.getList(3);
        kotlin.jvm.internal.o.f(list4, "getValues(...)");
        kz5.h0.w(list4, new java.lang.String[]{"0", "1", "2"});
        list3.add(dp5Var3);
        java.util.LinkedList list5 = dp5Var.getList(5);
        r45.dp5 dp5Var4 = new r45.dp5();
        dp5Var4.set(0, "RepairerGroup_PayLuckyMoney");
        dp5Var4.set(1, "红包调试");
        dp5Var4.set(2, 1);
        java.util.LinkedList list6 = dp5Var4.getList(5);
        r45.dp5 dp5Var5 = new r45.dp5();
        dp5Var5.set(0, "RepairerConfig_Pay_LuckyMoneyEnvelopeFirstGuide_Int");
        dp5Var5.set(1, "红包封面教育动画（0：默认、1：开启、2：关闭）");
        dp5Var5.set(2, 3);
        java.util.LinkedList list7 = dp5Var5.getList(3);
        kotlin.jvm.internal.o.f(list7, "getValues(...)");
        kz5.h0.w(list7, new java.lang.String[]{"0", "1", "2"});
        list6.add(dp5Var5);
        java.util.LinkedList list8 = dp5Var4.getList(5);
        r45.dp5 dp5Var6 = new r45.dp5();
        dp5Var6.set(0, "RepairerConfig_Pay_LuckyMoneyEnvelopePreviewVideo_Int");
        dp5Var6.set(1, "红包封面自动预览视频（0：默认、1：开启、2：关闭）");
        dp5Var6.set(2, 3);
        java.util.LinkedList list9 = dp5Var6.getList(3);
        kotlin.jvm.internal.o.f(list9, "getValues(...)");
        kz5.h0.w(list9, new java.lang.String[]{"0", "1", "2"});
        list8.add(dp5Var6);
        list5.add(dp5Var4);
        java.util.LinkedList list10 = dp5Var.getList(5);
        r45.dp5 dp5Var7 = new r45.dp5();
        dp5Var7.set(0, "RepairerConfig_Pay_YSFDebugEnv_Int");
        dp5Var7.set(1, "ysf调试环境（0：正式、1：测试）");
        dp5Var7.set(2, 3);
        java.util.LinkedList list11 = dp5Var7.getList(3);
        kotlin.jvm.internal.o.f(list11, "getValues(...)");
        kz5.h0.w(list11, new java.lang.String[]{"0", "1"});
        list10.add(dp5Var7);
        java.util.LinkedList list12 = dp5Var.getList(5);
        r45.dp5 dp5Var8 = new r45.dp5();
        dp5Var8.set(0, "RepairerConfig_Pay_UseBiometricPrompt_Int");
        dp5Var8.set(1, "强制使用BiometricPrompt（0：默认、1：使用、2：不使用）");
        dp5Var8.set(2, 3);
        java.util.LinkedList list13 = dp5Var8.getList(3);
        kotlin.jvm.internal.o.f(list13, "getValues(...)");
        kz5.h0.w(list13, new java.lang.String[]{"0", "1", "2"});
        list12.add(dp5Var8);
        java.util.LinkedList list14 = dp5Var.getList(5);
        r45.dp5 dp5Var9 = new r45.dp5();
        dp5Var9.set(0, "RepairerConfig_Pay_KindaHotReload_Int");
        dp5Var9.set(1, "kinda hot reload（0：关闭、1：开启）");
        dp5Var9.set(2, 3);
        java.util.LinkedList list15 = dp5Var9.getList(3);
        kotlin.jvm.internal.o.f(list15, "getValues(...)");
        kz5.h0.w(list15, new java.lang.String[]{"0", "1"});
        list14.add(dp5Var9);
        java.util.LinkedList list16 = dp5Var.getList(5);
        r45.dp5 dp5Var10 = new r45.dp5();
        dp5Var10.set(0, "RepairerActivity_PayDebugUI");
        dp5Var10.set(1, "支付调试页面");
        dp5Var10.set(2, 2);
        dp5Var10.getList(3).add("com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI");
        list16.add(dp5Var10);
        java.util.LinkedList list17 = dp5Var.getList(5);
        r45.dp5 dp5Var11 = new r45.dp5();
        dp5Var11.set(0, "RepairerConfig_Pay_HoneyPayCross_Int");
        dp5Var11.set(1, "亲属卡跨平台（0：默认、1：开启、2：关闭）");
        dp5Var11.set(2, 3);
        java.util.LinkedList list18 = dp5Var11.getList(3);
        kotlin.jvm.internal.o.f(list18, "getValues(...)");
        kz5.h0.w(list18, new java.lang.String[]{"0", "1", "2"});
        list17.add(dp5Var11);
        java.util.LinkedList list19 = dp5Var.getList(5);
        r45.dp5 dp5Var12 = new r45.dp5();
        dp5Var12.set(0, "RepairerConfig_Pay_FaceCheckCross_Int");
        dp5Var12.set(1, "人脸跨平台（0：默认、1：开启、2：关闭）");
        dp5Var12.set(2, 3);
        java.util.LinkedList list20 = dp5Var12.getList(3);
        kotlin.jvm.internal.o.f(list20, "getValues(...)");
        kz5.h0.w(list20, new java.lang.String[]{"0", "1", "2"});
        list19.add(dp5Var12);
        java.util.LinkedList list21 = dp5Var.getList(5);
        r45.dp5 dp5Var13 = new r45.dp5();
        dp5Var13.set(0, "RepairerConfig_Pay_UnionTransfer_Int");
        dp5Var13.set(1, "强制打开互通转账（0：不强制打开、1：强制打开）");
        dp5Var13.set(2, 3);
        java.util.LinkedList list22 = dp5Var13.getList(3);
        kotlin.jvm.internal.o.f(list22, "getValues(...)");
        kz5.h0.w(list22, new java.lang.String[]{"0", "1"});
        list21.add(dp5Var13);
        arrayList.add(dp5Var);
        r45.dp5 dp5Var14 = new r45.dp5();
        dp5Var14.set(0, "RepairerActivity_PaySetEnvId");
        dp5Var14.set(1, "设置测试环境ID");
        dp5Var14.set(2, 2);
        dp5Var14.getList(3).add("com.tencent.mm.plugin.paytest.ui.PayTestEnvInfoSettingUI");
        arrayList.add(dp5Var14);
        r45.dp5 dp5Var15 = new r45.dp5();
        dp5Var15.set(0, "RepairerActivity_SetH5Proxy");
        dp5Var15.set(1, "开启测试H5代理");
        dp5Var15.set(2, 2);
        dp5Var15.getList(3).add("com.tencent.mm.plugin.paytest.ui.SetH5ProxySettingUI");
        arrayList.add(dp5Var15);
        return arrayList;
    }
}
