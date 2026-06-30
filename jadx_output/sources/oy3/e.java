package oy3;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.e f350017d = new oy3.e();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", "save quick reply.");
        com.tencent.mm.autogen.events.RtosWatchGetQuickReplyEvent rtosWatchGetQuickReplyEvent = new com.tencent.mm.autogen.events.RtosWatchGetQuickReplyEvent();
        rtosWatchGetQuickReplyEvent.e();
        am.fs fsVar = rtosWatchGetQuickReplyEvent.f54716g;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", fsVar.f6704a);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", fsVar.f6705b);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", new org.json.JSONArray(fsVar.f6705b).toString());
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
