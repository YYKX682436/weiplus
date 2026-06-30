package k13;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld f303258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303259e;

    public q(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld, java.lang.String str) {
        this.f303258d = forceNotifyAcceptUIOld;
        this.f303259e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld = this.f303258d;
        java.lang.String string = forceNotifyAcceptUIOld.getString(com.tencent.mm.R.string.f490573yv);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld2 = this.f303258d;
        forceNotifyAcceptUIOld.f137334f = db5.e1.Q(forceNotifyAcceptUIOld, string, forceNotifyAcceptUIOld2.getString(com.tencent.mm.R.string.f490604zq), true, false, k13.o.f303253d);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = forceNotifyAcceptUIOld2.f137334f;
        if (u3Var != null) {
            u3Var.show();
        }
        new i13.d(this.f303259e).l().h(new k13.p(forceNotifyAcceptUIOld2));
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
