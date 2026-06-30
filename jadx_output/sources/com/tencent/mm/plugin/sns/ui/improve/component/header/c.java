package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.e f168817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f168818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f168819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f168820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f168821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f168822i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.sns.ui.improve.component.header.e eVar, kotlin.jvm.internal.f0 f0Var, java.util.List list, int i17, kotlin.jvm.internal.h0 h0Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168817d = eVar;
        this.f168818e = f0Var;
        this.f168819f = list;
        this.f168820g = i17;
        this.f168821h = h0Var;
        this.f168822i = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.c cVar = new com.tencent.mm.plugin.sns.ui.improve.component.header.c(this.f168817d, this.f168818e, this.f168819f, this.f168820g, this.f168821h, this.f168822i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.c cVar = (com.tencent.mm.plugin.sns.ui.improve.component.header.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f168818e.f310116d;
        int size = this.f168819f.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        com.tencent.mm.plugin.sns.ui.improve.component.header.e eVar = this.f168817d;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        java.util.HashMap hashMap = eVar.f168835c;
        android.view.View view = (android.view.View) hashMap.get(java.lang.Integer.valueOf(i17));
        android.widget.LinearLayout linearLayout = eVar.f168834b;
        if (view != null) {
            if (view.getParent() != null) {
                android.view.ViewParent parent = view.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(view);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        } else {
            android.view.View inflate = com.tencent.mm.ui.id.b(eVar.f168836d).inflate(com.tencent.mm.R.layout.bkv, (android.view.ViewGroup) linearLayout, false);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            view = (android.widget.LinearLayout) inflate;
            view.setOnClickListener(new com.tencent.mm.plugin.sns.ui.improve.component.header.a(eVar, size, this.f168820g));
            hashMap.put(java.lang.Integer.valueOf(i17), view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
        linearLayout2.setTag(this.f168821h.f310123d);
        android.view.View findViewById = linearLayout2.findViewById(com.tencent.mm.R.id.n_u);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        java.lang.Object obj2 = this.f168822i;
        if (obj2 instanceof com.tencent.mm.plugin.sns.storage.SnsInfo) {
            textView.setText(com.tencent.mm.R.string.jg6);
        } else if (obj2 instanceof wa4.n) {
            int i18 = ((wa4.n) obj2).f444267f;
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 7) {
                        if (i18 != 8) {
                            if (i18 == 20 || i18 == 21) {
                                textView.setText(com.tencent.mm.R.string.mcz);
                            }
                        }
                    }
                }
                textView.setText(com.tencent.mm.R.string.je9);
            }
            textView.setText(com.tencent.mm.R.string.je_);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        linearLayout.addView(linearLayout2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
        return f0Var;
    }
}
