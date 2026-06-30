package com.tencent.mm.repairer.group;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/group/RepairerGroupSns;", "Lq55/g;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerGroupSns extends q55.g {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerGroup_Sns";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "朋友圈";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMain.class;
    }

    public final r45.dp5 h() {
        r45.dp5 dp5Var = new r45.dp5();
        dp5Var.set(0, "RepairerGroup_OldMaas");
        dp5Var.set(1, "Maas Config");
        dp5Var.set(2, 1);
        for (java.util.Map.Entry entry : kz5.c1.k(new jz5.l("RepairerConfig_Maas_ShowMainEntry_Int", "发表主入口"), new jz5.l("RepairerConfig_Maas_ShowEventEntry_Int", "活动发表入口"), new jz5.l("RepairerConfig_Maas_ShowCreationSameEntry_Int", "剪同款入口"), new jz5.l("RepairerConfig_Maas_ShowFeedCreationSameEntry_Int", "feed 剪同款入口"), new jz5.l("RepairerConfig_Maas_32BitEntry_Int", "是否打开 32 位入口"), new jz5.l("RepairerConfig_Maas_DisableAiAnalysis_Int", "是否关闭 AI 分析"), new jz5.l("RepairerConfig_Maas_DisableVideoTranscodeOpt_Int", "是否开启导入视频优化转码"), new jz5.l("RepairerConfig_Maas_SnsShowPostMainEntry_Int", "是否开启朋友圈发表入口"), new jz5.l("RepairerConfig_Maas_SnsShowCreateSameEntry_Int", "是否开启朋友圈剪同款入口"), new jz5.l("RepairerConfig_Maas_SnsSpringStrategy_Int", "使用秒剪推荐"), new jz5.l("RepairerConfig_Maas_SnsSpringOfflineStrategy_Int", "朋友圈春节离线策略"), new jz5.l("RepairerConfig_Maas_CleanLegacyRes_Int", "是否清理 maas 过期资源")).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            java.util.LinkedList list = dp5Var.getList(5);
            r45.dp5 dp5Var2 = new r45.dp5();
            dp5Var2.set(0, str);
            dp5Var2.set(1, str2);
            dp5Var2.set(2, 3);
            java.util.LinkedList list2 = dp5Var2.getList(3);
            kotlin.jvm.internal.o.f(list2, "getValues(...)");
            kz5.h0.w(list2, new java.lang.String[]{"-1", "0", "1"});
            java.util.LinkedList list3 = dp5Var2.getList(6);
            kotlin.jvm.internal.o.f(list3, "getValueAlias(...)");
            kz5.h0.w(list3, new java.lang.String[]{"默认", "关闭", "打开"});
            list.add(dp5Var2);
        }
        java.util.LinkedList list4 = dp5Var.getList(5);
        r45.dp5 dp5Var3 = new r45.dp5();
        dp5Var3.set(0, "RepairerConfig_Maas_MinApiLevel_Int");
        dp5Var3.set(1, "最小支持API Level");
        dp5Var3.set(2, 3);
        java.util.LinkedList list5 = dp5Var3.getList(3);
        kotlin.jvm.internal.o.f(list5, "getValues(...)");
        kz5.h0.w(list5, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        java.util.LinkedList list6 = dp5Var3.getList(6);
        kotlin.jvm.internal.o.f(list6, "getValueAlias(...)");
        kz5.h0.w(list6, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        list4.add(dp5Var3);
        java.util.LinkedList list7 = dp5Var.getList(5);
        r45.dp5 dp5Var4 = new r45.dp5();
        dp5Var4.set(0, "RepairerConfig_Maas_SnsExportVideoBitrate_Int");
        dp5Var4.set(1, "朋友圈秒剪模板视频导出码率");
        dp5Var4.set(2, 3);
        java.util.LinkedList list8 = dp5Var4.getList(3);
        kotlin.jvm.internal.o.f(list8, "getValues(...)");
        kz5.h0.w(list8, new java.lang.String[]{"0", "1000000", "2000000", "4000000", "6000000", "8000000", "10000000"});
        java.util.LinkedList list9 = dp5Var4.getList(6);
        kotlin.jvm.internal.o.f(list9, "getValueAlias(...)");
        kz5.h0.w(list9, new java.lang.String[]{"默认", "1M", "2M", "4M", "6M", "8M", "10M"});
        list7.add(dp5Var4);
        java.util.LinkedList list10 = dp5Var.getList(5);
        r45.dp5 dp5Var5 = new r45.dp5();
        dp5Var5.set(0, "RepairerConfig_Maas_SnsExportVideoDimension_Int");
        dp5Var5.set(1, "朋友圈秒剪模板视频导出分辨率");
        dp5Var5.set(2, 3);
        java.util.LinkedList list11 = dp5Var5.getList(3);
        kotlin.jvm.internal.o.f(list11, "getValues(...)");
        kz5.h0.w(list11, new java.lang.String[]{"0", "540", "720", "1080"});
        java.util.LinkedList list12 = dp5Var5.getList(6);
        kotlin.jvm.internal.o.f(list12, "getValueAlias(...)");
        kz5.h0.w(list12, new java.lang.String[]{"默认", "540p", "720p", "1080p"});
        list10.add(dp5Var5);
        java.util.LinkedList list13 = dp5Var.getList(5);
        r45.dp5 dp5Var6 = new r45.dp5();
        dp5Var6.set(0, "RepairerConfig_Maas_PreprocTimeoutLimit_Int");
        dp5Var6.set(1, "preproc 超时时间");
        dp5Var6.set(2, 3);
        java.util.LinkedList list14 = dp5Var6.getList(3);
        kotlin.jvm.internal.o.f(list14, "getValues(...)");
        kz5.h0.w(list14, new java.lang.String[]{"1", "5", "20", "25", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "40"});
        java.util.LinkedList list15 = dp5Var6.getList(6);
        kotlin.jvm.internal.o.f(list15, "getValueAlias(...)");
        kz5.h0.w(list15, new java.lang.String[]{"1", "5", "20", "25", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "40"});
        list13.add(dp5Var6);
        java.util.LinkedList list16 = dp5Var.getList(5);
        r45.dp5 dp5Var7 = new r45.dp5();
        dp5Var7.set(0, "RepairerConfig_Maas_FinderFallBack_Int");
        dp5Var7.set(1, "视频号推荐回退策略");
        dp5Var7.set(2, 3);
        dp5Var7.getList(3).addAll(kz5.c0.i("0", "1", "2"));
        dp5Var7.getList(6).addAll(kz5.c0.i("无", "推荐网络出错", "不走推荐"));
        list16.add(dp5Var7);
        java.util.LinkedList list17 = dp5Var.getList(5);
        r45.dp5 dp5Var8 = new r45.dp5();
        dp5Var8.set(0, "RepairerConfig_Maas_SnsH265ExportCodecType_Int");
        dp5Var8.set(1, "朋友圈 h265 编码方式");
        dp5Var8.set(2, 3);
        dp5Var8.getList(3).addAll(kz5.c0.i("1", "2", "3"));
        dp5Var8.getList(6).addAll(kz5.c0.i("默认", "硬编", "软编"));
        list17.add(dp5Var8);
        java.util.LinkedList list18 = dp5Var.getList(5);
        r45.dp5 dp5Var9 = new r45.dp5();
        dp5Var9.set(0, "RepairerConfig_Maas_LoadSoFromSdCard_Int");
        dp5Var9.set(1, "从 sd 卡加载 so");
        dp5Var9.set(2, 3);
        dp5Var9.getList(3).addAll(kz5.c0.i("0", "1"));
        dp5Var9.getList(6).addAll(kz5.c0.i("默认", "打开"));
        list18.add(dp5Var9);
        java.lang.String str3 = "getValueAlias(...)";
        java.lang.String str4 = "-1";
        for (java.util.Map.Entry entry2 : kz5.c1.k(new jz5.l("RepairerConfig_Maas_RecordTemplateEnable_Int", "拍摄模板发表入口"), new jz5.l("RepairerConfig_Maas_RecordTemplateFollow_Int", "拍摄feed跟拍入口"), new jz5.l("RepairerConfig_Maas_RecordTemplateTransfer_Int", "拍摄转发跟拍入口"), new jz5.l("RepairerConfig_Maas_RecordTemplateEvent_Int", "活动跟拍入口"), new jz5.l("RepairerConfig_Maas_SnsSpringOfflineStrategy_Int", "朋友圈春节离线策略"), new jz5.l("RepairerConfig_Maas_SnsSpringStrategy_Int", "朋友圈春节策略"), new jz5.l("RepairerConfig_Maas_SnsH265Export_Int", "sns h265 export"), new jz5.l("RepairerConfig_Maas_SnsMusicSearch_Int", "朋友圈音乐搜索"), new jz5.l("RepairerConfig_Maas_PreloadEnable_Int", "开启预加载"), new jz5.l("RepairerConfig_Maas_DirectSearchEnable_Int", "音乐搜索直接搜索")).entrySet()) {
            java.lang.String str5 = (java.lang.String) entry2.getKey();
            java.lang.String str6 = (java.lang.String) entry2.getValue();
            java.util.LinkedList list19 = dp5Var.getList(5);
            r45.dp5 dp5Var10 = new r45.dp5();
            dp5Var10.set(0, str5);
            dp5Var10.set(1, str6);
            dp5Var10.set(2, 3);
            java.util.LinkedList list20 = dp5Var10.getList(3);
            kotlin.jvm.internal.o.f(list20, "getValues(...)");
            java.lang.String str7 = str4;
            kz5.h0.w(list20, new java.lang.String[]{str7, "0", "1"});
            java.util.LinkedList list21 = dp5Var10.getList(6);
            java.lang.String str8 = str3;
            kotlin.jvm.internal.o.f(list21, str8);
            kz5.h0.w(list21, new java.lang.String[]{"默认", "关闭", "打开"});
            list19.add(dp5Var10);
            str4 = str7;
            str3 = str8;
        }
        java.util.LinkedList list22 = dp5Var.getList(5);
        r45.dp5 dp5Var11 = new r45.dp5();
        dp5Var11.set(0, "RepairerConfig_Maas_MinApiLevel_Int");
        dp5Var11.set(1, "MassMinApiLevel");
        dp5Var11.set(2, 3);
        java.util.LinkedList list23 = dp5Var11.getList(3);
        kotlin.jvm.internal.o.f(list23, "getValues(...)");
        kz5.h0.w(list23, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        java.util.LinkedList list24 = dp5Var11.getList(6);
        kotlin.jvm.internal.o.f(list24, str3);
        kz5.h0.w(list24, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        list22.add(dp5Var11);
        return dp5Var;
    }
}
