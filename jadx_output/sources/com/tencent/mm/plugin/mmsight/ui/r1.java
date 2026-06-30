package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149411d;

    public r1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149411d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149411d;
        if (!a2Var.f149282r && a2Var.f149267c <= a2Var.f149283s.f71195h) {
            a2Var.f149269e = -1;
            a2Var.f149268d = -1;
            a2Var.f149281q.b();
            a2Var.f149265a = a2Var.f149281q.f149259d;
            a2Var.f149266b = false;
        }
        if (a2Var.C) {
            a2Var.c();
            if (!a2Var.f149282r && a2Var.B && a2Var.f149280p != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.q1(this));
            }
        } else if (a2Var.f149280p != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.p1(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
