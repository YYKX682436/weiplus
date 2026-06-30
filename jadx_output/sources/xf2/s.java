package xf2;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454298d;

    public s(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView) {
        this.f454298d = shellView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 5);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f454298d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = shellView.f111622h;
        if (liveRoomController == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.util.y.d(liveRoomController, null, null, new xf2.r(shellView, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
