package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.l0 f173298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.c f173300f;

    public k0(com.tencent.mm.plugin.textstatus.convert.topic.l0 l0Var, in5.s0 s0Var, nj4.c cVar) {
        this.f173298d = l0Var;
        this.f173299e = s0Var;
        this.f173300f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f173298d.getClass();
        nj4.c cVar = this.f173300f;
        if (cVar.f337936d.f5135b.size() > 0) {
            ai4.e eVar = cVar.f337936d;
            mj4.k kVar = (mj4.k) ((mj4.h) eVar.f5135b.get(0));
            java.lang.String o17 = kVar.o();
            com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
            android.content.Context context = this.f173299e.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var, context, o17, 1002, null, null, null, null, null, 248, null);
            qj4.s.n(qj4.s.f363958a, 6L, kVar.h(), eVar.f5135b.size(), kVar.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f355225s), null, null, null, 14832, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
