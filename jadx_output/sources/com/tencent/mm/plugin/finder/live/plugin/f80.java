package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i80 f112518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f112519e;

    public f80(com.tencent.mm.plugin.finder.live.plugin.i80 i80Var, cm2.f0 f0Var) {
        this.f112518d = i80Var;
        this.f112519e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.i80 i80Var = this.f112518d;
        yz5.l lVar = i80Var.f112940g;
        if (lVar != null) {
            lVar.invoke(this.f112519e);
        }
        android.content.Context context = i80Var.f112937d;
        db5.t7.i(context, context.getString(com.tencent.mm.R.string.e9k), com.tencent.mm.R.raw.icons_filled_info);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
