package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.n0 f173319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.d f173321f;

    public m0(com.tencent.mm.plugin.textstatus.convert.topic.n0 n0Var, in5.s0 s0Var, nj4.d dVar) {
        this.f173319d = n0Var;
        this.f173320e = s0Var;
        this.f173321f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupHeaderConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f173319d.getClass();
        nj4.d dVar = this.f173321f;
        if (dVar.f337936d.f5135b.size() > 0) {
            ai4.e eVar = dVar.f337936d;
            mj4.k kVar = (mj4.k) ((mj4.h) eVar.f5135b.get(0));
            java.lang.String o17 = kVar.o();
            com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
            android.content.Context context = this.f173320e.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var, context, o17, 1002, null, null, null, null, null, 248, null);
            qj4.s.n(qj4.s.f363958a, 6L, kVar.h(), eVar.f5135b.size(), kVar.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f355225s), null, null, null, 14832, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupHeaderConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
