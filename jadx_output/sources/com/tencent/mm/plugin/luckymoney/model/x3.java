package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class x3 implements com.tencent.mm.plugin.luckymoney.model.n5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f145694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145695b;

    public x3(boolean z17, java.lang.String str) {
        this.f145694a = z17;
        this.f145695b = str;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.n5
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.n5
    public int b(com.tencent.mm.modelbase.o oVar, com.tencent.mm.network.l0 l0Var) {
        r45.ex3 ex3Var = (r45.ex3) oVar.f70711b.f70700a;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gjq);
        java.lang.String format = this.f145694a ? java.lang.String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"wishing\":\"%s\",\"isSender\":0,\"receiveStatus\":0,\"hbStatus\":2,\"statusMess\":\"给你发了一个红包\",\"hbType\":0,\"watermark\":\"\",\"scenePicSwitch\":1,\"preStrainFlag\":1,\"agree_duty\":{\"title\":\"\",\"service_protocol_wording\":\"\",\"service_protocol_url\":\"\",\"button_wording\":\"\",\"delay_expired_time\":0,\"agreed_flag\":1},\"sendUserName\":\"1@fackuser\",\"timingIdentifier\":\"BC1985F636763728826336B3251529F4\",\"showYearExpression\":1,\"expression_md5\":\"%s\",\"expression_type\":\"2\",\"showRecNormalExpression\":1}", string, this.f145695b) : java.lang.String.format("{\"retcode\":0,\"retmsg\":\"ok\",\"sendId\":\"1000039401201911277000281247819\",\"wishing\":\"%s\",\"isSender\":0,\"receiveStatus\":0,\"hbStatus\":2,\"statusMess\":\"给你发了一个红包\",\"hbType\":0,\"watermark\":\"\",\"scenePicSwitch\":1,\"preStrainFlag\":1,\"agree_duty\":{\"title\":\"\",\"service_protocol_wording\":\"\",\"service_protocol_url\":\"\",\"button_wording\":\"\",\"delay_expired_time\":0,\"agreed_flag\":1},\"sendUserName\":\"1@fackuser\",\"timingIdentifier\":\"BC1985F636763728826336B3251529F4\",\"showYearExpression\":1,\"expression_md5\":\"\",\"showRecNormalExpression\":1}", string);
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(format.getBytes());
        ex3Var.f373781d = cu5Var;
        l0Var.onGYNetEnd(0, 0, 0, "", oVar, null);
        return 0;
    }
}
