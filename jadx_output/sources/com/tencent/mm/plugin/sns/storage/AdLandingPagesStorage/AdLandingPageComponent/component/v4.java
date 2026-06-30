package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class v4 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 implements java.io.Serializable {
    public final ab4.o0 B;

    public v4(android.content.Context context, ab4.o0 o0Var, android.view.ViewGroup viewGroup) {
        super(context, o0Var, viewGroup);
        this.B = o0Var;
        ib4.h hVar = this.f165386t;
        java.lang.String str = o0Var.f2885z1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hVar.b("emotionProductId", str == null ? "" : str);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
        try {
            java.lang.String n17 = u().n();
            if (android.text.TextUtils.isEmpty(n17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageEmojiBtnComp", "doBtnClick, updatedUxInfo==null, src=" + u().l() + ", originSource=" + u().g());
                n17 = u().o();
            }
            h0(this.f165049d, this.B.f2885z1, n17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageEmojiBtnComp", "doBtnClick, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
    }

    public void h0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageEmojiBtnComp", "jumpEmojiDetail, productID=" + str + ", uxinfo=" + str2);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        qk.c0 c0Var = new qk.c0(str);
        c0Var.f364198g = 22;
        c0Var.f364155a = 33;
        if (str2 == null) {
            str2 = "";
        }
        c0Var.f364206o = str2;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageEmojiBtnComp", "emoticon liteapp service not found");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, c0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
        }
    }
}
