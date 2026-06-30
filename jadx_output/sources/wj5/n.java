package wj5;

/* loaded from: classes8.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj5.f f446825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj5.p f446827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oo0.a f446828g;

    public n(xj5.f fVar, java.lang.String str, wj5.p pVar, oo0.a aVar) {
        this.f446825d = fVar;
        this.f446826e = str;
        this.f446827f = pVar;
        this.f446828g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f446825d.f454897e = 3;
        com.tencent.mm.ui.report.m0 m0Var = com.tencent.mm.ui.report.m0.f209698a;
        java.lang.String hostRoomId = this.f446826e;
        kotlin.jvm.internal.o.f(hostRoomId, "$hostRoomId");
        wj5.p pVar = this.f446827f;
        java.util.List list = pVar.f446832g.f462724f;
        long size = list != null ? ((java.util.LinkedList) list).size() : 0;
        oo0.d dVar = (oo0.d) this.f446828g;
        m0Var.b(hostRoomId, size, java.lang.String.valueOf(dVar.field_liveId), 3L, java.lang.System.currentTimeMillis());
        ((oo0.e) ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi()).z0(dVar.field_liveId);
        pVar.f446832g.o0();
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
