package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.g f162254d;

    public e(com.tencent.mm.plugin.shake.ui.g gVar) {
        this.f162254d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.shake.ui.g gVar = this.f162254d;
        gVar.f162270u.b();
        db5.e6 e6Var = gVar.f162269t;
        if (e6Var != null) {
            e6Var.a(view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
