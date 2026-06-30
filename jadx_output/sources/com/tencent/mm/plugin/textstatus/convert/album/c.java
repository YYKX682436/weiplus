package com.tencent.mm.plugin.textstatus.convert.album;

/* loaded from: classes11.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.album.d f173214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fj4.c f173216f;

    public c(com.tencent.mm.plugin.textstatus.convert.album.d dVar, in5.s0 s0Var, fj4.c cVar) {
        this.f173214d = dVar;
        this.f173215e = s0Var;
        this.f173216f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/album/HistoryCalendarItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.convert.album.b bVar = this.f173214d.f173217e;
        android.content.Context context = this.f173215e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        long j17 = this.f173216f.f263232i;
        ((com.tencent.mm.plugin.textstatus.convert.album.e) bVar).getClass();
        qj4.s.p(qj4.s.f363958a, 2L, 0L, null, 6, null);
        bk4.d.f21434j.b(j17, context);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/album/HistoryCalendarItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
