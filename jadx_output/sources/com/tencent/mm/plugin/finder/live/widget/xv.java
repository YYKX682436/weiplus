package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xv implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yv f120384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120385e;

    public xv(com.tencent.mm.plugin.finder.live.widget.yv yvVar, android.content.Context context) {
        this.f120384d = yvVar;
        this.f120385e = context;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveStatisticsWidget$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.live.widget.yv yvVar = this.f120384d;
        sb6.append((java.lang.Object) yvVar.f120474a.getText());
        sb6.append("cdnUrl:");
        sb6.append(yvVar.f120476c);
        sb6.append('\n');
        java.lang.String sb7 = sb6.toString();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setText(sb7);
        dp.a.makeText(this.f120385e, "copy done", 0).show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveStatisticsWidget$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
