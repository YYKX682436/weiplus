package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj4.c f173287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f173288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f173290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mj4.h f173291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173292i;

    public i0(nj4.c cVar, android.view.ViewGroup viewGroup, java.lang.String str, android.widget.ImageView imageView, mj4.h hVar, java.lang.String str2) {
        this.f173287d = cVar;
        this.f173288e = viewGroup;
        this.f173289f = str;
        this.f173290g = imageView;
        this.f173291h = hVar;
        this.f173292i = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int size = this.f173287d.f337931f.f337936d.f5135b.size();
        com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
        android.content.Context context = this.f173288e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var, context, this.f173289f, 1002, null, null, this.f173290g, null, null, 216, null);
        qj4.s sVar = qj4.s.f363958a;
        mj4.h hVar = this.f173291h;
        qj4.s.n(sVar, 7L, this.f173292i, size, this.f173289f, null, null, 0, 0L, 0L, xe0.j0.a(hVar, false, 1, null).f355218i, java.lang.Integer.valueOf(xe0.j0.a(hVar, false, 1, null).f355225s), null, null, null, 14832, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
