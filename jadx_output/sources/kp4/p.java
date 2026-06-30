package kp4;

/* loaded from: classes4.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.r f311129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.q f311130e;

    public p(kp4.r rVar, kp4.q qVar) {
        this.f311129d = rVar;
        this.f311130e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kp4.r rVar = this.f311129d;
        yz5.p pVar = rVar.f311139h;
        if (pVar != null) {
            kp4.q qVar = this.f311130e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(qVar.getAdapterPosition());
            java.lang.Object obj = rVar.f311135d.get(qVar.getAdapterPosition());
            kotlin.jvm.internal.o.f(obj, "get(...)");
            pVar.invoke(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
