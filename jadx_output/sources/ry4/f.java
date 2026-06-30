package ry4;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.a f401620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.g f401621e;

    public f(ry4.a aVar, ry4.g gVar) {
        this.f401620d = aVar;
        this.f401621e = gVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ry4.a aVar = this.f401620d;
        int adapterPosition = aVar.getAdapterPosition();
        if (adapterPosition == -1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        ry4.g gVar = this.f401621e;
        yz5.q qVar = gVar.f401627h;
        java.lang.Object obj = gVar.f401623d.get(adapterPosition);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(adapterPosition);
        android.view.View itemView = aVar.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        qVar.invoke(obj, valueOf, itemView);
        yj0.a.i(true, this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
