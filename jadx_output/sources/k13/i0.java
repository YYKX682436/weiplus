package k13;

/* loaded from: classes10.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.c f303222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI f303223e;

    public i0(i13.c cVar, com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI) {
        this.f303222d = cVar;
        this.f303223e = forceNotifyShowUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f303222d.k(view);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI = this.f303223e;
        forceNotifyShowUI.f137350p = false;
        forceNotifyShowUI.f137351q = false;
        forceNotifyShowUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
