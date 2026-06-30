package wj5;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj5.p f446822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oo0.a f446823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f446824g;

    public m(java.lang.String str, wj5.p pVar, oo0.a aVar, in5.s0 s0Var) {
        this.f446821d = str;
        this.f446822e = pVar;
        this.f446823f = aVar;
        this.f446824g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.report.m0 m0Var = com.tencent.mm.ui.report.m0.f209698a;
        java.lang.String hostRoomId = this.f446821d;
        kotlin.jvm.internal.o.f(hostRoomId, "$hostRoomId");
        java.util.List list = this.f446822e.f446832g.f462724f;
        long size = list != null ? ((java.util.LinkedList) list).size() : 0;
        oo0.a aVar = this.f446823f;
        m0Var.b(hostRoomId, size, java.lang.String.valueOf(((oo0.d) aVar).field_liveId), 4L, java.lang.System.currentTimeMillis());
        com.tencent.mm.ui.LiveTalkRoomTipsBar.b(aVar, this.f446824g.f293121e);
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
