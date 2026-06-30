package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class i6 extends com.tencent.mm.plugin.luckymoney.model.h6 {
    public i6(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7, java.lang.String str8, int i27, int i28, java.lang.String str9, java.lang.String str10, int i29) {
        this.f145326n = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("totalNum", i17 + "");
        hashMap.put("totalAmount", j17 + "");
        hashMap.put("perValue", j18 + "");
        hashMap.put("hbType", i18 + "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put("sendUserName", str5);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            hashMap.put("unique_id", str8);
        }
        hashMap.put("user_confirm_jump", java.lang.String.valueOf(i27));
        hashMap.put("unpay_type", java.lang.String.valueOf(i28));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i29);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put(dm.i4.COL_USERNAME, str3);
            if (com.tencent.mm.storage.z3.R4(str3)) {
                hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str3) + "");
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str2));
            hashMap.put("nickName", java.net.URLEncoder.encode(str6 == null ? "" : str6));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                hashMap.put("receiveNickName", java.net.URLEncoder.encode(str4));
            }
        }
        hashMap.put("inWay", i19 + "");
        if (i19 == 0 || i19 == 1 || i19 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            hashMap.put("showSourceMac", java.net.URLEncoder.encode(str7));
        }
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "20");
        hashMap.put("union_source", "0");
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str8;
        objArr[1] = java.lang.Integer.valueOf(i27);
        objArr[2] = java.lang.Integer.valueOf(i28);
        objArr[3] = str9 != null ? str9 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrepareLuckyMoneyUnion", "NetScenePrepareLuckyMoneyUnion request :uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", objArr);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.h6, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/requestunionhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.h6, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4915;
    }
}
