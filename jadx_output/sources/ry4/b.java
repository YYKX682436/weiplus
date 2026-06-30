package ry4;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.a f401579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.g f401580e;

    public b(ry4.a aVar, ry4.g gVar) {
        this.f401579d = aVar;
        this.f401580e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f401579d.getAdapterPosition();
        if (adapterPosition == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ry4.g gVar = this.f401580e;
        if (gVar.f401630n.contains(java.lang.Integer.valueOf(adapterPosition))) {
            gVar.f401630n.remove(java.lang.Integer.valueOf(adapterPosition));
        } else {
            gVar.f401630n.add(java.lang.Integer.valueOf(adapterPosition));
        }
        gVar.notifyItemChanged(adapterPosition, "PAYLOAD_SELECTION");
        gVar.f401626g.invoke(java.lang.Integer.valueOf(gVar.f401630n.size()));
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
