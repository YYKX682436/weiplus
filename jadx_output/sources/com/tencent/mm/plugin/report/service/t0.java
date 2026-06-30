package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f158309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f158310e;

    public t0(int i17, int i18) {
        this.f158309d = i17;
        this.f158310e = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        long e17 = c01.id.e();
        com.tencent.mm.plugin.report.service.b1 b1Var = com.tencent.mm.plugin.report.service.b1.f158148a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f158309d;
        sb6.append(i17);
        sb6.append('_');
        int i18 = this.f158310e;
        sb6.append(i18);
        r45.xv6 xv6Var = null;
        if (com.tencent.mm.plugin.report.service.b1.f158153f.contains(sb6.toString()) || com.tencent.mm.plugin.report.service.b1.a(b1Var, i17, i18)) {
            java.util.LinkedList<r45.xv6> user_data_list = b1Var.e().f371548d;
            kotlin.jvm.internal.o.f(user_data_list, "user_data_list");
            for (r45.xv6 xv6Var2 : user_data_list) {
                if (xv6Var2.f390534e == i17 && xv6Var2.f390533d == i18) {
                    xv6Var = xv6Var2;
                }
            }
        }
        if (xv6Var == null) {
            xv6Var = new r45.xv6();
            xv6Var.f390534e = i17;
            xv6Var.f390533d = i18;
            xv6Var.f390535f = e17;
            xv6Var.f390536g = 0;
            com.tencent.mm.plugin.report.service.b1.f158148a.e().f371548d.add(xv6Var);
        }
        com.tencent.mm.plugin.report.service.b1 b1Var2 = com.tencent.mm.plugin.report.service.b1.f158148a;
        if (com.tencent.mm.plugin.report.service.b1.a(b1Var2, i17, i18)) {
            xv6Var.f390536g = 0;
        }
        xv6Var.f390536g++;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("op, businessType:");
        switch (i17) {
            case 1:
                str = "注册";
                break;
            case 2:
                str = "登录";
                break;
            case 3:
                str = "聊天";
                break;
            case 4:
                str = "个人信息";
                break;
            case 5:
                str = "视频号";
                break;
            case 6:
                str = "微信游戏";
                break;
            case 7:
                str = "看一看";
                break;
            case 8:
                str = "小程序";
                break;
            case 9:
                str = "状态";
                break;
            case 10:
                str = "微信运动";
                break;
            case 11:
                str = "公众号";
                break;
            case 12:
                str = "朋友圈";
                break;
            case 13:
                str = "通讯录";
                break;
            case 14:
                str = "卡包";
                break;
            case 15:
                str = "微信豆";
                break;
            case 16:
            case 23:
            default:
                str = "Unknown";
                break;
            case 17:
                str = "附近的人";
                break;
            case 18:
                str = "雷达";
                break;
            case 19:
                str = "摇一摇";
                break;
            case 20:
                str = "扫一扫";
                break;
            case 21:
                str = "搜一搜";
                break;
            case 22:
                str = "其它";
                break;
            case 24:
                str = "设置";
                break;
        }
        sb7.append(str);
        sb7.append('(');
        sb7.append(i17);
        sb7.append("), dataType:");
        switch (i18) {
            case 1:
                str2 = "微信昵称";
                break;
            case 2:
                str2 = "微信头像";
                break;
            case 3:
                str2 = "微信绑定手机号";
                break;
            case 4:
                str2 = "微信个人资料性别";
                break;
            case 5:
                str2 = "微信个人资料地区";
                break;
            case 6:
                str2 = "微信个性签名";
                break;
            case 7:
                str2 = "微信个人资料地址";
                break;
            case 8:
                str2 = "设备名称";
                break;
            case 9:
                str2 = "设备类型";
                break;
            case 10:
                str2 = "位置信息";
                break;
            case 11:
                str2 = "图片信息";
                break;
            case 12:
                str2 = "微信运动步数";
                break;
            case 13:
                str2 = "视频号名字";
                break;
            case 14:
                str2 = "视频号头像";
                break;
            case 15:
                str2 = "视频号性别";
                break;
            case 16:
                str2 = "视频号地区";
                break;
            case 17:
                str2 = "视频号简介";
                break;
            case 18:
                str2 = "视频号封面";
                break;
            case 19:
                str2 = "视频号认证信息";
                break;
            case 20:
                str2 = "视频号黑名单";
                break;
            case 21:
                str2 = "视频号绑定的公众号（H5）";
                break;
            case 22:
                str2 = "视频号绑定的企业微信（H5）";
                break;
            case 23:
                str2 = "微信游戏头像";
                break;
            case 24:
                str2 = "微信游戏昵称";
                break;
            case 25:
                str2 = "微信游戏生活照";
                break;
            case 26:
                str2 = "微信游戏签名";
                break;
            case 27:
                str2 = "微信游戏性别";
                break;
            case 28:
                str2 = "微信游戏生日";
                break;
            case 29:
                str2 = "微信游戏地区";
                break;
            case 30:
                str2 = "微信游戏领取福利姓名";
                break;
            case 31:
                str2 = "微信游戏领取福利手机号";
                break;
            case 32:
                str2 = "微信游戏领取福利地址";
                break;
            case 33:
                str2 = "推荐通讯录朋友(手机联系人)";
                break;
            default:
                str2 = com.eclipsesource.mmv8.Platform.UNKNOWN;
                break;
        }
        sb7.append(str2);
        sb7.append('(');
        sb7.append(i18);
        sb7.append("), count:");
        sb7.append(xv6Var.f390536g);
        sb7.append(", stack：");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb7.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.UserDataOperationReporter", sb7.toString());
        b1Var2.g();
    }
}
