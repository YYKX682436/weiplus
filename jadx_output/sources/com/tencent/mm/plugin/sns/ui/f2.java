package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f168287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.h2 f168288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f168289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.sns.ui.h2 h2Var, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168288e = h2Var;
        this.f168289f = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        com.tencent.mm.plugin.sns.ui.f2 f2Var = new com.tencent.mm.plugin.sns.ui.f2(this.f168288e, this.f168289f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        return f2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f168287d;
        com.tencent.mm.plugin.sns.ui.h2 h2Var = this.f168288e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.sns.ui.e2 e2Var = new com.tencent.mm.plugin.sns.ui.e2(h2Var, null);
            this.f168287d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, e2Var, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.internal.o.f(obj, "withContext(...)");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBitmapContainer$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.util.HashMap hashMap = h2Var.f168485q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBitmapContainer$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.lang.String o17 = com.tencent.mm.plugin.sns.ui.h2.o(h2Var);
        if (o17 == null) {
            kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            throw null;
        }
        hashMap.put(o17, bitmap);
        if (ca4.z0.f(bitmap)) {
            android.widget.ImageView imageView = this.f168289f;
            if ((imageView != null ? imageView.getTag() : null) != null && (imageView.getTag() instanceof java.lang.String)) {
                java.lang.Object tag = imageView.getTag();
                java.lang.String o18 = com.tencent.mm.plugin.sns.ui.h2.o(h2Var);
                if (o18 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    throw null;
                }
                if (kotlin.jvm.internal.o.b(tag, o18)) {
                    imageView.setImageBitmap(bitmap);
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        return f0Var;
    }
}
