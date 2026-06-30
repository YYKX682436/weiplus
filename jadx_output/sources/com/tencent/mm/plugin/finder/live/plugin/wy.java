package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.x f115000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f115001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.az f115002f;

    public wy(cm2.x xVar, com.tencent.mm.ui.widget.dialog.y1 y1Var, com.tencent.mm.plugin.finder.live.plugin.az azVar) {
        this.f115000d = xVar;
        this.f115001e = y1Var;
        this.f115002f = azVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String string = this.f115000d.f43407v.getString(3);
        if (string != null) {
            com.tencent.mm.plugin.finder.live.plugin.az.a(this.f115002f, string);
        }
        this.f115001e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
