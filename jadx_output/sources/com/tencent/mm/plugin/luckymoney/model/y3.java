package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class y3 implements com.tencent.mm.plugin.luckymoney.model.n5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f145724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145725b;

    public y3(boolean z17, java.lang.String str) {
        this.f145724a = z17;
        this.f145725b = str;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.n5
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.n5
    public int b(com.tencent.mm.modelbase.o oVar, com.tencent.mm.network.l0 l0Var) {
        r45.ex3 ex3Var = (r45.ex3) oVar.f70711b.f70700a;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gjq);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gn_);
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gn7);
        java.lang.String format = this.f145724a ? java.lang.String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"amount\":888,\"recNum\":1,\"recAmount\":1,\"totalNum\":1,\"totalAmount\":888,\"hasWriteAnswer\":0,\"hbType\":0,\"isSender\":0,\"isContinue\":0,\"receiveStatus\":2,\"hbStatus\":4,\"statusMess\":\"\",\"wishing\":\"%s\",\"receiveId\":\"1000039401000911277000281247819\",\"headTitle\":\"\",\"canShare\":0,\"operationHeader\":[],\"record\":[],\"watermark\":\"\",\"jumpChange\":1,\"changeWording\":\"%s\",\"sendUserName\":\"1@fackuser\",\"changeUrl\":\"weixin:\\/\\/wxpay\\/change\",\"real_name_info\":{\"guide_flag\":0},\"sessionUserName\":\"1@fackuser\",\"jumpChangeType\":1,\"changeIconUrl\":\"\",\"showSourceOpen\":{\"source\":{\"subType\":0,\"sourceObject\":{\"detailImage\":\"\",\"detailImageMd5\":\"\"}, \"detail_link_type\":\"%s\",\"detail_link_appname\":\"%s\",\"detail_link_url\":\"%s\",\"detail_link_title\":\"%s\"},\"operation\":{\"name\":\"%s\",\"type\":\"Text\",\"content\":\"%s\",\"enable\":1,\"iconUrl\":\"\",\"ossKey\":4294967295}},\"expression_md5\":\"%s\",\"expression_type\":0,\"showYearExpression\":1,\"showOpenNormalExpression\":1,\"enableAnswerByExpression\":1,\"enableAnswerBySelfie\":0}", string, string2, "0", "", "", "", string3, "", this.f145725b) : java.lang.String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"amount\":888,\"recNum\":1,\"recAmount\":1,\"totalNum\":1,\"totalAmount\":888,\"hasWriteAnswer\":0,\"hbType\":0,\"isSender\":0,\"isContinue\":0,\"receiveStatus\":2,\"hbStatus\":4,\"statusMess\":\"\",\"wishing\":\"%s\",\"receiveId\":\"1000039401000911277000281247819\",\"headTitle\":\"\",\"canShare\":0,\"operationHeader\":[],\"record\":[],\"watermark\":\"\",\"jumpChange\":1,\"changeWording\":\"%s\",\"sendUserName\":\"1@fackuser\",\"changeUrl\":\"weixin:\\/\\/wxpay\\/change\",\"real_name_info\":{\"guide_flag\":0},\"sessionUserName\":\"1@fackuser\",\"jumpChangeType\":1,\"changeIconUrl\":\"\",\"showSourceOpen\":{\"source\":{\"subType\":0,\"sourceObject\":{\"detailImage\":\"\",\"detailImageMd5\":\"\"},\"detail_link_type\":\"%s\",\"detail_link_appname\":\"%s\",\"detail_link_url\":\"%s\",\"detail_link_title\":\"%s\"},\"operation\":{\"name\":\"%s\",\"type\":\"Text\",\"content\":\"%s\",\"enable\":1,\"iconUrl\":\"\",\"ossKey\":4294967295}},\"expression_md5\":\"\",\"expression_type\":0,\"showYearExpression\":1,\"showOpenNormalExpression\":1,\"enableAnswerByExpression\":1,\"enableAnswerBySelfie\":0}", string, string2, "0", "", "", "", string3, "");
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(format.getBytes());
        ex3Var.f373781d = cu5Var;
        l0Var.onGYNetEnd(0, 0, 0, "", oVar, null);
        return 0;
    }
}
