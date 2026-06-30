package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ur implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114616d;

    public ur(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f114616d = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initVoicePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114616d;
        etVar.R1();
        etVar.N1(0);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((ml2.r0) c17).ak(2, 15, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initVoicePanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
