package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class d9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173808d;

    public d9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173808d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173808d;
        if (textStatusEditActivity.d7().f173902d == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
        if (h2Var != null) {
            if (wi4.e.a(textStatusEditActivity.e7())) {
                h2Var.L++;
            } else {
                h2Var.K++;
            }
        }
        pj4.b0 e76 = textStatusEditActivity.e7();
        e76.f354986u = 1 ^ e76.f354986u;
        textStatusEditActivity.Q7();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
