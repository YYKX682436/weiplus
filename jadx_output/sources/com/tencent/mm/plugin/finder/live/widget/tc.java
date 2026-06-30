package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class tc implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yc f119880d;

    public tc(com.tencent.mm.plugin.finder.live.widget.yc ycVar) {
        this.f119880d = ycVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        java.util.HashMap hashMap = com.tencent.mm.plugin.finder.live.widget.yc.f120431h;
        com.tencent.mm.plugin.finder.live.widget.yc ycVar = this.f119880d;
        hashMap.put(ycVar.f120432a.f119627i, java.lang.Boolean.FALSE);
        ycVar.f120432a.f119623e.invoke();
    }
}
