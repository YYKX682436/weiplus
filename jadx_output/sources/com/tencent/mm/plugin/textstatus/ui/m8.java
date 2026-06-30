package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174098d;

    public m8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174098d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174098d;
        if (java.lang.Math.abs(currentTimeMillis - textStatusEditActivity.f173583h2) < 1000) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        textStatusEditActivity.f173583h2 = currentTimeMillis;
        android.view.LayoutInflater.from(textStatusEditActivity);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) textStatusEditActivity, 1, false);
        db5.g4 g4Var = new db5.g4(textStatusEditActivity);
        new db5.g4(textStatusEditActivity);
        com.tencent.mm.plugin.textstatus.ui.k8 k8Var = new com.tencent.mm.plugin.textstatus.ui.k8(textStatusEditActivity);
        com.tencent.mm.plugin.textstatus.ui.l8 l8Var = new com.tencent.mm.plugin.textstatus.ui.l8(textStatusEditActivity);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(textStatusEditActivity);
        k8Var.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = k8Var;
            k0Var.f211881s = l8Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.E++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$cameraClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
