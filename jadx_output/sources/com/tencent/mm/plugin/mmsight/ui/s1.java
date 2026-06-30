package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149416d;

    public s1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149416d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149416d;
        if (a2Var.C) {
            a2Var.c();
            if (a2Var.f149268d >= 0 && a2Var.f149269e > 0) {
                a2Var.f149282r = true;
            }
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.m1(a2Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
