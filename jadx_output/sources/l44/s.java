package l44;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f316331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 f316333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f54.x f316334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.widget.CheckBox checkBox, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 h2Var, f54.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f316332e = checkBox;
        this.f316333f = h2Var;
        this.f316334g = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        l44.s sVar = new l44.s(this.f316332e, this.f316333f, this.f316334g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        java.lang.Object invokeSuspend = ((l44.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        l44.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f316331d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.widget.CheckBox checkBox = this.f316332e;
            if (checkBox != null && checkBox.isChecked()) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 h2Var = this.f316333f;
                h2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                if (!h2Var.f162841b) {
                    l44.m5 m5Var = l44.m5.f316267a;
                    java.lang.String a17 = this.f316334g.a().a();
                    this.f316331d = 1;
                    obj = m5Var.a(a17, 182, this);
                    if (obj == aVar) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                        return aVar;
                    }
                }
            }
            lVar = new l44.l(false, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
            return lVar;
        }
        if (i17 != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
            throw illegalStateException;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        lVar = new l44.l(true, ((java.lang.Boolean) obj).booleanValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
        return lVar;
    }
}
