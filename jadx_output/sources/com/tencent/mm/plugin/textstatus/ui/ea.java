package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class ea implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173844d;

    public ea(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173844d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f173844d;
        textStatusEditActivity.getClass();
        android.text.Editable text = textStatusEditActivity.i7().getText();
        if (text != null) {
            text.insert(textStatusEditActivity.i7().getSelectionStart(), textStatusEditActivity.getContext().getString(com.tencent.mm.R.string.jo7));
        }
        textStatusEditActivity.i7().requestFocus();
        java.lang.Object systemService = textStatusEditActivity.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(textStatusEditActivity.i7(), 0);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.D++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
