package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class e2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.h2 f168221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.sns.ui.h2 h2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168221d = h2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        com.tencent.mm.plugin.sns.ui.e2 e2Var = new com.tencent.mm.plugin.sns.ui.e2(this.f168221d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        return e2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.e2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.h2 h2Var = this.f168221d;
        java.lang.String o17 = com.tencent.mm.plugin.sns.ui.h2.o(h2Var);
        if (o17 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(o17);
        int i17 = n07.outWidth;
        int i18 = n07.outHeight;
        float f17 = i65.a.f(h2Var.f169957c, com.tencent.mm.R.dimen.f480610ab2);
        float f18 = i18 * (f17 / i17);
        java.lang.String o18 = com.tencent.mm.plugin.sns.ui.h2.o(h2Var);
        if (o18 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(o18, (int) f18, (int) f17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1$bitmap$1");
        return T;
    }
}
