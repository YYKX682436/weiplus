package k13;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld f303261d;

    public r(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
        this.f303261d = forceNotifyAcceptUIOld;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld = this.f303261d;
        com.tencent.mars.xlog.Log.i(forceNotifyAcceptUIOld.f137332d, "Cancel!");
        forceNotifyAcceptUIOld.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
