package ry4;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.a f401587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.g f401588e;

    public c(ry4.a aVar, ry4.g gVar) {
        this.f401587d = aVar;
        this.f401588e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f401587d.getAdapterPosition();
        if (adapterPosition == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ry4.g gVar = this.f401588e;
        gVar.f401625f.invoke(gVar.f401623d.get(adapterPosition), java.lang.Integer.valueOf(adapterPosition));
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
