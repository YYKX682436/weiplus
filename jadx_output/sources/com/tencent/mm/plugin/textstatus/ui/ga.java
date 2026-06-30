package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class ga implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173910d;

    public ga(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173910d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173910d;
        textStatusEditActivity.f173579f2.onClick(view);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.F++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
