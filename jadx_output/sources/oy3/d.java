package oy3;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.d f350016d = new oy3.d();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", "save quick reply.");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < 4; i17++) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.INDEX, i17);
            jSONObject.put("msg", "Quick Reply " + i17);
            jSONArray.put(jSONObject);
        }
        com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = new com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent();
        rtosWatchSaveQuickReplyEvent.f54717g.f6787a = jSONArray.toString();
        rtosWatchSaveQuickReplyEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", rtosWatchSaveQuickReplyEvent.f54718h.f6865a);
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
