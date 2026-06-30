package k13;

/* loaded from: classes10.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.c f303226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI f303227e;

    public j0(i13.c cVar, com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI) {
        this.f303226d = cVar;
        this.f303227e = forceNotifyShowUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i13.c cVar = this.f303226d;
        if (cVar instanceof i13.p) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            long j17 = 1000;
            sb6.append(((i13.p) cVar).f287316n / j17);
            sb6.append(((i13.p) cVar).f287313h);
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ai(cVar.f287275d, sb6.toString(), 2, c01.id.c() / j17);
        }
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI forceNotifyShowUI = this.f303227e;
        forceNotifyShowUI.finish();
        forceNotifyShowUI.f137350p = false;
        forceNotifyShowUI.f137351q = false;
        forceNotifyShowUI.overridePendingTransition(0, com.tencent.mm.R.anim.f477855dd);
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
