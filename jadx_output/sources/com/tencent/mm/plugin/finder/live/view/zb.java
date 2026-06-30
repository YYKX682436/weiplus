package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class zb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116862d;

    public zb(com.tencent.mm.plugin.finder.live.view.mc mcVar) {
        this.f116862d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.mc mcVar = this.f116862d;
        mcVar.f116484b.i7(4);
        mcVar.b("attendClick");
        if (((mm2.c1) mcVar.f116484b.business(mm2.c1.class)).F) {
            if2.b.Y6(mcVar.f116484b, qo0.b.f365416t3, null, 2, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            db5.t7.m(mcVar.f116486d.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dly));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
