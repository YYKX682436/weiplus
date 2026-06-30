package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class za implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174482d;

    public za(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174482d = textStatusEditActivity;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174482d;
        textStatusEditActivity.i7().removeTextChangedListener(this);
        android.view.View c76 = textStatusEditActivity.c7();
        textStatusEditActivity.getClass();
        c76.setEnabled(true);
        if (textStatusEditActivity.c7().isEnabled()) {
            android.view.View j76 = textStatusEditActivity.j7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(j76, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(j76, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View j77 = textStatusEditActivity.j7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(j77, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(j77, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h12.m mVar = new h12.m(java.lang.String.valueOf(editable), (int) textStatusEditActivity.i7().getPaint().getTextSize());
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        java.lang.String.valueOf(editable);
        if (a17 > 2000) {
            textStatusEditActivity.i7().setText(pg5.d.a(textStatusEditActivity, mVar.b(2000, t4Var)));
            textStatusEditActivity.i7().setSelection(textStatusEditActivity.i7().getText().length());
            java.lang.String string = textStatusEditActivity.getString(com.tencent.mm.R.string.ith);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            textStatusEditActivity.O7(string);
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
            if (h2Var != null) {
                h2Var.A++;
            }
        }
        textStatusEditActivity.i7().addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
