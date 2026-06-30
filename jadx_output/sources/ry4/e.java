package ry4;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.g f401616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem f401617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401618f;

    public e(ry4.g gVar, com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, int i17) {
        this.f401616d = gVar;
        this.f401617e = shortcutCommandItem;
        this.f401618f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f401616d.f401625f.invoke(this.f401617e, java.lang.Integer.valueOf(this.f401618f));
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandAdapter$bindInteractions$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
