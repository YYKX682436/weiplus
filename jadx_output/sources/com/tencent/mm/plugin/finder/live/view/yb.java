package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f116840e;

    public yb(com.tencent.mm.plugin.finder.live.view.mc mcVar, r45.lv1 lv1Var) {
        this.f116839d = mcVar;
        this.f116840e = lv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.p42 p42Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.mc mcVar = this.f116839d;
        mcVar.f116484b.i7(4);
        mcVar.b("attendClick");
        if (!((mm2.c1) mcVar.f116484b.business(mm2.c1.class)).f328902w || !((mm2.c1) mcVar.f116484b.business(mm2.c1.class)).f328896v) {
            db5.t7.m(mcVar.f116486d.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_h));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.uv1 uv1Var = (r45.uv1) this.f116840e.getCustom(1);
        if (uv1Var == null || (p42Var = (r45.p42) uv1Var.getCustom(10)) == null || (str = p42Var.getString(1)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            df2.ar arVar = mcVar.f116484b;
            qo0.b bVar = qo0.b.W2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", str);
            arVar.X6(bVar, bundle);
            com.tencent.mars.xlog.Log.i(mcVar.f116485c, "[input-auto-wording]  text = ".concat(str));
        } else {
            if2.b.Y6(mcVar.f116484b, qo0.b.W2, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
