package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes8.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.c f173257e;

    public b(in5.s0 s0Var, com.tencent.mm.plugin.textstatus.convert.topic.c cVar) {
        this.f173256d = s0Var;
        this.f173257e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/NotifyInfoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bj4.a aVar = bj4.a.f21163a;
        android.content.Context context = this.f173256d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        yz5.a aVar2 = this.f173257e.f173258e;
        aVar.a(context, aVar2 != null ? ((java.lang.Number) aVar2.invoke()).intValue() : 0, true);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/NotifyInfoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
