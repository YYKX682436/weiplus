package dm1;

/* loaded from: classes14.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f241638d;

    public i(dm1.m mVar) {
        this.f241638d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dm1.m window = this.f241638d;
        dm1.a aVar = window.f241657l;
        if (aVar != null) {
            kotlin.jvm.internal.o.g(window, "window");
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click reject button");
            cm1.t tVar = cm1.t.f43316a;
            java.lang.String roomId = ((cm1.g) aVar).f43297b.f43283b;
            kotlin.jvm.internal.o.g(roomId, "roomId");
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            r45.ze7 ze7Var = new r45.ze7();
            ze7Var.f391963e = 4;
            ze7Var.f391962d = roomId;
            lVar.f70664a = ze7Var;
            lVar.f70665b = new r45.af7();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
            lVar.f70667d = 5036;
            com.tencent.mm.modelbase.z2.d(lVar.a(), bm1.a.f21742d, true);
            tVar.c();
            tVar.d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
