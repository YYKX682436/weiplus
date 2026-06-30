package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f168942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f168943f;

    /* renamed from: g, reason: collision with root package name */
    public int f168944g;

    /* renamed from: h, reason: collision with root package name */
    public int f168945h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f168946i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f168947m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.x1 f168948n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f168949o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.util.Set set, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168946i = set;
        this.f168947m = recyclerView;
        this.f168948n = x1Var;
        this.f168949o = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        com.tencent.mm.plugin.sns.ui.improve.component.m1 m1Var = new com.tencent.mm.plugin.sns.ui.improve.component.m1(this.f168946i, this.f168947m, this.f168948n, this.f168949o, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        return m1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int i17;
        com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var;
        java.util.Iterator it;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f168945h;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Iterator it6 = this.f168946i.iterator();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f168947m;
            com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var2 = this.f168948n;
            recyclerView = recyclerView2;
            i17 = this.f168949o;
            x1Var = x1Var2;
            it = it6;
        } else {
            if (i18 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
                throw illegalStateException;
            }
            i17 = this.f168944g;
            it = (java.util.Iterator) this.f168943f;
            x1Var = (com.tencent.mm.plugin.sns.ui.improve.component.x1) this.f168942e;
            recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f168941d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            com.tencent.mm.ui.component.UIComponent uIComponent = (com.tencent.mm.ui.component.UIComponent) it.next();
            if (uIComponent instanceof com.tencent.mm.plugin.sns.ui.improve.component.j) {
                this.f168941d = recyclerView;
                this.f168942e = x1Var;
                this.f168943f = it;
                this.f168944g = i17;
                this.f168945h = 1;
                if (((com.tencent.mm.plugin.sns.ui.improve.component.j) uIComponent).onScrollStateChanged(recyclerView, x1Var, i17, this) == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
                    return aVar;
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
        return f0Var;
    }
}
