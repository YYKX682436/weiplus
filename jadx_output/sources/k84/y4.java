package k84;

/* loaded from: classes4.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(k84.c6 c6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305354e = c6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        k84.y4 y4Var = new k84.y4(this.f305354e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        return y4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        java.lang.Object invokeSuspend = ((k84.y4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305353d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean C = com.tencent.mm.ui.bk.C();
            java.lang.String str = null;
            k84.c6 c6Var = this.f305354e;
            if (C) {
                mb4.c A = k84.c6.A(c6Var);
                if (A != null) {
                    str = A.likedIconDark;
                }
            } else {
                mb4.c A2 = k84.c6.A(c6Var);
                if (A2 != null) {
                    str = A2.likedIcon;
                }
            }
            if (str == null) {
                str = "";
            }
            n74.r rVar = n74.r.f335421a;
            com.tencent.mm.ui.widget.imageview.WeImageView B = k84.c6.B(c6Var);
            this.f305353d = 1;
            if (rVar.e(str, B, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initLikedIcon$1");
        return f0Var;
    }
}
