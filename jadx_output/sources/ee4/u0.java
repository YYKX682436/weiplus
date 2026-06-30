package ee4;

/* loaded from: classes4.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f251759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee4.x0 f251760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(jz5.l lVar, ee4.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251759d = lVar;
        this.f251760e = x0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        ee4.u0 u0Var = new ee4.u0(this.f251759d, this.f251760e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        return u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        ee4.u0 u0Var = (ee4.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = ((android.os.Bundle) this.f251759d.f302834e).getInt("key_err_code", 0);
        ee4.x0 x0Var = this.f251760e;
        x0Var.f("collect is error event the code: " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dealAlertTips", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        x0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAlertTips", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        ke4.a aVar2 = ke4.a.f307025a;
        if (i17 == 1) {
            com.tencent.mm.ui.MMActivity c17 = x0Var.c();
            java.lang.String r17 = i65.a.r(x0Var.c(), com.tencent.mm.R.string.f493231ok3);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            ee4.s0 s0Var = new ee4.s0(Ni, Bi);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMsgTipsKnowAlert", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper");
            db5.e1.E(c17, r17, "", i65.a.r(c17, com.tencent.mm.R.string.f490454vi), false, new ie4.c(s0Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMsgTipsKnowAlert", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper");
            kotlin.jvm.internal.o.d(Ni);
            aVar2.e(2, Ni, Bi);
        } else if (i17 != 2) {
            x0Var.e("dealAlertTips the errCode is inValid");
        } else {
            com.tencent.mm.ui.MMActivity c18 = x0Var.c();
            java.lang.String r18 = i65.a.r(x0Var.c(), com.tencent.mm.R.string.f493230ok2);
            kotlin.jvm.internal.o.f(r18, "getString(...)");
            ee4.t0 t0Var = new ee4.t0(Ni, Bi);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMsgTipsKnowAlert", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper");
            db5.e1.E(c18, r18, "", i65.a.r(c18, com.tencent.mm.R.string.f490454vi), false, new ie4.c(t0Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMsgTipsKnowAlert", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper");
            kotlin.jvm.internal.o.d(Ni);
            aVar2.e(1, Ni, Bi);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAlertTips", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dealAlertTips", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1$1");
        return f0Var;
    }
}
