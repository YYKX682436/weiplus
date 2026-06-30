package zd5;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.g f471678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f471679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471680f;

    public f(zd5.g gVar, androidx.recyclerview.widget.k3 k3Var, int i17) {
        this.f471678d = gVar;
        this.f471679e = k3Var;
        this.f471680f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiAllResultAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zd5.g gVar = this.f471678d;
        yz5.q qVar = gVar.f471684g;
        if (qVar != null) {
            android.view.View itemView = this.f471679e.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            int i17 = this.f471680f;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = gVar.f471683f.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            qVar.invoke(itemView, valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiAllResultAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
