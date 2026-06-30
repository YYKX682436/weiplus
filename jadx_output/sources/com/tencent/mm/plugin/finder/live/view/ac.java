package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ac implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116190d;

    public ac(com.tencent.mm.plugin.finder.live.view.mc mcVar) {
        this.f116190d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.mc mcVar = this.f116190d;
        mcVar.f116484b.i7(4);
        mcVar.b("attendClick");
        if (((mm2.d) mcVar.f116484b.business(mm2.d.class)).N6()) {
            mcVar.f116484b.a7();
        } else {
            dk2.Cif cif = dk2.Cif.f233626a;
            com.tencent.mm.plugin.finder.live.view.ub ubVar = mcVar.f116484b.f291099e;
            kotlin.jvm.internal.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.live.plugin.ILiveStatus");
            cif.a((qo0.c) ubVar, ((mm2.e1) mcVar.f116484b.business(mm2.e1.class)).f328988r.getLong(0), dk2.hf.f233591i, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
