package e45;

/* loaded from: classes.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.x f249430d;

    public w(e45.x xVar) {
        this.f249430d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/SystemFileSelectorUIC$intView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelectorPermission());
        e45.x xVar = this.f249430d;
        if (c17 == 0) {
            xVar.O6();
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(145, new e45.v(xVar), "android.permission.READ_EXTERNAL_STORAGE");
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/SystemFileSelectorUIC$intView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
