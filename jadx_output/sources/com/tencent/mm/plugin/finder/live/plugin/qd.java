package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.be f113991d;

    public qd(com.tencent.mm.plugin.finder.live.plugin.be beVar) {
        this.f113991d = beVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentDanmakuSettingPlugin$checkDanmaku$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.be beVar = this.f113991d;
        ((kotlinx.coroutines.flow.h3) beVar.w1()).k(java.lang.Boolean.valueOf(!((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) beVar.w1()).getValue()).booleanValue()));
        com.tencent.mm.plugin.finder.live.widget.sl slVar = beVar.f112023u;
        if (slVar != null) {
            if (slVar != null) {
                slVar.dismiss();
            }
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) beVar.X0(com.tencent.mm.plugin.finder.live.plugin.mg.class);
            if (mgVar != null) {
                mgVar.J1();
            }
            beVar.f112023u = null;
        }
        com.tencent.mm.plugin.finder.live.widget.jc.f118746p.a(beVar.S0(), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentDanmakuSettingPlugin$checkDanmaku$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
