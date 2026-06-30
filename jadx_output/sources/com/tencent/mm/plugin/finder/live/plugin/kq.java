package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113314d;

    public kq(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f113314d = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(2, 6, kz5.b1.e(new jz5.l(ya.b.SOURCE, "0")));
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113314d;
        if (etVar.U != etVar.f112453s) {
            etVar.X1();
        } else {
            etVar.P1();
            etVar.Y1(100L, "onEmojiBtnClick");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
