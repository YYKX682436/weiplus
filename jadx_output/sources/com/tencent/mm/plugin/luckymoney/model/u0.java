package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class u0 implements com.tencent.mm.plugin.luckymoney.model.t4 {
    public u0(com.tencent.mm.plugin.luckymoney.model.v0 v0Var) {
    }

    public void a(java.lang.String str, dn.h hVar, java.lang.String str2, boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "the download image data is success! filePath:" + str2);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "download image fail!  filePath:" + str2);
        }
    }
}
